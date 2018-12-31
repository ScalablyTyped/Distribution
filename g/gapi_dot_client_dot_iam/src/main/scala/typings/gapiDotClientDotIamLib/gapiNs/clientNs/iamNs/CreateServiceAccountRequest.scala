package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateServiceAccountRequest extends js.Object {
  /**
    * Required. The account id that is used to generate the service account
    * email address and a stable unique id. It is unique within a project,
    * must be 6-30 characters long, and match the regular expression
    * `[a-z]([-a-z0-9]&#42;[a-z0-9])` to comply with RFC1035.
    */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ServiceAccount resource to create.
    * Currently, only the following values are user assignable:
    * `display_name` .
    */
  var serviceAccount: js.UndefOr[ServiceAccount] = js.undefined
}

