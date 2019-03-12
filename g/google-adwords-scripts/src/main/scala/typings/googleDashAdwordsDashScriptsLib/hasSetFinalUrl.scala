package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasSetFinalUrl extends js.Object {
  def setFinalUrl(url: java.lang.String): scala.Unit
  def setMobileFinalUrl(url: java.lang.String): scala.Unit
}

object hasSetFinalUrl {
  @scala.inline
  def apply(setFinalUrl: java.lang.String => scala.Unit, setMobileFinalUrl: java.lang.String => scala.Unit): hasSetFinalUrl = {
    val __obj = js.Dynamic.literal(setFinalUrl = js.Any.fromFunction1(setFinalUrl), setMobileFinalUrl = js.Any.fromFunction1(setMobileFinalUrl))
  
    __obj.asInstanceOf[hasSetFinalUrl]
  }
}

