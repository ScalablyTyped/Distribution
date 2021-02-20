package typings.devexpressUtils

import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.File
import typings.std.FilePropertyBag
import typings.std.RegExp
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object base64Mod {
  
  @js.native
  sealed trait Base64MimeType extends StObject
  @JSImport("@devexpress/utils/lib/utils/base64", "Base64MimeType")
  @js.native
  object Base64MimeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Base64MimeType with Double] = js.native
    
    @js.native
    sealed trait Docm extends Base64MimeType
    /* 4 */ val Docm: typings.devexpressUtils.base64Mod.Base64MimeType.Docm with Double = js.native
    
    @js.native
    sealed trait OpenXml extends Base64MimeType
    /* 1 */ val OpenXml: typings.devexpressUtils.base64Mod.Base64MimeType.OpenXml with Double = js.native
    
    @js.native
    sealed trait PlainText extends Base64MimeType
    /* 3 */ val PlainText: typings.devexpressUtils.base64Mod.Base64MimeType.PlainText with Double = js.native
    
    @js.native
    sealed trait Rtf extends Base64MimeType
    /* 2 */ val Rtf: typings.devexpressUtils.base64Mod.Base64MimeType.Rtf with Double = js.native
    
    @js.native
    sealed trait Unknown extends Base64MimeType
    /* 0 */ val Unknown: typings.devexpressUtils.base64Mod.Base64MimeType.Unknown with Double = js.native
  }
  
  @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils")
  @js.native
  class Base64Utils () extends StObject
  /* static members */
  object Base64Utils {
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.checkPrependDataUrl")
    @js.native
    def checkPrependDataUrl(base64: String): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.dataUrl")
    @js.native
    def dataUrl: RegExp = js.native
    @scala.inline
    def dataUrl_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataUrl")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.deleteDataUrlPrefix")
    @js.native
    def deleteDataUrlPrefix(base64DataUrl: String): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.fromArrayBuffer")
    @js.native
    def fromArrayBuffer(buffer: ArrayBuffer): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.fromBlobAsArrayBuffer")
    @js.native
    def fromBlobAsArrayBuffer(blob: Blob, callback: js.Function1[/* base64 */ String, Unit]): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.fromBlobAsDataUrl")
    @js.native
    def fromBlobAsDataUrl(blob: Blob, callback: js.Function1[/* base64 */ String, Unit]): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.getFileFromBase64")
    @js.native
    def getFileFromBase64(base64: String): File = js.native
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.getFileFromBase64")
    @js.native
    def getFileFromBase64(base64: String, fileName: js.UndefOr[scala.Nothing], options: FilePropertyBag): File = js.native
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.getFileFromBase64")
    @js.native
    def getFileFromBase64(base64: String, fileName: String): File = js.native
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.getFileFromBase64")
    @js.native
    def getFileFromBase64(base64: String, fileName: String, options: FilePropertyBag): File = js.native
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.getKnownMimeType")
    @js.native
    def getKnownMimeType(base64: String): Base64MimeType = js.native
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.getMimeTypeAsString")
    @js.native
    def getMimeTypeAsString(base64: String): String | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.getUint8Array")
    @js.native
    def getUint8Array(base64: String): Uint8Array = js.native
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.mimeTypesMap")
    @js.native
    def mimeTypesMap: js.Any = js.native
    @scala.inline
    def mimeTypesMap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mimeTypesMap")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.normalizeToDataUrl")
    @js.native
    def normalizeToDataUrl(base64: String, mimeType: String): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.prependByDataUrl")
    @js.native
    def prependByDataUrl(base64: String, mimeType: String): String = js.native
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
