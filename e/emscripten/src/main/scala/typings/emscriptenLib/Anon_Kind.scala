package typings
package emscriptenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Kind extends js.Object {
  var kind: java.lang.String
  var name: java.lang.String
}

object Anon_Kind {
  @scala.inline
  def apply(kind: java.lang.String, name: java.lang.String): Anon_Kind = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
  
    __obj.asInstanceOf[Anon_Kind]
  }
}

