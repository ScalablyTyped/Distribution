package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** See Electron docs for explanations. https://www.electronjs.org/docs/api/dialog */
trait ShowMessageBoxOptions extends StObject {
  
  var buttons: js.UndefOr[js.Array[String]] = js.undefined
  
  var cancelId: js.UndefOr[Double] = js.undefined
  
  var message: String
  
  var title: js.UndefOr[String] = js.undefined
}
object ShowMessageBoxOptions {
  
  inline def apply(message: String): ShowMessageBoxOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowMessageBoxOptions]
  }
  
  extension [Self <: ShowMessageBoxOptions](x: Self) {
    
    inline def setButtons(value: js.Array[String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: String*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setCancelId(value: Double): Self = StObject.set(x, "cancelId", value.asInstanceOf[js.Any])
    
    inline def setCancelIdUndefined: Self = StObject.set(x, "cancelId", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
