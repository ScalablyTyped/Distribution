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
    close: () => scala.Unit,
    excludedAdGroups: () => AdWordsSelector[AdGroup],
    excludedCampaigns: () => AdWordsSelector[Campaign],
    getDescription: () => java.lang.String,
    getId: () => scala.Double,
    getMembershipLifeSpan: () => scala.Double,
    getName: () => java.lang.String,
    getSizeForDisplay: () => scala.Double,
    getSizeForSearch: () => scala.Double,
    getSizeRangeForDisplay: () => UserListSizeRange,
    getSizeRangeForSearch: () => UserListSizeRange,
    getType: () => UserListType,
    isClosed: () => scala.Boolean,
    isEligibleForDisplay: () => scala.Boolean,
    isEligibleForSearch: () => scala.Boolean,
    isOpen: () => scala.Boolean,
    isReadOnly: () => scala.Boolean,
    open: () => scala.Unit,
    setDescription: java.lang.String => scala.Unit,
    setMembershipLifeSpan: scala.Double => scala.Unit,
    setName: java.lang.String => scala.Unit,
    targetedAdGroups: () => AdWordsSelector[AdGroup],
    targetedCampaigns: () => AdWordsSelector[Campaign]
  ): UserList = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), excludedAdGroups = js.Any.fromFunction0(excludedAdGroups), excludedCampaigns = js.Any.fromFunction0(excludedCampaigns), getDescription = js.Any.fromFunction0(getDescription), getId = js.Any.fromFunction0(getId), getMembershipLifeSpan = js.Any.fromFunction0(getMembershipLifeSpan), getName = js.Any.fromFunction0(getName), getSizeForDisplay = js.Any.fromFunction0(getSizeForDisplay), getSizeForSearch = js.Any.fromFunction0(getSizeForSearch), getSizeRangeForDisplay = js.Any.fromFunction0(getSizeRangeForDisplay), getSizeRangeForSearch = js.Any.fromFunction0(getSizeRangeForSearch), getType = js.Any.fromFunction0(getType), isClosed = js.Any.fromFunction0(isClosed), isEligibleForDisplay = js.Any.fromFunction0(isEligibleForDisplay), isEligibleForSearch = js.Any.fromFunction0(isEligibleForSearch), isOpen = js.Any.fromFunction0(isOpen), isReadOnly = js.Any.fromFunction0(isReadOnly), open = js.Any.fromFunction0(open), setDescription = js.Any.fromFunction1(setDescription), setMembershipLifeSpan = js.Any.fromFunction1(setMembershipLifeSpan), setName = js.Any.fromFunction1(setName), targetedAdGroups = js.Any.fromFunction0(targetedAdGroups), targetedCampaigns = js.Any.fromFunction0(targetedCampaigns))
  
    __obj.asInstanceOf[UserList]
  }
}

