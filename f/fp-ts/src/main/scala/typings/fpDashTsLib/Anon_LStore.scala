package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LStore[L] extends js.Object {
  var URI: fpDashTsLib.fpDashTsLibStrings.Store
  var _L: L
}

object Anon_LStore {
  @scala.inline
  def apply[L](URI: fpDashTsLib.fpDashTsLibStrings.Store, _L: L): Anon_LStore[L] = {
    val __obj = js.Dynamic.literal(URI = URI, _L = _L.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LStore[L]]
  }
}

