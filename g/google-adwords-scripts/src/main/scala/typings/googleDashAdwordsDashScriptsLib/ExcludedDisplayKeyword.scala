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
    getAdGroup: () => AdGroup,
    getCampaign: () => Campaign,
    getId: () => scala.Double,
    getText: () => java.lang.String,
    remove: () => scala.Unit
  ): ExcludedDisplayKeyword = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), getText = js.Any.fromFunction0(getText), remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[ExcludedDisplayKeyword]
  }
}

