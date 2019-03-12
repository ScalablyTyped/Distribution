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
    getRemainingCreateQuota: () => scala.Double,
    getRemainingGetQuota: () => scala.Double,
    getRemainingTime: () => scala.Double,
    isPreview: () => scala.Boolean
  ): ExecutionInfo = {
    val __obj = js.Dynamic.literal(getRemainingCreateQuota = js.Any.fromFunction0(getRemainingCreateQuota), getRemainingGetQuota = js.Any.fromFunction0(getRemainingGetQuota), getRemainingTime = js.Any.fromFunction0(getRemainingTime), isPreview = js.Any.fromFunction0(isPreview))
  
    __obj.asInstanceOf[ExecutionInfo]
  }
}

