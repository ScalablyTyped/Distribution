package typings.esbuildWasm.anon

import org.scalablytyped.runtime.StringDictionary
import typings.esbuildWasm.esbuildWasmBooleans.`false`
import typings.esbuildWasm.esbuildWasmStrings.`inline`
import typings.esbuildWasm.esbuildWasmStrings.automatic
import typings.esbuildWasm.esbuildWasmStrings.both
import typings.esbuildWasm.esbuildWasmStrings.eof
import typings.esbuildWasm.esbuildWasmStrings.external
import typings.esbuildWasm.esbuildWasmStrings.linked
import typings.esbuildWasm.esbuildWasmStrings.none
import typings.esbuildWasm.esbuildWasmStrings.preserve
import typings.esbuildWasm.esbuildWasmStrings.transform
import typings.esbuildWasm.mod.Charset
import typings.esbuildWasm.mod.Drop
import typings.esbuildWasm.mod.Format
import typings.esbuildWasm.mod.Loader
import typings.esbuildWasm.mod.LogLevel
import typings.esbuildWasm.mod.Platform
import typings.esbuildWasm.mod.Plugin
import typings.esbuildWasm.mod.StdinOptions
import typings.esbuildWasm.mod.WatchMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined esbuild-wasm.esbuild-wasm.BuildOptions & {  metafile :true} */
trait BuildOptionsmetafiletrueAbsWorkingDir extends StObject {
  
