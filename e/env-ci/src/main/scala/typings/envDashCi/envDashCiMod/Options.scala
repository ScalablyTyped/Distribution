package typings.envDashCi.envDashCiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Options {
  @scala.inline
  def apply(cwd: String = null, env: StringDictionary[js.Any] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    __obj.asInstanceOf[Options]
  }
}

