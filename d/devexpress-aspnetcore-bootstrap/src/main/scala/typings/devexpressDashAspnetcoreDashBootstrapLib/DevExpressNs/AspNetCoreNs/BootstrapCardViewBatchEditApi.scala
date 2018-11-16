package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapCardViewBatchEditApi")
@js.native
class BootstrapCardViewBatchEditApi protected () extends js.Object {
  protected def this(instance: js.Any) = this()
  val instance: js.Any = js.native
  def addNewCard(): scala.Unit = js.native
  def deleteCard(visibleIndex: scala.Double): scala.Unit = js.native
  def deleteCardByKey(key: js.Any): scala.Unit = js.native
  def getCardVisibleIndices(includeDeleted: scala.Boolean): js.Array[scala.Double] = js.native
  def getDeletedCardIndices(): js.Array[scala.Double] = js.native
  def getInsertedCardIndices(): js.Array[scala.Double] = js.native
  def isDeletedCard(visibleIndex: scala.Double): scala.Boolean = js.native
  def isNewCard(visibleIndex: scala.Double): scala.Boolean = js.native
  def recoverCard(visibleIndex: scala.Double): scala.Unit = js.native
  def recoverCardByKey(key: js.Any): scala.Unit = js.native
  def validateCard(visibleIndex: scala.Double): scala.Boolean = js.native
  def validateCards(validateOnlyModified: scala.Boolean): scala.Boolean = js.native
}

