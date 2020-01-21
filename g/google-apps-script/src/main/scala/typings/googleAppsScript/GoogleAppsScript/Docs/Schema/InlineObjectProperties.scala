package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineObjectProperties extends js.Object {
  var embeddedObject: js.UndefOr[EmbeddedObject] = js.undefined
}

object InlineObjectProperties {
  @scala.inline
  def apply(embeddedObject: EmbeddedObject = null): InlineObjectProperties = {
    val __obj = js.Dynamic.literal()
    if (embeddedObject != null) __obj.updateDynamic("embeddedObject")(embeddedObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineObjectProperties]
  }
}

