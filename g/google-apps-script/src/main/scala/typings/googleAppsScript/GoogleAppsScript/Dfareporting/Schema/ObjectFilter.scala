package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectFilter extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var objectIds: js.UndefOr[js.Array[String]] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object ObjectFilter {
  @scala.inline
  def apply(kind: String = null, objectIds: js.Array[String] = null, status: String = null): ObjectFilter = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectFilter]
  }
}

