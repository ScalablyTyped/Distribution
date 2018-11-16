package typings
package dropboxjsLib.DropboxNs.UtilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Util.Xhr")
@js.native
class Xhr protected () extends js.Object {
  def this(method: java.lang.String, baseUrl: java.lang.String) = this()
  var xhr: stdLib.XMLHttpRequest = js.native
  def addOauthHeader(oauth: Oauth): Xhr = js.native
  def addOauthParams(oauth: Oauth): Xhr = js.native
  def onError(
    error: dropboxjsLib.DropboxNs.ApiError,
    callBack: js.Function1[/* error */ dropboxjsLib.DropboxNs.ApiError, scala.Unit]
  ): scala.Unit = js.native
  def onReadyStateChange(): scala.Unit = js.native
  def onXdrError(): scala.Unit = js.native
  def onXdrLoad(): scala.Unit = js.native
  def prepare(): Xhr = js.native
  def reportResponseHeaders(): Xhr = js.native
  def send(
    callback: js.Function3[
      /* err */ dropboxjsLib.DropboxNs.ApiError, 
      /* responseType */ java.lang.String, 
      /* metadataHeader */ js.Object, 
      scala.Unit
    ]
  ): Xhr = js.native
  def setBody(body: java.lang.String): Xhr = js.native
  def setBody(body: stdLib.ArrayBuffer): Xhr = js.native
  def setBody(body: stdLib.Blob): Xhr = js.native
  def setCallback(
    callback: js.Function4[
      /* err */ dropboxjsLib.DropboxNs.ApiError, 
      /* responseType */ java.lang.String, 
      /* metadataHeader */ js.Object, 
      /* headers */ js.Object, 
      scala.Unit
    ]
  ): Xhr = js.native
  def setFileField(fieldName: java.lang.String, fileName: java.lang.String, fileData: java.lang.String): scala.Unit = js.native
  def setFileField(
    fieldName: java.lang.String,
    fileName: java.lang.String,
    fileData: java.lang.String,
    contentType: java.lang.String
  ): scala.Unit = js.native
  def setFileField(fieldName: java.lang.String, fileName: java.lang.String, fileData: stdLib.Blob): scala.Unit = js.native
  def setFileField(
    fieldName: java.lang.String,
    fileName: java.lang.String,
    fileData: stdLib.Blob,
    contentType: java.lang.String
  ): scala.Unit = js.native
  def setFileField(fieldName: java.lang.String, fileName: java.lang.String, fileData: stdLib.File): scala.Unit = js.native
  def setFileField(
    fieldName: java.lang.String,
    fileName: java.lang.String,
    fileData: stdLib.File,
    contentType: java.lang.String
  ): scala.Unit = js.native
  def setHeader(headerName: java.lang.String, value: java.lang.String): Xhr = js.native
  def setParams(params: dropboxjsLib.DropboxNs.QueryParams): Xhr = js.native
  def setResponseType(responseType: java.lang.String): Xhr = js.native
  def signWithOauth(oauth: Oauth, cacheFriendly: scala.Boolean): Xhr = js.native
}

@JSGlobal("Dropbox.Util.Xhr")
@js.native
object Xhr extends js.Object {
  def urlDecode(string: js.Object): dropboxjsLib.DropboxNs.QueryParams = js.native
  def urlEncode(obj: js.Object): java.lang.String = js.native
  def urlEncodeValue(obj: js.Object): java.lang.String = js.native
}

