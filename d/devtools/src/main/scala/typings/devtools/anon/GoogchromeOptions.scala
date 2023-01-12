package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogchromeOptions extends StObject {
  
  @JSName("goog:chromeOptions")
  var googColonchromeOptions: DebuggerAddress
}
object GoogchromeOptions {
  
  inline def apply(googColonchromeOptions: DebuggerAddress): GoogchromeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("goog:chromeOptions")(googColonchromeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogchromeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogchromeOptions] (val x: Self) extends AnyVal {
    
    inline def setGoogColonchromeOptions(value: DebuggerAddress): Self = StObject.set(x, "goog:chromeOptions", value.asInstanceOf[js.Any])
  }
}
