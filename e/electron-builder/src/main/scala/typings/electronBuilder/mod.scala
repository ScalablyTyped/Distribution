package typings.electronBuilder

import typings.appBuilderLib.outForgeMakerMod.ForgeOptions
import typings.appBuilderLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.appBuilderLib.outPackagerApiMod.PackagerOptions
import typings.builderUtil.outArchMod.Arch
import typings.electronBuilder.outBuilderMod.CliOptions
import typings.electronPublish.mod.PublishOptions
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("electron-builder", "AppInfo")
  @js.native
  open class AppInfo protected ()
    extends typings.appBuilderLib.mod.AppInfo {
    def this(info: typings.appBuilderLib.outPackagerMod.Packager) = this()
    def this(info: typings.appBuilderLib.outPackagerMod.Packager, buildVersion: String) = this()
    def this(
      info: typings.appBuilderLib.outPackagerMod.Packager,
      buildVersion: String,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
    def this(
      info: typings.appBuilderLib.outPackagerMod.Packager,
      buildVersion: Null,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
    def this(
      info: typings.appBuilderLib.outPackagerMod.Packager,
      buildVersion: Unit,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
  }
  
  @JSImport("electron-builder", "Arch")
  @js.native
  object Arch extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.builderUtil.outArchMod.Arch & Double] = js.native
    
    /* 3 */ val arm64: typings.builderUtil.outArchMod.Arch.arm64 & Double = js.native
    
    /* 2 */ val armv7l: typings.builderUtil.outArchMod.Arch.armv7l & Double = js.native
    
    /* 0 */ val ia32: typings.builderUtil.outArchMod.Arch.ia32 & Double = js.native
    
    /* 4 */ val universal: typings.builderUtil.outArchMod.Arch.universal & Double = js.native
    
    /* 1 */ val x64: typings.builderUtil.outArchMod.Arch.x64 & Double = js.native
  }
  
  @JSImport("electron-builder", "CancellationToken")
  @js.native
  open class CancellationToken ()
    extends typings.builderUtilRuntime.mod.CancellationToken {
    def this(parent: typings.builderUtilRuntime.outCancellationTokenMod.CancellationToken) = this()
  }
  
  @JSImport("electron-builder", "DEFAULT_TARGET")
  @js.native
  val DEFAULT_TARGET: /* "default" */ String = js.native
  
  @JSImport("electron-builder", "DIR_TARGET")
  @js.native
  val DIR_TARGET: /* "dir" */ String = js.native
  
  @JSImport("electron-builder", "Packager")
  @js.native
  open class Packager protected ()
    extends typings.appBuilderLib.mod.Packager {
    def this(options: PackagerOptions) = this()
    def this(options: PackagerOptions, cancellationToken: typings.builderUtilRuntime.mod.CancellationToken) = this()
  }
  
  @JSImport("electron-builder", "Platform")
  @js.native
  open class Platform protected ()
    extends typings.appBuilderLib.mod.Platform {
    def this(
      name: String,
      buildConfigurationKey: String,
      nodeName: typings.node.processMod.global.NodeJS.Platform
    ) = this()
  }
  /* static members */
  object Platform {
    
    @JSImport("electron-builder", "Platform")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("electron-builder", "Platform.LINUX")
    @js.native
    def LINUX: typings.appBuilderLib.outCoreMod.Platform = js.native
    inline def LINUX_=(x: typings.appBuilderLib.outCoreMod.Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINUX")(x.asInstanceOf[js.Any])
    
    @JSImport("electron-builder", "Platform.MAC")
    @js.native
    def MAC: typings.appBuilderLib.outCoreMod.Platform = js.native
    inline def MAC_=(x: typings.appBuilderLib.outCoreMod.Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAC")(x.asInstanceOf[js.Any])
    
    @JSImport("electron-builder", "Platform.WINDOWS")
    @js.native
    def WINDOWS: typings.appBuilderLib.outCoreMod.Platform = js.native
    inline def WINDOWS_=(x: typings.appBuilderLib.outCoreMod.Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOWS")(x.asInstanceOf[js.Any])
    
    inline def current(): typings.appBuilderLib.outCoreMod.Platform = ^.asInstanceOf[js.Dynamic].applyDynamic("current")().asInstanceOf[typings.appBuilderLib.outCoreMod.Platform]
    
    inline def fromString(name: String): typings.appBuilderLib.outCoreMod.Platform = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(name.asInstanceOf[js.Any]).asInstanceOf[typings.appBuilderLib.outCoreMod.Platform]
  }
  
  @JSImport("electron-builder", "PublishManager")
  @js.native
  open class PublishManager protected ()
    extends typings.appBuilderLib.mod.PublishManager {
    def this(packager: typings.appBuilderLib.outPackagerMod.Packager, publishOptions: PublishOptions) = this()
    def this(
      packager: typings.appBuilderLib.outPackagerMod.Packager,
      publishOptions: PublishOptions,
      cancellationToken: typings.builderUtilRuntime.mod.CancellationToken
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("electron-builder", "Target")
  @js.native
  open class Target protected ()
    extends typings.appBuilderLib.mod.Target {
    /* protected */ def this(name: String) = this()
    /* protected */ def this(name: String, isAsyncSupported: Boolean) = this()
  }
  
  inline def archFromString(name: String): Arch = ^.asInstanceOf[js.Dynamic].applyDynamic("archFromString")(name.asInstanceOf[js.Any]).asInstanceOf[Arch]
  
  inline def build(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")().asInstanceOf[js.Promise[js.Array[String]]]
  inline def build(rawOptions: CliOptions): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(rawOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def buildForge(forgeOptions: ForgeOptions, options: PackagerOptions): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildForge")(forgeOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def createTargets(platforms: js.Array[typings.appBuilderLib.mod.Platform]): Map[typings.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTargets")(platforms.asInstanceOf[js.Any]).asInstanceOf[Map[typings.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]]]
  inline def createTargets(platforms: js.Array[typings.appBuilderLib.mod.Platform], `type`: String): Map[typings.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTargets")(platforms.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Map[typings.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]]]
  inline def createTargets(platforms: js.Array[typings.appBuilderLib.mod.Platform], `type`: String, arch: String): Map[typings.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTargets")(platforms.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], arch.asInstanceOf[js.Any])).asInstanceOf[Map[typings.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]]]
  inline def createTargets(platforms: js.Array[typings.appBuilderLib.mod.Platform], `type`: Null, arch: String): Map[typings.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTargets")(platforms.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], arch.asInstanceOf[js.Any])).asInstanceOf[Map[typings.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]]]
  inline def createTargets(platforms: js.Array[typings.appBuilderLib.mod.Platform], `type`: Unit, arch: String): Map[typings.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTargets")(platforms.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], arch.asInstanceOf[js.Any])).asInstanceOf[Map[typings.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]]]
  
  inline def getArchSuffix(arch: Arch): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getArchSuffix")(arch.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getArchSuffix(arch: Arch, defaultArch: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getArchSuffix")(arch.asInstanceOf[js.Any], defaultArch.asInstanceOf[js.Any])).asInstanceOf[String]
}
