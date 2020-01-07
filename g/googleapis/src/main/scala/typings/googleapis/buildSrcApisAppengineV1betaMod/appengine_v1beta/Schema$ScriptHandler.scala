package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Executes a script to handle the request that matches the URL pattern.
  */
@js.native
trait Schema$ScriptHandler extends js.Object {
  /**
    * Path to the script from the application root directory.
    */
  var scriptPath: js.UndefOr[String] = js.native
}

object Schema$ScriptHandler {
  @scala.inline
  def apply(scriptPath: String = null): Schema$ScriptHandler = {
    val __obj = js.Dynamic.literal()
    if (scriptPath != null) __obj.updateDynamic("scriptPath")(scriptPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ScriptHandler]
  }
}

