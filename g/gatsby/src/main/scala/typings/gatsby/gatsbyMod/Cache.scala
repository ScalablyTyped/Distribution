package typings.gatsby.gatsbyMod

import typings.gatsby.Anon_Create
import typings.gatsby.Anon_Del
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  var cache: Anon_Del
  var name: String
  var store: Anon_Create
}

object Cache {
  @scala.inline
  def apply(cache: Anon_Del, name: String, store: Anon_Create): Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Cache]
  }
}

