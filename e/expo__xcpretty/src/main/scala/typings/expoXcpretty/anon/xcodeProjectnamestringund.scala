package typings.expoXcpretty.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  xcodeProject :{  name :string} | undefined} & std.Pick<@expo/xcpretty.@expo/xcpretty/build/ExpoRunFormatter.ExpoRunFormatterProps, 'isDebug'> */
trait xcodeProjectnamestringund extends StObject {
  
  var isDebug: js.UndefOr[Boolean] = js.undefined
  
  var xcodeProject: js.UndefOr[Name] = js.undefined
}
object xcodeProjectnamestringund {
  
  inline def apply(): xcodeProjectnamestringund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[xcodeProjectnamestringund]
  }
  
  extension [Self <: xcodeProjectnamestringund](x: Self) {
    
    inline def setIsDebug(value: Boolean): Self = StObject.set(x, "isDebug", value.asInstanceOf[js.Any])
    
    inline def setIsDebugUndefined: Self = StObject.set(x, "isDebug", js.undefined)
    
    inline def setXcodeProject(value: Name): Self = StObject.set(x, "xcodeProject", value.asInstanceOf[js.Any])
    
    inline def setXcodeProjectUndefined: Self = StObject.set(x, "xcodeProject", js.undefined)
  }
}
