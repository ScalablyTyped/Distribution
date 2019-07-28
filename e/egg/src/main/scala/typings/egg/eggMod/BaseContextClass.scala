package typings.egg.eggMod

import typings.eggDashLogger.eggDashLoggerMod.EggLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg", "BaseContextClass")
@js.native
class BaseContextClass ()
  extends typings.eggDashCore.eggDashCoreMod.BaseContextClass[
      typings.eggDashView.eggMod.Context, 
      typings.eggDashView.eggMod.Application, 
      typings.eggDashView.eggMod.EggAppConfig, 
      IService
    ] {
  // tslint:disable-line
  /**
    * logger
    */
  var logger: EggLogger = js.native
}

