package typings.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.firebaseStorage.xhrioMod.Headers
import typings.firebaseStorage.xhrioMod.XhrIo
import typings.std.ArrayBufferView
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/test/unit/xhrio", JSImport.Namespace)
@js.native
object unitXhrioMod extends js.Object {
  @js.native
  sealed trait State extends js.Object
  
  @js.native
  class TestingXhrIo () extends XhrIo {
    def this(sendHook: SendHook) = this()
    var errorCode: js.Any = js.native
    var headers: js.Any = js.native
    var resolve: js.Any = js.native
    var responseText: js.Any = js.native
    var sendHook: js.Any = js.native
    var sendPromise: js.Any = js.native
    var state: js.Any = js.native
    var status: js.Any = js.native
    def addUploadProgressListener(): Unit = js.native
    def removeUploadProgressListener(): Unit = js.native
    def simulateResponse(status: Double, body: String, headers: StringDictionary[String]): Unit = js.native
  }
  
  @js.native
  object State extends js.Object {
    @js.native
    sealed trait DONE extends State
    
    @js.native
    sealed trait SENT extends State
    
    @js.native
    sealed trait START extends State
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[State with Double] = js.native
    /* 2 */ @js.native
    object DONE extends TopLevel[DONE with Double]
    
    /* 1 */ @js.native
    object SENT extends TopLevel[SENT with Double]
    
    /* 0 */ @js.native
    object START extends TopLevel[START with Double]
    
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

