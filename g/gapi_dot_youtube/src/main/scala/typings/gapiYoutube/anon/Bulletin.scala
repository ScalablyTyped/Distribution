package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bulletin extends js.Object {
  
  /**
    * The bulletin object contains details about a channel bulletin post. This object is only present if the snippet.type is bulletin.
    */
  var bulletin: ResourceIdKindPlaylistId = js.native
  
  /**
    * The channelItem object contains details about a resource that was added to a channel. This property is only present if the snippet.type is channelItem.
    */
  var channelItem: `0` = js.native
  
  /**
    * The comment object contains information about a resource that received a comment. This property is only present if the snippet.type is comment.
    */
  var comment: ResourceIdChannelIdKind = js.native
  
  /**
    * The favorite object contains information about a video that was marked as a favorite video. This property is only present if the snippet.type is favorite.
    */
  var favorite: ResourceId = js.native
  
  /**
    * The like object contains information about a resource that received a positive (like) rating. This property is only present if the snippet.type is like.
    */
  var like: ResourceId = js.native
  
  /**
    * The playlistItem object contains information about an item that was added to a playlist. This property is only present if the snippet.type is playlistItem.
    */
  var playlistItem: PlaylistId = js.native
  
  /**
    * The recommendation object contains information about a recommended resource. This property is only present if the snippet.type is recommendation.
    */
  var recommendation: Reason = js.native
  
  /**
    * The social object contains details about a social network post. This property is only present if the snippet.type is social.
    */
  var social: Author = js.native
  
  /**
    * The subscription object contains information about a channel that a user subscribed to. This property is only present if the snippet.type is subscription.
    */
  var subscription: ResourceIdChannelIdString = js.native
  
  /**
    * The upload object contains information about the uploaded video. This property is only present if the snippet.type is upload.
    */
  var upload: VideoId = js.native
}
object Bulletin {
  
  @scala.inline
  def apply(
    bulletin: ResourceIdKindPlaylistId,
    channelItem: `0`,
    comment: ResourceIdChannelIdKind,
    favorite: ResourceId,
    like: ResourceId,
    playlistItem: PlaylistId,
    recommendation: Reason,
    social: Author,
    subscription: ResourceIdChannelIdString,
    upload: VideoId
  ): Bulletin = {
    val __obj = js.Dynamic.literal(bulletin = bulletin.asInstanceOf[js.Any], channelItem = channelItem.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], like = like.asInstanceOf[js.Any], playlistItem = playlistItem.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any], social = social.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bulletin]
  }
  
  @scala.inline
  implicit class BulletinOps[Self <: Bulletin] (val x: Self) extends AnyVal {
    
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
    def setBulletin(value: ResourceIdKindPlaylistId): Self = this.set("bulletin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelItem(value: `0`): Self = this.set("channelItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: ResourceIdChannelIdKind): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavorite(value: ResourceId): Self = this.set("favorite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLike(value: ResourceId): Self = this.set("like", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistItem(value: PlaylistId): Self = this.set("playlistItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendation(value: Reason): Self = this.set("recommendation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocial(value: Author): Self = this.set("social", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription(value: ResourceIdChannelIdString): Self = this.set("subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload(value: VideoId): Self = this.set("upload", value.asInstanceOf[js.Any])
  }
}
