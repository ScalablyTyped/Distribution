package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bulletin extends js.Object {
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
}

