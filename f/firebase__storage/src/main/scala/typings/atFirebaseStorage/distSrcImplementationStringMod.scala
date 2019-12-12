package typings.atFirebaseStorage

import typings.atFirebaseStorage.distSrcImplementationStringMod.StringData
import typings.atFirebaseStorage.distSrcImplementationStringMod.StringFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/string", JSImport.Namespace)
@js.native
object distSrcImplementationStringMod extends js.Object {
  @js.native
  class StringData protected () extends js.Object {
    def this(data: Uint8Array) = this()
    def this(data: Uint8Array, contentType: String) = this()
    var contentType: String | Null = js.native
    var data: Uint8Array = js.native
  }
  
  def base64Bytes_(format: StringFormat, value: String): Uint8Array = js.native
  def dataFromString(format: StringFormat, stringData: String): StringData = js.native
  def dataURLBytes_(dataUrl: String): Uint8Array = js.native
  def dataURLContentType_(dataUrl: String): String | Null = js.native
  def formatValidator(stringFormat: js.Any): Unit = js.native
  def percentEncodedBytes_(value: String): Uint8Array = js.native
  def utf8Bytes_(value: String): Uint8Array = js.native
  @js.native
  object StringFormat extends js.Object {
    var BASE64: String = js.native
    var BASE64URL: String = js.native
    var DATA_URL: String = js.native
    var RAW: String = js.native
  }
  
  type StringFormat = String
}

