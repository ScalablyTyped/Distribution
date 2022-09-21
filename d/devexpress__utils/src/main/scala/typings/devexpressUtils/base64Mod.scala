package typings.devexpressUtils

import typings.devexpressUtils.mimeTypeMod.DxMimeType
import typings.std.Blob
import typings.std.File
import typings.std.FilePropertyBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object base64Mod {
  
  @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils")
  @js.native
  open class Base64Utils () extends StObject
  /* static members */
  object Base64Utils {
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def checkPrependDataUrl(base64: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPrependDataUrl")(base64.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("@devexpress/utils/lib/utils/base64", "Base64Utils.dataUrl")
    @js.native
    def dataUrl: js.RegExp = js.native
    inline def dataUrl_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataUrl")(x.asInstanceOf[js.Any])
    
    inline def deleteDataUrlPrefix(base64DataUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDataUrlPrefix")(base64DataUrl.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def fromArrayBuffer(buffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def fromBlobAsArrayBuffer(blob: Blob, callback: js.Function1[/* base64 */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBlobAsArrayBuffer")(blob.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def fromBlobAsDataUrl(blob: Blob, callback: js.Function1[/* base64 */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBlobAsDataUrl")(blob.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getFileFromBase64(base64: String): File = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileFromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[File]
    inline def getFileFromBase64(base64: String, fileName: String): File = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileFromBase64")(base64.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[File]
    inline def getFileFromBase64(base64: String, fileName: String, options: FilePropertyBag): File = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileFromBase64")(base64.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[File]
    inline def getFileFromBase64(base64: String, fileName: Unit, options: FilePropertyBag): File = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileFromBase64")(base64.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[File]
    
    inline def getKnownMimeType(base64: String): DxMimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("getKnownMimeType")(base64.asInstanceOf[js.Any]).asInstanceOf[DxMimeType]
    
    inline def getMimeTypeAsString(base64: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getMimeTypeAsString")(base64.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def getUint8Array(base64: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getUint8Array")(base64.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def normalizeToDataUrl(base64: String, mimeType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToDataUrl")(base64.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def prependByDataUrl(base64: String, mimeType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prependByDataUrl")(base64.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
