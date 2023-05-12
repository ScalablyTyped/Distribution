package typings.esbuildWasm.libBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServeOptions extends StObject {
  
  var certfile: js.UndefOr[String] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var keyfile: js.UndefOr[String] = js.undefined
  
  var onRequest: js.UndefOr[js.Function1[/* args */ ServeOnRequestArgs, Unit]] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var servedir: js.UndefOr[String] = js.undefined
}
object ServeOptions {
  
  inline def apply(): ServeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServeOptions] (val x: Self) extends AnyVal {
    
    inline def setCertfile(value: String): Self = StObject.set(x, "certfile", value.asInstanceOf[js.Any])
    
    inline def setCertfileUndefined: Self = StObject.set(x, "certfile", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setKeyfile(value: String): Self = StObject.set(x, "keyfile", value.asInstanceOf[js.Any])
    
    inline def setKeyfileUndefined: Self = StObject.set(x, "keyfile", js.undefined)
    
    inline def setOnRequest(value: /* args */ ServeOnRequestArgs => Unit): Self = StObject.set(x, "onRequest", js.Any.fromFunction1(value))
    
    inline def setOnRequestUndefined: Self = StObject.set(x, "onRequest", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setServedir(value: String): Self = StObject.set(x, "servedir", value.asInstanceOf[js.Any])
    
    inline def setServedirUndefined: Self = StObject.set(x, "servedir", js.undefined)
  }
}
