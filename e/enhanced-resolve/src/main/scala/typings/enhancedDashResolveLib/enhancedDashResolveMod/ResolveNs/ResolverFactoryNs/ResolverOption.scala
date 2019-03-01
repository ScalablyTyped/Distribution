package typings
package enhancedDashResolveLib.enhancedDashResolveMod.ResolveNs.ResolverFactoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var resolver: js.UndefOr[enhancedDashResolveLib.libResolverMod.namespaced] = js.undefined
  var symlinks: js.UndefOr[js.Array[java.lang.String] | scala.Boolean] = js.undefined
  var unsafeCache: js.UndefOr[scala.Boolean | enhancedDashResolveLib.libConcordMod.Dictionary[_]] = js.undefined
  var useSyncFileSystemCalls: js.UndefOr[scala.Boolean] = js.undefined
}

object ResolverOption {
  @scala.inline
  def apply(
    alias: js.Array[AliasItem] | enhancedDashResolveLib.libConcordMod.Dictionary[java.lang.String] = null,
    aliasFields: js.Array[java.lang.String] = null,
    cachePredicate: js.Function1[
      /* val */ enhancedDashResolveLib.libCommonDashTypesMod.ResolverRequest, 
      scala.Boolean
    ] = null,
    descriptionFiles: js.Array[java.lang.String] = null,
    enforceExtension: js.UndefOr[scala.Boolean] = js.undefined,
    enforceModuleExtension: js.UndefOr[scala.Boolean] = js.undefined,
    extensions: js.Array[java.lang.String] = null,
    fileSystem: enhancedDashResolveLib.libCommonDashTypesMod.AbstractInputFileSystem = null,
    mainFields: js.Array[java.lang.String] = null,
    mainFiles: js.Array[java.lang.String] = null,
    moduleExtensions: js.Array[java.lang.String] = null,
    modules: js.Array[java.lang.String] = null,
    plugins: js.Array[stdLib.Plugin] = null,
    resolveToContext: js.UndefOr[scala.Boolean] = js.undefined,
    resolver: enhancedDashResolveLib.libResolverMod.namespaced = null,
    symlinks: js.Array[java.lang.String] | scala.Boolean = null,
    unsafeCache: scala.Boolean | enhancedDashResolveLib.libConcordMod.Dictionary[_] = null,
    useSyncFileSystemCalls: js.UndefOr[scala.Boolean] = js.undefined
  ): ResolverOption = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (aliasFields != null) __obj.updateDynamic("aliasFields")(aliasFields)
    if (cachePredicate != null) __obj.updateDynamic("cachePredicate")(cachePredicate)
    if (descriptionFiles != null) __obj.updateDynamic("descriptionFiles")(descriptionFiles)
    if (!js.isUndefined(enforceExtension)) __obj.updateDynamic("enforceExtension")(enforceExtension)
    if (!js.isUndefined(enforceModuleExtension)) __obj.updateDynamic("enforceModuleExtension")(enforceModuleExtension)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (fileSystem != null) __obj.updateDynamic("fileSystem")(fileSystem)
    if (mainFields != null) __obj.updateDynamic("mainFields")(mainFields)
    if (mainFiles != null) __obj.updateDynamic("mainFiles")(mainFiles)
    if (moduleExtensions != null) __obj.updateDynamic("moduleExtensions")(moduleExtensions)
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(resolveToContext)) __obj.updateDynamic("resolveToContext")(resolveToContext)
    if (resolver != null) __obj.updateDynamic("resolver")(resolver)
    if (symlinks != null) __obj.updateDynamic("symlinks")(symlinks.asInstanceOf[js.Any])
    if (unsafeCache != null) __obj.updateDynamic("unsafeCache")(unsafeCache.asInstanceOf[js.Any])
    if (!js.isUndefined(useSyncFileSystemCalls)) __obj.updateDynamic("useSyncFileSystemCalls")(useSyncFileSystemCalls)
    __obj.asInstanceOf[ResolverOption]
  }
}

