package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceProposalUser extends js.Object {
  /** Gaia id associated with a user, absent for the Google Tag Manager system. */
  var gaiaId: js.UndefOr[java.lang.String] = js.undefined
  /** User type distinguishes between a user and the Google Tag Manager system. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object WorkspaceProposalUser {
  @scala.inline
  def apply(gaiaId: java.lang.String = null, `type`: java.lang.String = null): WorkspaceProposalUser = {
    val __obj = js.Dynamic.literal()
    if (gaiaId != null) __obj.updateDynamic("gaiaId")(gaiaId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorkspaceProposalUser]
  }
}

