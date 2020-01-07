package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a function in a script project.
  */
@js.native
trait Schema$GoogleAppsScriptTypeFunction extends js.Object {
  /**
    * The function name in the script project.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$GoogleAppsScriptTypeFunction {
  @scala.inline
  def apply(name: String = null): Schema$GoogleAppsScriptTypeFunction = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleAppsScriptTypeFunction]
  }
}

