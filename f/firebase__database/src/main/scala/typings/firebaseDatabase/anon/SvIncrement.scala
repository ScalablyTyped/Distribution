package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SvIncrement extends StObject {
  
  @JSName(".sv")
  var Dotsv: Increment
}
object SvIncrement {
  
  @scala.inline
  def apply(Dotsv: Increment): SvIncrement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".sv")(Dotsv.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvIncrement]
  }
  
  @scala.inline
  implicit class SvIncrementMutableBuilder[Self <: SvIncrement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDotsv(value: Increment): Self = StObject.set(x, ".sv", value.asInstanceOf[js.Any])
  }
}
