package typings.devexpressUtils

import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.File
import typings.std.FilePropertyBag
import typings.std.RegExp
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object base64Mod {
  
  @js.native
  sealed trait Base64MimeType extends StObject
  @JSImport("@devexpress/utils/lib/utils/base64", "Base64MimeType")
  @js.native
  object Base64MimeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Base64MimeType & Double] = js.native
    
    @js.native
    sealed trait Docm
      extends StObject
         with Base64MimeType
    /* 4 */ val Docm: typings.devexpressUtils.base64Mod.Base64MimeType.Docm & Double = js.native
    
    @js.native
    sealed trait OpenXml
      extends StObject
         with Base64MimeType
    /* 1 */ val OpenXml: typings.devexpressUtils.base64Mod.Base64MimeType.OpenXml & Double = js.native
    
    @js.native
    sealed trait PlainText
      extends StObject
         with Base64MimeType
    /* 3 */ val PlainText: typings.devexpressUtils.base64Mod.Base64MimeType.PlainText & Double = js.native
    
    @js.native
    sealed trait Rtf
      extends StObject
         with Base64MimeType
    /* 2 */ val Rtf: typings.devexpressUtils.base64Mod.Base64MimeType.Rtf & Double = js.native
    
    @js.native
    sealed trait Unknown
      extends StObject
         with Base64MimeType
    /* 0 */ val Unknown: typings.devexpressUtils.base64Mod.Base64MimeType.Unknown & Double = js.native
  }
  
  @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils")
  @js.native
  class Base64Utils () extends StObject
  /* static members */
  object Base64Utils {
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def checkPrependDataUrl(base64: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPrependDataUrl")(base64.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.dataUrl")
    @js.native
    def dataUrl: RegExp = js.native
    inline def dataUrl_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataUrl")(x.asInstanceOf[js.Any])
    
    inline def deleteDataUrlPrefix(base64DataUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDataUrlPrefix")(base64DataUrl.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def fromArrayBuffer(buffer: ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def fromBlobAsArrayBuffer(blob: Blob, callback: js.Function1[/* base64 */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBlobAsArrayBuffer")(blob.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def fromBlobAsDataUrl(blob: Blob, callback: js.Function1[/* base64 */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBlobAsDataUrl")(blob.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getFileFromBase64(base64: String): File = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileFromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[File]
    inline def getFileFromBase64(base64: String, fileName: String): File = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileFromBase64")(base64.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[File]
    inline def getFileFromBase64(base64: String, fileName: String, options: FilePropertyBag): File = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileFromBase64")(base64.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[File]
    inline def getFileFromBase64(base64: String, fileName: Unit, options: FilePropertyBag): File = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileFromBase64")(base64.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[File]
    
    inline def getKnownMimeType(base64: String): Base64MimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("getKnownMimeType")(base64.asInstanceOf[js.Any]).asInstanceOf[Base64MimeType]
    
    inline def getMimeTypeAsString(base64: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getMimeTypeAsString")(base64.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def getUint8Array(base64: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getUint8Array")(base64.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.mimeTypesMap")
    @js.native
    def mimeTypesMap: js.Any = js.native
    inline def mimeTypesMap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mimeTypesMap")(x.asInstanceOf[js.Any])
    
    inline def normalizeToDataUrl(base64: String, mimeType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToDataUrl")(base64.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def prependByDataUrl(base64: String, mimeType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prependByDataUrl")(base64.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("@devexpress/utils/lib/utils/base64", "DocmMimeType")
  @js.native
  val DocmMimeType: /* "application/vnd.ms-word.document.macroEnabled.12" */ String = js.native
  
  @JSImport("@devexpress/utils/lib/utils/base64", "OpenXmlMimeType")
  @js.native
  val OpenXmlMimeType: /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ String = js.native
  
  @JSImport("@devexpress/utils/lib/utils/base64", "PlainTextMimeType")
  @js.native
  val PlainTextMimeType: /* "text/plain" */ String = js.native
  
  @JSImport("@devexpress/utils/lib/utils/base64", "RtfMimeType")
  @js.native
  val RtfMimeType: /* "application/rtf" */ String = js.native
}
