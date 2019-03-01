package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobSource extends js.Object {
  def getAs(contentType: java.lang.String): Blob
  def getBlob(): Blob
}

object BlobSource {
  @scala.inline
  def apply(getAs: js.Function1[java.lang.String, Blob], getBlob: js.Function0[Blob]): BlobSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAs")(getAs)
    __obj.updateDynamic("getBlob")(getBlob)
    __obj.asInstanceOf[BlobSource]
  }
}

