package typings.ecmarkup.specMod

import typings.ecmarkup.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends js.Object {
  var namespace: String
  var opts: Options
  var rootDir: String
  var rootPath: String
  var spec: this.type
  def exportBiblio(): js.Any
  def toHTML(): String
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
}

