package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PictureFill extends js.Object {
  def getAs(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  def getBlob(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  def getContentUrl(): java.lang.String
  def getSourceUrl(): java.lang.String
}

object PictureFill {
  @scala.inline
  def apply(
    getAs: js.Function1[java.lang.String, googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob],
    getBlob: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob],
    getContentUrl: js.Function0[java.lang.String],
    getSourceUrl: js.Function0[java.lang.String]
  ): PictureFill = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAs")(getAs)
    __obj.updateDynamic("getBlob")(getBlob)
    __obj.updateDynamic("getContentUrl")(getContentUrl)
    __obj.updateDynamic("getSourceUrl")(getSourceUrl)
    __obj.asInstanceOf[PictureFill]
  }
}

