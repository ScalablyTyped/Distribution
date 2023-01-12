package typings.fbt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FbtNameProps extends StObject {
  
  var gender: IntlVariationsGender
  
  var name: String
}
object FbtNameProps {
  
  inline def apply(gender: IntlVariationsGender, name: String): FbtNameProps = {
    val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbtNameProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FbtNameProps] (val x: Self) extends AnyVal {
    
    inline def setGender(value: IntlVariationsGender): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
