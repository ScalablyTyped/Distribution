package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureAvailableMetadata extends js.Object {
  
  var availabilty: js.UndefOr[String] = js.native
  
  var featureName: js.UndefOr[String] = js.native
}
object FeatureAvailableMetadata {
  
  @scala.inline
  def apply(): FeatureAvailableMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureAvailableMetadata]
  }
  
  @scala.inline
  implicit class FeatureAvailableMetadataOps[Self <: FeatureAvailableMetadata] (val x: Self) extends AnyVal {
    
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
    def setAvailabilty(value: String): Self = this.set("availabilty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilty: Self = this.set("availabilty", js.undefined)
    
    @scala.inline
    def setFeatureName(value: String): Self = this.set("featureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureName: Self = this.set("featureName", js.undefined)
  }
}
