package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectReferences extends js.Object {
  var objectIds: js.UndefOr[js.Array[String]] = js.undefined
}

object ObjectReferences {
  @scala.inline
  def apply(objectIds: js.Array[String] = null): ObjectReferences = {
    val __obj = js.Dynamic.literal()
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectReferences]
  }
}

