package typings.electronDashBuilder.electronDashBuilderMod

import typings.electronDashBuilder.outBuilderMod.CliOptions
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-builder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def archFromString(name: String): typings.builderDashUtil.outArchMod.Arch = js.native
  def build(): js.Promise[js.Array[String]] = js.native
  def build(rawOptions: CliOptions): js.Promise[js.Array[String]] = js.native
  def createTargets(
    platforms: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _
    ]
  ): Map[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _, 
    Map[typings.builderDashUtil.outArchMod.Arch, js.Array[String]]
  ] = js.native
  def createTargets(
    platforms: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _
    ],
    `type`: String
  ): Map[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _, 
    Map[typings.builderDashUtil.outArchMod.Arch, js.Array[String]]
  ] = js.native
  def createTargets(
    platforms: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _
    ],
    `type`: String,
    arch: String
  ): Map[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _, 
    Map[typings.builderDashUtil.outArchMod.Arch, js.Array[String]]
  ] = js.native
  def createTargets(
    platforms: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _
    ],
    `type`: Null,
    arch: String
  ): Map[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _, 
    Map[typings.builderDashUtil.outArchMod.Arch, js.Array[String]]
  ] = js.native
  def getArchSuffix(arch: typings.builderDashUtil.outArchMod.Arch): String = js.native
}

