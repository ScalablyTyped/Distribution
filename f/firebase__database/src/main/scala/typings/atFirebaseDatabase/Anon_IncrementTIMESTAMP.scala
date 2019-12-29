package typings.atFirebaseDatabase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncrementTIMESTAMP extends js.Object {
  var TIMESTAMP: Anon_Sv
  def _increment(x: Double): Anon_SvAnonIncrement
}

object Anon_IncrementTIMESTAMP {
  @scala.inline
  def apply(TIMESTAMP: Anon_Sv, _increment: Double => Anon_SvAnonIncrement): Anon_IncrementTIMESTAMP = {
    val __obj = js.Dynamic.literal(TIMESTAMP = TIMESTAMP.asInstanceOf[js.Any], _increment = js.Any.fromFunction1(_increment))
  
    __obj.asInstanceOf[Anon_IncrementTIMESTAMP]
  }
}

