package typings.esbuildWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServeResult extends StObject {
  
  var host: String
  
  var port: Double
  
  def stop(): Unit
  
  @JSName("wait")
  var wait_FServeResult: js.Promise[Unit]
}
object ServeResult {
  
  inline def apply(host: String, port: Double, stop: () => Unit, wait_ : js.Promise[Unit]): ServeResult = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServeResult] (val x: Self) extends AnyVal {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setWait_(value: js.Promise[Unit]): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
  }
}
