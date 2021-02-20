package typings.electronBuilder

import typings.appBuilderLib.forgeMakerMod.ForgeOptions
import typings.appBuilderLib.packagerApiMod.PackagerOptions
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.builderUtil.archMod.Arch
import typings.electronBuilder.builderMod.CliOptions
import typings.electronPublish.mod.PublishOptions
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-builder", "AppInfo")
  @js.native
  class AppInfo protected ()
    extends typings.appBuilderLib.mod.AppInfo {
    def this(info: typings.appBuilderLib.packagerMod.Packager) = this()
    def this(info: typings.appBuilderLib.packagerMod.Packager, buildVersion: String) = this()
    def this(
      info: typings.appBuilderLib.packagerMod.Packager,
      buildVersion: js.UndefOr[scala.Nothing],
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
    def this(
      info: typings.appBuilderLib.packagerMod.Packager,
      buildVersion: String,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
    def this(
      info: typings.appBuilderLib.packagerMod.Packager,
      buildVersion: Null,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
  }
  
  @JSImport("electron-builder", "Arch")
  @js.native
  object Arch extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.builderUtil.archMod.Arch with Double] = js.native
    
    /* 3 */ val arm64: typings.builderUtil.archMod.Arch.arm64 with Double = js.native
    
    /* 2 */ val armv7l: typings.builderUtil.archMod.Arch.armv7l with Double = js.native
    
    /* 0 */ val ia32: typings.builderUtil.archMod.Arch.ia32 with Double = js.native
    
    /* 1 */ val x64: typings.builderUtil.archMod.Arch.x64 with Double = js.native
  }
  
  @JSImport("electron-builder", "CancellationToken")
  @js.native
  class CancellationToken ()
    extends typings.builderUtilRuntime.mod.CancellationToken {
    def this(parent: typings.builderUtilRuntime.cancellationTokenMod.CancellationToken) = this()
  }
  
  @JSImport("electron-builder", "DEFAULT_TARGET")
  @js.native
  val DEFAULT_TARGET: /* "default" */ String = js.native
  
  @JSImport("electron-builder", "DIR_TARGET")
  @js.native
  val DIR_TARGET: /* "dir" */ String = js.native
  
  @JSImport("electron-builder", "Packager")
  @js.native
  class Packager protected ()
    extends typings.appBuilderLib.mod.Packager {
    def this(options: PackagerOptions) = this()
    def this(options: PackagerOptions, cancellationToken: typings.builderUtilRuntime.mod.CancellationToken) = this()
  }
  
  @JSImport("electron-builder", "Platform")
  @js.native
  class Platform protected ()
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
    def LINUX: typings.appBuilderLib.coreMod.Platform = js.native
    @scala.inline
    def LINUX_=(x: typings.appBuilderLib.coreMod.Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINUX")(x.asInstanceOf[js.Any])
    
    @JSImport("electron-builder", "Platform.MAC")
    @js.native
    def MAC: typings.appBuilderLib.coreMod.Platform = js.native
    @scala.inline
    def MAC_=(x: typings.appBuilderLib.coreMod.Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAC")(x.asInstanceOf[js.Any])
    
    @JSImport("electron-builder", "Platform.WINDOWS")
    @js.native
    def WINDOWS: typings.appBuilderLib.coreMod.Platform = js.native
    @scala.inline
    def WINDOWS_=(x: typings.appBuilderLib.coreMod.Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOWS")(x.asInstanceOf[js.Any])
    
    @JSImport("electron-builder", "Platform.current")
    @js.native
    def current(): typings.appBuilderLib.coreMod.Platform = js.native
    
    @JSImport("electron-builder", "Platform.fromString")
    @js.native
    def fromString(name: String): typings.appBuilderLib.coreMod.Platform = js.native
  }
  
  @JSImport("electron-builder", "PublishManager")
  @js.native
  class PublishManager protected ()
    extends typings.appBuilderLib.mod.PublishManager {
    def this(packager: typings.appBuilderLib.packagerMod.Packager, publishOptions: PublishOptions) = this()
    def this(
      packager: typings.appBuilderLib.packagerMod.Packager,
      publishOptions: PublishOptions,
      cancellationToken: typings.builderUtilRuntime.mod.CancellationToken
    ) = this()
  }
  
  @JSImport("electron-builder", "Target")
  @js.native
  abstract class Target protected ()
    extends typings.appBuilderLib.mod.Target {
    protected def this(name: String) = this()
    protected def this(name: String, isAsyncSupported: Boolean) = this()
  }
  
  @JSImport("electron-builder", "archFromString")
  @js.native
  def archFromString(name: String): Arch = js.native
  
  @JSImport("electron-builder", "build")
  @js.native
  def build(): js.Promise[js.Array[String]] = js.native
  @JSImport("electron-builder", "build")
  @js.native
  def build(rawOptions: CliOptions): js.Promise[js.Array[String]] = js.native
  
  @JSImport("electron-builder", "buildForge")
  @js.native
  def buildForge(forgeOptions: ForgeOptions, options: PackagerOptions): js.Promise[js.Array[String]] = js.native
  
  @JSImport("electron-builder", "createTargets")
  @js.native
  def createTargets(platforms: js.Array[typings.appBuilderLib.mod.Platform]): Map[typings.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = js.native
  @JSImport("electron-builder", "createTargets")
  @js.native
  def createTargets(
    platforms: js.Array[typings.appBuilderLib.mod.Platform],
    `type`: js.UndefOr[scala.Nothing],
    arch: String
  ): Map[typings.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = js.native
  @JSImport("electron-builder", "createTargets")
  @js.native
  def createTargets(platforms: js.Array[typings.appBuilderLib.mod.Platform], `type`: String): Map[typings.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = js.native
  @JSImport("electron-builder", "createTargets")
  @js.native
  def createTargets(platforms: js.Array[typings.appBuilderLib.mod.Platform], `type`: String, arch: String): Map[typings.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = js.native
  @JSImport("electron-builder", "createTargets")
  @js.native
  def createTargets(platforms: js.Array[typings.appBuilderLib.mod.Platform], `type`: Null, arch: String): Map[typings.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = js.native
  
  @JSImport("electron-builder", "getArchSuffix")
  @js.native
  def getArchSuffix(arch: Arch): String = js.native
}
