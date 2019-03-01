package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// User Lists
trait UserList extends js.Object {
  def close(): scala.Unit
  def excludedAdGroups(): AdWordsSelector[AdGroup]
  def excludedCampaigns(): AdWordsSelector[Campaign]
  def getDescription(): java.lang.String
  def getId(): scala.Double
  def getMembershipLifeSpan(): scala.Double
  def getName(): java.lang.String
  def getSizeForDisplay(): scala.Double
  def getSizeForSearch(): scala.Double
  def getSizeRangeForDisplay(): UserListSizeRange
  def getSizeRangeForSearch(): UserListSizeRange
  def getType(): UserListType
  def isClosed(): scala.Boolean
  def isEligibleForDisplay(): scala.Boolean
  def isEligibleForSearch(): scala.Boolean
  def isOpen(): scala.Boolean
  def isReadOnly(): scala.Boolean
  def open(): scala.Unit
  def setDescription(description: java.lang.String): scala.Unit
  def setMembershipLifeSpan(membershipLifeSpan: scala.Double): scala.Unit
  def setName(name: java.lang.String): scala.Unit
  def targetedAdGroups(): AdWordsSelector[AdGroup]
  def targetedCampaigns(): AdWordsSelector[Campaign]
}

object UserList {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    excludedAdGroups: js.Function0[AdWordsSelector[AdGroup]],
    excludedCampaigns: js.Function0[AdWordsSelector[Campaign]],
    getDescription: js.Function0[java.lang.String],
    getId: js.Function0[scala.Double],
    getMembershipLifeSpan: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    getSizeForDisplay: js.Function0[scala.Double],
    getSizeForSearch: js.Function0[scala.Double],
    getSizeRangeForDisplay: js.Function0[UserListSizeRange],
    getSizeRangeForSearch: js.Function0[UserListSizeRange],
    getType: js.Function0[UserListType],
    isClosed: js.Function0[scala.Boolean],
    isEligibleForDisplay: js.Function0[scala.Boolean],
    isEligibleForSearch: js.Function0[scala.Boolean],
    isOpen: js.Function0[scala.Boolean],
    isReadOnly: js.Function0[scala.Boolean],
    open: js.Function0[scala.Unit],
    setDescription: js.Function1[java.lang.String, scala.Unit],
    setMembershipLifeSpan: js.Function1[scala.Double, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    targetedAdGroups: js.Function0[AdWordsSelector[AdGroup]],
    targetedCampaigns: js.Function0[AdWordsSelector[Campaign]]
  ): UserList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("excludedAdGroups")(excludedAdGroups)
    __obj.updateDynamic("excludedCampaigns")(excludedCampaigns)
    __obj.updateDynamic("getDescription")(getDescription)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getMembershipLifeSpan")(getMembershipLifeSpan)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getSizeForDisplay")(getSizeForDisplay)
    __obj.updateDynamic("getSizeForSearch")(getSizeForSearch)
    __obj.updateDynamic("getSizeRangeForDisplay")(getSizeRangeForDisplay)
    __obj.updateDynamic("getSizeRangeForSearch")(getSizeRangeForSearch)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("isClosed")(isClosed)
    __obj.updateDynamic("isEligibleForDisplay")(isEligibleForDisplay)
    __obj.updateDynamic("isEligibleForSearch")(isEligibleForSearch)
    __obj.updateDynamic("isOpen")(isOpen)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("setDescription")(setDescription)
    __obj.updateDynamic("setMembershipLifeSpan")(setMembershipLifeSpan)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("targetedAdGroups")(targetedAdGroups)
    __obj.updateDynamic("targetedCampaigns")(targetedCampaigns)
    __obj.asInstanceOf[UserList]
  }
}

