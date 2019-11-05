package typings.googleDashAppsDashScript.GoogleAppsScript.JDBC

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Blob
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.BlobSource
import typings.googleDashAppsDashScript.GoogleAppsScript.Byte
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Blob. For documentation of this class, see java.sql.Blob
  * .
  */
@js.native
trait JdbcBlob extends js.Object {
  def free(): Unit = js.native
  def getAppsScriptBlob(): Blob = js.native
  def getAs(contentType: String): Blob = js.native
  def getBytes(position: Integer, length: Integer): js.Array[Byte] = js.native
  def length(): Integer = js.native
  def position(pattern: js.Array[Byte], start: Integer): Integer = js.native
  def position(pattern: JdbcBlob, start: Integer): Integer = js.native
  def setBytes(position: Integer, blobSource: BlobSource): Integer = js.native
  def setBytes(position: Integer, blobSource: BlobSource, offset: Integer, length: Integer): Integer = js.native
  def setBytes(position: Integer, bytes: js.Array[Byte]): Integer = js.native
  def setBytes(position: Integer, bytes: js.Array[Byte], offset: Integer, length: Integer): Integer = js.native
  def truncate(length: Integer): Unit = js.native
}

