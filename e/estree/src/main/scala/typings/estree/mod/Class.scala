package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.estree.mod.ClassDeclaration
  - typings.estree.mod.ClassExpression
*/
trait Class extends Node
object Class {
  
  @scala.inline
  def ClassDeclaration(body: ClassBody, `type`: typings.estree.estreeStrings.ClassDeclaration): typings.estree.mod.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ClassDeclaration]
  }
  
  @scala.inline
  def ClassExpression(body: ClassBody, `type`: typings.estree.estreeStrings.ClassExpression): typings.estree.mod.ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ClassExpression]
  }
}
