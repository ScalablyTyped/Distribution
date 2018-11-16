package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VideoTopicDetails extends js.Object {
  /**
               * Similar to topic_id, except that these topics are merely relevant to the video. These are topics that may be mentioned in, or appear in the video. You
               * can retrieve information about each topic using Freebase Topic API.
               */
  var relevantTopicIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A list of Wikipedia URLs that provide a high-level description of the video's content. */
  var topicCategories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * A list of Freebase topic IDs that are centrally associated with the video. These are topics that are centrally featured in the video, and it can be
               * said that the video is mainly about each of these. You can retrieve information about each topic using the Freebase Topic API.
               */
  var topicIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

