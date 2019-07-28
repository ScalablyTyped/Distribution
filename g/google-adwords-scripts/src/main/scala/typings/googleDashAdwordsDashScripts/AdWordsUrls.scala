package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsUrls extends js.Object {
  def getCustomParameters(): js.Object
  def getTrackingTemplate(): String
}

object AdWordsUrls {
  @scala.inline
  def apply(getCustomParameters: () => js.Object, getTrackingTemplate: () => String): AdWordsUrls = {
    val __obj = js.Dynamic.literal(getCustomParameters = js.Any.fromFunction0(getCustomParameters), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate))
  
    __obj.asInstanceOf[AdWordsUrls]
  }
}

