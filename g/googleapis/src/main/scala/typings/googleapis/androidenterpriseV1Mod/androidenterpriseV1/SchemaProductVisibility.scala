package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductVisibility extends StObject {
  
  /**
    * The product ID to make visible to the user. Required for each item in the productVisibility list.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Grants the user visibility to the specified product track(s), identified by trackIds.
    */
  var trackIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Deprecated. Use trackIds instead.
    */
  var tracks: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaProductVisibility {
  
  inline def apply(): SchemaProductVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductVisibility]
  }
  
  extension [Self <: SchemaProductVisibility](x: Self) {
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setTrackIds(value: js.Array[String]): Self = StObject.set(x, "trackIds", value.asInstanceOf[js.Any])
    
    inline def setTrackIdsNull: Self = StObject.set(x, "trackIds", null)
    
    inline def setTrackIdsUndefined: Self = StObject.set(x, "trackIds", js.undefined)
    
    inline def setTrackIdsVarargs(value: String*): Self = StObject.set(x, "trackIds", js.Array(value*))
    
    inline def setTracks(value: js.Array[String]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksNull: Self = StObject.set(x, "tracks", null)
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: String*): Self = StObject.set(x, "tracks", js.Array(value*))
  }
}
