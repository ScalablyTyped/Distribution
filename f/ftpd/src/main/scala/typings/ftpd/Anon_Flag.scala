package typings.ftpd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flag extends js.Object {
  var flag: js.UndefOr[String] = js.undefined
}

object Anon_Flag {
  @scala.inline
  def apply(flag: String = null): Anon_Flag = {
    val __obj = js.Dynamic.literal()
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Flag]
  }
}

