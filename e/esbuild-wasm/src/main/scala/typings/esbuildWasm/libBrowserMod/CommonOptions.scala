package typings.esbuildWasm.libBrowserMod

import org.scalablytyped.runtime.StringDictionary
import typings.esbuildWasm.anon.CompilerOptions
import typings.esbuildWasm.esbuildWasmBooleans.`false`
import typings.esbuildWasm.esbuildWasmStrings.`inline`
import typings.esbuildWasm.esbuildWasmStrings.automatic
import typings.esbuildWasm.esbuildWasmStrings.both
import typings.esbuildWasm.esbuildWasmStrings.eof
import typings.esbuildWasm.esbuildWasmStrings.external
import typings.esbuildWasm.esbuildWasmStrings.linked
import typings.esbuildWasm.esbuildWasmStrings.none
import typings.esbuildWasm.esbuildWasmStrings.preserve
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonOptions extends StObject {
  
  /** Documentation: https://esbuild.github.io/api/#charset */
  var charset: js.UndefOr[Charset] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#color */
  var color: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#define */
  var define: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#drop */
  var drop: js.UndefOr[js.Array[Drop]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#format */
  var format: js.UndefOr[Format] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#global-name */
  var globalName: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#ignore-annotations */
  var ignoreAnnotations: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#jsx */
  var jsx: js.UndefOr[typings.esbuildWasm.esbuildWasmStrings.transform | preserve | automatic] = js.undefined
  
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
  
  /** Documentation: https://esbuild.github.io/api/#log-level */
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#log-limit */
  var logLimit: js.UndefOr[Double] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#log-override */
  var logOverride: js.UndefOr[Record[String, LogLevel]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#mangle-props */
  var mangleCache: js.UndefOr[Record[String, String | `false`]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#mangle-props */
  var mangleProps: js.UndefOr[js.RegExp] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#mangle-props */
  var mangleQuoted: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#minify */
  var minify: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#minify */
  var minifyIdentifiers: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#minify */
  var minifySyntax: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#minify */
  var minifyWhitespace: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#platform */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#pure */
  var pure: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#mangle-props */
  var reserveProps: js.UndefOr[js.RegExp] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#source-root */
  var sourceRoot: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#sourcemap */
  var sourcemap: js.UndefOr[Boolean | linked | `inline` | external | both] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#sources-content */
  var sourcesContent: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#supported */
  var supported: js.UndefOr[Record[String, Boolean]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#target */
  var target: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#tree-shaking */
  var treeShaking: js.UndefOr[Boolean] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#tsconfig-raw */
  var tsconfigRaw: js.UndefOr[String | CompilerOptions] = js.undefined
}
object CommonOptions {
  
  inline def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommonOptions] (val x: Self) extends AnyVal {
    
    inline def setCharset(value: Charset): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDefine(value: StringDictionary[String]): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
    
    inline def setDefineUndefined: Self = StObject.set(x, "define", js.undefined)
    
    inline def setDrop(value: js.Array[Drop]): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setDropVarargs(value: Drop*): Self = StObject.set(x, "drop", js.Array(value*))
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGlobalName(value: String): Self = StObject.set(x, "globalName", value.asInstanceOf[js.Any])
    
    inline def setGlobalNameUndefined: Self = StObject.set(x, "globalName", js.undefined)
    
    inline def setIgnoreAnnotations(value: Boolean): Self = StObject.set(x, "ignoreAnnotations", value.asInstanceOf[js.Any])
    
    inline def setIgnoreAnnotationsUndefined: Self = StObject.set(x, "ignoreAnnotations", js.undefined)
    
    inline def setJsx(value: typings.esbuildWasm.esbuildWasmStrings.transform | preserve | automatic): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
    
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
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogLimit(value: Double): Self = StObject.set(x, "logLimit", value.asInstanceOf[js.Any])
    
    inline def setLogLimitUndefined: Self = StObject.set(x, "logLimit", js.undefined)
    
    inline def setLogOverride(value: Record[String, LogLevel]): Self = StObject.set(x, "logOverride", value.asInstanceOf[js.Any])
    
    inline def setLogOverrideUndefined: Self = StObject.set(x, "logOverride", js.undefined)
    
    inline def setMangleCache(value: Record[String, String | `false`]): Self = StObject.set(x, "mangleCache", value.asInstanceOf[js.Any])
    
    inline def setMangleCacheUndefined: Self = StObject.set(x, "mangleCache", js.undefined)
    
    inline def setMangleProps(value: js.RegExp): Self = StObject.set(x, "mangleProps", value.asInstanceOf[js.Any])
    
    inline def setManglePropsUndefined: Self = StObject.set(x, "mangleProps", js.undefined)
    
    inline def setMangleQuoted(value: Boolean): Self = StObject.set(x, "mangleQuoted", value.asInstanceOf[js.Any])
    
    inline def setMangleQuotedUndefined: Self = StObject.set(x, "mangleQuoted", js.undefined)
    
    inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setMinifyIdentifiers(value: Boolean): Self = StObject.set(x, "minifyIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setMinifyIdentifiersUndefined: Self = StObject.set(x, "minifyIdentifiers", js.undefined)
    
    inline def setMinifySyntax(value: Boolean): Self = StObject.set(x, "minifySyntax", value.asInstanceOf[js.Any])
    
    inline def setMinifySyntaxUndefined: Self = StObject.set(x, "minifySyntax", js.undefined)
    
    inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    
    inline def setMinifyWhitespace(value: Boolean): Self = StObject.set(x, "minifyWhitespace", value.asInstanceOf[js.Any])
    
    inline def setMinifyWhitespaceUndefined: Self = StObject.set(x, "minifyWhitespace", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setPure(value: js.Array[String]): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
    
    inline def setPureVarargs(value: String*): Self = StObject.set(x, "pure", js.Array(value*))
    
    inline def setReserveProps(value: js.RegExp): Self = StObject.set(x, "reserveProps", value.asInstanceOf[js.Any])
    
    inline def setReservePropsUndefined: Self = StObject.set(x, "reserveProps", js.undefined)
    
    inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    
    inline def setSourcemap(value: Boolean | linked | `inline` | external | both): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    
    inline def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
    
    inline def setSourcesContent(value: Boolean): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
    
    inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
    
    inline def setSupported(value: Record[String, Boolean]): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    inline def setSupportedUndefined: Self = StObject.set(x, "supported", js.undefined)
    
    inline def setTarget(value: String | js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setTreeShaking(value: Boolean): Self = StObject.set(x, "treeShaking", value.asInstanceOf[js.Any])
    
    inline def setTreeShakingUndefined: Self = StObject.set(x, "treeShaking", js.undefined)
    
    inline def setTsconfigRaw(value: String | CompilerOptions): Self = StObject.set(x, "tsconfigRaw", value.asInstanceOf[js.Any])
    
    inline def setTsconfigRawUndefined: Self = StObject.set(x, "tsconfigRaw", js.undefined)
  }
}
