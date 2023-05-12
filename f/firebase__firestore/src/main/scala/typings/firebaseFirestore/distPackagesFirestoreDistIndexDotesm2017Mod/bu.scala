package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait bu extends StObject {
  
  var Wr: vu
  
  def addLocalQueryTarget(t: Any): Any
  
  def addPendingMutation(t: Any): Unit
  
  def clearQueryState(t: Any): Unit
  
  def getAllActiveQueryTargets(): Ee
  
  def handleUserChange(t: Any, e: Any, n: Any): Unit
  
  def isActiveQueryTarget(t: Any): Boolean
  
  def isLocalQueryTarget(t: Any): Boolean
  
  def notifyBundleLoaded(t: Any): Unit
  
  var onlineStateHandler: Any
  
  def removeLocalQueryTarget(t: Any): Unit
  
  var sequenceNumberHandler: Any
  
  def setOnlineState(t: Any): Unit
  
  def shutdown(): Unit
  
  def start(): js.Promise[Unit]
  
  def updateMutationState(t: Any, e: Any, n: Any): Unit
  
  def updateQueryState(t: Any, e: Any, n: Any): Unit
  
  def writeSequenceNumber(t: Any): Unit
}
object bu {
  
  inline def apply(
    Wr: vu,
    addLocalQueryTarget: Any => Any,
    addPendingMutation: Any => Unit,
    clearQueryState: Any => Unit,
    getAllActiveQueryTargets: () => Ee,
    handleUserChange: (Any, Any, Any) => Unit,
    isActiveQueryTarget: Any => Boolean,
    isLocalQueryTarget: Any => Boolean,
    notifyBundleLoaded: Any => Unit,
    onlineStateHandler: Any,
    removeLocalQueryTarget: Any => Unit,
    sequenceNumberHandler: Any,
    setOnlineState: Any => Unit,
    shutdown: () => Unit,
    start: () => js.Promise[Unit],
    updateMutationState: (Any, Any, Any) => Unit,
    updateQueryState: (Any, Any, Any) => Unit,
    writeSequenceNumber: Any => Unit
  ): bu = {
    val __obj = js.Dynamic.literal(Wr = Wr.asInstanceOf[js.Any], addLocalQueryTarget = js.Any.fromFunction1(addLocalQueryTarget), addPendingMutation = js.Any.fromFunction1(addPendingMutation), clearQueryState = js.Any.fromFunction1(clearQueryState), getAllActiveQueryTargets = js.Any.fromFunction0(getAllActiveQueryTargets), handleUserChange = js.Any.fromFunction3(handleUserChange), isActiveQueryTarget = js.Any.fromFunction1(isActiveQueryTarget), isLocalQueryTarget = js.Any.fromFunction1(isLocalQueryTarget), notifyBundleLoaded = js.Any.fromFunction1(notifyBundleLoaded), onlineStateHandler = onlineStateHandler.asInstanceOf[js.Any], removeLocalQueryTarget = js.Any.fromFunction1(removeLocalQueryTarget), sequenceNumberHandler = sequenceNumberHandler.asInstanceOf[js.Any], setOnlineState = js.Any.fromFunction1(setOnlineState), shutdown = js.Any.fromFunction0(shutdown), start = js.Any.fromFunction0(start), updateMutationState = js.Any.fromFunction3(updateMutationState), updateQueryState = js.Any.fromFunction3(updateQueryState), writeSequenceNumber = js.Any.fromFunction1(writeSequenceNumber))
    __obj.asInstanceOf[bu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: bu] (val x: Self) extends AnyVal {
    
    inline def setAddLocalQueryTarget(value: Any => Any): Self = StObject.set(x, "addLocalQueryTarget", js.Any.fromFunction1(value))
    
    inline def setAddPendingMutation(value: Any => Unit): Self = StObject.set(x, "addPendingMutation", js.Any.fromFunction1(value))
    
    inline def setClearQueryState(value: Any => Unit): Self = StObject.set(x, "clearQueryState", js.Any.fromFunction1(value))
    
    inline def setGetAllActiveQueryTargets(value: () => Ee): Self = StObject.set(x, "getAllActiveQueryTargets", js.Any.fromFunction0(value))
    
    inline def setHandleUserChange(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "handleUserChange", js.Any.fromFunction3(value))
    
    inline def setIsActiveQueryTarget(value: Any => Boolean): Self = StObject.set(x, "isActiveQueryTarget", js.Any.fromFunction1(value))
    
    inline def setIsLocalQueryTarget(value: Any => Boolean): Self = StObject.set(x, "isLocalQueryTarget", js.Any.fromFunction1(value))
    
    inline def setNotifyBundleLoaded(value: Any => Unit): Self = StObject.set(x, "notifyBundleLoaded", js.Any.fromFunction1(value))
    
    inline def setOnlineStateHandler(value: Any): Self = StObject.set(x, "onlineStateHandler", value.asInstanceOf[js.Any])
    
    inline def setRemoveLocalQueryTarget(value: Any => Unit): Self = StObject.set(x, "removeLocalQueryTarget", js.Any.fromFunction1(value))
    
    inline def setSequenceNumberHandler(value: Any): Self = StObject.set(x, "sequenceNumberHandler", value.asInstanceOf[js.Any])
    
    inline def setSetOnlineState(value: Any => Unit): Self = StObject.set(x, "setOnlineState", js.Any.fromFunction1(value))
    
    inline def setShutdown(value: () => Unit): Self = StObject.set(x, "shutdown", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => js.Promise[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setUpdateMutationState(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "updateMutationState", js.Any.fromFunction3(value))
    
    inline def setUpdateQueryState(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "updateQueryState", js.Any.fromFunction3(value))
    
    inline def setWr(value: vu): Self = StObject.set(x, "Wr", value.asInstanceOf[js.Any])
    
    inline def setWriteSequenceNumber(value: Any => Unit): Self = StObject.set(x, "writeSequenceNumber", js.Any.fromFunction1(value))
  }
}