  /** Documentation: https://esbuild.github.io/api/#working-directory */
  var absWorkingDir: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#allow-overwrite */
  var allowOverwrite: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#asset-names */
  var assetNames: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#banner */
  var banner: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#bundle */
  var bundle: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#charset */
  var charset: js.UndefOr[Charset] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#chunk-names */
  var chunkNames: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#color */
  var color: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#conditions */
  var conditions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#define */
  var define: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#drop */
  var drop: js.UndefOr[js.Array[Drop]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#entry-names */
  var entryNames: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#entry-points */
  var entryPoints: js.UndefOr[js.Array[String] | (Record[String, String])] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#external */
  var external: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#footer */
  var footer: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#format */
  var format: js.UndefOr[Format] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#global-name */
  var globalName: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#ignore-annotations */
  var ignoreAnnotations: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#incremental */
  var incremental: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#inject */
  var inject: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#jsx */
  var jsx: js.UndefOr[transform | preserve | automatic] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#jsx-development */
  var jsxDev: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#jsx-factory */
  var jsxFactory: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#jsx-fragment */
  var jsxFragment: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#jsx-import-source */
  var jsxImportSource: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#jsx-side-effects */
  var jsxSideEffects: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#keep-names */
  var keepNames: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#legal-comments */
  var legalComments: js.UndefOr[none | `inline` | eof | linked | external] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#loader */
  var loader: js.UndefOr[StringDictionary[Loader]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#log-level */
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#log-limit */
  var logLimit: js.UndefOr[Double] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#log-override */
  var logOverride: js.UndefOr[Record[String, LogLevel]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#main-fields */
  var mainFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#mangle-props */
  var mangleCache: js.UndefOr[Record[String, String | `false`]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#mangle-props */
  var mangleProps: js.UndefOr[js.RegExp] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#mangle-props */
  var mangleQuoted: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#metafile */
  var metafile: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#minify */
  var minify: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#minify */
  var minifyIdentifiers: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#minify */
  var minifySyntax: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#minify */
  var minifyWhitespace: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#node-paths */
  var nodePaths: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#out-extension */
  var outExtension: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#outbase */
  var outbase: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#outdir */
  var outdir: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#outfile */
  var outfile: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#platform */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /** Documentation: https://esbuild.github.io/plugins/ */
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#preserve-symlinks */
  var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#public-path */
  var publicPath: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#pure */
  var pure: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#mangle-props */
  var reserveProps: js.UndefOr[js.RegExp] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#resolve-extensions */
  var resolveExtensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#source-root */
  var sourceRoot: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#sourcemap */
  var sourcemap: js.UndefOr[Boolean | linked | `inline` | external | both] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#sources-content */
  var sourcesContent: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#splitting */
  var splitting: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#stdin */
  var stdin: js.UndefOr[StdinOptions] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#supported */
  var supported: js.UndefOr[Record[String, Boolean]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#target */
  var target: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#tree-shaking */
  var treeShaking: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#tsconfig */
  var tsconfig: js.UndefOr[String] = js.undefined
  
  // The "NODE_PATH" variable from Node.js
  /** Documentation: https://esbuild.github.io/api/#watch */
  var watch: js.UndefOr[Boolean | WatchMode] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#write */
  var write: js.UndefOr[Boolean] = js.undefined
}
object BuildOptionsmetafiletrueAbsWorkingDir {
  
  inline def apply(): BuildOptionsmetafiletrueAbsWorkingDir = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOptionsmetafiletrueAbsWorkingDir]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildOptionsmetafiletrueAbsWorkingDir] (val x: Self) extends AnyVal {
    
    inline def setAbsWorkingDir(value: String): Self = StObject.set(x, "absWorkingDir", value.asInstanceOf[js.Any])
    
    inline def setAbsWorkingDirUndefined: Self = StObject.set(x, "absWorkingDir", js.undefined)
    
    inline def setAllowOverwrite(value: Boolean): Self = StObject.set(x, "allowOverwrite", value.asInstanceOf[js.Any])
    
    inline def setAllowOverwriteUndefined: Self = StObject.set(x, "allowOverwrite", js.undefined)
    
    inline def setAssetNames(value: String): Self = StObject.set(x, "assetNames", value.asInstanceOf[js.Any])
    
    inline def setAssetNamesUndefined: Self = StObject.set(x, "assetNames", js.undefined)
    
    inline def setBanner(value: StringDictionary[String]): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
    
    inline def setBundle(value: Boolean): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
    
    inline def setBundleUndefined: Self = StObject.set(x, "bundle", js.undefined)
    
    inline def setCharset(value: Charset): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    inline def setChunkNames(value: String): Self = StObject.set(x, "chunkNames", value.asInstanceOf[js.Any])
    
    inline def setChunkNamesUndefined: Self = StObject.set(x, "chunkNames", js.undefined)
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setConditions(value: js.Array[String]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: String*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setDefine(value: StringDictionary[String]): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
    
    inline def setDefineUndefined: Self = StObject.set(x, "define", js.undefined)
    
    inline def setDrop(value: js.Array[Drop]): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setDropVarargs(value: Drop*): Self = StObject.set(x, "drop", js.Array(value*))
    
    inline def setEntryNames(value: String): Self = StObject.set(x, "entryNames", value.asInstanceOf[js.Any])
    
    inline def setEntryNamesUndefined: Self = StObject.set(x, "entryNames", js.undefined)
    
    inline def setEntryPoints(value: js.Array[String] | (Record[String, String])): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
    
    inline def setEntryPointsUndefined: Self = StObject.set(x, "entryPoints", js.undefined)
    
    inline def setEntryPointsVarargs(value: String*): Self = StObject.set(x, "entryPoints", js.Array(value*))
    
    inline def setExternal(value: js.Array[String]): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    inline def setExternalVarargs(value: String*): Self = StObject.set(x, "external", js.Array(value*))
    
    inline def setFooter(value: StringDictionary[String]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGlobalName(value: String): Self = StObject.set(x, "globalName", value.asInstanceOf[js.Any])
    
    inline def setGlobalNameUndefined: Self = StObject.set(x, "globalName", js.undefined)
    
    inline def setIgnoreAnnotations(value: Boolean): Self = StObject.set(x, "ignoreAnnotations", value.asInstanceOf[js.Any])
    
    inline def setIgnoreAnnotationsUndefined: Self = StObject.set(x, "ignoreAnnotations", js.undefined)
    
    inline def setIncremental(value: Boolean): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
    
    inline def setIncrementalUndefined: Self = StObject.set(x, "incremental", js.undefined)
    
    inline def setInject(value: js.Array[String]): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
    
    inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
    
    inline def setInjectVarargs(value: String*): Self = StObject.set(x, "inject", js.Array(value*))
    
    inline def setJsx(value: transform | preserve | automatic): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
    
    inline def setJsxDev(value: Boolean): Self = StObject.set(x, "jsxDev", value.asInstanceOf[js.Any])
    
    inline def setJsxDevUndefined: Self = StObject.set(x, "jsxDev", js.undefined)
    
    inline def setJsxFactory(value: String): Self = StObject.set(x, "jsxFactory", value.asInstanceOf[js.Any])
    
    inline def setJsxFactoryUndefined: Self = StObject.set(x, "jsxFactory", js.undefined)
    
    inline def setJsxFragment(value: String): Self = StObject.set(x, "jsxFragment", value.asInstanceOf[js.Any])
    
    inline def setJsxFragmentUndefined: Self = StObject.set(x, "jsxFragment", js.undefined)
    
    inline def setJsxImportSource(value: String): Self = StObject.set(x, "jsxImportSource", value.asInstanceOf[js.Any])
    
    inline def setJsxImportSourceUndefined: Self = StObject.set(x, "jsxImportSource", js.undefined)
    
    inline def setJsxSideEffects(value: Boolean): Self = StObject.set(x, "jsxSideEffects", value.asInstanceOf[js.Any])
    
    inline def setJsxSideEffectsUndefined: Self = StObject.set(x, "jsxSideEffects", js.undefined)
    
    inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
    
    inline def setKeepNames(value: Boolean): Self = StObject.set(x, "keepNames", value.asInstanceOf[js.Any])
    
    inline def setKeepNamesUndefined: Self = StObject.set(x, "keepNames", js.undefined)
    
    inline def setLegalComments(value: none | `inline` | eof | linked | external): Self = StObject.set(x, "legalComments", value.asInstanceOf[js.Any])
    
    inline def setLegalCommentsUndefined: Self = StObject.set(x, "legalComments", js.undefined)
    
    inline def setLoader(value: StringDictionary[Loader]): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogLimit(value: Double): Self = StObject.set(x, "logLimit", value.asInstanceOf[js.Any])
    
    inline def setLogLimitUndefined: Self = StObject.set(x, "logLimit", js.undefined)
    
    inline def setLogOverride(value: Record[String, LogLevel]): Self = StObject.set(x, "logOverride", value.asInstanceOf[js.Any])
    
    inline def setLogOverrideUndefined: Self = StObject.set(x, "logOverride", js.undefined)
    
    inline def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
    
    inline def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
    
    inline def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value*))
    
    inline def setMangleCache(value: Record[String, String | `false`]): Self = StObject.set(x, "mangleCache", value.asInstanceOf[js.Any])
    
    inline def setMangleCacheUndefined: Self = StObject.set(x, "mangleCache", js.undefined)
    
    inline def setMangleProps(value: js.RegExp): Self = StObject.set(x, "mangleProps", value.asInstanceOf[js.Any])
    
    inline def setManglePropsUndefined: Self = StObject.set(x, "mangleProps", js.undefined)
    
    inline def setMangleQuoted(value: Boolean): Self = StObject.set(x, "mangleQuoted", value.asInstanceOf[js.Any])
    
    inline def setMangleQuotedUndefined: Self = StObject.set(x, "mangleQuoted", js.undefined)
    
    inline def setMetafile(value: Boolean): Self = StObject.set(x, "metafile", value.asInstanceOf[js.Any])
    
    inline def setMetafileUndefined: Self = StObject.set(x, "metafile", js.undefined)
    
    inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setMinifyIdentifiers(value: Boolean): Self = StObject.set(x, "minifyIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setMinifyIdentifiersUndefined: Self = StObject.set(x, "minifyIdentifiers", js.undefined)
    
    inline def setMinifySyntax(value: Boolean): Self = StObject.set(x, "minifySyntax", value.asInstanceOf[js.Any])
    
    inline def setMinifySyntaxUndefined: Self = StObject.set(x, "minifySyntax", js.undefined)
    
    inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    
    inline def setMinifyWhitespace(value: Boolean): Self = StObject.set(x, "minifyWhitespace", value.asInstanceOf[js.Any])
    
    inline def setMinifyWhitespaceUndefined: Self = StObject.set(x, "minifyWhitespace", js.undefined)
    
    inline def setNodePaths(value: js.Array[String]): Self = StObject.set(x, "nodePaths", value.asInstanceOf[js.Any])
    
    inline def setNodePathsUndefined: Self = StObject.set(x, "nodePaths", js.undefined)
    
    inline def setNodePathsVarargs(value: String*): Self = StObject.set(x, "nodePaths", js.Array(value*))
    
    inline def setOutExtension(value: StringDictionary[String]): Self = StObject.set(x, "outExtension", value.asInstanceOf[js.Any])
    
    inline def setOutExtensionUndefined: Self = StObject.set(x, "outExtension", js.undefined)
    
    inline def setOutbase(value: String): Self = StObject.set(x, "outbase", value.asInstanceOf[js.Any])
    
    inline def setOutbaseUndefined: Self = StObject.set(x, "outbase", js.undefined)
    
    inline def setOutdir(value: String): Self = StObject.set(x, "outdir", value.asInstanceOf[js.Any])
    
    inline def setOutdirUndefined: Self = StObject.set(x, "outdir", js.undefined)
    
    inline def setOutfile(value: String): Self = StObject.set(x, "outfile", value.asInstanceOf[js.Any])
    
    inline def setOutfileUndefined: Self = StObject.set(x, "outfile", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
    
    inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
    
    inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    
    inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    
    inline def setPure(value: js.Array[String]): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
    
    inline def setPureVarargs(value: String*): Self = StObject.set(x, "pure", js.Array(value*))
    
    inline def setReserveProps(value: js.RegExp): Self = StObject.set(x, "reserveProps", value.asInstanceOf[js.Any])
    
    inline def setReservePropsUndefined: Self = StObject.set(x, "reserveProps", js.undefined)
    
    inline def setResolveExtensions(value: js.Array[String]): Self = StObject.set(x, "resolveExtensions", value.asInstanceOf[js.Any])
    
    inline def setResolveExtensionsUndefined: Self = StObject.set(x, "resolveExtensions", js.undefined)
    
    inline def setResolveExtensionsVarargs(value: String*): Self = StObject.set(x, "resolveExtensions", js.Array(value*))
    
    inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    
    inline def setSourcemap(value: Boolean | linked | `inline` | external | both): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    
    inline def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
    
    inline def setSourcesContent(value: Boolean): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
    
    inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
    
    inline def setSplitting(value: Boolean): Self = StObject.set(x, "splitting", value.asInstanceOf[js.Any])
    
    inline def setSplittingUndefined: Self = StObject.set(x, "splitting", js.undefined)
    
    inline def setStdin(value: StdinOptions): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    
    inline def setSupported(value: Record[String, Boolean]): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    inline def setSupportedUndefined: Self = StObject.set(x, "supported", js.undefined)
    
    inline def setTarget(value: String | js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setTreeShaking(value: Boolean): Self = StObject.set(x, "treeShaking", value.asInstanceOf[js.Any])
    
    inline def setTreeShakingUndefined: Self = StObject.set(x, "treeShaking", js.undefined)
    
    inline def setTsconfig(value: String): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
    
    inline def setTsconfigUndefined: Self = StObject.set(x, "tsconfig", js.undefined)
    
    inline def setWatch(value: Boolean | WatchMode): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    
    inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
