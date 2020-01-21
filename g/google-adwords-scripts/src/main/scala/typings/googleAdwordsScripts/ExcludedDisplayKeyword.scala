package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedDisplayKeyword extends isAdGroupChild {
  def getId(): Double
  def getText(): String
  def remove(): Unit
}

object ExcludedDisplayKeyword {
  @scala.inline
  def apply(
    getAdGroup: () => AdGroup,
    getCampaign: () => Campaign,
    getId: () => Double,
    getText: () => String,
    remove: () => Unit
  ): ExcludedDisplayKeyword = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), getText = js.Any.fromFunction0(getText), remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[ExcludedDisplayKeyword]
  }
}

