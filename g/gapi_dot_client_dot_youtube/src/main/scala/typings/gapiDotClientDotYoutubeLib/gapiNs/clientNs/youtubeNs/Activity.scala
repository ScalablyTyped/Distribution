package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  /**
    * The contentDetails object contains information about the content associated with the activity. For example, if the snippet.type value is videoRated,
    * then the contentDetails object's content identifies the rated video.
    */
  var contentDetails: js.UndefOr[ActivityContentDetails] = js.undefined
  /** Etag of this resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the activity. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#activity". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The snippet object contains basic details about the activity, including the activity's type and group ID. */
  var snippet: js.UndefOr[ActivitySnippet] = js.undefined
}

