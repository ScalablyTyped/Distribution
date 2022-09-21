package typings.expoXcpretty.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XcodeProject extends StObject {
  
  var xcodeProject: js.UndefOr[Name] = js.undefined
}
object XcodeProject {
  
  inline def apply(): XcodeProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XcodeProject]
  }
  
  extension [Self <: XcodeProject](x: Self) {
    
    inline def setXcodeProject(value: Name): Self = StObject.set(x, "xcodeProject", value.asInstanceOf[js.Any])
    
    inline def setXcodeProjectUndefined: Self = StObject.set(x, "xcodeProject", js.undefined)
  }
}
