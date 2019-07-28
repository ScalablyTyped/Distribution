package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasSetFinalUrl extends js.Object {
  def setFinalUrl(url: String): Unit
  def setMobileFinalUrl(url: String): Unit
}

object hasSetFinalUrl {
  @scala.inline
  def apply(setFinalUrl: String => Unit, setMobileFinalUrl: String => Unit): hasSetFinalUrl = {
    val __obj = js.Dynamic.literal(setFinalUrl = js.Any.fromFunction1(setFinalUrl), setMobileFinalUrl = js.Any.fromFunction1(setMobileFinalUrl))
  
    __obj.asInstanceOf[hasSetFinalUrl]
  }
}

