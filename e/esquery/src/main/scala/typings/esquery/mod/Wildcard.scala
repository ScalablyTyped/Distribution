package typings.esquery.mod

import typings.esquery.esqueryStrings.Asterisk
import typings.esquery.esqueryStrings.wildcard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wildcard
  extends StObject
     with SubjectSelectorAtom
     with Selector
     with SubjectSelector {
  
  @JSName("type")
  var type_Wildcard: wildcard
  
  var value: Asterisk
}
object Wildcard {
  
  inline def apply(): Wildcard = {
    val __obj = js.Dynamic.literal(value = "*")
    __obj.updateDynamic("type")("wildcard")
    __obj.asInstanceOf[Wildcard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Wildcard] (val x: Self) extends AnyVal {
    
    inline def setType(value: wildcard): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Asterisk): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
