package typings.embroiderSharedInternals

import typings.embroiderSharedInternals.anon.ExportedName
import typings.embroiderSharedInternals.anon.TypeofBabel
import typings.embroiderSharedInternals.anon.Visitor
import typings.embroiderSharedInternals.srcEmberCliModelsMod.AddonInstance
import typings.embroiderSharedInternals.srcEmberCliModelsMod.ShallowAddonInstance
import typings.embroiderSharedInternals.srcGetOrCreateMod.AbstractMap
import typings.embroiderSharedInternals.srcHbsToJsMod.Options
import typings.embroiderSharedInternals.srcPackageMod.default
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("@embroider/shared-internals/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@embroider/shared-internals/src", "Package")
  @js.native
  open class Package protected () extends default {
    def this(
      root: String,
      packageCache: typings.embroiderSharedInternals.srcPackageCacheMod.default,
      isApp: Boolean
    ) = this()
  }
  
  @JSImport("@embroider/shared-internals/src", "PackageCache")
  @js.native
  open class PackageCache protected ()
    extends typings.embroiderSharedInternals.srcPackageCacheMod.default {
    def this(appRoot: String) = this()
  }
  /* static members */
  object PackageCache {
    
    @JSImport("@embroider/shared-internals/src", "PackageCache")
    @js.native
    val ^ : js.Any = js.native
    
    inline def shared(identifier: String, appRoot: String): typings.embroiderSharedInternals.srcPackageCacheMod.PackageCache = (^.asInstanceOf[js.Dynamic].applyDynamic("shared")(identifier.asInstanceOf[js.Any], appRoot.asInstanceOf[js.Any])).asInstanceOf[typings.embroiderSharedInternals.srcPackageCacheMod.PackageCache]
  }
  
  inline def babelFilter(skipBabel: js.Array[typings.embroiderSharedInternals.anon.Package], appRoot: String): js.Function1[/* filename */ String, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("babelFilter")(skipBabel.asInstanceOf[js.Any], appRoot.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* filename */ String, Boolean]]
  
  @JSImport("@embroider/shared-internals/src", "emberVirtualPackages")
  @js.native
  val emberVirtualPackages: Set[String] = js.native
  
  @JSImport("@embroider/shared-internals/src", "emberVirtualPeerDeps")
  @js.native
  val emberVirtualPeerDeps: Set[String] = js.native
  
  inline def explicitRelative(fromDir: String, toFile: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("explicitRelative")(fromDir.asInstanceOf[js.Any], toFile.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def extensionsPattern(extensions: js.Array[String]): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("extensionsPattern")(extensions.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def findTopmostAddon(addon: AddonInstance): ShallowAddonInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("findTopmostAddon")(addon.asInstanceOf[js.Any]).asInstanceOf[ShallowAddonInstance]
  
  inline def getOrCreate[K, V](map: AbstractMap[K, V], key: K, construct: js.Function1[/* key */ K, V]): V = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreate")(map.asInstanceOf[js.Any], key.asInstanceOf[js.Any], construct.asInstanceOf[js.Any])).asInstanceOf[V]
  
  inline def hbsToJS(hbsContents: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hbsToJS")(hbsContents.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hbsToJS(hbsContents: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hbsToJS")(hbsContents.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isDeepAddonInstance(addon: AddonInstance): /* is @embroider/shared-internals.@embroider/shared-internals/src/ember-cli-models.DeepAddonInstance */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeepAddonInstance")(addon.asInstanceOf[js.Any]).asInstanceOf[/* is @embroider/shared-internals.@embroider/shared-internals/src/ember-cli-models.DeepAddonInstance */ Boolean]
  
  inline def packageName(specifier: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("packageName")(specifier.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def templateColocationPlugin(babel: TypeofBabel): Visitor = ^.asInstanceOf[js.Dynamic].applyDynamic("templateColocationPlugin")(babel.asInstanceOf[js.Any]).asInstanceOf[Visitor]
  
  @JSImport("@embroider/shared-internals/src", "templateCompilationModules")
  @js.native
  val templateCompilationModules: js.Array[ExportedName] = js.native
  
  @JSImport("@embroider/shared-internals/src", "tmpdir")
  @js.native
  val tmpdir: String = js.native
}
