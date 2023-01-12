package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureAvailableMetadata extends StObject {
  
  var availabilty: js.UndefOr[String] = js.undefined
  
  var featureName: js.UndefOr[String] = js.undefined
}
object FeatureAvailableMetadata {
  
  inline def apply(): FeatureAvailableMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureAvailableMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureAvailableMetadata] (val x: Self) extends AnyVal {
    
    inline def setAvailabilty(value: String): Self = StObject.set(x, "availabilty", value.asInstanceOf[js.Any])
    
    inline def setAvailabiltyUndefined: Self = StObject.set(x, "availabilty", js.undefined)
    
    inline def setFeatureName(value: String): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
    
    inline def setFeatureNameUndefined: Self = StObject.set(x, "featureName", js.undefined)
  }
}
