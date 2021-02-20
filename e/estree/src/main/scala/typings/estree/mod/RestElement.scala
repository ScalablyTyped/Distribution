package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestElement
  extends BaseNode
     with Pattern {
  
  var argument: Pattern = js.native
  
  @JSName("type")
  var type_RestElement: typings.estree.estreeStrings.RestElement = js.native
}
object RestElement {
  
  @scala.inline
  def apply(argument: Pattern, `type`: typings.estree.estreeStrings.RestElement): RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestElement]
  }
  
  @scala.inline
  implicit class RestElementMutableBuilder[Self <: RestElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Pattern): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.RestElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
