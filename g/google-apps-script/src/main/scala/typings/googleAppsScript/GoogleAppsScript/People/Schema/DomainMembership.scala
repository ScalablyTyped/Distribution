package typings.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainMembership extends js.Object {
  var inViewerDomain: js.UndefOr[Boolean] = js.undefined
}

object DomainMembership {
  @scala.inline
  def apply(inViewerDomain: js.UndefOr[Boolean] = js.undefined): DomainMembership = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inViewerDomain)) __obj.updateDynamic("inViewerDomain")(inViewerDomain.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainMembership]
  }
}

