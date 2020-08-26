package typings.esm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<esm.esm.Options.Esm> */
@js.native
trait PartialEsm extends js.Object {
  var cache: js.UndefOr[Boolean] = js.native
  var dedefault: js.UndefOr[Boolean] = js.native
  var esModule: js.UndefOr[Boolean] = js.native
  var extensions: js.UndefOr[Boolean] = js.native
  var mutableNamespace: js.UndefOr[Boolean] = js.native
  var namedExports: js.UndefOr[Boolean] = js.native
  var paths: js.UndefOr[Boolean] = js.native
  var topLevelReturn: js.UndefOr[Boolean] = js.native
  var vars: js.UndefOr[Boolean] = js.native
}

object PartialEsm {
  @scala.inline
  def apply(): PartialEsm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEsm]
  }
  @scala.inline
  implicit class PartialEsmOps[Self <: PartialEsm] (val x: Self) extends AnyVal {
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
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setDedefault(value: Boolean): Self = this.set("dedefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDedefault: Self = this.set("dedefault", js.undefined)
    @scala.inline
    def setEsModule(value: Boolean): Self = this.set("esModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEsModule: Self = this.set("esModule", js.undefined)
    @scala.inline
    def setExtensions(value: Boolean): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setMutableNamespace(value: Boolean): Self = this.set("mutableNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMutableNamespace: Self = this.set("mutableNamespace", js.undefined)
    @scala.inline
    def setNamedExports(value: Boolean): Self = this.set("namedExports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedExports: Self = this.set("namedExports", js.undefined)
    @scala.inline
    def setPaths(value: Boolean): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    @scala.inline
    def setTopLevelReturn(value: Boolean): Self = this.set("topLevelReturn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopLevelReturn: Self = this.set("topLevelReturn", js.undefined)
    @scala.inline
    def setVars(value: Boolean): Self = this.set("vars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVars: Self = this.set("vars", js.undefined)
  }
  
}

