package typings.gapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: String
  var headers: js.Array[_]
  var status: Double
  var statusText: String
}

object Anon_Body {
  @scala.inline
  def apply(body: String, headers: js.Array[_], status: Double, statusText: String): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, status = status, statusText = statusText)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

