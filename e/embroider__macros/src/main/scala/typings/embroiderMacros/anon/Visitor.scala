package typings.embroiderMacros.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visitor extends StObject {
  
  var name: String
  
  var visitor: BlockStatement
}
object Visitor {
  
  inline def apply(name: String, visitor: BlockStatement): Visitor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], visitor = visitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visitor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Visitor] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVisitor(value: BlockStatement): Self = StObject.set(x, "visitor", value.asInstanceOf[js.Any])
  }
}
