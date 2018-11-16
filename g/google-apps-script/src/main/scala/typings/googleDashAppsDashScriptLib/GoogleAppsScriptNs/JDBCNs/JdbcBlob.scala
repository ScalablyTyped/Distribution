package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JdbcBlob extends js.Object {
  def free(): scala.Unit = js.native
  def getAppsScriptBlob(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getAs(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getBytes(
    position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    length: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def length(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def position(pattern: JdbcBlob, start: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def position(
    pattern: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte],
    start: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def setBytes(
    position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    blobSource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def setBytes(
    position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    blobSource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource,
    offset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    length: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def setBytes(
    position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    bytes: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte]
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def setBytes(
    position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    bytes: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte],
    offset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    length: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def truncate(length: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
}

