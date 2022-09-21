package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppVersion extends StObject {
  
  /**
    * If the value is True, it indicates that this version is a production track.
    */
  var production: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Track identifiers that the app version is published in. This does not include the production track (see production instead).
    */
  var trackIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Unique increasing identifier for the app version.
    */
  var versionCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The string used in the Play store by the app developer to identify the version. The string is not necessarily unique or localized (for example, the string could be "1.4").
    */
  var versionString: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppVersion {
  
  inline def apply(): SchemaAppVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppVersion]
  }
  
  extension [Self <: SchemaAppVersion](x: Self) {
    
    inline def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
    
    inline def setProductionNull: Self = StObject.set(x, "production", null)
    
    inline def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
    
    inline def setTrackIds(value: js.Array[String]): Self = StObject.set(x, "trackIds", value.asInstanceOf[js.Any])
    
    inline def setTrackIdsNull: Self = StObject.set(x, "trackIds", null)
    
    inline def setTrackIdsUndefined: Self = StObject.set(x, "trackIds", js.undefined)
    
    inline def setTrackIdsVarargs(value: String*): Self = StObject.set(x, "trackIds", js.Array(value*))
    
    inline def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeNull: Self = StObject.set(x, "versionCode", null)
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
    
    inline def setVersionString(value: String): Self = StObject.set(x, "versionString", value.asInstanceOf[js.Any])
    
    inline def setVersionStringNull: Self = StObject.set(x, "versionString", null)
    
    inline def setVersionStringUndefined: Self = StObject.set(x, "versionString", js.undefined)
  }
}
