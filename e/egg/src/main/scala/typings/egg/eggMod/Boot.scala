package typings.egg.eggMod

import typings.eggDashLogger.eggDashLoggerMod.EggLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg", "Boot")
@js.native
class Boot () extends js.Object {
  /**
    * The instance of agent
    * @member {Agent}
    */
  var agent: Agent = js.native
  /**
    * The instance of app
    * @member {Application}
    */
  var app: Application = js.native
  /**
    * The configuration of application
    * @member {EggAppConfig}
    */
  var config: EggAppConfig = js.native
  /**
    * logger
    * @member {EggLogger}
    */
  var logger: EggLogger = js.native
}

