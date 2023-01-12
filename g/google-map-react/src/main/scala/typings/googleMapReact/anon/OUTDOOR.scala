package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OUTDOOR extends StObject {
  
  var DEFAULT: String
  
  var OUTDOOR: String
}
object OUTDOOR {
  
  inline def apply(DEFAULT: String, OUTDOOR: String): OUTDOOR = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], OUTDOOR = OUTDOOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[OUTDOOR]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OUTDOOR] (val x: Self) extends AnyVal {
    
    inline def setDEFAULT(value: String): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    inline def setOUTDOOR(value: String): Self = StObject.set(x, "OUTDOOR", value.asInstanceOf[js.Any])
  }
}
