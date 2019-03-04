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
    build: js.Function0[AdWordsOperation[Media]],
    withData: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob, ImageBuilder[Media]],
    withName: js.Function1[java.lang.String, ImageBuilder[Media]]
  ): ImageBuilder[Media] = {
    val __obj = js.Dynamic.literal(build = build, withData = withData, withName = withName)
  
    __obj.asInstanceOf[ImageBuilder[Media]]
  }
}

