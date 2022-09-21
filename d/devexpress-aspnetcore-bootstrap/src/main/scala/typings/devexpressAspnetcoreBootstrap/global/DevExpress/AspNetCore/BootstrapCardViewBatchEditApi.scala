package typings.devexpressAspnetcoreBootstrap.global.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("DevExpress.AspNetCore.BootstrapCardViewBatchEditApi")
@js.native
open class BootstrapCardViewBatchEditApi protected ()
  extends StObject
     with typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore.BootstrapCardViewBatchEditApi {
  /* protected */ def this(instance: Any) = this()
  
  /* CompleteClass */
  override def addNewCard(): Unit = js.native
  
  /* CompleteClass */
  override def deleteCard(visibleIndex: Double): Unit = js.native
  
  /* CompleteClass */
  override def deleteCardByKey(key: Any): Unit = js.native
  
  /* CompleteClass */
  override def getCardVisibleIndices(includeDeleted: Boolean): js.Array[Double] = js.native
  
  /* CompleteClass */
  override def getDeletedCardIndices(): js.Array[Double] = js.native
  
  /* CompleteClass */
  override def getInsertedCardIndices(): js.Array[Double] = js.native
  
  /* protected */ /* CompleteClass */
  override val instance: Any = js.native
  
  /* CompleteClass */
  override def isDeletedCard(visibleIndex: Double): Boolean = js.native
  
  /* CompleteClass */
  override def isNewCard(visibleIndex: Double): Boolean = js.native
  
  /* CompleteClass */
  override def recoverCard(visibleIndex: Double): Unit = js.native
  
  /* CompleteClass */
  override def recoverCardByKey(key: Any): Unit = js.native
  
  /* CompleteClass */
  override def validateCard(visibleIndex: Double): Boolean = js.native
  
  /* CompleteClass */
  override def validateCards(validateOnlyModified: Boolean): Boolean = js.native
}
