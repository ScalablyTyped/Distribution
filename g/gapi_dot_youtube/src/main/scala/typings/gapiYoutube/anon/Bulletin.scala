package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bulletin extends StObject {
  
  /**
    * The bulletin object contains details about a channel bulletin post. This object is only present if the snippet.type is bulletin.
    */
  var bulletin: ResourceIdKindPlaylistId
  
  /**
    * The channelItem object contains details about a resource that was added to a channel. This property is only present if the snippet.type is channelItem.
    */
  var channelItem: `0`
  
  /**
    * The comment object contains information about a resource that received a comment. This property is only present if the snippet.type is comment.
    */
  var comment: ResourceIdChannelIdKind
  
  /**
    * The favorite object contains information about a video that was marked as a favorite video. This property is only present if the snippet.type is favorite.
    */
  var favorite: ResourceId
  
  /**
    * The like object contains information about a resource that received a positive (like) rating. This property is only present if the snippet.type is like.
    */
  var like: ResourceId
  
  /**
    * The playlistItem object contains information about an item that was added to a playlist. This property is only present if the snippet.type is playlistItem.
    */
  var playlistItem: PlaylistId
  
  /**
    * The recommendation object contains information about a recommended resource. This property is only present if the snippet.type is recommendation.
    */
  var recommendation: Reason
  
  /**
    * The social object contains details about a social network post. This property is only present if the snippet.type is social.
    */
  var social: Author
  
  /**
    * The subscription object contains information about a channel that a user subscribed to. This property is only present if the snippet.type is subscription.
    */
  var subscription: ResourceIdChannelIdString
  
  /**
    * The upload object contains information about the uploaded video. This property is only present if the snippet.type is upload.
    */
  var upload: VideoId
}
object Bulletin {
  
  inline def apply(
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
  
  extension [Self <: Bulletin](x: Self) {
    
    inline def setBulletin(value: ResourceIdKindPlaylistId): Self = StObject.set(x, "bulletin", value.asInstanceOf[js.Any])
    
    inline def setChannelItem(value: `0`): Self = StObject.set(x, "channelItem", value.asInstanceOf[js.Any])
    
    inline def setComment(value: ResourceIdChannelIdKind): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setFavorite(value: ResourceId): Self = StObject.set(x, "favorite", value.asInstanceOf[js.Any])
    
    inline def setLike(value: ResourceId): Self = StObject.set(x, "like", value.asInstanceOf[js.Any])
    
    inline def setPlaylistItem(value: PlaylistId): Self = StObject.set(x, "playlistItem", value.asInstanceOf[js.Any])
    
    inline def setRecommendation(value: Reason): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    inline def setSocial(value: Author): Self = StObject.set(x, "social", value.asInstanceOf[js.Any])
    
    inline def setSubscription(value: ResourceIdChannelIdString): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setUpload(value: VideoId): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
  }
}
