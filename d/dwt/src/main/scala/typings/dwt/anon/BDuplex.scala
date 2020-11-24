package typings.dwt.anon

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BDuplex extends js.Object {
  
  /**
    * Whether to enable duplex scan.
    */
  var bDuplex: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to enable document feader.
    */
  var bFeeder: js.UndefOr[Boolean] = js.native
  
  /**
    * "ignore" (default) or "fail".
    */
  var exception: js.UndefOr[String] = js.native
  
  /**
    * Specify the pixel type.
    */
  var pixelType: js.UndefOr[EnumDWTPixelType | Double] = js.native
  
  /**
    * Specify the resolution.
    */
  var resolution: js.UndefOr[Double] = js.native
}
object BDuplex {
  
  @scala.inline
  def apply(): BDuplex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BDuplex]
  }
  
  @scala.inline
  implicit class BDuplexOps[Self <: BDuplex] (val x: Self) extends AnyVal {
    
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
    def setBDuplex(value: Boolean): Self = this.set("bDuplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBDuplex: Self = this.set("bDuplex", js.undefined)
    
    @scala.inline
    def setBFeeder(value: Boolean): Self = this.set("bFeeder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBFeeder: Self = this.set("bFeeder", js.undefined)
    
    @scala.inline
    def setException(value: String): Self = this.set("exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteException: Self = this.set("exception", js.undefined)
    
    @scala.inline
    def setPixelType(value: EnumDWTPixelType | Double): Self = this.set("pixelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelType: Self = this.set("pixelType", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
  }
}
