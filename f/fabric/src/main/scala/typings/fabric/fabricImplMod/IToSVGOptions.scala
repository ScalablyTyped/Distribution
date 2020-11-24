package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToSVGOptions extends js.Object {
  
  /**
    * Encoding of SVG output
    */
  var encoding: js.UndefOr[String] = js.native
  
  /**
    * desired height of svg with or without units
    */
  var height: js.UndefOr[Double | String] = js.native
  
  /**
    * If true xml tag is not included
    */
  var suppressPreamble: js.UndefOr[Boolean] = js.native
  
  /**
    * SVG viewbox object
    */
  var viewBox: js.UndefOr[IViewBox] = js.native
  
  /**
    * desired width of svg with or without units
    */
  var width: js.UndefOr[Double | String] = js.native
}
object IToSVGOptions {
  
  @scala.inline
  def apply(): IToSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToSVGOptions]
  }
  
  @scala.inline
  implicit class IToSVGOptionsOps[Self <: IToSVGOptions] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setSuppressPreamble(value: Boolean): Self = this.set("suppressPreamble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressPreamble: Self = this.set("suppressPreamble", js.undefined)
    
    @scala.inline
    def setViewBox(value: IViewBox): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewBox: Self = this.set("viewBox", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
