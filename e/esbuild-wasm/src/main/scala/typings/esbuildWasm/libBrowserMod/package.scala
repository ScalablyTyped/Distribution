package typings.esbuildWasm.libBrowserMod

import typings.esbuildWasm.libBrowserMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def analyzeMetafile(metafile: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("analyzeMetafile")(metafile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
inline def analyzeMetafile(metafile: String, options: AnalyzeMetafileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("analyzeMetafile")(metafile.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def analyzeMetafile(metafile: Metafile): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("analyzeMetafile")(metafile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
inline def analyzeMetafile(metafile: Metafile, options: AnalyzeMetafileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("analyzeMetafile")(metafile.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]

inline def analyzeMetafileSync(metafile: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("analyzeMetafileSync")(metafile.asInstanceOf[js.Any]).asInstanceOf[String]
inline def analyzeMetafileSync(metafile: String, options: AnalyzeMetafileOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("analyzeMetafileSync")(metafile.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
inline def analyzeMetafileSync(metafile: Metafile): String = ^.asInstanceOf[js.Dynamic].applyDynamic("analyzeMetafileSync")(metafile.asInstanceOf[js.Any]).asInstanceOf[String]
inline def analyzeMetafileSync(metafile: Metafile, options: AnalyzeMetafileOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("analyzeMetafileSync")(metafile.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def build(options: BuildOptions): js.Promise[BuildResult[BuildOptions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildResult[BuildOptions]]]
inline def build[SpecificOptions /* <: BuildOptions */](options: SpecificOptions): js.Promise[BuildResult[SpecificOptions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildResult[SpecificOptions]]]

inline def buildSync(options: BuildOptions): BuildResult[BuildOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSync")(options.asInstanceOf[js.Any]).asInstanceOf[BuildResult[BuildOptions]]
inline def buildSync[SpecificOptions /* <: BuildOptions */](options: SpecificOptions): BuildResult[SpecificOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSync")(options.asInstanceOf[js.Any]).asInstanceOf[BuildResult[SpecificOptions]]

inline def context(options: BuildOptions): js.Promise[BuildContext[BuildOptions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("context")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildContext[BuildOptions]]]
inline def context[T /* <: BuildOptions */](options: T): js.Promise[BuildContext[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("context")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildContext[T]]]

inline def formatMessages(messages: js.Array[PartialMessage], options: FormatMessagesOptions): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessages")(messages.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]

inline def formatMessagesSync(messages: js.Array[PartialMessage], options: FormatMessagesOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessagesSync")(messages.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def initialize(options: InitializeOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def transform(input: String): js.Promise[TransformResult[TransformOptions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransformResult[TransformOptions]]]
inline def transform(input: String, options: TransformOptions): js.Promise[TransformResult[TransformOptions]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransformResult[TransformOptions]]]
inline def transform(input: js.typedarray.Uint8Array): js.Promise[TransformResult[TransformOptions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransformResult[TransformOptions]]]
inline def transform(input: js.typedarray.Uint8Array, options: TransformOptions): js.Promise[TransformResult[TransformOptions]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransformResult[TransformOptions]]]
inline def transform[SpecificOptions /* <: TransformOptions */](input: String, options: SpecificOptions): js.Promise[TransformResult[SpecificOptions]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransformResult[SpecificOptions]]]
inline def transform[SpecificOptions /* <: TransformOptions */](input: js.typedarray.Uint8Array, options: SpecificOptions): js.Promise[TransformResult[SpecificOptions]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransformResult[SpecificOptions]]]

inline def transformSync(input: String): TransformResult[TransformOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(input.asInstanceOf[js.Any]).asInstanceOf[TransformResult[TransformOptions]]
inline def transformSync(input: String, options: TransformOptions): TransformResult[TransformOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TransformResult[TransformOptions]]
inline def transformSync(input: js.typedarray.Uint8Array): TransformResult[TransformOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(input.asInstanceOf[js.Any]).asInstanceOf[TransformResult[TransformOptions]]
inline def transformSync(input: js.typedarray.Uint8Array, options: TransformOptions): TransformResult[TransformOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TransformResult[TransformOptions]]
inline def transformSync[SpecificOptions /* <: TransformOptions */](input: String, options: SpecificOptions): TransformResult[SpecificOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TransformResult[SpecificOptions]]

inline def transformSync_SpecificOptions[SpecificOptions /* <: TransformOptions */](input: String): TransformResult[SpecificOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(input.asInstanceOf[js.Any]).asInstanceOf[TransformResult[SpecificOptions]]

inline def transform_SpecificOptions[SpecificOptions /* <: TransformOptions */](input: String): js.Promise[TransformResult[SpecificOptions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransformResult[SpecificOptions]]]
inline def transform_SpecificOptions[SpecificOptions /* <: TransformOptions */](input: js.typedarray.Uint8Array): js.Promise[TransformResult[SpecificOptions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransformResult[SpecificOptions]]]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]
inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
