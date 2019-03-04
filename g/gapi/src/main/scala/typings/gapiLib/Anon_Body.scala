package typings
package gapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: java.lang.String
  var headers: js.Array[_]
  var status: scala.Double
  var statusText: java.lang.String
}

object Anon_Body {
  @scala.inline
  def apply(body: java.lang.String, headers: js.Array[_], status: scala.Double, statusText: java.lang.String): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, status = status, statusText = statusText)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

