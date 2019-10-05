package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bulletin extends js.Object {
  /**
    * The bulletin object contains details about a channel bulletin post. This object is only present if the snippet.type is bulletin.
    */
  var bulletin: Anon_ResourceIdAnonChannelIdKindPlaylistId
  /**
    * The channelItem object contains details about a resource that was added to a channel. This property is only present if the snippet.type is channelItem.
    */
  var channelItem: Anon_ResourceId_388971480
  /**
    * The comment object contains information about a resource that received a comment. This property is only present if the snippet.type is comment.
    */
  var comment: Anon_ResourceIdAnonChannelIdKind
  /**
    * The favorite object contains information about a video that was marked as a favorite video. This property is only present if the snippet.type is favorite.
    */
  var favorite: Anon_ResourceId
  /**
    * The like object contains information about a resource that received a positive (like) rating. This property is only present if the snippet.type is like.
    */
  var like: Anon_ResourceId
  /**
    * The playlistItem object contains information about an item that was added to a playlist. This property is only present if the snippet.type is playlistItem.
    */
  var playlistItem: Anon_PlaylistId
  /**
    * The recommendation object contains information about a recommended resource. This property is only present if the snippet.type is recommendation.
    */
  var recommendation: Anon_Reason
  /**
    * The social object contains details about a social network post. This property is only present if the snippet.type is social.
    */
  var social: Anon_Author
  /**
    * The subscription object contains information about a channel that a user subscribed to. This property is only present if the snippet.type is subscription.
    */
  var subscription: Anon_ResourceIdAnonChannelIdKindString
  /**
    * The upload object contains information about the uploaded video. This property is only present if the snippet.type is upload.
    */
  var upload: Anon_VideoId
}

object Anon_Bulletin {
  @scala.inline
  def apply(
    bulletin: Anon_ResourceIdAnonChannelIdKindPlaylistId,
    channelItem: Anon_ResourceId_388971480,
    comment: Anon_ResourceIdAnonChannelIdKind,
    favorite: Anon_ResourceId,
    like: Anon_ResourceId,
    playlistItem: Anon_PlaylistId,
    recommendation: Anon_Reason,
    social: Anon_Author,
    subscription: Anon_ResourceIdAnonChannelIdKindString,
    upload: Anon_VideoId
  ): Anon_Bulletin = {
    val __obj = js.Dynamic.literal(bulletin = bulletin, channelItem = channelItem, comment = comment, favorite = favorite, like = like, playlistItem = playlistItem, recommendation = recommendation, social = social, subscription = subscription, upload = upload)
  
    __obj.asInstanceOf[Anon_Bulletin]
  }
}

