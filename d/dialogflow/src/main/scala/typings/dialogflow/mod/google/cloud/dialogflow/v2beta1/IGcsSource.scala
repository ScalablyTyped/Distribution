package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GcsSource. */
trait IGcsSource extends js.Object {
  /** GcsSource uri */
  var uri: js.UndefOr[String | Null] = js.undefined
}

object IGcsSource {
  @scala.inline
  def apply(uri: String = null): IGcsSource = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGcsSource]
  }
}

