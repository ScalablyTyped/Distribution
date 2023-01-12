package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Find extends StObject {
  
  var find: js.RegExp
  
  var replacement: String
}
object Find {
  
  inline def apply(find: js.RegExp, replacement: String): Find = {
    val __obj = js.Dynamic.literal(find = find.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Find]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Find] (val x: Self) extends AnyVal {
    
    inline def setFind(value: js.RegExp): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
    
    inline def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
  }
}
