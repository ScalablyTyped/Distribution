package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiasettingsRequestGmbAccessResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
}

object LiasettingsRequestGmbAccessResponse {
  @scala.inline
  def apply(kind: String = null): LiasettingsRequestGmbAccessResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiasettingsRequestGmbAccessResponse]
  }
}

