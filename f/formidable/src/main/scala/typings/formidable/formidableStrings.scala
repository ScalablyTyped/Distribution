package typings.formidable

import typings.formidable.mod.BufferEncoding
import typings.formidable.mod.EventNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formidableStrings {
  
  @js.native
  sealed trait END extends StObject
  inline def END: END = "END".asInstanceOf[END]
  
  @js.native
  sealed trait HEADERS_ALMOST_DONE extends StObject
  inline def HEADERS_ALMOST_DONE: HEADERS_ALMOST_DONE = "HEADERS_ALMOST_DONE".asInstanceOf[HEADERS_ALMOST_DONE]
  
  @js.native
  sealed trait HEADER_FIELD extends StObject
  inline def HEADER_FIELD: HEADER_FIELD = "HEADER_FIELD".asInstanceOf[HEADER_FIELD]
  
  @js.native
  sealed trait HEADER_FIELD_START extends StObject
  inline def HEADER_FIELD_START: HEADER_FIELD_START = "HEADER_FIELD_START".asInstanceOf[HEADER_FIELD_START]
  
  @js.native
  sealed trait HEADER_VALUE extends StObject
  inline def HEADER_VALUE: HEADER_VALUE = "HEADER_VALUE".asInstanceOf[HEADER_VALUE]
  
  @js.native
  sealed trait HEADER_VALUE_ALMOST_DONE extends StObject
  inline def HEADER_VALUE_ALMOST_DONE: HEADER_VALUE_ALMOST_DONE = "HEADER_VALUE_ALMOST_DONE".asInstanceOf[HEADER_VALUE_ALMOST_DONE]
  
  @js.native
  sealed trait HEADER_VALUE_START extends StObject
  inline def HEADER_VALUE_START: HEADER_VALUE_START = "HEADER_VALUE_START".asInstanceOf[HEADER_VALUE_START]
  
  @js.native
  sealed trait PARSER_UNINITIALIZED extends StObject
  inline def PARSER_UNINITIALIZED: PARSER_UNINITIALIZED = "PARSER_UNINITIALIZED".asInstanceOf[PARSER_UNINITIALIZED]
  
  @js.native
  sealed trait PART_DATA extends StObject
  inline def PART_DATA: PART_DATA = "PART_DATA".asInstanceOf[PART_DATA]
  
  @js.native
  sealed trait PART_DATA_START extends StObject
  inline def PART_DATA_START: PART_DATA_START = "PART_DATA_START".asInstanceOf[PART_DATA_START]
  
  @js.native
  sealed trait PART_END extends StObject
  inline def PART_END: PART_END = "PART_END".asInstanceOf[PART_END]
  
  @js.native
  sealed trait START extends StObject
  inline def START: START = "START".asInstanceOf[START]
  
  @js.native
  sealed trait START_BOUNDARY extends StObject
  inline def START_BOUNDARY: START_BOUNDARY = "START_BOUNDARY".asInstanceOf[START_BOUNDARY]
  
  @js.native
  sealed trait aborted
    extends StObject
       with EventNames
  inline def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @js.native
  sealed trait ascii
    extends StObject
       with BufferEncoding
  inline def ascii: ascii = "ascii".asInstanceOf[ascii]
  
  @js.native
  sealed trait base64
    extends StObject
       with BufferEncoding
  inline def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait binary
    extends StObject
       with BufferEncoding
  inline def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait end_
    extends StObject
       with EventNames
  inline def end_ : end_ = "end".asInstanceOf[end_]
  
  @js.native
  sealed trait error
    extends StObject
       with EventNames
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait field
    extends StObject
       with EventNames
  inline def field: field = "field".asInstanceOf[field]
  
  @js.native
  sealed trait file
    extends StObject
       with EventNames
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait fileBegin
    extends StObject
       with EventNames
  inline def fileBegin: fileBegin = "fileBegin".asInstanceOf[fileBegin]
  
  @js.native
  sealed trait headerEnd
    extends StObject
       with EventNames
  inline def headerEnd: headerEnd = "headerEnd".asInstanceOf[headerEnd]
  
  @js.native
  sealed trait headerField
    extends StObject
       with EventNames
  inline def headerField: headerField = "headerField".asInstanceOf[headerField]
  
  @js.native
  sealed trait headerValue
    extends StObject
       with EventNames
  inline def headerValue: headerValue = "headerValue".asInstanceOf[headerValue]
  
  @js.native
  sealed trait headersEnd
    extends StObject
       with EventNames
  inline def headersEnd: headersEnd = "headersEnd".asInstanceOf[headersEnd]
  
  @js.native
  sealed trait hex
    extends StObject
       with BufferEncoding
  inline def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait json extends StObject
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait latin1
    extends StObject
       with BufferEncoding
  inline def latin1: latin1 = "latin1".asInstanceOf[latin1]
  
  @js.native
  sealed trait md5 extends StObject
  inline def md5: md5 = "md5".asInstanceOf[md5]
  
  @js.native
  sealed trait multipart extends StObject
  inline def multipart: multipart = "multipart".asInstanceOf[multipart]
  
  @js.native
  sealed trait octetstream extends StObject
  inline def octetstream: octetstream = "octetstream".asInstanceOf[octetstream]
  
  @js.native
  sealed trait partBegin
    extends StObject
       with EventNames
  inline def partBegin: partBegin = "partBegin".asInstanceOf[partBegin]
  
  @js.native
  sealed trait partData
    extends StObject
       with EventNames
  inline def partData: partData = "partData".asInstanceOf[partData]
  
  @js.native
  sealed trait progress
    extends StObject
       with EventNames
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait querystring extends StObject
  inline def querystring: querystring = "querystring".asInstanceOf[querystring]
  
  @js.native
  sealed trait sha1 extends StObject
  inline def sha1: sha1 = "sha1".asInstanceOf[sha1]
  
  @js.native
  sealed trait sha256 extends StObject
  inline def sha256: sha256 = "sha256".asInstanceOf[sha256]
  
  @js.native
  sealed trait `ucs-2`
    extends StObject
       with BufferEncoding
  inline def `ucs-2`: `ucs-2` = "ucs-2".asInstanceOf[`ucs-2`]
  
  @js.native
  sealed trait ucs2
    extends StObject
       with BufferEncoding
  inline def ucs2: ucs2 = "ucs2".asInstanceOf[ucs2]
  
  @js.native
  sealed trait `utf-8`
    extends StObject
       with BufferEncoding
  inline def `utf-8`: `utf-8` = "utf-8".asInstanceOf[`utf-8`]
  
  @js.native
  sealed trait utf16le
    extends StObject
       with BufferEncoding
  inline def utf16le: utf16le = "utf16le".asInstanceOf[utf16le]
  
  @js.native
  sealed trait utf8
    extends StObject
       with BufferEncoding
  inline def utf8: utf8 = "utf8".asInstanceOf[utf8]
}
