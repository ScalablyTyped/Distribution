package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppTrackInfo extends StObject {
  
  /**
    * The track name associated with the trackId, set in the Play Console. The name is modifiable from Play Console.
    */
  var trackAlias: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unmodifiable unique track identifier, taken from the releaseTrackId in the URL of the Play Console page that displays the app’s track information.
    */
  var trackId: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppTrackInfo {
  
  inline def apply(): SchemaAppTrackInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppTrackInfo]
  }
  
  extension [Self <: SchemaAppTrackInfo](x: Self) {
    
    inline def setTrackAlias(value: String): Self = StObject.set(x, "trackAlias", value.asInstanceOf[js.Any])
    
    inline def setTrackAliasNull: Self = StObject.set(x, "trackAlias", null)
    
    inline def setTrackAliasUndefined: Self = StObject.set(x, "trackAlias", js.undefined)
    
    inline def setTrackId(value: String): Self = StObject.set(x, "trackId", value.asInstanceOf[js.Any])
    
    inline def setTrackIdNull: Self = StObject.set(x, "trackId", null)
    
    inline def setTrackIdUndefined: Self = StObject.set(x, "trackId", js.undefined)
  }
}
