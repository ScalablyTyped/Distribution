package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LURI[L] extends js.Object {
  var URI: fpDashTsLib.fpDashTsLibStrings.Writer
  var _L: L
}

object Anon_LURI {
  @scala.inline
  def apply[L](URI: fpDashTsLib.fpDashTsLibStrings.Writer, _L: L): Anon_LURI[L] = {
    val __obj = js.Dynamic.literal(URI = URI, _L = _L.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LURI[L]]
  }
}

