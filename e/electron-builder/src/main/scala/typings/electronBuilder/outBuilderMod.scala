package typings.electronBuilder

import typings.appBuilderLib.mod.Platform
import typings.appBuilderLib.outPackagerApiMod.PackagerOptions
import typings.builderUtil.outArchMod.Arch
import typings.electronPublish.mod.PublishOptions
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outBuilderMod {
  
  @JSImport("electron-builder/out/builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def build(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")().asInstanceOf[js.Promise[js.Array[String]]]
  inline def build(rawOptions: CliOptions): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(rawOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def coerceTypes(host: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceTypes")(host.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def configureBuildCommand(
    yargs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify yargs.Argv */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("configureBuildCommand")(yargs.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createTargets(platforms: js.Array[Platform]): Map[Platform, Map[Arch, js.Array[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTargets")(platforms.asInstanceOf[js.Any]).asInstanceOf[Map[Platform, Map[Arch, js.Array[String]]]]
  inline def createTargets(platforms: js.Array[Platform], `type`: String): Map[Platform, Map[Arch, js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTargets")(platforms.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Map[Platform, Map[Arch, js.Array[String]]]]
  inline def createTargets(platforms: js.Array[Platform], `type`: String, arch: String): Map[Platform, Map[Arch, js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTargets")(platforms.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], arch.asInstanceOf[js.Any])).asInstanceOf[Map[Platform, Map[Arch, js.Array[String]]]]
  inline def createTargets(platforms: js.Array[Platform], `type`: Null, arch: String): Map[Platform, Map[Arch, js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTargets")(platforms.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], arch.asInstanceOf[js.Any])).asInstanceOf[Map[Platform, Map[Arch, js.Array[String]]]]
  inline def createTargets(platforms: js.Array[Platform], `type`: Unit, arch: String): Map[Platform, Map[Arch, js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTargets")(platforms.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], arch.asInstanceOf[js.Any])).asInstanceOf[Map[Platform, Map[Arch, js.Array[String]]]]
  
  inline def createYargs(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createYargs")().asInstanceOf[Any]
  
  inline def normalizeOptions(args: CliOptions): BuildOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeOptions")(args.asInstanceOf[js.Any]).asInstanceOf[BuildOptions]
  
  trait BuildOptions
    extends StObject
       with PackagerOptions
       with PublishOptions
  object BuildOptions {
    
    inline def apply(): BuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildOptions]
    }
  }
  
  trait CliOptions
    extends StObject
       with PackagerOptions
       with PublishOptions {
    
    var arm64: js.UndefOr[Boolean] = js.undefined
    
    var armv7l: js.UndefOr[Boolean] = js.undefined
    
    var dir: js.UndefOr[Boolean] = js.undefined
    
    var ia32: js.UndefOr[Boolean] = js.undefined
    
    var universal: js.UndefOr[Boolean] = js.undefined
    
    var x64: js.UndefOr[Boolean] = js.undefined
  }
  object CliOptions {
    
    inline def apply(): CliOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CliOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CliOptions] (val x: Self) extends AnyVal {
      
      inline def setArm64(value: Boolean): Self = StObject.set(x, "arm64", value.asInstanceOf[js.Any])
      
      inline def setArm64Undefined: Self = StObject.set(x, "arm64", js.undefined)
      
      inline def setArmv7l(value: Boolean): Self = StObject.set(x, "armv7l", value.asInstanceOf[js.Any])
      
      inline def setArmv7lUndefined: Self = StObject.set(x, "armv7l", js.undefined)
      
      inline def setDir(value: Boolean): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setIa32(value: Boolean): Self = StObject.set(x, "ia32", value.asInstanceOf[js.Any])
      
      inline def setIa32Undefined: Self = StObject.set(x, "ia32", js.undefined)
      
      inline def setUniversal(value: Boolean): Self = StObject.set(x, "universal", value.asInstanceOf[js.Any])
      
      inline def setUniversalUndefined: Self = StObject.set(x, "universal", js.undefined)
      
      inline def setX64(value: Boolean): Self = StObject.set(x, "x64", value.asInstanceOf[js.Any])
      
      inline def setX64Undefined: Self = StObject.set(x, "x64", js.undefined)
    }
  }
}
