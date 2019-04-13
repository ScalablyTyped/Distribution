package typings
package enhancedDashResolveLib.enhancedDashResolveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve", "ResolverFactory")
@js.native
object ResolverFactoryNs extends js.Object {
  trait AliasItem extends js.Object {
    var alias: java.lang.String
    var name: java.lang.String
    var onlyModule: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait ResolverOption extends js.Object {
    var alias: js.UndefOr[
        js.Array[AliasItem] | enhancedDashResolveLib.libConcordMod.Dictionary[java.lang.String]
      ] = js.undefined
    var aliasFields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var cachePredicate: js.UndefOr[
        js.Function1[
          /* val */ enhancedDashResolveLib.libCommonDashTypesMod.ResolverRequest, 
          scala.Boolean
        ]
      ] = js.undefined
    var descriptionFiles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var enforceExtension: js.UndefOr[scala.Boolean] = js.undefined
    var enforceModuleExtension: js.UndefOr[scala.Boolean] = js.undefined
    var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var fileSystem: js.UndefOr[enhancedDashResolveLib.libCommonDashTypesMod.AbstractInputFileSystem] = js.undefined
    var mainFields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var mainFiles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var moduleExtensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var modules: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var plugins: js.UndefOr[js.Array[stdLib.Plugin]] = js.undefined
    var resolveToContext: js.UndefOr[scala.Boolean] = js.undefined
    var resolver: js.UndefOr[enhancedDashResolveLib.libResolverMod.^] = js.undefined
    var symlinks: js.UndefOr[js.Array[java.lang.String] | scala.Boolean] = js.undefined
    var unsafeCache: js.UndefOr[scala.Boolean | enhancedDashResolveLib.libConcordMod.Dictionary[_]] = js.undefined
    var useSyncFileSystemCalls: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  def createResolver(options: ResolverOption): enhancedDashResolveLib.libResolverMod.^ = js.native
}

