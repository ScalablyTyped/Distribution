package typings.esbuildWasm.anon

import typings.esbuildWasm.browserMod.AnalyzeMetafileOptions
import typings.esbuildWasm.browserMod.BuildIncremental
import typings.esbuildWasm.browserMod.BuildOptions
import typings.esbuildWasm.browserMod.BuildResult
import typings.esbuildWasm.browserMod.FormatMessagesOptions
import typings.esbuildWasm.browserMod.InitializeOptions
import typings.esbuildWasm.browserMod.Metafile
import typings.esbuildWasm.browserMod.PartialMessage
import typings.esbuildWasm.browserMod.ServeOptions
import typings.esbuildWasm.browserMod.ServeResult
import typings.esbuildWasm.browserMod.TransformOptions
import typings.esbuildWasm.browserMod.TransformResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def build(options: BuildOptionsincrementaltr): js.Promise[BuildIncremental]
  def build(options: BuildOptionsincrementaltrAbsWorkingDir): js.Promise[BuildIncrementalmetafileM]
  def build(options: BuildOptionsmetafiletrue): js.Promise[BuildResultmetafileMetafi]
  def build(options: BuildOptionswritefalse): js.Promise[BuildResultoutputFilesArr]
  def build(options: BuildOptions): js.Promise[BuildResult]
  
  def buildSync(options: BuildOptionswritefalse): BuildResultoutputFilesArr
  def buildSync(options: BuildOptions): BuildResult
  @JSName("buildSync")
  var buildSync_Original: FnCallOptions
  
  @JSName("build")
  var build_Original: FnCall
  
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
  
  def serve(serveOptions: ServeOptions, buildOptions: BuildOptions): js.Promise[ServeResult]
  @JSName("serve")
  var serve_Original: js.Function2[
    /* serveOptions */ ServeOptions, 
    /* buildOptions */ BuildOptions, 
    js.Promise[ServeResult]
  ]
  
  def transform(input: String): js.Promise[TransformResult]
  def transform(input: String, options: TransformOptions): js.Promise[TransformResult]
  def transform(input: js.typedarray.Uint8Array): js.Promise[TransformResult]
  def transform(input: js.typedarray.Uint8Array, options: TransformOptions): js.Promise[TransformResult]
  
  def transformSync(input: String): TransformResult
  def transformSync(input: String, options: TransformOptions): TransformResult
  @JSName("transformSync")
  var transformSync_Original: js.Function2[/* input */ String, /* options */ js.UndefOr[TransformOptions], TransformResult]
  
  @JSName("transform")
  var transform_Original: js.Function2[
    /* input */ String | js.typedarray.Uint8Array, 
    /* options */ js.UndefOr[TransformOptions], 
    js.Promise[TransformResult]
  ]
  
  var version: String
}
object AnalyzeMetafile {
  
  inline def apply(
    analyzeMetafile: (/* metafile */ Metafile | String, /* options */ js.UndefOr[AnalyzeMetafileOptions]) => js.Promise[String],
    analyzeMetafileSync: (/* metafile */ Metafile | String, /* options */ js.UndefOr[AnalyzeMetafileOptions]) => String,
    build: FnCall,
    buildSync: FnCallOptions,
    formatMessages: (/* messages */ js.Array[PartialMessage], /* options */ FormatMessagesOptions) => js.Promise[js.Array[String]],
    formatMessagesSync: (/* messages */ js.Array[PartialMessage], /* options */ FormatMessagesOptions) => js.Array[String],
    initialize: /* options */ InitializeOptions => js.Promise[Unit],
    serve: (/* serveOptions */ ServeOptions, /* buildOptions */ BuildOptions) => js.Promise[ServeResult],
    transform: (/* input */ String | js.typedarray.Uint8Array, /* options */ js.UndefOr[TransformOptions]) => js.Promise[TransformResult],
    transformSync: (/* input */ String, /* options */ js.UndefOr[TransformOptions]) => TransformResult,
    version: String
  ): AnalyzeMetafile = {
    val __obj = js.Dynamic.literal(analyzeMetafile = js.Any.fromFunction2(analyzeMetafile), analyzeMetafileSync = js.Any.fromFunction2(analyzeMetafileSync), build = build.asInstanceOf[js.Any], buildSync = buildSync.asInstanceOf[js.Any], formatMessages = js.Any.fromFunction2(formatMessages), formatMessagesSync = js.Any.fromFunction2(formatMessagesSync), initialize = js.Any.fromFunction1(initialize), serve = js.Any.fromFunction2(serve), transform = js.Any.fromFunction2(transform), transformSync = js.Any.fromFunction2(transformSync), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzeMetafile]
  }
  
  extension [Self <: AnalyzeMetafile](x: Self) {
    
    inline def setAnalyzeMetafile(
      value: (/* metafile */ Metafile | String, /* options */ js.UndefOr[AnalyzeMetafileOptions]) => js.Promise[String]
    ): Self = StObject.set(x, "analyzeMetafile", js.Any.fromFunction2(value))
    
    inline def setAnalyzeMetafileSync(
      value: (/* metafile */ Metafile | String, /* options */ js.UndefOr[AnalyzeMetafileOptions]) => String
    ): Self = StObject.set(x, "analyzeMetafileSync", js.Any.fromFunction2(value))
    
    inline def setBuild(value: FnCall): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildSync(value: FnCallOptions): Self = StObject.set(x, "buildSync", value.asInstanceOf[js.Any])
    
    inline def setFormatMessages(
      value: (/* messages */ js.Array[PartialMessage], /* options */ FormatMessagesOptions) => js.Promise[js.Array[String]]
    ): Self = StObject.set(x, "formatMessages", js.Any.fromFunction2(value))
    
    inline def setFormatMessagesSync(
      value: (/* messages */ js.Array[PartialMessage], /* options */ FormatMessagesOptions) => js.Array[String]
    ): Self = StObject.set(x, "formatMessagesSync", js.Any.fromFunction2(value))
    
    inline def setInitialize(value: /* options */ InitializeOptions => js.Promise[Unit]): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setServe(
      value: (/* serveOptions */ ServeOptions, /* buildOptions */ BuildOptions) => js.Promise[ServeResult]
    ): Self = StObject.set(x, "serve", js.Any.fromFunction2(value))
    
    inline def setTransform(
      value: (/* input */ String | js.typedarray.Uint8Array, /* options */ js.UndefOr[TransformOptions]) => js.Promise[TransformResult]
    ): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    
    inline def setTransformSync(value: (/* input */ String, /* options */ js.UndefOr[TransformOptions]) => TransformResult): Self = StObject.set(x, "transformSync", js.Any.fromFunction2(value))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
