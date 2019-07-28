package typings.eggDashCore.eggDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg-core", "BaseContextClass")
@js.native
class BaseContextClass[Context, Application, EggAppConfig, Service] protected () extends js.Object {
  def this(ctx: Context) = this()
  /** Application */
  var app: Application = js.native
  /** Application config object */
  var config: EggAppConfig = js.native
  /** request context */
  var ctx: Context = js.native
  /** service */
  var service: Service = js.native
}

