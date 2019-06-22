package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Either[L] extends js.Object {
  var URI: fpDashTsLib.fpDashTsLibStrings.Either
  var _L: L
}

object Anon_Either {
  @scala.inline
  def apply[L](URI: fpDashTsLib.fpDashTsLibStrings.Either, _L: L): Anon_Either[L] = {
    val __obj = js.Dynamic.literal(URI = URI, _L = _L.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Either[L]]
  }
}

