package typings.ecmarkup.libSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends js.Object {
  var namespace: String
  var opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Options */ js.Any
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
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Options */ js.Any,
    rootDir: String,
    rootPath: String,
    spec: Spec,
    toHTML: () => String
  ): Spec = {
    val __obj = js.Dynamic.literal(exportBiblio = js.Any.fromFunction0(exportBiblio), namespace = namespace, opts = opts, rootDir = rootDir, rootPath = rootPath, spec = spec, toHTML = js.Any.fromFunction0(toHTML))
  
    __obj.asInstanceOf[Spec]
  }
}

