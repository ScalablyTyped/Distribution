package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typings.googleAppsScript.GoogleAppsScript.Byte
import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Blob. For documentation of this class, see java.sql.Blob
  * .
  */
@js.native
trait JdbcBlob extends StObject {
  
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
