package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommentThreadSnippet extends js.Object {
  /** Whether the current viewer of the thread can reply to it. This is viewer specific - other viewers may see a different value for this field. */
  var canReply: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * The YouTube channel the comments in the thread refer to or the channel with the video the comments refer to. If video_id isn't set the comments refer
               * to the channel itself.
               */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the thread (and therefore all its comments) is visible to all YouTube users. */
  var isPublic: js.UndefOr[scala.Boolean] = js.undefined
  /** The top level comment of this thread. */
  var topLevelComment: js.UndefOr[Comment] = js.undefined
  /** The total number of replies (not including the top level comment). */
  var totalReplyCount: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the video the comments refer to, if any. No video_id implies a channel discussion comment. */
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

