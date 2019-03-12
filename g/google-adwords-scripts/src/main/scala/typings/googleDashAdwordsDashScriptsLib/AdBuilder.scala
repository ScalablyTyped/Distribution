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
    build: () => AdWordsOperation[T],
    withCustomParameters: js.Object => T,
    withFinalUrl: java.lang.String => T,
    withMobileFinalUrl: java.lang.String => T,
    withTrackingTemplate: java.lang.String => T
  ): AdBuilder[T] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
  
    __obj.asInstanceOf[AdBuilder[T]]
  }
}

