package typings.devtools.anon

import typings.devtools.devtoolsStrings.tab
import typings.devtools.devtoolsStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handle extends StObject {
  
  var handle: String
  
  var `type`: tab | window
}
object Handle {
  
  inline def apply(handle: String, `type`: tab | window): Handle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handle]
  }
  
  extension [Self <: Handle](x: Self) {
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setType(value: tab | window): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
