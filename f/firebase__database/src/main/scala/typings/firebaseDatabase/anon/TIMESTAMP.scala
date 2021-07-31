package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TIMESTAMP extends StObject {
  
  var TIMESTAMP: Sv
  
  def increment(delta: Double): SvIncrement
}
object TIMESTAMP {
  
  @scala.inline
  def apply(TIMESTAMP: Sv, increment: Double => SvIncrement): TIMESTAMP = {
    val __obj = js.Dynamic.literal(TIMESTAMP = TIMESTAMP.asInstanceOf[js.Any], increment = js.Any.fromFunction1(increment))
    __obj.asInstanceOf[TIMESTAMP]
  }
  
  @scala.inline
  implicit class TIMESTAMPMutableBuilder[Self <: TIMESTAMP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncrement(value: Double => SvIncrement): Self = StObject.set(x, "increment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTIMESTAMP(value: Sv): Self = StObject.set(x, "TIMESTAMP", value.asInstanceOf[js.Any])
  }
}
