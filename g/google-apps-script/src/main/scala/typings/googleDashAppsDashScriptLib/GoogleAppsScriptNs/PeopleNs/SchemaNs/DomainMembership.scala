package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainMembership extends js.Object {
  var inViewerDomain: js.UndefOr[scala.Boolean] = js.undefined
}

object DomainMembership {
  @scala.inline
  def apply(inViewerDomain: js.UndefOr[scala.Boolean] = js.undefined): DomainMembership = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inViewerDomain)) __obj.updateDynamic("inViewerDomain")(inViewerDomain)
    __obj.asInstanceOf[DomainMembership]
  }
}

