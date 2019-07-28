package typings.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: String | Anon_Column
  var to: String | Anon_Column
}

object Anon_From {
  @scala.inline
  def apply(from: String | Anon_Column, to: String | Anon_Column): Anon_From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_From]
  }
}

