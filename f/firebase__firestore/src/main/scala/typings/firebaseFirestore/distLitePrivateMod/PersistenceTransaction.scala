package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A base class representing a persistence transaction, encapsulating both the
  * transaction's sequence numbers as well as a list of onCommitted listeners.
  *
  * When you call Persistence.runTransaction(), it will create a transaction and
  * pass it to your callback. You then pass it to any method that operates
  * on persistence.
  */
trait PersistenceTransaction extends StObject {
  
  def addOnCommittedListener(listener: js.Function0[Unit]): Unit
  
  val currentSequenceNumber: ListenSequenceNumber
  
  /* private */ val onCommittedListeners: Any
  
  def raiseOnCommittedEvent(): Unit
}
object PersistenceTransaction {
  
  inline def apply(
    addOnCommittedListener: js.Function0[Unit] => Unit,
    currentSequenceNumber: ListenSequenceNumber,
    onCommittedListeners: Any,
    raiseOnCommittedEvent: () => Unit
  ): PersistenceTransaction = {
    val __obj = js.Dynamic.literal(addOnCommittedListener = js.Any.fromFunction1(addOnCommittedListener), currentSequenceNumber = currentSequenceNumber.asInstanceOf[js.Any], onCommittedListeners = onCommittedListeners.asInstanceOf[js.Any], raiseOnCommittedEvent = js.Any.fromFunction0(raiseOnCommittedEvent))
    __obj.asInstanceOf[PersistenceTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistenceTransaction] (val x: Self) extends AnyVal {
    
    inline def setAddOnCommittedListener(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "addOnCommittedListener", js.Any.fromFunction1(value))
    
    inline def setCurrentSequenceNumber(value: ListenSequenceNumber): Self = StObject.set(x, "currentSequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setOnCommittedListeners(value: Any): Self = StObject.set(x, "onCommittedListeners", value.asInstanceOf[js.Any])
    
    inline def setRaiseOnCommittedEvent(value: () => Unit): Self = StObject.set(x, "raiseOnCommittedEvent", js.Any.fromFunction0(value))
  }
}
