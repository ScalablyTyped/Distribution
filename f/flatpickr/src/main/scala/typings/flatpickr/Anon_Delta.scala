package typings.flatpickr

import typings.flatpickr.flatpickrStrings.increment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delta extends js.Object {
  var delta: Double
  var `type`: increment
}

object Anon_Delta {
  @scala.inline
  def apply(delta: Double, `type`: increment): Anon_Delta = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Delta]
  }
}

