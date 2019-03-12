package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBuilder[Media] extends AdWordsBuilder[Media] {
  def withData(data: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob): ImageBuilder[Media]
  def withName(name: java.lang.String): ImageBuilder[Media]
}

object ImageBuilder {
  @scala.inline
  def apply[Media](
    build: () => AdWordsOperation[Media],
    withData: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob => ImageBuilder[Media],
    withName: java.lang.String => ImageBuilder[Media]
  ): ImageBuilder[Media] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withData = js.Any.fromFunction1(withData), withName = js.Any.fromFunction1(withName))
  
    __obj.asInstanceOf[ImageBuilder[Media]]
  }
}

