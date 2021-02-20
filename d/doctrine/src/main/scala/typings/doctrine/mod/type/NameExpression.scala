package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameExpression extends Type_ {
  
  var name: String = js.native
  
  var `type`: typings.doctrine.doctrineStrings.NameExpression = js.native
}
object NameExpression {
  
  @scala.inline
  def apply(name: String, `type`: typings.doctrine.doctrineStrings.NameExpression): NameExpression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameExpression]
  }
  
  @scala.inline
  implicit class NameExpressionMutableBuilder[Self <: NameExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.doctrine.doctrineStrings.NameExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
