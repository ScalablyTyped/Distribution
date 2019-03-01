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
  def apply(
    setFinalUrl: js.Function1[java.lang.String, scala.Unit],
    setMobileFinalUrl: js.Function1[java.lang.String, scala.Unit]
  ): hasSetFinalUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setFinalUrl")(setFinalUrl)
    __obj.updateDynamic("setMobileFinalUrl")(setMobileFinalUrl)
    __obj.asInstanceOf[hasSetFinalUrl]
  }
}

