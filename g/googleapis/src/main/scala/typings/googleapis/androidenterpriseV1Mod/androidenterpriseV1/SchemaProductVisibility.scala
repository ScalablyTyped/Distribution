package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A product to be made visible to a user.
  */
@js.native
trait SchemaProductVisibility extends js.Object {
  
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
  implicit class SchemaProductVisibilityOps[Self <: SchemaProductVisibility] (val x: Self) extends AnyVal {
    
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
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setTrackIdsVarargs(value: String*): Self = this.set("trackIds", js.Array(value :_*))
    
    @scala.inline
    def setTrackIds(value: js.Array[String]): Self = this.set("trackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackIds: Self = this.set("trackIds", js.undefined)
    
    @scala.inline
    def setTracksVarargs(value: String*): Self = this.set("tracks", js.Array(value :_*))
    
    @scala.inline
    def setTracks(value: js.Array[String]): Self = this.set("tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracks: Self = this.set("tracks", js.undefined)
  }
}
