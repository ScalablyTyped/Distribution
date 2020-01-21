package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteControl extends js.Object {
  var requiredRevisionId: js.UndefOr[String] = js.undefined
  var targetRevisionId: js.UndefOr[String] = js.undefined
}

object WriteControl {
  @scala.inline
  def apply(requiredRevisionId: String = null, targetRevisionId: String = null): WriteControl = {
    val __obj = js.Dynamic.literal()
    if (requiredRevisionId != null) __obj.updateDynamic("requiredRevisionId")(requiredRevisionId.asInstanceOf[js.Any])
    if (targetRevisionId != null) __obj.updateDynamic("targetRevisionId")(targetRevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteControl]
  }
}

