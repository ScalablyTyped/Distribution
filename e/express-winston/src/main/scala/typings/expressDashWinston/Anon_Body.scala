package typings.expressDashWinston

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.Array[String]
  var req: js.Array[String]
  var res: js.Array[String]
}

object Anon_Body {
  @scala.inline
  def apply(body: js.Array[String], req: js.Array[String], res: js.Array[String]): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, req = req, res = res)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

