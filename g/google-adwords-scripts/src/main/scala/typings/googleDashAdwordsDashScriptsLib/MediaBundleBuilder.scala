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
    build: () => AdWordsOperation[Media],
    withData: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob => MediaBundleBuilder[Media],
    withName: java.lang.String => MediaBundleBuilder[Media]
  ): MediaBundleBuilder[Media] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withData = js.Any.fromFunction1(withData), withName = js.Any.fromFunction1(withName))
  
    __obj.asInstanceOf[MediaBundleBuilder[Media]]
  }
}

