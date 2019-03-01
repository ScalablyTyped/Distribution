package typings
package fastifyDashFaviconLib.fastifyDashFaviconMod.defaultFaviconPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastifyFaviconOptions extends js.Object {
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object FastifyFaviconOptions {
  @scala.inline
  def apply(path: java.lang.String = null): FastifyFaviconOptions = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[FastifyFaviconOptions]
  }
}

