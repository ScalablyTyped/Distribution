package typings.googleAppsScript.GoogleAppsScript.AdminGroupsMigration.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groups extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var responseCode: js.UndefOr[String] = js.undefined
}

object Groups {
  @scala.inline
  def apply(kind: String = null, responseCode: String = null): Groups = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
}

