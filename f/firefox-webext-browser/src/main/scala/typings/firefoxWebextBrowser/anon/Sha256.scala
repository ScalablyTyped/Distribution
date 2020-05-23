package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sha256 extends js.Object {
  var sha256: String
}

object Sha256 {
  @scala.inline
  def apply(sha256: String): Sha256 = {
    val __obj = js.Dynamic.literal(sha256 = sha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha256]
  }
}

