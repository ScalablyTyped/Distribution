package typings.esbuildWasm.mod

import typings.esbuildWasm.mod.^
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

inline def build[T /* <: BuildOptions */](options: SameShape[BuildOptions, T]): js.Promise[BuildResult[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildResult[T]]]

inline def buildSync[T /* <: BuildOptions */](options: SameShape[BuildOptions, T]): BuildResult[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSync")(options.asInstanceOf[js.Any]).asInstanceOf[BuildResult[T]]

inline def context[T /* <: BuildOptions */](options: SameShape[BuildOptions, T]): js.Promise[BuildContext[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("context")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildContext[T]]]

inline def formatMessages(messages: js.Array[PartialMessage], options: FormatMessagesOptions): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessages")(messages.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]

inline def formatMessagesSync(messages: js.Array[PartialMessage], options: FormatMessagesOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessagesSync")(messages.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def initialize(options: InitializeOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def transform[T /* <: TransformOptions */](input: String): js.Promise[TransformResult[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransformResult[T]]]
inline def transform[T /* <: TransformOptions */](input: String, options: SameShape[TransformOptions, T]): js.Promise[TransformResult[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransformResult[T]]]
inline def transform[T /* <: TransformOptions */](input: js.typedarray.Uint8Array): js.Promise[TransformResult[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransformResult[T]]]
inline def transform[T /* <: TransformOptions */](input: js.typedarray.Uint8Array, options: SameShape[TransformOptions, T]): js.Promise[TransformResult[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransformResult[T]]]

inline def transformSync[T /* <: TransformOptions */](input: String): TransformResult[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(input.asInstanceOf[js.Any]).asInstanceOf[TransformResult[T]]
inline def transformSync[T /* <: TransformOptions */](input: String, options: SameShape[TransformOptions, T]): TransformResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TransformResult[T]]
inline def transformSync[T /* <: TransformOptions */](input: js.typedarray.Uint8Array): TransformResult[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(input.asInstanceOf[js.Any]).asInstanceOf[TransformResult[T]]
inline def transformSync[T /* <: TransformOptions */](input: js.typedarray.Uint8Array, options: SameShape[TransformOptions, T]): TransformResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TransformResult[T]]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]
inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])

// This is a TypeScript type-level function which replaces any keys in "In"
// that aren't in "Out" with "never". We use this to reject properties with
// typos in object literals. See: https://stackoverflow.com/questions/49580725
type SameShape[Out, In /* <: Out */] = In & (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in std.Exclude<keyof In, keyof Out> ]: never} */ js.Any)
