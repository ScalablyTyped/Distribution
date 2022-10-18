package typings.firebaseFirestore

import typings.firebaseFirestore.anon.CloseFn
import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteConnectionMod.Stream
import typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcRemoteStreamBridgeMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/remote/stream_bridge", "StreamBridge")
  @js.native
  open class StreamBridge[I, O] protected ()
    extends StObject
       with Stream[I, O] {
    def this(args: CloseFn[I]) = this()
    
    def callOnClose(): Unit = js.native
    def callOnClose(err: FirestoreError): Unit = js.native
    
    def callOnMessage(msg: O): Unit = js.native
    
    def callOnOpen(): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* private */ var closeFn: Any = js.native
    
    /* CompleteClass */
    override def onClose(callback: js.Function1[/* err */ js.UndefOr[FirestoreError], Unit]): Unit = js.native
    
    /* CompleteClass */
    override def onMessage(callback: js.Function1[O, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def onOpen(callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def send(msg: I): Unit = js.native
    
    /* private */ var sendFn: Any = js.native
    
    /* private */ var wrappedOnClose: Any = js.native
    
    /* private */ var wrappedOnMessage: Any = js.native
    
    /* private */ var wrappedOnOpen: Any = js.native
  }
}
