package typings.forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: String
  var method: String
  var url: String
}

object Anon_Body {
  @scala.inline
  def apply(body: String, method: String, url: String): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, method = method, url = url)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

