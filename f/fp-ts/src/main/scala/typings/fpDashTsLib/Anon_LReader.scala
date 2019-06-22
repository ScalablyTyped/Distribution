package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LReader[L] extends js.Object {
  var URI: fpDashTsLib.fpDashTsLibStrings.Reader
  var _L: L
}

object Anon_LReader {
  @scala.inline
  def apply[L](URI: fpDashTsLib.fpDashTsLibStrings.Reader, _L: L): Anon_LReader[L] = {
    val __obj = js.Dynamic.literal(URI = URI, _L = _L.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LReader[L]]
  }
}

