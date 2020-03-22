package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBulletin extends js.Object {
  /**
    * The bulletin object contains details about a channel bulletin post. This object is only present if the snippet.type is bulletin.
    */
  var bulletin: AnonResourceIdAnonKindPlaylistId
  /**
    * The channelItem object contains details about a resource that was added to a channel. This property is only present if the snippet.type is channelItem.
    */
  var channelItem: Anon0
  /**
    * The comment object contains information about a resource that received a comment. This property is only present if the snippet.type is comment.
    */
  var comment: AnonResourceIdAnonChannelIdKind
  /**
    * The favorite object contains information about a video that was marked as a favorite video. This property is only present if the snippet.type is favorite.
    */
  var favorite: AnonResourceId
  /**
    * The like object contains information about a resource that received a positive (like) rating. This property is only present if the snippet.type is like.
    */
  var like: AnonResourceId
  /**
    * The playlistItem object contains information about an item that was added to a playlist. This property is only present if the snippet.type is playlistItem.
    */
  var playlistItem: AnonPlaylistId
  /**
    * The recommendation object contains information about a recommended resource. This property is only present if the snippet.type is recommendation.
    */
  var recommendation: AnonReason
  /**
    * The social object contains details about a social network post. This property is only present if the snippet.type is social.
    */
  var social: AnonAuthor
  /**
    * The subscription object contains information about a channel that a user subscribed to. This property is only present if the snippet.type is subscription.
    */
  var subscription: AnonResourceIdAnonChannelIdString
  /**
    * The upload object contains information about the uploaded video. This property is only present if the snippet.type is upload.
    */
  var upload: AnonVideoId
}

object AnonBulletin {
  @scala.inline
  def apply(
    bulletin: AnonResourceIdAnonKindPlaylistId,
    channelItem: Anon0,
    comment: AnonResourceIdAnonChannelIdKind,
    favorite: AnonResourceId,
    like: AnonResourceId,
    playlistItem: AnonPlaylistId,
    recommendation: AnonReason,
    social: AnonAuthor,
    subscription: AnonResourceIdAnonChannelIdString,
    upload: AnonVideoId
  ): AnonBulletin = {
    val __obj = js.Dynamic.literal(bulletin = bulletin.asInstanceOf[js.Any], channelItem = channelItem.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], like = like.asInstanceOf[js.Any], playlistItem = playlistItem.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any], social = social.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBulletin]
  }
}

