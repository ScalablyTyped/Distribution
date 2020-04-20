package typings.gatsby.mod

import typings.gatsby.AnonCreate
import typings.gatsby.AnonDel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  var cache: AnonDel
  var name: String
  var store: AnonCreate
}

object Cache {
  @scala.inline
  def apply(cache: AnonDel, name: String, store: AnonCreate): Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
}

