package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sv extends StObject {
  
  @JSName(".sv")
  var Dotsv: String
}
object Sv {
  
  inline def apply(Dotsv: String): Sv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".sv")(Dotsv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sv]
  }
  
  extension [Self <: Sv](x: Self) {
    
    inline def setDotsv(value: String): Self = StObject.set(x, ".sv", value.asInstanceOf[js.Any])
  }
}
