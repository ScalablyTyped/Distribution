package typings.egg.eggMod

import typings.eggDashLogger.eggDashLoggerMod.EggLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg", "BaseContextClass")
@js.native
class BaseContextClass ()
  extends typings.eggDashCore.eggDashCoreMod.BaseContextClass[Context, Application, EggAppConfig, IService] {
  // tslint:disable-line
  /**
    * logger
    */
  var logger: EggLogger = js.native
}

