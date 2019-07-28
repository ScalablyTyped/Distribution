package typings.easyDashXapiDashSupertest.mimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Charsets extends js.Object {
  def lookup(mime: String): String
}

object Charsets {
  @scala.inline
  def apply(lookup: String => String): Charsets = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup))
  
    __obj.asInstanceOf[Charsets]
  }
}

