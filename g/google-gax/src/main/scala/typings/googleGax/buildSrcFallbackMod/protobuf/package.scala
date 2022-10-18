package typings.googleGax.buildSrcFallbackMod.protobuf

import typings.googleGax.buildSrcFallbackMod.protobuf.^
import typings.protobufjs.mod.Codegen
import typings.protobufjs.mod.IParseOptions
import typings.protobufjs.mod.IParserResult
import typings.protobufjs.mod.LoadCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def build: String = ^.asInstanceOf[js.Dynamic].selectDynamic("build").asInstanceOf[String]

inline def configure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")().asInstanceOf[Unit]

inline def decoder(mtype: typings.protobufjs.mod.Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("decoder")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]

inline def encoder(mtype: typings.protobufjs.mod.Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("encoder")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]

inline def load(filename: String): js.Promise[typings.protobufjs.mod.Root] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.protobufjs.mod.Root]]
inline def load(filename: String, callback: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def load(filename: String, root: typings.protobufjs.mod.Root): js.Promise[typings.protobufjs.mod.Root] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.protobufjs.mod.Root]]
inline def load(filename: String, root: typings.protobufjs.mod.Root, callback: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def load(filename: js.Array[String]): js.Promise[typings.protobufjs.mod.Root] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.protobufjs.mod.Root]]
inline def load(filename: js.Array[String], callback: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def load(filename: js.Array[String], root: typings.protobufjs.mod.Root): js.Promise[typings.protobufjs.mod.Root] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.protobufjs.mod.Root]]
inline def load(filename: js.Array[String], root: typings.protobufjs.mod.Root, callback: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def loadSync(filename: String): typings.protobufjs.mod.Root = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.Root]
inline def loadSync(filename: String, root: typings.protobufjs.mod.Root): typings.protobufjs.mod.Root = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.Root]
inline def loadSync(filename: js.Array[String]): typings.protobufjs.mod.Root = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.Root]
inline def loadSync(filename: js.Array[String], root: typings.protobufjs.mod.Root): typings.protobufjs.mod.Root = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.Root]

inline def parse(source: String): IParserResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[IParserResult]
inline def parse(source: String, options: IParseOptions): IParserResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IParserResult]
inline def parse(source: String, root: typings.protobufjs.mod.Root): IParserResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[IParserResult]
inline def parse(source: String, root: typings.protobufjs.mod.Root, options: IParseOptions): IParserResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IParserResult]

inline def verifier(mtype: typings.protobufjs.mod.Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("verifier")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]
