package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  var cache: gatsbyLib.Anon_Del
  var name: java.lang.String
  var store: gatsbyLib.Anon_Create
}

object Cache {
  @scala.inline
  def apply(cache: gatsbyLib.Anon_Del, name: java.lang.String, store: gatsbyLib.Anon_Create): Cache = {
    val __obj = js.Dynamic.literal(cache = cache, name = name, store = store)
  
    __obj.asInstanceOf[Cache]
  }
}

