package typings.fastCsvParse.parserOptionsMod

import typings.fastCsvParse.typesMod.HeaderArray
import typings.fastCsvParse.typesMod.HeaderTransformFunction
import typings.node.BufferEncoding
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fast-csv/parse/build/src/ParserOptions", "ParserOptions")
@js.native
class ParserOptions () extends js.Object {
  def this(opts: ParserOptionsArgs) = this()
  
  val NEXT_TOKEN_REGEXP: RegExp = js.native
  
  val carriageReturn: String = js.native
  
  val comment: String | Null = js.native
  
  val delimiter: String = js.native
  
  val discardUnmappedColumns: Boolean = js.native
  
  val encoding: BufferEncoding = js.native
  
  val escape: String | Null = js.native
  
  val escapeChar: String | Null = js.native
  
  val escapedDelimiter: String = js.native
  
  val headers: Boolean | HeaderTransformFunction | HeaderArray | Null = js.native
  
  val ignoreEmpty: Boolean = js.native
  
  val limitRows: Boolean = js.native
  
  val ltrim: Boolean = js.native
  
  val maxRows: Double = js.native
  
  val objectMode: Boolean = js.native
  
  val quote: String | Null = js.native
  
  val renameHeaders: Boolean = js.native
  
  val rtrim: Boolean = js.native
  
  val skipLines: Double = js.native
  
  val skipRows: Double = js.native
  
  val strictColumnHandling: Boolean = js.native
  
  val supportsComments: Boolean = js.native
  
  val trim: Boolean = js.native
}
