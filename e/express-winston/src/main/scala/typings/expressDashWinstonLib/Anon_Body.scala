package typings
package expressDashWinstonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.Array[java.lang.String]
  var req: js.Array[java.lang.String]
  var res: js.Array[java.lang.String]
}

object Anon_Body {
  @scala.inline
  def apply(body: js.Array[java.lang.String], req: js.Array[java.lang.String], res: js.Array[java.lang.String]): Anon_Body = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("req")(req)
    __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[Anon_Body]
  }
}

