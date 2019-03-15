package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg", "BaseContextClass")
@js.native
class BaseContextClass protected () extends js.Object {
  def this(ctx: eggDashViewLib.eggMod.Context) = this()
  /**
    * Application
    */
  var app: eggDashViewLib.eggMod.Application = js.native
  /**
    * Application config object
    */
  var config: eggDashViewLib.eggMod.EggAppConfig = js.native
  // tslint:disable-line
  /**
    * request context
    */
  var ctx: eggDashViewLib.eggMod.Context = js.native
  /**
    * logger
    */
  var logger: eggDashLoggerLib.eggDashLoggerMod.EggLogger = js.native
  /**
    * service
    */
  var service: IService = js.native
}

