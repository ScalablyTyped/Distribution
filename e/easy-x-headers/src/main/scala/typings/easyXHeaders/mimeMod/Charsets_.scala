package typings.easyXHeaders.mimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Charsets_ extends js.Object {
  def lookup(mime: String): String
}

object Charsets_ {
  @scala.inline
  def apply(lookup: String => String): Charsets_ = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup))
    __obj.asInstanceOf[Charsets_]
  }
}

