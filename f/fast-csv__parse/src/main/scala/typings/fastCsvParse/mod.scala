package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptionsArgs
import typings.fastCsvParse.typesMod.Row
import typings.fastCsvParse.typesMod.RowTransformFunction
import typings.fastCsvParse.typesMod.RowValidate
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fast-csv/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fast-csv/parse", "CsvParserStream")
  @js.native
  class CsvParserStream[I /* <: Row[js.Any] */, O /* <: Row[js.Any] */] protected ()
    extends typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] {
    def this(parserOptions: typings.fastCsvParse.parserOptionsMod.ParserOptions) = this()
  }
  /* static members */
  object CsvParserStream {
    
    @JSImport("@fast-csv/parse", "CsvParserStream")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/parse", "CsvParserStream.wrapDoneCallback")
    @js.native
    def wrapDoneCallback: js.Any = js.native
    @scala.inline
    def wrapDoneCallback_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapDoneCallback")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@fast-csv/parse", "ParserOptions")
  @js.native
  class ParserOptions ()
    extends typings.fastCsvParse.parserOptionsMod.ParserOptions {
    def this(opts: ParserOptionsArgs) = this()
  }
  
  @scala.inline
  def isSyncTransform[I /* <: Row[js.Any] */, O /* <: Row[js.Any] */](transform: RowTransformFunction[I, O]): /* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowTransform<I, O> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyncTransform")(transform.asInstanceOf[js.Any]).asInstanceOf[/* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowTransform<I, O> */ Boolean]
  
  @scala.inline
  def isSyncValidate[R /* <: Row[js.Any] */](validate: RowValidate[R]): /* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowValidate<R> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyncValidate")(validate.asInstanceOf[js.Any]).asInstanceOf[/* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowValidate<R> */ Boolean]
  
  @scala.inline
  def parse[I /* <: Row[js.Any] */, O /* <: Row[js.Any] */](): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O]]
  @scala.inline
  def parse[I /* <: Row[js.Any] */, O /* <: Row[js.Any] */](args: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(args.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O]]
  
  @scala.inline
  def parseFile[I /* <: Row[js.Any] */, O /* <: Row[js.Any] */](location: String): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(location.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O]]
  @scala.inline
  def parseFile[I /* <: Row[js.Any] */, O /* <: Row[js.Any] */](location: String, options: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(location.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O]]
  
  @scala.inline
  def parseStream[I /* <: Row[js.Any] */, O /* <: Row[js.Any] */](stream: ReadableStream): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStream")(stream.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O]]
  @scala.inline
  def parseStream[I /* <: Row[js.Any] */, O /* <: Row[js.Any] */](stream: ReadableStream, options: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStream")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O]]
  
  @scala.inline
  def parseString[I /* <: Row[js.Any] */, O /* <: Row[js.Any] */](string: String): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(string.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O]]
  @scala.inline
  def parseString[I /* <: Row[js.Any] */, O /* <: Row[js.Any] */](string: String, options: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O]]
}
