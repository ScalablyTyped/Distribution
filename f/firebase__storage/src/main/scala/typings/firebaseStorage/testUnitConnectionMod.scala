package typings.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseStorage.implementationConnectionMod.Connection
import typings.firebaseStorage.implementationConnectionMod.Headers
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUnitConnectionMod {
  
  @JSImport("@firebase/storage/dist/test/unit/connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait State extends StObject
  @JSImport("@firebase/storage/dist/test/unit/connection", "State")
  @js.native
  object State extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[State & Double] = js.native
    
    @js.native
    sealed trait DONE
      extends StObject
         with State
    /* 2 */ val DONE: typings.firebaseStorage.testUnitConnectionMod.State.DONE & Double = js.native
    
    @js.native
    sealed trait SENT
      extends StObject
         with State
    /* 1 */ val SENT: typings.firebaseStorage.testUnitConnectionMod.State.SENT & Double = js.native
    
    @js.native
    sealed trait START
      extends StObject
         with State
    /* 0 */ val START: typings.firebaseStorage.testUnitConnectionMod.State.START & Double = js.native
  }
  
  @JSImport("@firebase/storage/dist/test/unit/connection", "TestingConnection")
  @js.native
  open class TestingConnection ()
    extends StObject
       with Connection[String] {
    def this(sendHook: SendHook) = this()
    
    def addUploadProgressListener(): Unit = js.native
    
    /* private */ var errorCode: Any = js.native
    
    /* private */ var headers: Any = js.native
    
    def removeUploadProgressListener(): Unit = js.native
    
    /* private */ var resolve: Any = js.native
    
    /* private */ var responseText: Any = js.native
    
    /* private */ var sendHook: Any = js.native
    
    /* private */ var sendPromise: Any = js.native
    
    def simulateResponse(status: Double, body: String, headers: StringDictionary[String]): Unit = js.native
    
    /* private */ var state: Any = js.native
    
    /* private */ var status: Any = js.native
  }
  
  inline def newTestConnection(): Connection[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("newTestConnection")().asInstanceOf[Connection[String]]
  inline def newTestConnection(sendHook: SendHook): Connection[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("newTestConnection")(sendHook.asInstanceOf[js.Any]).asInstanceOf[Connection[String]]
  
  type SendHook = js.Function5[
    /* connection */ TestingConnection, 
    /* url */ String, 
    /* method */ String, 
    /* body */ js.UndefOr[js.typedarray.ArrayBufferView | Blob | String | Null], 
    /* headers */ js.UndefOr[Headers], 
    Unit
  ]
}
