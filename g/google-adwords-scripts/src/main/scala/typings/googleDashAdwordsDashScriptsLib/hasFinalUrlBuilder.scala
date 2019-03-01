package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasFinalUrlBuilder[B] extends js.Object {
  def withFinalUrl(url: java.lang.String): B
  def withMobileFinalUrl(url: java.lang.String): B
}

object hasFinalUrlBuilder {
  @scala.inline
  def apply[B](
    withFinalUrl: js.Function1[java.lang.String, B],
    withMobileFinalUrl: js.Function1[java.lang.String, B]
  ): hasFinalUrlBuilder[B] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("withFinalUrl")(withFinalUrl)
    __obj.updateDynamic("withMobileFinalUrl")(withMobileFinalUrl)
    __obj.asInstanceOf[hasFinalUrlBuilder[B]]
  }
}

