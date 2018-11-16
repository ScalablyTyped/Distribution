package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LegacyAbac extends js.Object {
  /**
               * Whether the ABAC authorizer is enabled for this cluster. When enabled,
               * identities in the system, including service accounts, nodes, and
               * controllers, will have statically granted permissions beyond those
               * provided by the RBAC configuration or IAM.
               */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
}

