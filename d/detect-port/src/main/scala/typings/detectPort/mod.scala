package typings.detectPort

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("detect-port", JSImport.Namespace)
  @js.native
  val ^ : DetectPort = js.native
  
  @js.native
  trait DetectPort extends StObject {
    
    def apply(port: Double): js.Promise[Double] = js.native
    def apply(port: Double, callback: DetectPortCallback): Unit = js.native
    def apply(port: PortConfig): js.Promise[Double] = js.native
    def apply(port: PortConfig, callback: DetectPortCallback): Unit = js.native
  }
  
  type DetectPortCallback = js.Function2[/* err */ js.Error, /* _port */ Double, Unit]
  
  trait PortConfig extends StObject {
    
    var callback: js.UndefOr[DetectPortCallback] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var port: Double
  }
  object PortConfig {
    
    inline def apply(port: Double): PortConfig = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PortConfig] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: (/* err */ js.Error, /* _port */ Double) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = DetectPort
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: DetectPort = ^
}
