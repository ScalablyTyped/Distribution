package typings.discoveryjsJsonExt

import typings.discoveryjsJsonExt.anon.Async
import typings.discoveryjsJsonExt.anon.Circular
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@discoveryjs/json-ext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseChunked(input: js.Function0[js.Iterable[TChunk] | AsyncIterable[TChunk]]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseChunked")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def parseChunked(input: Readable): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseChunked")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def stringifyInfo(value: Any): Circular = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyInfo")(value.asInstanceOf[js.Any]).asInstanceOf[Circular]
  inline def stringifyInfo(value: Any, replacer: Unit, space: Unit, options: Async): Circular = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyInfo")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Circular]
  inline def stringifyInfo(value: Any, replacer: Unit, space: TSpace): Circular = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyInfo")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Circular]
  inline def stringifyInfo(value: Any, replacer: Unit, space: TSpace, options: Async): Circular = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyInfo")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Circular]
  inline def stringifyInfo(value: Any, replacer: TReplacer): Circular = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyInfo")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[Circular]
  inline def stringifyInfo(value: Any, replacer: TReplacer, space: Unit, options: Async): Circular = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyInfo")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Circular]
  inline def stringifyInfo(value: Any, replacer: TReplacer, space: TSpace): Circular = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyInfo")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Circular]
  inline def stringifyInfo(value: Any, replacer: TReplacer, space: TSpace, options: Async): Circular = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyInfo")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Circular]
  
  inline def stringifyStream(value: Any): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyStream")(value.asInstanceOf[js.Any]).asInstanceOf[Readable]
  inline def stringifyStream(value: Any, replacer: Unit, space: TSpace): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyStream")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Readable]
  inline def stringifyStream(value: Any, replacer: TReplacer): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyStream")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[Readable]
  inline def stringifyStream(value: Any, replacer: TReplacer, space: TSpace): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyStream")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Readable]
  
  type TChunk = String | Buffer | js.typedarray.Uint8Array
  
  type TReplacer = (js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]) | (js.Array[Double | String]) | Null
  
  type TSpace = String | Double | Null
}
