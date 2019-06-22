package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LMap[L] extends js.Object {
  var URI: fpDashTsLib.fpDashTsLibStrings.Map
  var _L: L
}

object Anon_LMap {
  @scala.inline
  def apply[L](URI: fpDashTsLib.fpDashTsLibStrings.Map, _L: L): Anon_LMap[L] = {
    val __obj = js.Dynamic.literal(URI = URI, _L = _L.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LMap[L]]
  }
}

