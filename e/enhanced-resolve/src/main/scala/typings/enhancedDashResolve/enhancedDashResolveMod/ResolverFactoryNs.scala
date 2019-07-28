package typings.enhancedDashResolve.enhancedDashResolveMod

import typings.enhancedDashResolve.enhancedDashResolveMod.ResolverFactoryNs.AliasItem
import typings.enhancedDashResolve.enhancedDashResolveMod.ResolverFactoryNs.ResolverOption
import typings.enhancedDashResolve.libCommonDashTypesMod.AbstractInputFileSystem
import typings.enhancedDashResolve.libCommonDashTypesMod.ResolverRequest
import typings.enhancedDashResolve.libConcordMod.Dictionary
import typings.std.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve", "ResolverFactory")
@js.native
object ResolverFactoryNs extends js.Object {
  trait AliasItem extends js.Object {
    var alias: String
    var name: String
    var onlyModule: js.UndefOr[Boolean] = js.undefined
  }
  
  trait ResolverOption extends js.Object {
    var alias: js.UndefOr[js.Array[AliasItem] | Dictionary[String]] = js.undefined
    var aliasFields: js.UndefOr[js.Array[String]] = js.undefined
    var cachePredicate: js.UndefOr[js.Function1[/* val */ ResolverRequest, Boolean]] = js.undefined
    var descriptionFiles: js.UndefOr[js.Array[String]] = js.undefined
    var enforceExtension: js.UndefOr[Boolean] = js.undefined
    var enforceModuleExtension: js.UndefOr[Boolean] = js.undefined
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    var fileSystem: js.UndefOr[AbstractInputFileSystem] = js.undefined
    var mainFields: js.UndefOr[js.Array[String]] = js.undefined
    var mainFiles: js.UndefOr[js.Array[String]] = js.undefined
    var moduleExtensions: js.UndefOr[js.Array[String]] = js.undefined
    var modules: js.UndefOr[js.Array[String]] = js.undefined
    var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
    var resolveToContext: js.UndefOr[Boolean] = js.undefined
    var resolver: js.UndefOr[typings.enhancedDashResolve.libResolverMod.^] = js.undefined
    var symlinks: js.UndefOr[js.Array[String] | Boolean] = js.undefined
    var unsafeCache: js.UndefOr[Boolean | Dictionary[_]] = js.undefined
    var useSyncFileSystemCalls: js.UndefOr[Boolean] = js.undefined
  }
  
  def createResolver(options: ResolverOption): typings.enhancedDashResolve.libResolverMod.^ = js.native
}

