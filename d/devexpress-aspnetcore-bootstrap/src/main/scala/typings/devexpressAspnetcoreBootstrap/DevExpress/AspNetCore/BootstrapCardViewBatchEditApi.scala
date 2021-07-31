package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapCardViewBatchEditApi extends StObject {
  
  def addNewCard(): Unit
  
  def deleteCard(visibleIndex: Double): Unit
  
  def deleteCardByKey(key: js.Any): Unit
  
  def getCardVisibleIndices(includeDeleted: Boolean): js.Array[Double]
  
  def getDeletedCardIndices(): js.Array[Double]
  
  def getInsertedCardIndices(): js.Array[Double]
  
  val instance: js.Any
  
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
  
  @scala.inline
  implicit class BootstrapCardViewBatchEditApiMutableBuilder[Self <: BootstrapCardViewBatchEditApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddNewCard(value: () => Unit): Self = StObject.set(x, "addNewCard", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteCard(value: Double => Unit): Self = StObject.set(x, "deleteCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteCardByKey(value: js.Any => Unit): Self = StObject.set(x, "deleteCardByKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCardVisibleIndices(value: Boolean => js.Array[Double]): Self = StObject.set(x, "getCardVisibleIndices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDeletedCardIndices(value: () => js.Array[Double]): Self = StObject.set(x, "getDeletedCardIndices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInsertedCardIndices(value: () => js.Array[Double]): Self = StObject.set(x, "getInsertedCardIndices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeletedCard(value: Double => Boolean): Self = StObject.set(x, "isDeletedCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNewCard(value: Double => Boolean): Self = StObject.set(x, "isNewCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRecoverCard(value: Double => Unit): Self = StObject.set(x, "recoverCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRecoverCardByKey(value: js.Any => Unit): Self = StObject.set(x, "recoverCardByKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateCard(value: Double => Boolean): Self = StObject.set(x, "validateCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateCards(value: Boolean => Boolean): Self = StObject.set(x, "validateCards", js.Any.fromFunction1(value))
  }
}
