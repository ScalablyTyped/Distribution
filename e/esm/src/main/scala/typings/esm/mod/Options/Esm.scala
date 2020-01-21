package typings.esm.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Esm extends js.Object {
  var cache: Boolean
  var dedefault: Boolean
  var esModule: Boolean
  var extensions: Boolean
  var mutableNamespace: Boolean
  var namedExports: Boolean
  var paths: Boolean
  var topLevelReturn: Boolean
  var vars: Boolean
}

object Esm {
  @scala.inline
  def apply(
    cache: Boolean,
    dedefault: Boolean,
    esModule: Boolean,
    extensions: Boolean,
    mutableNamespace: Boolean,
    namedExports: Boolean,
    paths: Boolean,
    topLevelReturn: Boolean,
    vars: Boolean
  ): Esm = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], dedefault = dedefault.asInstanceOf[js.Any], esModule = esModule.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], mutableNamespace = mutableNamespace.asInstanceOf[js.Any], namedExports = namedExports.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], topLevelReturn = topLevelReturn.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Esm]
  }
}

