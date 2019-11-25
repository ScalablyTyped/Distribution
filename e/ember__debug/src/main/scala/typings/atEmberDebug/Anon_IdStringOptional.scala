package typings.atEmberDebug

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdStringOptional extends js.Object {
  var id: js.UndefOr[String] = js.undefined
}

object Anon_IdStringOptional {
  @scala.inline
  def apply(id: String = null): Anon_IdStringOptional = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdStringOptional]
  }
}

