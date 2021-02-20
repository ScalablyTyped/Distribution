package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sv extends StObject {
  
  @JSName(".sv")
  var Dotsv: String = js.native
}
object Sv {
  
  @scala.inline
  def apply(Dotsv: String): Sv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".sv")(Dotsv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sv]
  }
  
  @scala.inline
  implicit class SvMutableBuilder[Self <: Sv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDotsv(value: String): Self = StObject.set(x, ".sv", value.asInstanceOf[js.Any])
  }
}
