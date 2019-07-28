package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionInfo extends js.Object {
  def getRemainingCreateQuota(): Double
  def getRemainingGetQuota(): Double
  def getRemainingTime(): Double
  def isPreview(): Boolean
}

object ExecutionInfo {
  @scala.inline
  def apply(
    getRemainingCreateQuota: () => Double,
    getRemainingGetQuota: () => Double,
    getRemainingTime: () => Double,
    isPreview: () => Boolean
  ): ExecutionInfo = {
    val __obj = js.Dynamic.literal(getRemainingCreateQuota = js.Any.fromFunction0(getRemainingCreateQuota), getRemainingGetQuota = js.Any.fromFunction0(getRemainingGetQuota), getRemainingTime = js.Any.fromFunction0(getRemainingTime), isPreview = js.Any.fromFunction0(isPreview))
  
    __obj.asInstanceOf[ExecutionInfo]
  }
}

