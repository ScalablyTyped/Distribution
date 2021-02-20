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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined distributions-poisson-quantile.distributions-poisson-quantile.Options & {  dtype :'float32'} */
  @js.native
  trait Optionsdtypefloat32 extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, _]] = js.native
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.native
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] with float32 = js.native
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.native
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.native
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.native
  }
  object Optionsdtypefloat32 {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] with float32): Optionsdtypefloat32 = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypefloat32]
    }
    
    @scala.inline
    implicit class Optionsdtypefloat32MutableBuilder[Self <: Optionsdtypefloat32] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => _): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] with float32): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
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
  @js.native
  trait Optionsdtypefloat64undefi extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, _]] = js.native
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.native
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] with js.UndefOr[float64] = js.native
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.native
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.native
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.native
  }
  object Optionsdtypefloat64undefi {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] with js.UndefOr[float64]): Optionsdtypefloat64undefi = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypefloat64undefi]
    }
    
    @scala.inline
    implicit class Optionsdtypefloat64undefiMutableBuilder[Self <: Optionsdtypefloat64undefi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => _): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] with js.UndefOr[float64]): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
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
  @js.native
  trait Optionsdtypeint16 extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, _]] = js.native
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.native
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] with int16 = js.native
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.native
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.native
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.native
  }
  object Optionsdtypeint16 {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] with int16): Optionsdtypeint16 = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypeint16]
    }
    
    @scala.inline
    implicit class Optionsdtypeint16MutableBuilder[Self <: Optionsdtypeint16] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => _): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] with int16): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
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
  @js.native
  trait Optionsdtypeint32 extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, _]] = js.native
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.native
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] with int32 = js.native
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.native
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.native
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.native
  }
  object Optionsdtypeint32 {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] with int32): Optionsdtypeint32 = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypeint32]
    }
    
    @scala.inline
    implicit class Optionsdtypeint32MutableBuilder[Self <: Optionsdtypeint32] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => _): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] with int32): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
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
  @js.native
  trait Optionsdtypeint8 extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, _]] = js.native
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.native
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] with int8 = js.native
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.native
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.native
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.native
  }
  object Optionsdtypeint8 {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] with int8): Optionsdtypeint8 = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypeint8]
    }
    
    @scala.inline
    implicit class Optionsdtypeint8MutableBuilder[Self <: Optionsdtypeint8] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => _): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] with int8): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
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
  @js.native
  trait Optionsdtypeuint16 extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, _]] = js.native
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.native
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] with uint16 = js.native
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.native
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.native
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.native
  }
  object Optionsdtypeuint16 {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] with uint16): Optionsdtypeuint16 = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypeuint16]
    }
    
    @scala.inline
    implicit class Optionsdtypeuint16MutableBuilder[Self <: Optionsdtypeuint16] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => _): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] with uint16): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
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
  @js.native
  trait Optionsdtypeuint32 extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, _]] = js.native
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.native
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] with uint32 = js.native
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.native
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.native
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.native
  }
  object Optionsdtypeuint32 {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] with uint32): Optionsdtypeuint32 = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypeuint32]
    }
    
    @scala.inline
    implicit class Optionsdtypeuint32MutableBuilder[Self <: Optionsdtypeuint32] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => _): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] with uint32): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
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
  @js.native
  trait Optionsdtypeuint8 extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, _]] = js.native
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.native
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] with uint8 = js.native
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.native
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.native
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.native
  }
  object Optionsdtypeuint8 {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] with uint8): Optionsdtypeuint8 = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypeuint8]
    }
    
    @scala.inline
    implicit class Optionsdtypeuint8MutableBuilder[Self <: Optionsdtypeuint8] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => _): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] with uint8): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
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
  @js.native
  trait Optionsdtypeuint8clamped extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, _]] = js.native
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.native
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] with uint8_clamped = js.native
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.native
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.native
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.native
  }
  object Optionsdtypeuint8clamped {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] with uint8_clamped): Optionsdtypeuint8clamped = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypeuint8clamped]
    }
    
    @scala.inline
    implicit class Optionsdtypeuint8clampedMutableBuilder[Self <: Optionsdtypeuint8clamped] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => _): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] with uint8_clamped): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
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
  @js.native
  trait Optionsdtypeundefined extends StObject {
    
    /** accessor function for accessing array values */
    var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, _]] = js.native
    
    /** boolean indicating if the function should return a new data structure, default=true */
    var copy: js.UndefOr[Boolean] = js.native
    
    /** output data type, default="float64" */
    var dtype: js.UndefOr[DataType] with js.UndefOr[scala.Nothing] = js.native
    
    /** mean parameter, default=1 */
    var lambda: js.UndefOr[Double] = js.native
    
    /** deep get/set key path */
    var path: js.UndefOr[String] = js.native
    
    /** deep get/set key path separator, default="." */
    var sep: js.UndefOr[String] = js.native
  }
  object Optionsdtypeundefined {
    
    @scala.inline
    def apply(dtype: js.UndefOr[DataType] with js.UndefOr[scala.Nothing]): Optionsdtypeundefined = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsdtypeundefined]
    }
    
    @scala.inline
    implicit class OptionsdtypeundefinedMutableBuilder[Self <: Optionsdtypeundefined] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(value: (/* d */ Data, /* i */ Double) => _): Self = StObject.set(x, "accessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDtype(value: js.UndefOr[DataType] with js.UndefOr[scala.Nothing]): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
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
