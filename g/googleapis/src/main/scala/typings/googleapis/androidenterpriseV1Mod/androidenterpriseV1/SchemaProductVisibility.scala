package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A product to be made visible to a user.
  */
@js.native
trait SchemaProductVisibility extends StObject {
  
  /**
    * The product ID to make visible to the user. Required for each item in the
    * productVisibility list.
    */
  var productId: js.UndefOr[String] = js.native
  
  /**
    * Grants the user visibility to the specified product track(s), identified
    * by trackIds.
    */
  var trackIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Deprecated. Use trackIds instead.
    */
  var tracks: js.UndefOr[js.Array[String]] = js.native
}
object SchemaProductVisibility {
  
  @scala.inline
  def apply(): SchemaProductVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductVisibility]
  }
  
  @scala.inline
  implicit class SchemaProductVisibilityMutableBuilder[Self <: SchemaProductVisibility] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setTrackIds(value: js.Array[String]): Self = StObject.set(x, "trackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackIdsUndefined: Self = StObject.set(x, "trackIds", js.undefined)
    
    @scala.inline
    def setTrackIdsVarargs(value: String*): Self = StObject.set(x, "trackIds", js.Array(value :_*))
    
    @scala.inline
    def setTracks(value: js.Array[String]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    @scala.inline
    def setTracksVarargs(value: String*): Self = StObject.set(x, "tracks", js.Array(value :_*))
  }
}
