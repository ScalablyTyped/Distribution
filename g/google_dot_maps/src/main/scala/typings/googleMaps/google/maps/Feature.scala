package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feature extends StObject {
  
  /**
    * <code>FeatureType</code> of this <code>Feature</code>.
    */
  var featureType: FeatureType
}
object Feature {
  
  inline def apply(featureType: FeatureType): Feature = {
    val __obj = js.Dynamic.literal(featureType = featureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
    
    inline def setFeatureType(value: FeatureType): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
  }
}
