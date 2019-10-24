package typings.electronDashBuilder

import typings.builderDashUtil.outArchMod.Arch
import typings.electronDashBuilder.outBuilderMod.CliOptions
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-builder", JSImport.Namespace)
@js.native
object electronDashBuilderMod extends js.Object {
  @js.native
  class CancellationToken ()
    extends typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeMod.CancellationToken {
    def this(parent: typings.builderDashUtilDashRuntime.outCancellationTokenMod.CancellationToken) = this()
  }
  
  def archFromString(name: String): Arch = js.native
  def build(): js.Promise[js.Array[String]] = js.native
  def build(rawOptions: CliOptions): js.Promise[js.Array[String]] = js.native
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
  def getArchSuffix(arch: Arch): String = js.native
  @js.native
  object Arch extends js.Object {
    /* 3 */ val arm64: typings.builderDashUtil.outArchMod.Arch.arm64 with Double = js.native
    /* 2 */ val armv7l: typings.builderDashUtil.outArchMod.Arch.armv7l with Double = js.native
    /* 0 */ val ia32: typings.builderDashUtil.outArchMod.Arch.ia32 with Double = js.native
    /* 1 */ val x64: typings.builderDashUtil.outArchMod.Arch.x64 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.builderDashUtil.outArchMod.Arch with Double] = js.native
  }
  
}

