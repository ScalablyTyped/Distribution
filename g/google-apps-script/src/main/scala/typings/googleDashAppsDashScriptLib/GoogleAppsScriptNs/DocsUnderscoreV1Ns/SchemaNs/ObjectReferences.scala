package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectReferences extends js.Object {
  var objectIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ObjectReferences {
  @scala.inline
  def apply(objectIds: js.Array[java.lang.String] = null): ObjectReferences = {
    val __obj = js.Dynamic.literal()
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds)
    __obj.asInstanceOf[ObjectReferences]
  }
}

