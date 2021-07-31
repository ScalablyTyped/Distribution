package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.estree.mod.Node because Already inherited */ trait Identifier
  extends StObject
     with BaseNode
     with Expression
     with Pattern {
  
  var name: String
  
  @JSName("type")
  var type_Identifier: typings.estree.estreeStrings.Identifier
}
object Identifier {
  
  @scala.inline
  def apply(name: String): Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[Identifier]
  }
  
  @scala.inline
  implicit class IdentifierMutableBuilder[Self <: Identifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
