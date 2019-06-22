package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LTuple[L] extends js.Object {
  var URI: fpDashTsLib.fpDashTsLibStrings.Tuple
  var _L: L
}

object Anon_LTuple {
  @scala.inline
  def apply[L](URI: fpDashTsLib.fpDashTsLibStrings.Tuple, _L: L): Anon_LTuple[L] = {
    val __obj = js.Dynamic.literal(URI = URI, _L = _L.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LTuple[L]]
  }
}

