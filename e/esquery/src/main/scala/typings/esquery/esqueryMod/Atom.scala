package typings.esquery.esqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Atom extends js.Object {
  var `type`: String
}

object Atom {
  @scala.inline
  def apply(`type`: String): Atom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Atom]
  }
}

