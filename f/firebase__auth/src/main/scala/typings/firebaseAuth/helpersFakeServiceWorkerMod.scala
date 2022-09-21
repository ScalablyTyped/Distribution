package typings.firebaseAuth

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.MessagePort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersFakeServiceWorkerMod {
  
  @JSImport("@firebase/auth/dist/esm2017/test/helpers/fake_service_worker", "FakeServiceWorker")
  @js.native
  open class FakeServiceWorker () extends StObject {
    
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, _options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, _options: AddEventListenerOptions): Unit = js.native
    
    /* private */ val listeners: Any = js.native
    
    def postMessage(message: Any, transfer: js.Array[MessagePort]): Unit = js.native
    
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, _options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, _options: EventListenerOptions): Unit = js.native
  }
}
