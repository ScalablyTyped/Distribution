package typings
package firstDashRunLib.firstDashRunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		The name used to identify it. Default: `name` field in your package.json
  		*/
  val name: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(name: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Options]
  }
}

