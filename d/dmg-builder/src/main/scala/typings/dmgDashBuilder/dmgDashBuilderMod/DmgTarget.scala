package typings.dmgDashBuilder.dmgDashBuilderMod

import typings.builderDashUtil.outArchMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("dmg-builder", "DmgTarget")
@js.native
class DmgTarget protected () extends js.Object {
  def this(
    packager: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MacPackager */ js.Any,
    outDir: String
  ) = this()
  val options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DmgOptions */ js.Any = js.native
  val outDir: String = js.native
  val packager: js.Any = js.native
  var signDmg: js.Any = js.native
  def build(appPath: String, arch: Arch): js.Promise[Unit] = js.native
  def computeDmgOptions(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DmgOptions */ _
  ] = js.native
  def computeVolumeName(): String = js.native
  def computeVolumeName(custom: String): String = js.native
}

