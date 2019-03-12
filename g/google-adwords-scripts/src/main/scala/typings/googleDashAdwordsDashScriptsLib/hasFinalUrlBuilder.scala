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
  def apply[B](withFinalUrl: java.lang.String => B, withMobileFinalUrl: java.lang.String => B): hasFinalUrlBuilder[B] = {
    val __obj = js.Dynamic.literal(withFinalUrl = js.Any.fromFunction1(withFinalUrl), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl))
  
    __obj.asInstanceOf[hasFinalUrlBuilder[B]]
  }
}

