package typings.esbuild.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildOptions
  extends StObject
     with CommonOptions {
  
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
  
  /** Documentation: https://esbuild.github.io/api/#chunk-names */
  var chunkNames: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#conditions */
  var conditions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#entry-names */
  var entryNames: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#entry-points */
  var entryPoints: js.UndefOr[js.Array[String] | (Record[String, String])] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#external */
  var external: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#footer */
  var footer: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#incremental */
  var incremental: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#inject */
  var inject: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#loader */
  var loader: js.UndefOr[StringDictionary[Loader]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#main-fields */
  var mainFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#metafile */
  var metafile: js.UndefOr[Boolean] = js.undefined
  
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
  
  /** Documentation: https://esbuild.github.io/plugins/ */
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#preserve-symlinks */
  var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#public-path */
  var publicPath: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#resolve-extensions */
  var resolveExtensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#splitting */
  var splitting: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#stdin */
  var stdin: js.UndefOr[StdinOptions] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#tsconfig */
  var tsconfig: js.UndefOr[String] = js.undefined
  
  // The "NODE_PATH" variable from Node.js
  /** Documentation: https://esbuild.github.io/api/#watch */
  var watch: js.UndefOr[Boolean | WatchMode] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#write */
  var write: js.UndefOr[Boolean] = js.undefined
}
object BuildOptions {
  
  inline def apply(): BuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOptions]
  }
  
  extension [Self <: BuildOptions](x: Self) {
    
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
    
    inline def setChunkNames(value: String): Self = StObject.set(x, "chunkNames", value.asInstanceOf[js.Any])
    
    inline def setChunkNamesUndefined: Self = StObject.set(x, "chunkNames", js.undefined)
    
    inline def setConditions(value: js.Array[String]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: String*): Self = StObject.set(x, "conditions", js.Array(value*))
    
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
    
    inline def setIncremental(value: Boolean): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
    
    inline def setIncrementalUndefined: Self = StObject.set(x, "incremental", js.undefined)
    
    inline def setInject(value: js.Array[String]): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
    
    inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
    
    inline def setInjectVarargs(value: String*): Self = StObject.set(x, "inject", js.Array(value*))
    
    inline def setLoader(value: StringDictionary[Loader]): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
    
    inline def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
    
    inline def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value*))
    
    inline def setMetafile(value: Boolean): Self = StObject.set(x, "metafile", value.asInstanceOf[js.Any])
    
    inline def setMetafileUndefined: Self = StObject.set(x, "metafile", js.undefined)
    
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
    
    inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
    
    inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
    
    inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    
    inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    
    inline def setResolveExtensions(value: js.Array[String]): Self = StObject.set(x, "resolveExtensions", value.asInstanceOf[js.Any])
    
    inline def setResolveExtensionsUndefined: Self = StObject.set(x, "resolveExtensions", js.undefined)
    
    inline def setResolveExtensionsVarargs(value: String*): Self = StObject.set(x, "resolveExtensions", js.Array(value*))
    
    inline def setSplitting(value: Boolean): Self = StObject.set(x, "splitting", value.asInstanceOf[js.Any])
    
    inline def setSplittingUndefined: Self = StObject.set(x, "splitting", js.undefined)
    
    inline def setStdin(value: StdinOptions): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    
    inline def setTsconfig(value: String): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
    
    inline def setTsconfigUndefined: Self = StObject.set(x, "tsconfig", js.undefined)
    
    inline def setWatch(value: Boolean | WatchMode): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    
    inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
