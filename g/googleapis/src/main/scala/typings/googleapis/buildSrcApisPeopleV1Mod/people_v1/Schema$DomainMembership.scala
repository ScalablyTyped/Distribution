package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Google Apps Domain membership.
  */
@js.native
trait Schema$DomainMembership extends js.Object {
  /**
    * True if the person is in the viewer&#39;s Google Apps domain.
    */
  var inViewerDomain: js.UndefOr[Boolean] = js.native
}

object Schema$DomainMembership {
  @scala.inline
  def apply(inViewerDomain: js.UndefOr[Boolean] = js.undefined): Schema$DomainMembership = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inViewerDomain)) __obj.updateDynamic("inViewerDomain")(inViewerDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DomainMembership]
  }
}

