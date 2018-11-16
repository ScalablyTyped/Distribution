package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Budgets
@js.native
trait Budget
  extends AdWordsEntity
     with hasStats {
  def campaigns(): AdWordsSelector[Campaign] = js.native
  def getAmount(): scala.Double = js.native
  def getDeliveryMethod(): java.lang.String = js.native
  def getId(): scala.Double = js.native
  def getName(): java.lang.String = js.native
  def isExplicitlyShared(): scala.Boolean = js.native
  def setAmount(amount: scala.Double): scala.Unit = js.native
}

