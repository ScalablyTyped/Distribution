package typings
package ecmarkupLib.libSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends js.Object {
  var namespace: java.lang.String
  var opts: ecmarkupLib.libEcmarkupMod.Options
  var rootDir: java.lang.String
  var rootPath: java.lang.String
  var spec: this.type
  def exportBiblio(): js.Any
  def toHTML(): java.lang.String
}

object Spec {
  @scala.inline
  def apply(
    exportBiblio: js.Function0[js.Any],
    namespace: java.lang.String,
    opts: ecmarkupLib.libEcmarkupMod.Options,
    rootDir: java.lang.String,
    rootPath: java.lang.String,
    spec: Spec,
    toHTML: js.Function0[java.lang.String]
  ): Spec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exportBiblio")(exportBiblio)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("opts")(opts)
    __obj.updateDynamic("rootDir")(rootDir)
    __obj.updateDynamic("rootPath")(rootPath)
    __obj.updateDynamic("spec")(spec)
    __obj.updateDynamic("toHTML")(toHTML)
    __obj.asInstanceOf[Spec]
  }
}

