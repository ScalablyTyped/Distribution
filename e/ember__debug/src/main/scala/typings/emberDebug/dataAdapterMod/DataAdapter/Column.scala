package typings.emberDebug.dataAdapterMod.DataAdapter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var desc: String
  var name: String
}

object Column {
  @scala.inline
  def apply(desc: String, name: String): Column = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

