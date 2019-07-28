package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasGetFinalUrl extends js.Object {
  def getFinalUrl(): String
  def getMobileFinalUrl(): String
}

object hasGetFinalUrl {
  @scala.inline
  def apply(getFinalUrl: () => String, getMobileFinalUrl: () => String): hasGetFinalUrl = {
    val __obj = js.Dynamic.literal(getFinalUrl = js.Any.fromFunction0(getFinalUrl), getMobileFinalUrl = js.Any.fromFunction0(getMobileFinalUrl))
  
    __obj.asInstanceOf[hasGetFinalUrl]
  }
}

