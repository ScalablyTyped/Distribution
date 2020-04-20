package typings.forkTsCheckerWebpackPlugin.vueOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueOptions extends js.Object {
  var compiler: String
  var enabled: Boolean
}

object VueOptions {
  @scala.inline
  def apply(compiler: String, enabled: Boolean): VueOptions = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueOptions]
  }
}

