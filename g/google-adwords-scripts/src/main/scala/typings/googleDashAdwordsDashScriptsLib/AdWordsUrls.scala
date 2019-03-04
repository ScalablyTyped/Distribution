package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsUrls extends js.Object {
  def getCustomParameters(): js.Object
  def getTrackingTemplate(): java.lang.String
}

object AdWordsUrls {
  @scala.inline
  def apply(getCustomParameters: js.Function0[js.Object], getTrackingTemplate: js.Function0[java.lang.String]): AdWordsUrls = {
    val __obj = js.Dynamic.literal(getCustomParameters = getCustomParameters, getTrackingTemplate = getTrackingTemplate)
  
    __obj.asInstanceOf[AdWordsUrls]
  }
}

