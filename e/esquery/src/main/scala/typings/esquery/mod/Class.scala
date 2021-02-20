package typings.esquery.mod

import typings.esquery.esqueryStrings.`class`
import typings.esquery.esqueryStrings.declaration
import typings.esquery.esqueryStrings.expression
import typings.esquery.esqueryStrings.function
import typings.esquery.esqueryStrings.pattern
import typings.esquery.esqueryStrings.statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Class
  extends Atom
     with Selector {
  
  var name: declaration | expression | function | pattern | statement = js.native
  
  @JSName("type")
  var type_Class: `class` = js.native
}
object Class {
  
  @scala.inline
  def apply(name: declaration | expression | function | pattern | statement, `type`: `class`): Class = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
  
  @scala.inline
  implicit class ClassMutableBuilder[Self <: Class] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: declaration | expression | function | pattern | statement): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `class`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
