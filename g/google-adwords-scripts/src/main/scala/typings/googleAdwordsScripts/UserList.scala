package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// User Lists
@js.native
trait UserList extends StObject {
  
  def close(): Unit = js.native
  
  def excludedAdGroups(): AdWordsSelector[AdGroup] = js.native
  
  def excludedCampaigns(): AdWordsSelector[Campaign] = js.native
  
  def getDescription(): String = js.native
  
  def getId(): Double = js.native
  
  def getMembershipLifeSpan(): Double = js.native
  
  def getName(): String = js.native
  
  def getSizeForDisplay(): Double = js.native
  
  def getSizeForSearch(): Double = js.native
  
  def getSizeRangeForDisplay(): UserListSizeRange = js.native
  
  def getSizeRangeForSearch(): UserListSizeRange = js.native
  
  def getType(): UserListType = js.native
  
  def isClosed(): Boolean = js.native
  
  def isEligibleForDisplay(): Boolean = js.native
  
  def isEligibleForSearch(): Boolean = js.native
  
  def isOpen(): Boolean = js.native
  
  def isReadOnly(): Boolean = js.native
  
  def open(): Unit = js.native
  
  def setDescription(description: String): Unit = js.native
  
  def setMembershipLifeSpan(membershipLifeSpan: Double): Unit = js.native
  
  def setName(name: String): Unit = js.native
  
  def targetedAdGroups(): AdWordsSelector[AdGroup] = js.native
  
  def targetedCampaigns(): AdWordsSelector[Campaign] = js.native
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
  
  @scala.inline
  implicit class UserListMutableBuilder[Self <: UserList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcludedAdGroups(value: () => AdWordsSelector[AdGroup]): Self = StObject.set(x, "excludedAdGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcludedCampaigns(value: () => AdWordsSelector[Campaign]): Self = StObject.set(x, "excludedCampaigns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDescription(value: () => String): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMembershipLifeSpan(value: () => Double): Self = StObject.set(x, "getMembershipLifeSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSizeForDisplay(value: () => Double): Self = StObject.set(x, "getSizeForDisplay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSizeForSearch(value: () => Double): Self = StObject.set(x, "getSizeForSearch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSizeRangeForDisplay(value: () => UserListSizeRange): Self = StObject.set(x, "getSizeRangeForDisplay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSizeRangeForSearch(value: () => UserListSizeRange): Self = StObject.set(x, "getSizeRangeForSearch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => UserListType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsClosed(value: () => Boolean): Self = StObject.set(x, "isClosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEligibleForDisplay(value: () => Boolean): Self = StObject.set(x, "isEligibleForDisplay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEligibleForSearch(value: () => Boolean): Self = StObject.set(x, "isEligibleForSearch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOpen(value: () => Boolean): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsReadOnly(value: () => Boolean): Self = StObject.set(x, "isReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDescription(value: String => Unit): Self = StObject.set(x, "setDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMembershipLifeSpan(value: Double => Unit): Self = StObject.set(x, "setMembershipLifeSpan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetName(value: String => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTargetedAdGroups(value: () => AdWordsSelector[AdGroup]): Self = StObject.set(x, "targetedAdGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTargetedCampaigns(value: () => AdWordsSelector[Campaign]): Self = StObject.set(x, "targetedCampaigns", js.Any.fromFunction0(value))
  }
}
