package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Free[L] extends js.Object {
  var URI: fpDashTsLib.fpDashTsLibStrings.Free
  var _L: L
}

object Anon_Free {
  @scala.inline
  def apply[L](URI: fpDashTsLib.fpDashTsLibStrings.Free, _L: L): Anon_Free[L] = {
    val __obj = js.Dynamic.literal(URI = URI, _L = _L.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Free[L]]
  }
}

