package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasFinalUrlBuilder[B] extends js.Object {
  def withFinalUrl(url: String): B
  def withMobileFinalUrl(url: String): B
}

object hasFinalUrlBuilder {
  @scala.inline
  def apply[B](withFinalUrl: String => B, withMobileFinalUrl: String => B): hasFinalUrlBuilder[B] = {
    val __obj = js.Dynamic.literal(withFinalUrl = js.Any.fromFunction1(withFinalUrl), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl))
  
    __obj.asInstanceOf[hasFinalUrlBuilder[B]]
  }
}

