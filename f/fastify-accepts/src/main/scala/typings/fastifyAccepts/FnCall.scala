package typings.fastifyAccepts

import typings.fastifyAccepts.fastifyAcceptsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(): js.Array[String] = js.native
  def apply(languages: String*): String | `false` = js.native
  def apply(languages: js.Array[String]): String | `false` = js.native
}

