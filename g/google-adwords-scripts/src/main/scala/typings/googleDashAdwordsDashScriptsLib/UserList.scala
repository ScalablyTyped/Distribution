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

