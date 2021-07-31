package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameExpression
  extends StObject
     with Type_ {
  
  var name: String
  
  var `type`: typings.doctrine.doctrineStrings.NameExpression
}
object NameExpression {
  
  @scala.inline
  def apply(name: String): NameExpression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NameExpression")
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
