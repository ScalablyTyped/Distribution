package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Ad
@js.native
trait Ad
  extends isAdGroupChild
     with AdWordsEntity
     with canBeEnabled
     with hasLabels
     with hasStats {
  def asType(): AdViewSpace = js.native
  def getApprovalStatus(): ApprovalStatus = js.native
  def getDisapprovalReasons(): js.Array[java.lang.String] = js.native
  def getId(): scala.Double = js.native
  def getPolicyApprovalStatus(): PolicyApprovalStatus = js.native
  def getPolicyTopics(): js.Array[PolicyTopic] = js.native
  def getType(): AdType = js.native
  def isType(): AdTypeSpace = js.native
  def remove(): scala.Unit = js.native
  def urls(): AdUrls = js.native
}

