package typings.esquery.mod

import typings.esquery.esqueryStrings.`class`
import typings.esquery.esqueryStrings.declaration
import typings.esquery.esqueryStrings.expression
import typings.esquery.esqueryStrings.function
import typings.esquery.esqueryStrings.pattern
import typings.esquery.esqueryStrings.statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Class
  extends StObject
     with Atom
     with Selector {
  
  var name: declaration | expression | function | pattern | statement
  
  @JSName("type")
  var type_Class: `class`
}
object Class {
  
  inline def apply(name: declaration | expression | function | pattern | statement): Class = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("class")
    __obj.asInstanceOf[Class]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Class] (val x: Self) extends AnyVal {
    
    inline def setName(value: declaration | expression | function | pattern | statement): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `class`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
