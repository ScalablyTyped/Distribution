package typings.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseStorage.xhrioMod.Headers
import typings.firebaseStorage.xhrioMod.XhrIo
import typings.std.ArrayBufferView
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unitXhrioMod {
  
  @js.native
  sealed trait State extends StObject
  @JSImport("@firebase/storage/dist/test/unit/xhrio", "State")
  @js.native
  object State extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[State with Double] = js.native
    
    @js.native
    sealed trait DONE extends State
    /* 2 */ val DONE: typings.firebaseStorage.unitXhrioMod.State.DONE with Double = js.native
    
    @js.native
    sealed trait SENT extends State
    /* 1 */ val SENT: typings.firebaseStorage.unitXhrioMod.State.SENT with Double = js.native
    
    @js.native
    sealed trait START extends State
    /* 0 */ val START: typings.firebaseStorage.unitXhrioMod.State.START with Double = js.native
  }
  
  @JSImport("@firebase/storage/dist/test/unit/xhrio", "TestingXhrIo")
  @js.native
  class TestingXhrIo () extends XhrIo {
    def this(sendHook: SendHook) = this()
    
    def addUploadProgressListener(): Unit = js.native
    
    var errorCode: js.Any = js.native
    
    var headers: js.Any = js.native
    
    def removeUploadProgressListener(): Unit = js.native
    
    var resolve: js.Any = js.native
    
    var responseText: js.Any = js.native
    
    var sendHook: js.Any = js.native
    
    var sendPromise: js.Any = js.native
    
    def simulateResponse(status: Double, body: String, headers: StringDictionary[String]): Unit = js.native
    
    var state: js.Any = js.native
    
    var status: js.Any = js.native
  }
  
  type SendHook = js.Function5[
    /* xhrio */ TestingXhrIo, 
    /* url */ String, 
    /* method */ String, 
    /* body */ js.UndefOr[ArrayBufferView | Blob | String | Null], 
    /* headers */ js.UndefOr[Headers], 
    Unit
  ]
  
  type StringHeaders = StringDictionary[String]
}
