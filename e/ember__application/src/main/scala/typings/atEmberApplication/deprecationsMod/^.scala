package typings.atEmberApplication.deprecationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/application/deprecations", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def deprecate(message: String, test: Boolean, options: DeprecationOptions): js.Any = js.native
  def deprecateFunc[Func /* <: js.Function1[/* repeated */ js.Any, _] */](message: String, options: DeprecationOptions, func: Func): Func = js.native
}

