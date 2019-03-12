package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasGetFinalUrl extends js.Object {
  def getFinalUrl(): java.lang.String
  def getMobileFinalUrl(): java.lang.String
}

object hasGetFinalUrl {
  @scala.inline
  def apply(getFinalUrl: () => java.lang.String, getMobileFinalUrl: () => java.lang.String): hasGetFinalUrl = {
    val __obj = js.Dynamic.literal(getFinalUrl = js.Any.fromFunction0(getFinalUrl), getMobileFinalUrl = js.Any.fromFunction0(getMobileFinalUrl))
  
    __obj.asInstanceOf[hasGetFinalUrl]
  }
}

