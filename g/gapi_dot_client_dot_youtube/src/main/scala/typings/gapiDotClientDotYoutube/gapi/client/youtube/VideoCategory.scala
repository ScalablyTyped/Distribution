package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoCategory extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the video category. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#videoCategory". */
  var kind: js.UndefOr[String] = js.undefined
  /** The snippet object contains basic details about the video category, including its title. */
  var snippet: js.UndefOr[VideoCategorySnippet] = js.undefined
}

object VideoCategory {
  @scala.inline
  def apply(etag: String = null, id: String = null, kind: String = null, snippet: VideoCategorySnippet = null): VideoCategory = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    __obj.asInstanceOf[VideoCategory]
  }
}

