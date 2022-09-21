package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close extends StObject {
  
  def close(): Unit
  
  def isAvailable(cb: js.Function1[/* available */ Boolean, Unit]): Unit
  
  def openUrl(url: String): Unit
}
object Close {
  
  inline def apply(
    close: () => Unit,
    isAvailable: js.Function1[/* available */ Boolean, Unit] => Unit,
    openUrl: String => Unit
  ): Close = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isAvailable = js.Any.fromFunction1(isAvailable), openUrl = js.Any.fromFunction1(openUrl))
    __obj.asInstanceOf[Close]
  }
  
  extension [Self <: Close](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setIsAvailable(value: js.Function1[/* available */ Boolean, Unit] => Unit): Self = StObject.set(x, "isAvailable", js.Any.fromFunction1(value))
    
    inline def setOpenUrl(value: String => Unit): Self = StObject.set(x, "openUrl", js.Any.fromFunction1(value))
  }
}
