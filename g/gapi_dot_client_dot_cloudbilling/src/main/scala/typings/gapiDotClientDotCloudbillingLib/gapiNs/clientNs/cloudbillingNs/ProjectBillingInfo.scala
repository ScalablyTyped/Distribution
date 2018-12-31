package typings
package gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectBillingInfo extends js.Object {
  /**
    * The resource name of the billing account associated with the project, if
    * any. For example, `billingAccounts/012345-567890-ABCDEF`.
    */
  var billingAccountName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * True if the project is associated with an open billing account, to which
    * usage on the project is charged. False if the project is associated with a
    * closed billing account, or no billing account at all, and therefore cannot
    * use paid services. This field is read-only.
    */
  var billingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The resource name for the `ProjectBillingInfo`; has the form
    * `projects/{project_id}/billingInfo`. For example, the resource name for the
    * billing information for project `tokyo-rain-123` would be
    * `projects/tokyo-rain-123/billingInfo`. This field is read-only.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the project that this `ProjectBillingInfo` represents, such as
    * `tokyo-rain-123`. This is a convenience field so that you don't need to
    * parse the `name` field to obtain a project ID. This field is read-only.
    */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
}

