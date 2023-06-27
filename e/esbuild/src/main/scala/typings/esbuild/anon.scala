package typings.esbuild

import org.scalablytyped.runtime.StringDictionary
import typings.esbuild.esbuildStrings.`file-loader`
import typings.esbuild.esbuildStrings.`react-jsx`
import typings.esbuild.esbuildStrings.`react-jsxdev`
import typings.esbuild.esbuildStrings.`react-native`
import typings.esbuild.esbuildStrings.cjs
import typings.esbuild.esbuildStrings.error
import typings.esbuild.esbuildStrings.esm
import typings.esbuild.esbuildStrings.preserve
import typings.esbuild.esbuildStrings.react
import typings.esbuild.esbuildStrings.remove
import typings.esbuild.mod.AnalyzeMetafileOptions
import typings.esbuild.mod.BuildContext
import typings.esbuild.mod.BuildOptions
import typings.esbuild.mod.BuildResult
import typings.esbuild.mod.FormatMessagesOptions
import typings.esbuild.mod.ImportKind
import typings.esbuild.mod.InitializeOptions
import typings.esbuild.mod.Metafile
import typings.esbuild.mod.PartialMessage
import typings.esbuild.mod.SameShape
import typings.esbuild.mod.TransformOptions
import typings.esbuild.mod.TransformResult
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AlwaysStrict extends StObject {
    
    var alwaysStrict: js.UndefOr[Boolean] = js.undefined
    
    var baseUrl: js.UndefOr[Boolean] = js.undefined
    
    var experimentalDecorators: js.UndefOr[Boolean] = js.undefined
    
    var importsNotUsedAsValues: js.UndefOr[remove | preserve | error] = js.undefined
    
    var jsx: js.UndefOr[preserve | `react-native` | react | `react-jsx` | `react-jsxdev`] = js.undefined
    
    var jsxFactory: js.UndefOr[String] = js.undefined
    
    var jsxFragmentFactory: js.UndefOr[String] = js.undefined
    
    var jsxImportSource: js.UndefOr[String] = js.undefined
    
    var paths: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
    
    var preserveValueImports: js.UndefOr[Boolean] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var useDefineForClassFields: js.UndefOr[Boolean] = js.undefined
    
    var verbatimModuleSyntax: js.UndefOr[Boolean] = js.undefined
  }
  object AlwaysStrict {
    
    inline def apply(): AlwaysStrict = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlwaysStrict]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlwaysStrict] (val x: Self) extends AnyVal {
      
      inline def setAlwaysStrict(value: Boolean): Self = StObject.set(x, "alwaysStrict", value.asInstanceOf[js.Any])
      
      inline def setAlwaysStrictUndefined: Self = StObject.set(x, "alwaysStrict", js.undefined)
      
      inline def setBaseUrl(value: Boolean): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setExperimentalDecorators(value: Boolean): Self = StObject.set(x, "experimentalDecorators", value.asInstanceOf[js.Any])
      
      inline def setExperimentalDecoratorsUndefined: Self = StObject.set(x, "experimentalDecorators", js.undefined)
      
      inline def setImportsNotUsedAsValues(value: remove | preserve | error): Self = StObject.set(x, "importsNotUsedAsValues", value.asInstanceOf[js.Any])
      
      inline def setImportsNotUsedAsValuesUndefined: Self = StObject.set(x, "importsNotUsedAsValues", js.undefined)
      
      inline def setJsx(value: preserve | `react-native` | react | `react-jsx` | `react-jsxdev`): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      inline def setJsxFactory(value: String): Self = StObject.set(x, "jsxFactory", value.asInstanceOf[js.Any])
      
      inline def setJsxFactoryUndefined: Self = StObject.set(x, "jsxFactory", js.undefined)
      
      inline def setJsxFragmentFactory(value: String): Self = StObject.set(x, "jsxFragmentFactory", value.asInstanceOf[js.Any])
      
      inline def setJsxFragmentFactoryUndefined: Self = StObject.set(x, "jsxFragmentFactory", js.undefined)
      
      inline def setJsxImportSource(value: String): Self = StObject.set(x, "jsxImportSource", value.asInstanceOf[js.Any])
      
      inline def setJsxImportSourceUndefined: Self = StObject.set(x, "jsxImportSource", js.undefined)
      
      inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      inline def setPaths(value: Record[String, js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPreserveValueImports(value: Boolean): Self = StObject.set(x, "preserveValueImports", value.asInstanceOf[js.Any])
      
      inline def setPreserveValueImportsUndefined: Self = StObject.set(x, "preserveValueImports", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setUseDefineForClassFields(value: Boolean): Self = StObject.set(x, "useDefineForClassFields", value.asInstanceOf[js.Any])
      
      inline def setUseDefineForClassFieldsUndefined: Self = StObject.set(x, "useDefineForClassFields", js.undefined)
      
      inline def setVerbatimModuleSyntax(value: Boolean): Self = StObject.set(x, "verbatimModuleSyntax", value.asInstanceOf[js.Any])
      
      inline def setVerbatimModuleSyntaxUndefined: Self = StObject.set(x, "verbatimModuleSyntax", js.undefined)
    }
  }
  
  trait AnalyzeMetafile extends StObject {
    
    def analyzeMetafile(metafile: String): js.Promise[String]
    def analyzeMetafile(metafile: String, options: AnalyzeMetafileOptions): js.Promise[String]
    def analyzeMetafile(metafile: Metafile): js.Promise[String]
    def analyzeMetafile(metafile: Metafile, options: AnalyzeMetafileOptions): js.Promise[String]
    
    def analyzeMetafileSync(metafile: String): String
    def analyzeMetafileSync(metafile: String, options: AnalyzeMetafileOptions): String
    def analyzeMetafileSync(metafile: Metafile): String
    def analyzeMetafileSync(metafile: Metafile, options: AnalyzeMetafileOptions): String
    @JSName("analyzeMetafileSync")
    var analyzeMetafileSync_Original: js.Function2[
        /* metafile */ Metafile | String, 
        /* options */ js.UndefOr[AnalyzeMetafileOptions], 
        String
      ]
    
    @JSName("analyzeMetafile")
    var analyzeMetafile_Original: js.Function2[
        /* metafile */ Metafile | String, 
        /* options */ js.UndefOr[AnalyzeMetafileOptions], 
        js.Promise[String]
      ]
    
    def build[T /* <: BuildOptions */](options: SameShape[BuildOptions, T]): js.Promise[BuildResult[T]]
    
    def buildSync[T /* <: BuildOptions */](options: SameShape[BuildOptions, T]): BuildResult[T]
    @JSName("buildSync")
    var buildSync_Original: Fn0
    
    @JSName("build")
    var build_Original: FnCallOptions
    
    def context[T /* <: BuildOptions */](options: SameShape[BuildOptions, T]): js.Promise[BuildContext[T]]
    @JSName("context")
    var context_Original: FnCall
    
    def formatMessages(messages: js.Array[PartialMessage], options: FormatMessagesOptions): js.Promise[js.Array[String]]
    
    def formatMessagesSync(messages: js.Array[PartialMessage], options: FormatMessagesOptions): js.Array[String]
    @JSName("formatMessagesSync")
    var formatMessagesSync_Original: js.Function2[
        /* messages */ js.Array[PartialMessage], 
        /* options */ FormatMessagesOptions, 
        js.Array[String]
      ]
    
    @JSName("formatMessages")
    var formatMessages_Original: js.Function2[
        /* messages */ js.Array[PartialMessage], 
        /* options */ FormatMessagesOptions, 
        js.Promise[js.Array[String]]
      ]
    
    def initialize(options: InitializeOptions): js.Promise[Unit]
    @JSName("initialize")
    var initialize_Original: js.Function1[/* options */ InitializeOptions, js.Promise[Unit]]
    
    def transform[T /* <: TransformOptions */](input: String): js.Promise[TransformResult[T]]
    def transform[T /* <: TransformOptions */](input: String, options: SameShape[TransformOptions, T]): js.Promise[TransformResult[T]]
    def transform[T /* <: TransformOptions */](input: js.typedarray.Uint8Array): js.Promise[TransformResult[T]]
    def transform[T /* <: TransformOptions */](input: js.typedarray.Uint8Array, options: SameShape[TransformOptions, T]): js.Promise[TransformResult[T]]
    
    def transformSync[T /* <: TransformOptions */](input: String): TransformResult[T]
    def transformSync[T /* <: TransformOptions */](input: String, options: SameShape[TransformOptions, T]): TransformResult[T]
    def transformSync[T /* <: TransformOptions */](input: js.typedarray.Uint8Array): TransformResult[T]
    def transformSync[T /* <: TransformOptions */](input: js.typedarray.Uint8Array, options: SameShape[TransformOptions, T]): TransformResult[T]
    @JSName("transformSync")
    var transformSync_Original: Fn1
    
    @JSName("transform")
    var transform_Original: FnCallInputOptions
    
    var version: String
  }
  object AnalyzeMetafile {
    
    inline def apply(
      analyzeMetafile: (/* metafile */ Metafile | String, /* options */ js.UndefOr[AnalyzeMetafileOptions]) => js.Promise[String],
      analyzeMetafileSync: (/* metafile */ Metafile | String, /* options */ js.UndefOr[AnalyzeMetafileOptions]) => String,
      build: FnCallOptions,
      buildSync: Fn0,
      context: FnCall,
      formatMessages: (/* messages */ js.Array[PartialMessage], /* options */ FormatMessagesOptions) => js.Promise[js.Array[String]],
      formatMessagesSync: (/* messages */ js.Array[PartialMessage], /* options */ FormatMessagesOptions) => js.Array[String],
      initialize: /* options */ InitializeOptions => js.Promise[Unit],
      transform: FnCallInputOptions,
      transformSync: Fn1,
      version: String
    ): AnalyzeMetafile = {
      val __obj = js.Dynamic.literal(analyzeMetafile = js.Any.fromFunction2(analyzeMetafile), analyzeMetafileSync = js.Any.fromFunction2(analyzeMetafileSync), build = build.asInstanceOf[js.Any], buildSync = buildSync.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], formatMessages = js.Any.fromFunction2(formatMessages), formatMessagesSync = js.Any.fromFunction2(formatMessagesSync), initialize = js.Any.fromFunction1(initialize), transform = transform.asInstanceOf[js.Any], transformSync = transformSync.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyzeMetafile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyzeMetafile] (val x: Self) extends AnyVal {
      
      inline def setAnalyzeMetafile(
        value: (/* metafile */ Metafile | String, /* options */ js.UndefOr[AnalyzeMetafileOptions]) => js.Promise[String]
      ): Self = StObject.set(x, "analyzeMetafile", js.Any.fromFunction2(value))
      
      inline def setAnalyzeMetafileSync(
        value: (/* metafile */ Metafile | String, /* options */ js.UndefOr[AnalyzeMetafileOptions]) => String
      ): Self = StObject.set(x, "analyzeMetafileSync", js.Any.fromFunction2(value))
      
      inline def setBuild(value: FnCallOptions): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setBuildSync(value: Fn0): Self = StObject.set(x, "buildSync", value.asInstanceOf[js.Any])
      
      inline def setContext(value: FnCall): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setFormatMessages(
        value: (/* messages */ js.Array[PartialMessage], /* options */ FormatMessagesOptions) => js.Promise[js.Array[String]]
      ): Self = StObject.set(x, "formatMessages", js.Any.fromFunction2(value))
      
      inline def setFormatMessagesSync(
        value: (/* messages */ js.Array[PartialMessage], /* options */ FormatMessagesOptions) => js.Array[String]
      ): Self = StObject.set(x, "formatMessagesSync", js.Any.fromFunction2(value))
      
      inline def setInitialize(value: /* options */ InitializeOptions => js.Promise[Unit]): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
      
      inline def setTransform(value: FnCallInputOptions): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformSync(value: Fn1): Self = StObject.set(x, "transformSync", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bytes extends StObject {
    
    var bytes: Double
    
    var format: js.UndefOr[cjs | esm] = js.undefined
    
    var imports: js.Array[External]
  }
  object Bytes {
    
    inline def apply(bytes: Double, imports: js.Array[External]): Bytes = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bytes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bytes] (val x: Self) extends AnyVal {
      
      inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: cjs | esm): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setImports(value: js.Array[External]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      inline def setImportsVarargs(value: External*): Self = StObject.set(x, "imports", js.Array(value*))
    }
  }
  
  trait BytesInOutput extends StObject {
    
    var bytesInOutput: Double
  }
  object BytesInOutput {
    
    inline def apply(bytesInOutput: Double): BytesInOutput = {
      val __obj = js.Dynamic.literal(bytesInOutput = bytesInOutput.asInstanceOf[js.Any])
      __obj.asInstanceOf[BytesInOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BytesInOutput] (val x: Self) extends AnyVal {
      
      inline def setBytesInOutput(value: Double): Self = StObject.set(x, "bytesInOutput", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompilerOptions extends StObject {
    
    var compilerOptions: js.UndefOr[AlwaysStrict] = js.undefined
  }
  object CompilerOptions {
    
    inline def apply(): CompilerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompilerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompilerOptions] (val x: Self) extends AnyVal {
      
      inline def setCompilerOptions(value: AlwaysStrict): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
    }
  }
  
  trait CssBundle extends StObject {
    
    var bytes: Double
    
    var cssBundle: js.UndefOr[String] = js.undefined
    
    var entryPoint: js.UndefOr[String] = js.undefined
    
    var exports: js.Array[String]
    
    var imports: js.Array[Kind]
    
    var inputs: StringDictionary[BytesInOutput]
  }
  object CssBundle {
    
    inline def apply(
      bytes: Double,
      exports: js.Array[String],
      imports: js.Array[Kind],
      inputs: StringDictionary[BytesInOutput]
    ): CssBundle = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssBundle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CssBundle] (val x: Self) extends AnyVal {
      
      inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setCssBundle(value: String): Self = StObject.set(x, "cssBundle", value.asInstanceOf[js.Any])
      
      inline def setCssBundleUndefined: Self = StObject.set(x, "cssBundle", js.undefined)
      
      inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
      
      inline def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
      
      inline def setExports(value: js.Array[String]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      inline def setExportsVarargs(value: String*): Self = StObject.set(x, "exports", js.Array(value*))
      
      inline def setImports(value: js.Array[Kind]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      inline def setImportsVarargs(value: Kind*): Self = StObject.set(x, "imports", js.Array(value*))
      
      inline def setInputs(value: StringDictionary[BytesInOutput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    }
  }
  
  trait External extends StObject {
    
    var external: js.UndefOr[Boolean] = js.undefined
    
    var kind: ImportKind
    
    var original: js.UndefOr[String] = js.undefined
    
    var path: String
  }
  object External {
    
    inline def apply(kind: ImportKind, path: String): External = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[External]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: External] (val x: Self) extends AnyVal {
      
      inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setKind(value: ImportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply[T /* <: BuildOptions */](options: SameShape[BuildOptions, T]): BuildResult[T] = js.native
  }
  
  @js.native
  trait Fn1 extends StObject {
    
    def apply[T /* <: TransformOptions */](input: String): TransformResult[T] = js.native
    def apply[T /* <: TransformOptions */](input: String, options: SameShape[TransformOptions, T]): TransformResult[T] = js.native
    def apply[T /* <: TransformOptions */](input: js.typedarray.Uint8Array): TransformResult[T] = js.native
    def apply[T /* <: TransformOptions */](input: js.typedarray.Uint8Array, options: SameShape[TransformOptions, T]): TransformResult[T] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T /* <: BuildOptions */](options: SameShape[BuildOptions, T]): js.Promise[BuildContext[T]] = js.native
  }
  
  @js.native
  trait FnCallInputOptions extends StObject {
    
    def apply[T /* <: TransformOptions */](input: String): js.Promise[TransformResult[T]] = js.native
    def apply[T /* <: TransformOptions */](input: String, options: SameShape[TransformOptions, T]): js.Promise[TransformResult[T]] = js.native
    def apply[T /* <: TransformOptions */](input: js.typedarray.Uint8Array): js.Promise[TransformResult[T]] = js.native
    def apply[T /* <: TransformOptions */](input: js.typedarray.Uint8Array, options: SameShape[TransformOptions, T]): js.Promise[TransformResult[T]] = js.native
  }
  
  @js.native
  trait FnCallOptions extends StObject {
    
    def apply[T /* <: BuildOptions */](options: SameShape[BuildOptions, T]): js.Promise[BuildResult[T]] = js.native
  }
  
  trait In extends StObject {
    
    var in: String
    
    var out: String
  }
  object In {
    
    inline def apply(in: String, out: String): In = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
      __obj.asInstanceOf[In]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: In] (val x: Self) extends AnyVal {
      
      inline def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    }
  }
  
  trait Kind extends StObject {
    
    var external: js.UndefOr[Boolean] = js.undefined
    
    var kind: ImportKind | `file-loader`
    
    var path: String
  }
  object Kind {
    
    inline def apply(kind: ImportKind | `file-loader`, path: String): Kind = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Kind]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Kind] (val x: Self) extends AnyVal {
      
      inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setKind(value: ImportKind | `file-loader`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<esbuild.esbuild.Location> */
  trait PartialLocation extends StObject {
    
    var column: js.UndefOr[Double] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var line: js.UndefOr[Double] = js.undefined
    
    var lineText: js.UndefOr[String] = js.undefined
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var suggestion: js.UndefOr[String] = js.undefined
  }
  object PartialLocation {
    
    inline def apply(): PartialLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialLocation] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineText(value: String): Self = StObject.set(x, "lineText", value.asInstanceOf[js.Any])
      
      inline def setLineTextUndefined: Self = StObject.set(x, "lineText", js.undefined)
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setSuggestion(value: String): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
      
      inline def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
    }
  }
}
