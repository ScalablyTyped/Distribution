package typings.googleAppsScript.GoogleAppsScript.Base

import typings.googleAppsScript.GoogleAppsScript.Byte
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A data interchange object for Apps Script services.
  */
@js.native
trait Blob extends BlobSource {
  def copyBlob(): Blob = js.native
  /** @deprecated DO NOT USE */ def getAllBlobs(): js.Array[Blob] = js.native
  def getBytes(): js.Array[Byte] = js.native
  def getContentType(): String = js.native
  def getDataAsString(): String = js.native
  def getDataAsString(charset: String): String = js.native
  def getName(): String = js.native
  def isGoogleType(): Boolean = js.native
  def setBytes(data: js.Array[Byte]): Blob = js.native
  def setContentType(contentType: String): Blob = js.native
  def setContentTypeFromExtension(): Blob = js.native
  def setDataFromString(string: String): Blob = js.native
  def setDataFromString(string: String, charset: String): Blob = js.native
  def setName(name: String): Blob = js.native
}

