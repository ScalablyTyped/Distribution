package typings.electronPackager

import typings.electronPackager.electronPackagerStrings.legacy
import typings.electronPackager.electronPackagerStrings.notarytool
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tool] (val x: Self) extends AnyVal {
      
      inline def setTool(value: legacy): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      
      inline def setToolUndefined: Self = StObject.set(x, "tool", js.undefined)
    }
  }
}
