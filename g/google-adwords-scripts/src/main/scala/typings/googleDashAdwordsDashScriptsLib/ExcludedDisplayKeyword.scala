package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedDisplayKeyword extends isAdGroupChild {
  def getId(): scala.Double
  def getText(): java.lang.String
  def remove(): scala.Unit
}

object ExcludedDisplayKeyword {
  @scala.inline
  def apply(
    getAdGroup: js.Function0[AdGroup],
    getCampaign: js.Function0[Campaign],
    getId: js.Function0[scala.Double],
    getText: js.Function0[java.lang.String],
    remove: js.Function0[scala.Unit]
  ): ExcludedDisplayKeyword = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup, getCampaign = getCampaign, getId = getId, getText = getText, remove = remove)
  
    __obj.asInstanceOf[ExcludedDisplayKeyword]
  }
}

