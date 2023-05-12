package typings.esbuildWasm.anon

import typings.esbuildWasm.mod.AnalyzeMetafileOptions
import typings.esbuildWasm.mod.BuildContext
import typings.esbuildWasm.mod.BuildOptions
import typings.esbuildWasm.mod.BuildResult
import typings.esbuildWasm.mod.FormatMessagesOptions
import typings.esbuildWasm.mod.InitializeOptions
import typings.esbuildWasm.mod.Metafile
import typings.esbuildWasm.mod.PartialMessage
import typings.esbuildWasm.mod.TransformOptions
import typings.esbuildWasm.mod.TransformResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeMetafileSync extends StObject {
  
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
  
  def build(options: BuildOptions): js.Promise[BuildResult[BuildOptions]]
  def build[SpecificOptions /* <: BuildOptions */](options: SpecificOptions): js.Promise[BuildResult[SpecificOptions]]
  
  def buildSync(options: BuildOptions): BuildResult[BuildOptions]
  def buildSync[SpecificOptions /* <: BuildOptions */](options: SpecificOptions): BuildResult[SpecificOptions]
  @JSName("buildSync")
  var buildSync_Original: Fn4
  
  @JSName("build")
  var build_Original: Fn3
  
  def context(options: BuildOptions): js.Promise[BuildContext[BuildOptions]]
  def context[T /* <: BuildOptions */](options: T): js.Promise[BuildContext[T]]
  @JSName("context")
  var context_Original: Fn2
  
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
  
  def transform(input: String): js.Promise[TransformResult[TransformOptions]]
  def transform(input: String, options: TransformOptions): js.Promise[TransformResult[TransformOptions]]
  def transform(input: js.typedarray.Uint8Array): js.Promise[TransformResult[TransformOptions]]
  def transform(input: js.typedarray.Uint8Array, options: TransformOptions): js.Promise[TransformResult[TransformOptions]]
  def transform[SpecificOptions /* <: TransformOptions */](input: String, options: SpecificOptions): js.Promise[TransformResult[SpecificOptions]]
  def transform[SpecificOptions /* <: TransformOptions */](input: js.typedarray.Uint8Array, options: SpecificOptions): js.Promise[TransformResult[SpecificOptions]]
  
  def transformSync(input: String): TransformResult[TransformOptions]
  def transformSync(input: String, options: TransformOptions): TransformResult[TransformOptions]
  def transformSync(input: js.typedarray.Uint8Array): TransformResult[TransformOptions]
  def transformSync(input: js.typedarray.Uint8Array, options: TransformOptions): TransformResult[TransformOptions]
  def transformSync[SpecificOptions /* <: TransformOptions */](input: String, options: SpecificOptions): TransformResult[SpecificOptions]
  @JSName("transformSync")
  var transformSync_Original: Fn6
  @JSName("transformSync")
  def transformSync_SpecificOptions[SpecificOptions /* <: TransformOptions */](input: String): TransformResult[SpecificOptions]
  
  @JSName("transform")
  var transform_Original: Fn5
  @JSName("transform")
  def transform_SpecificOptions[SpecificOptions /* <: TransformOptions */](input: String): js.Promise[TransformResult[SpecificOptions]]
  @JSName("transform")
  def transform_SpecificOptions[SpecificOptions /* <: TransformOptions */](input: js.typedarray.Uint8Array): js.Promise[TransformResult[SpecificOptions]]
  
  var version: String
}
object AnalyzeMetafileSync {
  
  inline def apply(
    analyzeMetafile: (/* metafile */ Metafile | String, /* options */ js.UndefOr[AnalyzeMetafileOptions]) => js.Promise[String],
    analyzeMetafileSync: (/* metafile */ Metafile | String, /* options */ js.UndefOr[AnalyzeMetafileOptions]) => String,
    build: Fn3,
    buildSync: Fn4,
    context: Fn2,
    formatMessages: (/* messages */ js.Array[PartialMessage], /* options */ FormatMessagesOptions) => js.Promise[js.Array[String]],
    formatMessagesSync: (/* messages */ js.Array[PartialMessage], /* options */ FormatMessagesOptions) => js.Array[String],
    initialize: /* options */ InitializeOptions => js.Promise[Unit],
    transform: Fn5,
    transformSync: Fn6,
    version: String
  ): AnalyzeMetafileSync = {
    val __obj = js.Dynamic.literal(analyzeMetafile = js.Any.fromFunction2(analyzeMetafile), analyzeMetafileSync = js.Any.fromFunction2(analyzeMetafileSync), build = build.asInstanceOf[js.Any], buildSync = buildSync.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], formatMessages = js.Any.fromFunction2(formatMessages), formatMessagesSync = js.Any.fromFunction2(formatMessagesSync), initialize = js.Any.fromFunction1(initialize), transform = transform.asInstanceOf[js.Any], transformSync = transformSync.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzeMetafileSync]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalyzeMetafileSync] (val x: Self) extends AnyVal {
    
    inline def setAnalyzeMetafile(
      value: (/* metafile */ Metafile | String, /* options */ js.UndefOr[AnalyzeMetafileOptions]) => js.Promise[String]
    ): Self = StObject.set(x, "analyzeMetafile", js.Any.fromFunction2(value))
    
    inline def setAnalyzeMetafileSync(
      value: (/* metafile */ Metafile | String, /* options */ js.UndefOr[AnalyzeMetafileOptions]) => String
    ): Self = StObject.set(x, "analyzeMetafileSync", js.Any.fromFunction2(value))
    
    inline def setBuild(value: Fn3): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildSync(value: Fn4): Self = StObject.set(x, "buildSync", value.asInstanceOf[js.Any])
    
    inline def setContext(value: Fn2): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setFormatMessages(
      value: (/* messages */ js.Array[PartialMessage], /* options */ FormatMessagesOptions) => js.Promise[js.Array[String]]
    ): Self = StObject.set(x, "formatMessages", js.Any.fromFunction2(value))
    
    inline def setFormatMessagesSync(
      value: (/* messages */ js.Array[PartialMessage], /* options */ FormatMessagesOptions) => js.Array[String]
    ): Self = StObject.set(x, "formatMessagesSync", js.Any.fromFunction2(value))
    
    inline def setInitialize(value: /* options */ InitializeOptions => js.Promise[Unit]): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setTransform(value: Fn5): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformSync(value: Fn6): Self = StObject.set(x, "transformSync", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
