package typings.esm.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Esm extends js.Object {
  var cache: Boolean = js.native
  var dedefault: Boolean = js.native
  var esModule: Boolean = js.native
  var extensions: Boolean = js.native
  var mutableNamespace: Boolean = js.native
  var namedExports: Boolean = js.native
  var paths: Boolean = js.native
  var topLevelReturn: Boolean = js.native
  var vars: Boolean = js.native
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
  @scala.inline
  implicit class EsmOps[Self <: Esm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setDedefault(value: Boolean): Self = this.set("dedefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setEsModule(value: Boolean): Self = this.set("esModule", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensions(value: Boolean): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setMutableNamespace(value: Boolean): Self = this.set("mutableNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamedExports(value: Boolean): Self = this.set("namedExports", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaths(value: Boolean): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopLevelReturn(value: Boolean): Self = this.set("topLevelReturn", value.asInstanceOf[js.Any])
    @scala.inline
    def setVars(value: Boolean): Self = this.set("vars", value.asInstanceOf[js.Any])
  }
  
}

