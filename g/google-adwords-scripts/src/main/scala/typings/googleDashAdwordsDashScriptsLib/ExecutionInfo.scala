package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionInfo extends js.Object {
  def getRemainingCreateQuota(): scala.Double
  def getRemainingGetQuota(): scala.Double
  def getRemainingTime(): scala.Double
  def isPreview(): scala.Boolean
}

object ExecutionInfo {
  @scala.inline
  def apply(
    getRemainingCreateQuota: js.Function0[scala.Double],
    getRemainingGetQuota: js.Function0[scala.Double],
    getRemainingTime: js.Function0[scala.Double],
    isPreview: js.Function0[scala.Boolean]
  ): ExecutionInfo = {
    val __obj = js.Dynamic.literal(getRemainingCreateQuota = getRemainingCreateQuota, getRemainingGetQuota = getRemainingGetQuota, getRemainingTime = getRemainingTime, isPreview = isPreview)
  
    __obj.asInstanceOf[ExecutionInfo]
  }
}

