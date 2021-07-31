package typings.distributionsPoissonQuantile

import typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.float32
import typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.float64
import typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int16
import typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int32
import typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int8
import typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint16
import typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint32
import typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint8
import typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint8_clamped
import typings.distributionsPoissonQuantile.mod.Data
import typings.distributionsPoissonQuantile.mod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined distributions-poisson-quantile.distributions-poisson-quantile.Options & {  dtype :'float32'} */
  trait Optionsdtypefloat32 extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, js.Any]] = js.undefined
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.undefined
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] & float32
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.undefined
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.undefined
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.undefined
  }
  object Optionsdtypefloat32 {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] & float32): Optionsdtypefloat32 = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypefloat32]
    }
    
    @scala.inline
    implicit class Optionsdtypefloat32MutableBuilder[Self <: Optionsdtypefloat32] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => js.Any): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] & float32): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambda(value: Double): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    }
  }
  
  /* Inlined distributions-poisson-quantile.distributions-poisson-quantile.Options & {  dtype :'float64' | undefined} */
  trait Optionsdtypefloat64undefi extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, js.Any]] = js.undefined
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.undefined
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] & js.UndefOr[float64]
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.undefined
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.undefined
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.undefined
  }
  object Optionsdtypefloat64undefi {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] & js.UndefOr[float64]): Optionsdtypefloat64undefi = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypefloat64undefi]
    }
    
    @scala.inline
    implicit class Optionsdtypefloat64undefiMutableBuilder[Self <: Optionsdtypefloat64undefi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => js.Any): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] & js.UndefOr[float64]): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambda(value: Double): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    }
  }
  
  /* Inlined distributions-poisson-quantile.distributions-poisson-quantile.Options & {  dtype :'int16'} */
  trait Optionsdtypeint16 extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, js.Any]] = js.undefined
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.undefined
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] & int16
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.undefined
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.undefined
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.undefined
  }
  object Optionsdtypeint16 {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] & int16): Optionsdtypeint16 = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypeint16]
    }
    
    @scala.inline
    implicit class Optionsdtypeint16MutableBuilder[Self <: Optionsdtypeint16] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => js.Any): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] & int16): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambda(value: Double): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    }
  }
  
  /* Inlined distributions-poisson-quantile.distributions-poisson-quantile.Options & {  dtype :'int32'} */
  trait Optionsdtypeint32 extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, js.Any]] = js.undefined
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.undefined
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] & int32
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.undefined
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.undefined
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.undefined
  }
  object Optionsdtypeint32 {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] & int32): Optionsdtypeint32 = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypeint32]
    }
    
    @scala.inline
    implicit class Optionsdtypeint32MutableBuilder[Self <: Optionsdtypeint32] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => js.Any): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] & int32): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambda(value: Double): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    }
  }
  
  /* Inlined distributions-poisson-quantile.distributions-poisson-quantile.Options & {  dtype :'int8'} */
  trait Optionsdtypeint8 extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, js.Any]] = js.undefined
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.undefined
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] & int8
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.undefined
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.undefined
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.undefined
  }
  object Optionsdtypeint8 {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] & int8): Optionsdtypeint8 = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypeint8]
    }
    
    @scala.inline
    implicit class Optionsdtypeint8MutableBuilder[Self <: Optionsdtypeint8] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => js.Any): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] & int8): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambda(value: Double): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    }
  }
  
  /* Inlined distributions-poisson-quantile.distributions-poisson-quantile.Options & {  dtype :'uint16'} */
  trait Optionsdtypeuint16 extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, js.Any]] = js.undefined
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.undefined
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] & uint16
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.undefined
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.undefined
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.undefined
  }
  object Optionsdtypeuint16 {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] & uint16): Optionsdtypeuint16 = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypeuint16]
    }
    
    @scala.inline
    implicit class Optionsdtypeuint16MutableBuilder[Self <: Optionsdtypeuint16] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => js.Any): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] & uint16): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambda(value: Double): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    }
  }
  
  /* Inlined distributions-poisson-quantile.distributions-poisson-quantile.Options & {  dtype :'uint32'} */
  trait Optionsdtypeuint32 extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, js.Any]] = js.undefined
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.undefined
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] & uint32
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.undefined
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.undefined
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.undefined
  }
  object Optionsdtypeuint32 {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] & uint32): Optionsdtypeuint32 = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypeuint32]
    }
    
    @scala.inline
    implicit class Optionsdtypeuint32MutableBuilder[Self <: Optionsdtypeuint32] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => js.Any): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] & uint32): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambda(value: Double): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    }
  }
  
  /* Inlined distributions-poisson-quantile.distributions-poisson-quantile.Options & {  dtype :'uint8'} */
  trait Optionsdtypeuint8 extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, js.Any]] = js.undefined
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.undefined
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] & uint8
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.undefined
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.undefined
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.undefined
  }
  object Optionsdtypeuint8 {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] & uint8): Optionsdtypeuint8 = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypeuint8]
    }
    
    @scala.inline
    implicit class Optionsdtypeuint8MutableBuilder[Self <: Optionsdtypeuint8] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => js.Any): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] & uint8): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambda(value: Double): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    }
  }
  
  /* Inlined distributions-poisson-quantile.distributions-poisson-quantile.Options & {  dtype :'uint8_clamped'} */
  trait Optionsdtypeuint8clamped extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, js.Any]] = js.undefined
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.undefined
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] & uint8_clamped
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.undefined
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.undefined
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.undefined
  }
  object Optionsdtypeuint8clamped {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] & uint8_clamped): Optionsdtypeuint8clamped = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypeuint8clamped]
    }
    
    @scala.inline
    implicit class Optionsdtypeuint8clampedMutableBuilder[Self <: Optionsdtypeuint8clamped] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => js.Any): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] & uint8_clamped): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambda(value: Double): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    }
  }
  
  /* Inlined distributions-poisson-quantile.distributions-poisson-quantile.Options & {  dtype :undefined} */
  trait Optionsdtypeundefined extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, js.Any]] = js.undefined
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.undefined
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] & Unit
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.undefined
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.undefined
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.undefined
  }
  object Optionsdtypeundefined {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] & Unit): Optionsdtypeundefined = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypeundefined]
    }
    
    @scala.inline
    implicit class OptionsdtypeundefinedMutableBuilder[Self <: Optionsdtypeundefined] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => js.Any): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] & Unit): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambda(value: Double): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    }
  }
}
