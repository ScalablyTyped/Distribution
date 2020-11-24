package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICanvasDimensionsOptions extends js.Object {
  
  /**
    * Set the given dimensions only as canvas backstore dimensions
    */
  var backstoreOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the given dimensions only as css dimensions
    */
  var cssOnly: js.UndefOr[Boolean] = js.native
}
object ICanvasDimensionsOptions {
  
  @scala.inline
  def apply(): ICanvasDimensionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICanvasDimensionsOptions]
  }
  
  @scala.inline
  implicit class ICanvasDimensionsOptionsOps[Self <: ICanvasDimensionsOptions] (val x: Self) extends AnyVal {
    
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
    def setBackstoreOnly(value: Boolean): Self = this.set("backstoreOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackstoreOnly: Self = this.set("backstoreOnly", js.undefined)
    
    @scala.inline
    def setCssOnly(value: Boolean): Self = this.set("cssOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssOnly: Self = this.set("cssOnly", js.undefined)
  }
}
