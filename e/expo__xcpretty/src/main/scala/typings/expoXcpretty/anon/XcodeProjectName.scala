package typings.expoXcpretty.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XcodeProjectName extends StObject {
  
  var xcodeProjectName: js.UndefOr[String] = js.undefined
}
object XcodeProjectName {
  
  inline def apply(): XcodeProjectName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XcodeProjectName]
  }
  
  extension [Self <: XcodeProjectName](x: Self) {
    
    inline def setXcodeProjectName(value: String): Self = StObject.set(x, "xcodeProjectName", value.asInstanceOf[js.Any])
    
    inline def setXcodeProjectNameUndefined: Self = StObject.set(x, "xcodeProjectName", js.undefined)
  }
}
