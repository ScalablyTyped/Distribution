package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEnrichment extends js.Object {
  /** Text for this enrichment item. */
  var text: js.UndefOr[String] = js.undefined
}

object TextEnrichment {
  @scala.inline
  def apply(text: String = null): TextEnrichment = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEnrichment]
  }
}

