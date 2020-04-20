package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// User Lists
trait UserList extends js.Object {
  def close(): Unit
  def excludedAdGroups(): AdWordsSelector[AdGroup]
  def excludedCampaigns(): AdWordsSelector[Campaign]
  def getDescription(): String
  def getId(): Double
  def getMembershipLifeSpan(): Double
  def getName(): String
  def getSizeForDisplay(): Double
  def getSizeForSearch(): Double
  def getSizeRangeForDisplay(): UserListSizeRange
  def getSizeRangeForSearch(): UserListSizeRange
  def getType(): UserListType
  def isClosed(): Boolean
  def isEligibleForDisplay(): Boolean
  def isEligibleForSearch(): Boolean
  def isOpen(): Boolean
  def isReadOnly(): Boolean
  def open(): Unit
  def setDescription(description: String): Unit
  def setMembershipLifeSpan(membershipLifeSpan: Double): Unit
  def setName(name: String): Unit
  def targetedAdGroups(): AdWordsSelector[AdGroup]
  def targetedCampaigns(): AdWordsSelector[Campaign]
}

object UserList {
  @scala.inline
  def apply(
    close: () => Unit,
    excludedAdGroups: () => AdWordsSelector[AdGroup],
    excludedCampaigns: () => AdWordsSelector[Campaign],
    getDescription: () => String,
    getId: () => Double,
    getMembershipLifeSpan: () => Double,
    getName: () => String,
    getSizeForDisplay: () => Double,
    getSizeForSearch: () => Double,
    getSizeRangeForDisplay: () => UserListSizeRange,
    getSizeRangeForSearch: () => UserListSizeRange,
    getType: () => UserListType,
    isClosed: () => Boolean,
    isEligibleForDisplay: () => Boolean,
    isEligibleForSearch: () => Boolean,
    isOpen: () => Boolean,
    isReadOnly: () => Boolean,
    open: () => Unit,
    setDescription: String => Unit,
    setMembershipLifeSpan: Double => Unit,
    setName: String => Unit,
    targetedAdGroups: () => AdWordsSelector[AdGroup],
    targetedCampaigns: () => AdWordsSelector[Campaign]
  ): UserList = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), excludedAdGroups = js.Any.fromFunction0(excludedAdGroups), excludedCampaigns = js.Any.fromFunction0(excludedCampaigns), getDescription = js.Any.fromFunction0(getDescription), getId = js.Any.fromFunction0(getId), getMembershipLifeSpan = js.Any.fromFunction0(getMembershipLifeSpan), getName = js.Any.fromFunction0(getName), getSizeForDisplay = js.Any.fromFunction0(getSizeForDisplay), getSizeForSearch = js.Any.fromFunction0(getSizeForSearch), getSizeRangeForDisplay = js.Any.fromFunction0(getSizeRangeForDisplay), getSizeRangeForSearch = js.Any.fromFunction0(getSizeRangeForSearch), getType = js.Any.fromFunction0(getType), isClosed = js.Any.fromFunction0(isClosed), isEligibleForDisplay = js.Any.fromFunction0(isEligibleForDisplay), isEligibleForSearch = js.Any.fromFunction0(isEligibleForSearch), isOpen = js.Any.fromFunction0(isOpen), isReadOnly = js.Any.fromFunction0(isReadOnly), open = js.Any.fromFunction0(open), setDescription = js.Any.fromFunction1(setDescription), setMembershipLifeSpan = js.Any.fromFunction1(setMembershipLifeSpan), setName = js.Any.fromFunction1(setName), targetedAdGroups = js.Any.fromFunction0(targetedAdGroups), targetedCampaigns = js.Any.fromFunction0(targetedCampaigns))
    __obj.asInstanceOf[UserList]
  }
}

