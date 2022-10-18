package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.ListenSequenceNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcCoreListenSequenceMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/listen_sequence", "ListenSequence")
  @js.native
  open class ListenSequence protected () extends StObject {
    def this(previousValue: ListenSequenceNumber) = this()
    def this(previousValue: ListenSequenceNumber, sequenceNumberSyncer: SequenceNumberSyncer) = this()
    
    def next(): ListenSequenceNumber = js.native
    
    /* private */ var previousValue: Any = js.native
    
    /* private */ var setPreviousValue: Any = js.native
    
    /* private */ var writeNewSequenceNumber: Any = js.native
  }
  /* static members */
  object ListenSequence {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/core/listen_sequence", "ListenSequence.INVALID")
    @js.native
    val INVALID: ListenSequenceNumber = js.native
  }
  
  trait SequenceNumberSyncer extends StObject {
    
    var sequenceNumberHandler: (js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]) | Null
    
    def writeSequenceNumber(sequenceNumber: ListenSequenceNumber): Unit
  }
  object SequenceNumberSyncer {
    
    inline def apply(writeSequenceNumber: ListenSequenceNumber => Unit): SequenceNumberSyncer = {
      val __obj = js.Dynamic.literal(writeSequenceNumber = js.Any.fromFunction1(writeSequenceNumber), sequenceNumberHandler = null)
      __obj.asInstanceOf[SequenceNumberSyncer]
    }
    
    extension [Self <: SequenceNumberSyncer](x: Self) {
      
      inline def setSequenceNumberHandler(value: /* sequenceNumber */ ListenSequenceNumber => Unit): Self = StObject.set(x, "sequenceNumberHandler", js.Any.fromFunction1(value))
      
      inline def setSequenceNumberHandlerNull: Self = StObject.set(x, "sequenceNumberHandler", null)
      
      inline def setWriteSequenceNumber(value: ListenSequenceNumber => Unit): Self = StObject.set(x, "writeSequenceNumber", js.Any.fromFunction1(value))
    }
  }
}
