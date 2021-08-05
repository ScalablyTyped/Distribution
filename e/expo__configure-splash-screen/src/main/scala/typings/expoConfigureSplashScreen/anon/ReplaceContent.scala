package typings.expoConfigureSplashScreen.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceContent extends StObject {
  
  var replaceContent: String
  
  var replacePattern: String | RegExp
}
object ReplaceContent {
  
  inline def apply(replaceContent: String, replacePattern: String | RegExp): ReplaceContent = {
    val __obj = js.Dynamic.literal(replaceContent = replaceContent.asInstanceOf[js.Any], replacePattern = replacePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceContent]
  }
  
  extension [Self <: ReplaceContent](x: Self) {
    
    inline def setReplaceContent(value: String): Self = StObject.set(x, "replaceContent", value.asInstanceOf[js.Any])
    
    inline def setReplacePattern(value: String | RegExp): Self = StObject.set(x, "replacePattern", value.asInstanceOf[js.Any])
  }
}
