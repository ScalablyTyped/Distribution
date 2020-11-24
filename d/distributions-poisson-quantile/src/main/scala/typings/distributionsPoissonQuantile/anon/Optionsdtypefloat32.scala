package typings.distributionsPoissonQuantile.anon

import typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.float32
import typings.distributionsPoissonQuantile.mod.Data
import typings.distributionsPoissonQuantile.mod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined distributions-poisson-quantile.distributions-poisson-quantile.Options & {  dtype :'float32'} */
@js.native
trait Optionsdtypefloat32 extends js.Object {
  
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
  implicit class Optionsdtypefloat32Ops[Self <: Optionsdtypefloat32] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDtype(value: js.UndefOr[DataType] with float32): Self = this.set("dtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessor(value: (/* d */ Data, /* i */ Double) => _): Self = this.set("accessor", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAccessor: Self = this.set("accessor", js.undefined)
    
    @scala.inline
    def setCopy(value: Boolean): Self = this.set("copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setLambda(value: Double): Self = this.set("lambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambda: Self = this.set("lambda", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSep(value: String): Self = this.set("sep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSep: Self = this.set("sep", js.undefined)
  }
}
