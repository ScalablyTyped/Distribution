package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapCardViewBatchEditApi extends js.Object {
  val instance: js.Any
  def addNewCard(): Unit
  def deleteCard(visibleIndex: Double): Unit
  def deleteCardByKey(key: js.Any): Unit
  def getCardVisibleIndices(includeDeleted: Boolean): js.Array[Double]
  def getDeletedCardIndices(): js.Array[Double]
  def getInsertedCardIndices(): js.Array[Double]
  def isDeletedCard(visibleIndex: Double): Boolean
  def isNewCard(visibleIndex: Double): Boolean
  def recoverCard(visibleIndex: Double): Unit
  def recoverCardByKey(key: js.Any): Unit
  def validateCard(visibleIndex: Double): Boolean
  def validateCards(validateOnlyModified: Boolean): Boolean
}

object BootstrapCardViewBatchEditApi {
  @scala.inline
  def apply(
    addNewCard: () => Unit,
    deleteCard: Double => Unit,
    deleteCardByKey: js.Any => Unit,
    getCardVisibleIndices: Boolean => js.Array[Double],
    getDeletedCardIndices: () => js.Array[Double],
    getInsertedCardIndices: () => js.Array[Double],
    instance: js.Any,
    isDeletedCard: Double => Boolean,
    isNewCard: Double => Boolean,
    recoverCard: Double => Unit,
    recoverCardByKey: js.Any => Unit,
    validateCard: Double => Boolean,
    validateCards: Boolean => Boolean
  ): BootstrapCardViewBatchEditApi = {
    val __obj = js.Dynamic.literal(addNewCard = js.Any.fromFunction0(addNewCard), deleteCard = js.Any.fromFunction1(deleteCard), deleteCardByKey = js.Any.fromFunction1(deleteCardByKey), getCardVisibleIndices = js.Any.fromFunction1(getCardVisibleIndices), getDeletedCardIndices = js.Any.fromFunction0(getDeletedCardIndices), getInsertedCardIndices = js.Any.fromFunction0(getInsertedCardIndices), instance = instance.asInstanceOf[js.Any], isDeletedCard = js.Any.fromFunction1(isDeletedCard), isNewCard = js.Any.fromFunction1(isNewCard), recoverCard = js.Any.fromFunction1(recoverCard), recoverCardByKey = js.Any.fromFunction1(recoverCardByKey), validateCard = js.Any.fromFunction1(validateCard), validateCards = js.Any.fromFunction1(validateCards))
    __obj.asInstanceOf[BootstrapCardViewBatchEditApi]
  }
}

