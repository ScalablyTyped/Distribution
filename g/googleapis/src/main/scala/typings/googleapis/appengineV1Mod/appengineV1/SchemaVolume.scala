package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVolume extends StObject {
  
  /**
    * Unique name for the volume.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Volume size in gigabytes.
    */
  var sizeGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Underlying volume type, e.g. 'tmpfs'.
    */
  var volumeType: js.UndefOr[String | Null] = js.undefined
}
object SchemaVolume {
  
  inline def apply(): SchemaVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolume]
  }
  
  extension [Self <: SchemaVolume](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSizeGb(value: Double): Self = StObject.set(x, "sizeGb", value.asInstanceOf[js.Any])
    
    inline def setSizeGbNull: Self = StObject.set(x, "sizeGb", null)
    
    inline def setSizeGbUndefined: Self = StObject.set(x, "sizeGb", js.undefined)
    
    inline def setVolumeType(value: String): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeNull: Self = StObject.set(x, "volumeType", null)
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "volumeType", js.undefined)
  }
}
