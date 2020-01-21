package typings.dropboxjs.Dropbox

import typings.dropboxjs.AnonCancelable
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Util")
@js.native
object Util extends js.Object {
  @js.native
  class EventSource protected () extends js.Object {
    def this(options: AnonCancelable) = this()
    def addListener(listener: js.Function1[/* event */ js.Any, Unit]): EventSource = js.native
    def dispatch(event: js.Object): Boolean = js.native
    def removeListener(listener: js.Function1[/* event */ js.Any, Unit]): EventSource = js.native
  }
  
  @js.native
  class Oauth () extends js.Object {
    def checkAuthStateParam(stateParam: String): Boolean = js.native
  }
  
  @js.native
  class Xhr protected () extends js.Object {
    def this(method: String, baseUrl: String) = this()
    var xhr: XMLHttpRequest = js.native
    def addOauthHeader(oauth: Oauth): Xhr = js.native
    def addOauthParams(oauth: Oauth): Xhr = js.native
    def onError(error: ApiError, callBack: js.Function1[/* error */ ApiError, Unit]): Unit = js.native
    def onReadyStateChange(): Unit = js.native
    def onXdrError(): Unit = js.native
    def onXdrLoad(): Unit = js.native
    def prepare(): Xhr = js.native
    def reportResponseHeaders(): Xhr = js.native
    def send(
      callback: js.Function3[/* err */ ApiError, /* responseType */ String, /* metadataHeader */ js.Object, Unit]
    ): Xhr = js.native
    def setBody(body: String): Xhr = js.native
    def setBody(body: ArrayBuffer): Xhr = js.native
    def setBody(body: Blob): Xhr = js.native
    def setCallback(
      callback: js.Function4[
          /* err */ ApiError, 
          /* responseType */ String, 
          /* metadataHeader */ js.Object, 
          /* headers */ js.Object, 
          Unit
        ]
    ): Xhr = js.native
    def setFileField(fieldName: String, fileName: String, fileData: String): Unit = js.native
    def setFileField(fieldName: String, fileName: String, fileData: String, contentType: String): Unit = js.native
    def setFileField(fieldName: String, fileName: String, fileData: Blob): Unit = js.native
    def setFileField(fieldName: String, fileName: String, fileData: Blob, contentType: String): Unit = js.native
    def setFileField(fieldName: String, fileName: String, fileData: typings.std.File): Unit = js.native
    def setFileField(fieldName: String, fileName: String, fileData: typings.std.File, contentType: String): Unit = js.native
    def setHeader(headerName: String, value: String): Xhr = js.native
    def setParams(params: QueryParams): Xhr = js.native
    def setResponseType(responseType: String): Xhr = js.native
    def signWithOauth(oauth: Oauth, cacheFriendly: Boolean): Xhr = js.native
  }
  
  /* static members */
  @js.native
  object Oauth extends js.Object {
    def queryParamsFromUrl(url: String): QueryParams = js.native
    def randomAuthStateParam(): String = js.native
  }
  
  /* static members */
  @js.native
  object Xhr extends js.Object {
    def urlDecode(string: js.Object): QueryParams = js.native
    def urlEncode(obj: js.Object): String = js.native
    def urlEncodeValue(obj: js.Object): String = js.native
  }
  
}

