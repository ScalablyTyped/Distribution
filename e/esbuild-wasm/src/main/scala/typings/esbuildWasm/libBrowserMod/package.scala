package typings.esbuildWasm.libBrowserMod

import typings.esbuildWasm.anon.BuildIncrementalmetafileM
import typings.esbuildWasm.anon.BuildOptionsincrementaltr
import typings.esbuildWasm.anon.BuildOptionsincrementaltrAbsWorkingDir
import typings.esbuildWasm.anon.BuildOptionsmetafiletrue
import typings.esbuildWasm.anon.BuildOptionswritefalse
import typings.esbuildWasm.anon.BuildResultmetafileMetafi
import typings.esbuildWasm.anon.BuildResultoutputFilesArr
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

inline def build(options: BuildOptionsincrementaltr): js.Promise[BuildIncremental] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildIncremental]]
inline def build(options: BuildOptionsincrementaltrAbsWorkingDir): js.Promise[BuildIncrementalmetafileM] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildIncrementalmetafileM]]
inline def build(options: BuildOptionsmetafiletrue): js.Promise[BuildResultmetafileMetafi] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildResultmetafileMetafi]]
inline def build(options: BuildOptionswritefalse): js.Promise[BuildResultoutputFilesArr] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildResultoutputFilesArr]]
inline def build(options: BuildOptions): js.Promise[BuildResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildResult]]

inline def buildSync(options: BuildOptionswritefalse): BuildResultoutputFilesArr = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSync")(options.asInstanceOf[js.Any]).asInstanceOf[BuildResultoutputFilesArr]
inline def buildSync(options: BuildOptions): BuildResult = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSync")(options.asInstanceOf[js.Any]).asInstanceOf[BuildResult]

inline def formatMessages(messages: js.Array[PartialMessage], options: FormatMessagesOptions): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessages")(messages.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]

inline def formatMessagesSync(messages: js.Array[PartialMessage], options: FormatMessagesOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessagesSync")(messages.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def initialize(options: InitializeOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def serve(serveOptions: ServeOptions, buildOptions: BuildOptions): js.Promise[ServeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("serve")(serveOptions.asInstanceOf[js.Any], buildOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ServeResult]]

inline def transform(input: String): js.Promise[TransformResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransformResult]]
inline def transform(input: String, options: TransformOptions): js.Promise[TransformResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransformResult]]
inline def transform(input: js.typedarray.Uint8Array): js.Promise[TransformResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransformResult]]
inline def transform(input: js.typedarray.Uint8Array, options: TransformOptions): js.Promise[TransformResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransformResult]]

inline def transformSync(input: String): TransformResult = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(input.asInstanceOf[js.Any]).asInstanceOf[TransformResult]
inline def transformSync(input: String, options: TransformOptions): TransformResult = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TransformResult]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]
inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
