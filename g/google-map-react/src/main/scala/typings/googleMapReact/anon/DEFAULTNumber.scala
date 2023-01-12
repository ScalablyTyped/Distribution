package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DEFAULTNumber extends StObject {
  
  var DEFAULT: Double
}
object DEFAULTNumber {
  
  inline def apply(DEFAULT: Double): DEFAULTNumber = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEFAULTNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DEFAULTNumber] (val x: Self) extends AnyVal {
    
    inline def setDEFAULT(value: Double): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
  }
}
