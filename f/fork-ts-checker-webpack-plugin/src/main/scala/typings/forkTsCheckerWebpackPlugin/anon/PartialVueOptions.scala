package typings.forkTsCheckerWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/types/vue-options.VueOptions> */
trait PartialVueOptions extends js.Object {
  var compiler: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object PartialVueOptions {
  @scala.inline
  def apply(compiler: String = null, enabled: js.UndefOr[Boolean] = js.undefined): PartialVueOptions = {
    val __obj = js.Dynamic.literal()
    if (compiler != null) __obj.updateDynamic("compiler")(compiler.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialVueOptions]
  }
}

