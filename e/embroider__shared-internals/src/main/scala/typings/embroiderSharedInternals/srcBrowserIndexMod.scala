package typings.embroiderSharedInternals

import typings.embroiderSharedInternals.srcGetOrCreateMod.AbstractMap
import typings.embroiderSharedInternals.srcPackageMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBrowserIndexMod {
  
  @JSImport("@embroider/shared-internals/src/browser-index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@embroider/shared-internals/src/browser-index", "Package")
  @js.native
  open class Package protected () extends default {
    def this(
      root: String,
      packageCache: typings.embroiderSharedInternals.srcPackageCacheMod.default,
      isApp: Boolean
    ) = this()
  }
  
  @JSImport("@embroider/shared-internals/src/browser-index", "PackageCache")
  @js.native
  open class PackageCache ()
    extends typings.embroiderSharedInternals.srcBrowserPackageCacheMod.default
  /* static members */
  object PackageCache {
    
    @JSImport("@embroider/shared-internals/src/browser-index", "PackageCache")
    @js.native
    val ^ : js.Any = js.native
    
    inline def shared(identifier: String): typings.embroiderSharedInternals.srcBrowserPackageCacheMod.PackageCache = ^.asInstanceOf[js.Dynamic].applyDynamic("shared")(identifier.asInstanceOf[js.Any]).asInstanceOf[typings.embroiderSharedInternals.srcBrowserPackageCacheMod.PackageCache]
  }
  
  inline def explicitRelative(fromDir: String, toFile: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("explicitRelative")(fromDir.asInstanceOf[js.Any], toFile.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def extensionsPattern(extensions: js.Array[String]): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("extensionsPattern")(extensions.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def getOrCreate[K, V](map: AbstractMap[K, V], key: K, construct: js.Function1[/* key */ K, V]): V = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreate")(map.asInstanceOf[js.Any], key.asInstanceOf[js.Any], construct.asInstanceOf[js.Any])).asInstanceOf[V]
}
