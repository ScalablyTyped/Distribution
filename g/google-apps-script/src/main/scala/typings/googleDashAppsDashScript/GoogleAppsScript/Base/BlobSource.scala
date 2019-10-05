package typings.googleDashAppsDashScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobSource extends js.Object {
  def getAs(contentType: String): Blob
  def getBlob(): Blob
}

object BlobSource {
  @scala.inline
  def apply(getAs: String => Blob, getBlob: () => Blob): BlobSource = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob))
  
    __obj.asInstanceOf[BlobSource]
  }
}

