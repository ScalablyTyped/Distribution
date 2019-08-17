package typings.atEmberDebug.dataDashAdapterMod.DataAdapterNs

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
    val __obj = js.Dynamic.literal(desc = desc, name = name)
  
    __obj.asInstanceOf[Column]
  }
}

