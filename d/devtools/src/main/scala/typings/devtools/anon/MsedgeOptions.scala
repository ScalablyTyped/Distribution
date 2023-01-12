package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MsedgeOptions extends StObject {
  
  @JSName("ms:edgeOptions")
  var msColonedgeOptions: DebuggerAddress
}
object MsedgeOptions {
  
  inline def apply(msColonedgeOptions: DebuggerAddress): MsedgeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ms:edgeOptions")(msColonedgeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsedgeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MsedgeOptions] (val x: Self) extends AnyVal {
    
    inline def setMsColonedgeOptions(value: DebuggerAddress): Self = StObject.set(x, "ms:edgeOptions", value.asInstanceOf[js.Any])
  }
}
