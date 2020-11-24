package typings.devexpressUtils

import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.File
import typings.std.FilePropertyBag
import typings.std.RegExp
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/base64", JSImport.Namespace)
@js.native
object base64Mod extends js.Object {
  
  val DocmMimeType: /* "application/vnd.ms-word.document.macroEnabled.12" */ String = js.native
  
  val OpenXmlMimeType: /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ String = js.native
  
  val PlainTextMimeType: /* "text/plain" */ String = js.native
  
  val RtfMimeType: /* "application/rtf" */ String = js.native
  
  @js.native
  sealed trait Base64MimeType extends js.Object
  @js.native
  object Base64MimeType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Base64MimeType with Double] = js.native
    
    @js.native
    sealed trait Docm extends Base64MimeType
    /* 4 */ @js.native
    object Docm extends TopLevel[Docm with Double]
    
    @js.native
    sealed trait OpenXml extends Base64MimeType
    /* 1 */ @js.native
    object OpenXml extends TopLevel[OpenXml with Double]
    
    @js.native
    sealed trait PlainText extends Base64MimeType
    /* 3 */ @js.native
    object PlainText extends TopLevel[PlainText with Double]
    
    @js.native
    sealed trait Rtf extends Base64MimeType
    /* 2 */ @js.native
    object Rtf extends TopLevel[Rtf with Double]
    
    @js.native
    sealed trait Unknown extends Base64MimeType
    /* 0 */ @js.native
    object Unknown extends TopLevel[Unknown with Double]
  }
  
  @js.native
  class Base64Utils () extends js.Object
  /* static members */
  @js.native
  object Base64Utils extends js.Object {
    
    def checkPrependDataUrl(base64: String): Boolean = js.native
    
    var dataUrl: RegExp = js.native
    
    def deleteDataUrlPrefix(base64DataUrl: String): String = js.native
    
    def fromArrayBuffer(buffer: ArrayBuffer): String = js.native
    
    def fromBlobAsArrayBuffer(blob: Blob, callback: js.Function1[/* base64 */ String, Unit]): Unit = js.native
    
    def fromBlobAsDataUrl(blob: Blob, callback: js.Function1[/* base64 */ String, Unit]): Unit = js.native
    
    def getFileFromBase64(base64: String): File = js.native
    def getFileFromBase64(base64: String, fileName: js.UndefOr[scala.Nothing], options: FilePropertyBag): File = js.native
    def getFileFromBase64(base64: String, fileName: String): File = js.native
    def getFileFromBase64(base64: String, fileName: String, options: FilePropertyBag): File = js.native
    
    def getKnownMimeType(base64: String): Base64MimeType = js.native
    
    def getMimeTypeAsString(base64: String): String | Null = js.native
    
    def getUint8Array(base64: String): Uint8Array = js.native
    
    var mimeTypesMap: js.Any = js.native
    
    def normalizeToDataUrl(base64: String, mimeType: String): String = js.native
    
    def prependByDataUrl(base64: String, mimeType: String): String = js.native
  }
}
