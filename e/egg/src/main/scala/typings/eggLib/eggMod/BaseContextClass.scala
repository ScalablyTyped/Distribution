package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg", "BaseContextClass")
@js.native
class BaseContextClass ()
  extends eggDashCoreLib.eggDashCoreMod.BaseContextClass[
      eggDashViewLib.eggMod.Context, 
      eggDashViewLib.eggMod.Application, 
      eggDashViewLib.eggMod.EggAppConfig, 
      IService
    ] {
  // tslint:disable-line
  /**
    * logger
    */
  var logger: eggDashLoggerLib.eggDashLoggerMod.EggLogger = js.native
}

