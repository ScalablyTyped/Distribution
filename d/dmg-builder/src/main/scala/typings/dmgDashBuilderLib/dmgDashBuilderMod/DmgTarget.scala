package typings
package dmgDashBuilderLib.dmgDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dmg-builder", "DmgTarget")
@js.native
class DmgTarget protected ()
  extends appDashBuilderDashLibLib.appDashBuilderDashLibMod.Target {
  def this(packager: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MacPackager */ js.Any, outDir: java.lang.String) = this()
  @JSName("options")
  val options_DmgTarget: appDashBuilderDashLibLib.outOptionsMacOptionsMod.DmgOptions = js.native
  val packager: js.Any = js.native
  var signDmg: js.Any = js.native
  def computeDmgOptions(): js.Promise[appDashBuilderDashLibLib.outOptionsMacOptionsMod.DmgOptions] = js.native
  def computeVolumeName(): java.lang.String = js.native
  def computeVolumeName(custom: java.lang.String): java.lang.String = js.native
}

