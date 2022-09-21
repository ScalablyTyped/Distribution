package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * An interface representing a vector map tile feature. These are inputs to
  * the <code>FeatureStyleFunction</code>. Do not save a reference to a
  * particular <code>Feature</code> object because the reference will not be
  * stable.
  */
trait Feature extends StObject {
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * <code>FeatureType</code> of this <code>Feature</code>.
    */
  var featureType: FeatureType
}
object Feature {
  
  inline def apply(featureType: FeatureType): Feature = {
    val __obj = js.Dynamic.literal(featureType = featureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  
  extension [Self <: Feature](x: Self) {
    
    inline def setFeatureType(value: FeatureType): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
  }
}
