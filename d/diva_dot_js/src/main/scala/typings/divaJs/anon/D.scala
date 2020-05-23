package typings.divaJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait D extends js.Object {
  var d: H
  var f: String
  var il: String
  var url: String
}

object D {
  @scala.inline
  def apply(d: H, f: String, il: String, url: String): D = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], il = il.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[D]
  }
}

