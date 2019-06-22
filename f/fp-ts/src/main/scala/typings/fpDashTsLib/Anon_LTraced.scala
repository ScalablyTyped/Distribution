package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LTraced[L] extends js.Object {
  var URI: fpDashTsLib.fpDashTsLibStrings.Traced
  var _L: L
}

object Anon_LTraced {
  @scala.inline
  def apply[L](URI: fpDashTsLib.fpDashTsLibStrings.Traced, _L: L): Anon_LTraced[L] = {
    val __obj = js.Dynamic.literal(URI = URI, _L = _L.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LTraced[L]]
  }
}

