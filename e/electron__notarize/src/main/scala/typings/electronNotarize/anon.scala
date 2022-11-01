package typings.electronNotarize

import typings.electronNotarize.electronNotarizeStrings.legacy
import typings.electronNotarize.electronNotarizeStrings.notarytool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var tool: notarytool
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(tool = "notarytool")
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setTool(value: notarytool): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tool extends StObject {
    
    var tool: js.UndefOr[legacy] = js.undefined
  }
  object Tool {
    
    inline def apply(): Tool = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tool]
    }
    
    extension [Self <: Tool](x: Self) {
      
      inline def setTool(value: legacy): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      
      inline def setToolUndefined: Self = StObject.set(x, "tool", js.undefined)
    }
  }
}
