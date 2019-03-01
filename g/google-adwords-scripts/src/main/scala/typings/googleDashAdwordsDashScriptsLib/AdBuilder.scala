package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdBuilder[T]
  extends AdWordsBuilder[T]
     with hasFinalUrlBuilder[T]
     with hasTrackingTemplateBuilder[T]

object AdBuilder {
  @scala.inline
  def apply[T](
    build: js.Function0[AdWordsOperation[T]],
    withCustomParameters: js.Function1[js.Object, T],
    withFinalUrl: js.Function1[java.lang.String, T],
    withMobileFinalUrl: js.Function1[java.lang.String, T],
    withTrackingTemplate: js.Function1[java.lang.String, T]
  ): AdBuilder[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("withCustomParameters")(withCustomParameters)
    __obj.updateDynamic("withFinalUrl")(withFinalUrl)
    __obj.updateDynamic("withMobileFinalUrl")(withMobileFinalUrl)
    __obj.updateDynamic("withTrackingTemplate")(withTrackingTemplate)
    __obj.asInstanceOf[AdBuilder[T]]
  }
}

