package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JdbcClob extends js.Object {
  def free(): scala.Unit = js.native
  def getAppsScriptBlob(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getAs(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getSubString(
    position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    length: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): java.lang.String = js.native
  def length(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def position(search: JdbcClob, start: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def position(search: java.lang.String, start: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def setString(
    position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    blobSource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def setString(
    position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    blobSource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource,
    offset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    len: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def setString(position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, value: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def setString(
    position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    value: java.lang.String,
    offset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    len: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def truncate(length: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
}

