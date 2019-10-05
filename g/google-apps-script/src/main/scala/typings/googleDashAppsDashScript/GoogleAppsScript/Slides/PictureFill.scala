package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PictureFill extends js.Object {
  def getAs(contentType: String): Blob
  def getBlob(): Blob
  def getContentUrl(): String
  def getSourceUrl(): String
}

object PictureFill {
  @scala.inline
  def apply(
    getAs: String => Blob,
    getBlob: () => Blob,
    getContentUrl: () => String,
    getSourceUrl: () => String
  ): PictureFill = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getContentUrl = js.Any.fromFunction0(getContentUrl), getSourceUrl = js.Any.fromFunction0(getSourceUrl))
  
    __obj.asInstanceOf[PictureFill]
  }
}

