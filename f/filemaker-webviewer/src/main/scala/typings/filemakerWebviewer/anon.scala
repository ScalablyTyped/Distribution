package typings.filemakerWebviewer

import typings.filemakerWebviewer.filemakerWebviewerStrings.`0`
import typings.filemakerWebviewer.filemakerWebviewerStrings.`1`
import typings.filemakerWebviewer.filemakerWebviewerStrings.`2`
import typings.filemakerWebviewer.filemakerWebviewerStrings.`3`
import typings.filemakerWebviewer.filemakerWebviewerStrings.`4`
import typings.filemakerWebviewer.filemakerWebviewerStrings.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait PerformScript extends StObject {
    
    def PerformScript(name: String, parameter: String): Unit
    
    def PerformScriptWithOption(name: String, parameter: String, option: `0` | `1` | `2` | `3` | `4` | `5`): Unit
  }
  object PerformScript {
    
    inline def apply(
      PerformScript: (String, String) => Unit,
      PerformScriptWithOption: (String, String, `0` | `1` | `2` | `3` | `4` | `5`) => Unit
    ): PerformScript = {
      val __obj = js.Dynamic.literal(PerformScript = js.Any.fromFunction2(PerformScript), PerformScriptWithOption = js.Any.fromFunction3(PerformScriptWithOption))
      __obj.asInstanceOf[PerformScript]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PerformScript] (val x: Self) extends AnyVal {
      
      inline def setPerformScript(value: (String, String) => Unit): Self = StObject.set(x, "PerformScript", js.Any.fromFunction2(value))
      
      inline def setPerformScriptWithOption(value: (String, String, `0` | `1` | `2` | `3` | `4` | `5`) => Unit): Self = StObject.set(x, "PerformScriptWithOption", js.Any.fromFunction3(value))
    }
  }
}
