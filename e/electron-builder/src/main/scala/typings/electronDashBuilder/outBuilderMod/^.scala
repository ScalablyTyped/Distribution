package typings.electronDashBuilder.outBuilderMod

import typings.builderDashUtil.outArchMod.Arch
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-builder/out/builder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def build(): js.Promise[js.Array[String]] = js.native
  def build(rawOptions: CliOptions): js.Promise[js.Array[String]] = js.native
  def coerceTypes(host: js.Any): js.Any = js.native
  def createTargets(
    platforms: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _
    ]
  ): Map[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _, 
    Map[Arch, js.Array[String]]
  ] = js.native
  def createTargets(
    platforms: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _
    ],
    `type`: String
  ): Map[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _, 
    Map[Arch, js.Array[String]]
  ] = js.native
  def createTargets(
    platforms: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _
    ],
    `type`: String,
    arch: String
  ): Map[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _, 
    Map[Arch, js.Array[String]]
  ] = js.native
  def createTargets(
    platforms: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _
    ],
    `type`: Null,
    arch: String
  ): Map[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _, 
    Map[Arch, js.Array[String]]
  ] = js.native
}

