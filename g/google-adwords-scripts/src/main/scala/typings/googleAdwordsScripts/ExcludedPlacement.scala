package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedPlacement extends isAdGroupChild {
  def getId(): Double
  def getUrl(): String
  def remove(): Unit
}

object ExcludedPlacement {
  @scala.inline
  def apply(
    getAdGroup: () => AdGroup,
    getCampaign: () => Campaign,
    getId: () => Double,
    getUrl: () => String,
    remove: () => Unit
  ): ExcludedPlacement = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), getUrl = js.Any.fromFunction0(getUrl), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedPlacement]
  }
}

