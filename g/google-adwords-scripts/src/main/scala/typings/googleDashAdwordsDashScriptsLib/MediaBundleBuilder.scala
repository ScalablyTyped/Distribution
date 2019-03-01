package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaBundleBuilder[Media] extends AdWordsBuilder[Media] {
  def withData(data: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob): MediaBundleBuilder[Media]
  def withName(name: java.lang.String): MediaBundleBuilder[Media]
}

object MediaBundleBuilder {
  @scala.inline
  def apply[Media](
    build: js.Function0[AdWordsOperation[Media]],
    withData: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob, 
      MediaBundleBuilder[Media]
    ],
    withName: js.Function1[java.lang.String, MediaBundleBuilder[Media]]
  ): MediaBundleBuilder[Media] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("withData")(withData)
    __obj.updateDynamic("withName")(withName)
    __obj.asInstanceOf[MediaBundleBuilder[Media]]
  }
}

