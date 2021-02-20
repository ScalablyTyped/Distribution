package typings.electronBuilder

import typings.appBuilderLib.mod.Platform
import typings.appBuilderLib.packagerApiMod.PackagerOptions
import typings.builderUtil.archMod.Arch
import typings.electronPublish.mod.PublishOptions
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builderMod {
  
  @JSImport("electron-builder/out/builder", "build")
  @js.native
  def build(): js.Promise[js.Array[String]] = js.native
  @JSImport("electron-builder/out/builder", "build")
  @js.native
  def build(rawOptions: CliOptions): js.Promise[js.Array[String]] = js.native
  
  @JSImport("electron-builder/out/builder", "coerceTypes")
  @js.native
  def coerceTypes(host: js.Any): js.Any = js.native
  
  @JSImport("electron-builder/out/builder", "configureBuildCommand")
  @js.native
  def configureBuildCommand(
    yargs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify yargs.Argv */ js.Any
  ): js.Any = js.native
  
  @JSImport("electron-builder/out/builder", "createTargets")
  @js.native
  def createTargets(platforms: js.Array[Platform]): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  @JSImport("electron-builder/out/builder", "createTargets")
  @js.native
  def createTargets(platforms: js.Array[Platform], `type`: js.UndefOr[scala.Nothing], arch: String): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  @JSImport("electron-builder/out/builder", "createTargets")
  @js.native
  def createTargets(platforms: js.Array[Platform], `type`: String): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  @JSImport("electron-builder/out/builder", "createTargets")
  @js.native
  def createTargets(platforms: js.Array[Platform], `type`: String, arch: String): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  @JSImport("electron-builder/out/builder", "createTargets")
  @js.native
  def createTargets(platforms: js.Array[Platform], `type`: Null, arch: String): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  
  @JSImport("electron-builder/out/builder", "createYargs")
  @js.native
  def createYargs(): js.Any = js.native
  
  @JSImport("electron-builder/out/builder", "normalizeOptions")
  @js.native
  def normalizeOptions(args: CliOptions): BuildOptions = js.native
  
  @js.native
  trait BuildOptions
    extends PackagerOptions
       with PublishOptions
  object BuildOptions {
    
    @scala.inline
    def apply(): BuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildOptions]
    }
  }
  
  @js.native
  trait CliOptions
    extends PackagerOptions
       with PublishOptions {
    
    var arm64: js.UndefOr[Boolean] = js.native
    
    var armv7l: js.UndefOr[Boolean] = js.native
    
    var dir: js.UndefOr[Boolean] = js.native
    
    var ia32: js.UndefOr[Boolean] = js.native
    
    var x64: js.UndefOr[Boolean] = js.native
  }
  object CliOptions {
    
    @scala.inline
    def apply(): CliOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CliOptions]
    }
    
    @scala.inline
    implicit class CliOptionsMutableBuilder[Self <: CliOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArm64(value: Boolean): Self = StObject.set(x, "arm64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArm64Undefined: Self = StObject.set(x, "arm64", js.undefined)
      
      @scala.inline
      def setArmv7l(value: Boolean): Self = StObject.set(x, "armv7l", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArmv7lUndefined: Self = StObject.set(x, "armv7l", js.undefined)
      
      @scala.inline
      def setDir(value: Boolean): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setIa32(value: Boolean): Self = StObject.set(x, "ia32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIa32Undefined: Self = StObject.set(x, "ia32", js.undefined)
      
      @scala.inline
      def setX64(value: Boolean): Self = StObject.set(x, "x64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX64Undefined: Self = StObject.set(x, "x64", js.undefined)
    }
  }
}
