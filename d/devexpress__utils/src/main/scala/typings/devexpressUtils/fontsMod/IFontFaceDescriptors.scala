package typings.devexpressUtils.fontsMod

import typings.devexpressUtils.devexpressUtilsStrings.`100`
import typings.devexpressUtils.devexpressUtilsStrings.`200`
import typings.devexpressUtils.devexpressUtilsStrings.`300`
import typings.devexpressUtils.devexpressUtilsStrings.`400`
import typings.devexpressUtils.devexpressUtilsStrings.`500`
import typings.devexpressUtils.devexpressUtilsStrings.`600`
import typings.devexpressUtils.devexpressUtilsStrings.`700`
import typings.devexpressUtils.devexpressUtilsStrings.`800`
import typings.devexpressUtils.devexpressUtilsStrings.`900`
import typings.devexpressUtils.devexpressUtilsStrings.bold
import typings.devexpressUtils.devexpressUtilsStrings.italic
import typings.devexpressUtils.devexpressUtilsStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFontFaceDescriptors extends js.Object {
  
  var display: js.UndefOr[String] = js.native
  
  var featureSettings: js.UndefOr[String] = js.native
  
  var stretch: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[normal | italic | String] = js.native
  
  var unicodeRange: js.UndefOr[String] = js.native
  
  var variant: js.UndefOr[String] = js.native
  
  var variationSettings: js.UndefOr[String] = js.native
  
  var weight: js.UndefOr[
    normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | String | Double
  ] = js.native
}
object IFontFaceDescriptors {
  
  @scala.inline
  def apply(): IFontFaceDescriptors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFontFaceDescriptors]
  }
  
  @scala.inline
  implicit class IFontFaceDescriptorsOps[Self <: IFontFaceDescriptors] (val x: Self) extends AnyVal {
    
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
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setFeatureSettings(value: String): Self = this.set("featureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureSettings: Self = this.set("featureSettings", js.undefined)
    
    @scala.inline
    def setStretch(value: String): Self = this.set("stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStretch: Self = this.set("stretch", js.undefined)
    
    @scala.inline
    def setStyle(value: normal | italic | String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUnicodeRange(value: String): Self = this.set("unicodeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicodeRange: Self = this.set("unicodeRange", js.undefined)
    
    @scala.inline
    def setVariant(value: String): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
    
    @scala.inline
    def setVariationSettings(value: String): Self = this.set("variationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariationSettings: Self = this.set("variationSettings", js.undefined)
    
    @scala.inline
    def setWeight(
      value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | String | Double
    ): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
