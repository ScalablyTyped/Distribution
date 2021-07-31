package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXBoundaryElement
  extends StObject
     with BaseNode {
  
  var name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName
}
object JSXBoundaryElement {
  
  @scala.inline
  def apply(name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName, `type`: String): JSXBoundaryElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXBoundaryElement]
  }
  
  @scala.inline
  implicit class JSXBoundaryElementMutableBuilder[Self <: JSXBoundaryElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: JSXIdentifier | JSXMemberExpression | JSXNamespacedName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
