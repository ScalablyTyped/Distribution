package typings.ecmarkup.specMod

import typings.ecmarkup.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spec extends js.Object {
  var namespace: String = js.native
  var opts: Options = js.native
  var rootDir: String = js.native
  var rootPath: String = js.native
  var spec: this.type = js.native
  def exportBiblio(): js.Any = js.native
  def toHTML(): String = js.native
}

object Spec {
  @scala.inline
  def apply(
    exportBiblio: () => js.Any,
    namespace: String,
    opts: Options,
    rootDir: String,
    rootPath: String,
    spec: Spec,
    toHTML: () => String
  ): Spec = {
    val __obj = js.Dynamic.literal(exportBiblio = js.Any.fromFunction0(exportBiblio), namespace = namespace.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], rootPath = rootPath.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], toHTML = js.Any.fromFunction0(toHTML))
    __obj.asInstanceOf[Spec]
  }
  @scala.inline
  implicit class SpecOps[Self <: Spec] (val x: Self) extends AnyVal {
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
    def setExportBiblio(value: () => js.Any): Self = this.set("exportBiblio", js.Any.fromFunction0(value))
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpts(value: Options): Self = this.set("opts", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootDir(value: String): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootPath(value: String): Self = this.set("rootPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpec(value: Spec): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def setToHTML(value: () => String): Self = this.set("toHTML", js.Any.fromFunction0(value))
  }
  
}

