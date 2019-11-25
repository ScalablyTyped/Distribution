package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperChatEvent extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID that YouTube assigns to uniquely identify the Super Chat event. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#superChatEvent". */
  var kind: js.UndefOr[String] = js.undefined
  /** The snippet object contains basic details about the Super Chat event. */
  var snippet: js.UndefOr[SuperChatEventSnippet] = js.undefined
}

object SuperChatEvent {
  @scala.inline
  def apply(etag: String = null, id: String = null, kind: String = null, snippet: SuperChatEventSnippet = null): SuperChatEvent = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuperChatEvent]
  }
}

