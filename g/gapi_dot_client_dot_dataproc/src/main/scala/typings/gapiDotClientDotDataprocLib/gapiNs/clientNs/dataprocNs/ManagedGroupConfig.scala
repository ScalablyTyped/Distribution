package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedGroupConfig extends js.Object {
  /** Output-only. The name of the Instance Group Manager for this group. */
  var instanceGroupManagerName: js.UndefOr[java.lang.String] = js.undefined
  /** Output-only. The name of the Instance Template used for the Managed Instance Group. */
  var instanceTemplateName: js.UndefOr[java.lang.String] = js.undefined
}

object ManagedGroupConfig {
  @scala.inline
  def apply(instanceGroupManagerName: java.lang.String = null, instanceTemplateName: java.lang.String = null): ManagedGroupConfig = {
    val __obj = js.Dynamic.literal()
    if (instanceGroupManagerName != null) __obj.updateDynamic("instanceGroupManagerName")(instanceGroupManagerName)
    if (instanceTemplateName != null) __obj.updateDynamic("instanceTemplateName")(instanceTemplateName)
    __obj.asInstanceOf[ManagedGroupConfig]
  }
}

