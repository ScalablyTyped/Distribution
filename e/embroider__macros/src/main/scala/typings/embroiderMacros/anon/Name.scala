package typings.embroiderMacros.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: String
  
  var visitor: MustacheStatement
}
object Name {
  
  inline def apply(name: String, visitor: MustacheStatement): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], visitor = visitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVisitor(value: MustacheStatement): Self = StObject.set(x, "visitor", value.asInstanceOf[js.Any])
  }
}
