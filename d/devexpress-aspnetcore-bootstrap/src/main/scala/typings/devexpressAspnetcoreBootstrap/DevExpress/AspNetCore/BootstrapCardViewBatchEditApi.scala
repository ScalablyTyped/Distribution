package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapCardViewBatchEditApi extends js.Object {
  
  def addNewCard(): Unit = js.native
  
  def deleteCard(visibleIndex: Double): Unit = js.native
  
  def deleteCardByKey(key: js.Any): Unit = js.native
  
  def getCardVisibleIndices(includeDeleted: Boolean): js.Array[Double] = js.native
  
  def getDeletedCardIndices(): js.Array[Double] = js.native
  
  def getInsertedCardIndices(): js.Array[Double] = js.native
  
  val instance: js.Any = js.native
  
  def isDeletedCard(visibleIndex: Double): Boolean = js.native
  
  def isNewCard(visibleIndex: Double): Boolean = js.native
  
  def recoverCard(visibleIndex: Double): Unit = js.native
  
  def recoverCardByKey(key: js.Any): Unit = js.native
  
  def validateCard(visibleIndex: Double): Boolean = js.native
  
  def validateCards(validateOnlyModified: Boolean): Boolean = js.native
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
  
  @scala.inline
  implicit class BootstrapCardViewBatchEditApiOps[Self <: BootstrapCardViewBatchEditApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddNewCard(value: () => Unit): Self = this.set("addNewCard", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteCard(value: Double => Unit): Self = this.set("deleteCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteCardByKey(value: js.Any => Unit): Self = this.set("deleteCardByKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCardVisibleIndices(value: Boolean => js.Array[Double]): Self = this.set("getCardVisibleIndices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDeletedCardIndices(value: () => js.Array[Double]): Self = this.set("getDeletedCardIndices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInsertedCardIndices(value: () => js.Array[Double]): Self = this.set("getInsertedCardIndices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstance(value: js.Any): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeletedCard(value: Double => Boolean): Self = this.set("isDeletedCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNewCard(value: Double => Boolean): Self = this.set("isNewCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRecoverCard(value: Double => Unit): Self = this.set("recoverCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRecoverCardByKey(value: js.Any => Unit): Self = this.set("recoverCardByKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateCard(value: Double => Boolean): Self = this.set("validateCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateCards(value: Boolean => Boolean): Self = this.set("validateCards", js.Any.fromFunction1(value))
  }
}
