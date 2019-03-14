package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg", "BaseContextClass")
@js.native
class BaseContextClass protected () extends js.Object {
  def this(ctx: Context) = this()
  /**
    * Application
    */
  var app: Application = js.native
  /**
    * Application config object
    */
  var config: EggAppConfig = js.native
  // tslint:disable-line
  /**
    * request context
    */
  var ctx: Context = js.native
  /**
    * logger
    */
  var logger: eggDashLoggerLib.eggDashLoggerMod.EggLogger = js.native
  /**
    * service
    */
  var service: IService = js.native
}

