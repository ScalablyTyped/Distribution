package typings
package formsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: java.lang.String
  var method: java.lang.String
  var url: java.lang.String
}

object Anon_Body {
  @scala.inline
  def apply(body: java.lang.String, method: java.lang.String, url: java.lang.String): Anon_Body = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Body]
  }
}

