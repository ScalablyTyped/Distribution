package typings.gapiDotPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: String
  var `type`: String
  var value: String
}

object Anon_Label {
  @scala.inline
  def apply(label: String, `type`: String, value: String): Anon_Label = {
    val __obj = js.Dynamic.literal(label = label, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Label]
  }
}

