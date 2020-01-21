package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapCardViewBatchEditApi")
@js.native
class BootstrapCardViewBatchEditApi protected () extends js.Object {
  protected def this(instance: js.Any) = this()
  val instance: js.Any = js.native
  def addNewCard(): Unit = js.native
  def deleteCard(visibleIndex: Double): Unit = js.native
  def deleteCardByKey(key: js.Any): Unit = js.native
  def getCardVisibleIndices(includeDeleted: Boolean): js.Array[Double] = js.native
  def getDeletedCardIndices(): js.Array[Double] = js.native
  def getInsertedCardIndices(): js.Array[Double] = js.native
  def isDeletedCard(visibleIndex: Double): Boolean = js.native
  def isNewCard(visibleIndex: Double): Boolean = js.native
  def recoverCard(visibleIndex: Double): Unit = js.native
  def recoverCardByKey(key: js.Any): Unit = js.native
  def validateCard(visibleIndex: Double): Boolean = js.native
  def validateCards(validateOnlyModified: Boolean): Boolean = js.native
}

