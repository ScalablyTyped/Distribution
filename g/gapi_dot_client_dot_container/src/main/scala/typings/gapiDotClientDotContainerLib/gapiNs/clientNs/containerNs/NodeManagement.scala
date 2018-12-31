package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeManagement extends js.Object {
  /**
    * A flag that specifies whether the node auto-repair is enabled for the node
    * pool. If enabled, the nodes in this node pool will be monitored and, if
    * they fail health checks too many times, an automatic repair action will be
    * triggered.
    */
  var autoRepair: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A flag that specifies whether node auto-upgrade is enabled for the node
    * pool. If enabled, node auto-upgrade helps keep the nodes in your node pool
    * up to date with the latest release version of Kubernetes.
    */
  var autoUpgrade: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the Auto Upgrade knobs for the node pool. */
  var upgradeOptions: js.UndefOr[AutoUpgradeOptions] = js.undefined
}

