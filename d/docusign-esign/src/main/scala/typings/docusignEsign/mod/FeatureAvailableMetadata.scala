package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureAvailableMetadata extends StObject {
  
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
  implicit class FeatureAvailableMetadataMutableBuilder[Self <: FeatureAvailableMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilty(value: String): Self = StObject.set(x, "availabilty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabiltyUndefined: Self = StObject.set(x, "availabilty", js.undefined)
    
    @scala.inline
    def setFeatureName(value: String): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureNameUndefined: Self = StObject.set(x, "featureName", js.undefined)
  }
}
