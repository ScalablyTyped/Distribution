package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// User Lists
trait UserList extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: UserList] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setExcludedAdGroups(value: () => AdWordsSelector[AdGroup]): Self = StObject.set(x, "excludedAdGroups", js.Any.fromFunction0(value))
    
    inline def setExcludedCampaigns(value: () => AdWordsSelector[Campaign]): Self = StObject.set(x, "excludedCampaigns", js.Any.fromFunction0(value))
    
    inline def setGetDescription(value: () => String): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetMembershipLifeSpan(value: () => Double): Self = StObject.set(x, "getMembershipLifeSpan", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetSizeForDisplay(value: () => Double): Self = StObject.set(x, "getSizeForDisplay", js.Any.fromFunction0(value))
    
    inline def setGetSizeForSearch(value: () => Double): Self = StObject.set(x, "getSizeForSearch", js.Any.fromFunction0(value))
    
    inline def setGetSizeRangeForDisplay(value: () => UserListSizeRange): Self = StObject.set(x, "getSizeRangeForDisplay", js.Any.fromFunction0(value))
    
    inline def setGetSizeRangeForSearch(value: () => UserListSizeRange): Self = StObject.set(x, "getSizeRangeForSearch", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => UserListType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setIsClosed(value: () => Boolean): Self = StObject.set(x, "isClosed", js.Any.fromFunction0(value))
    
    inline def setIsEligibleForDisplay(value: () => Boolean): Self = StObject.set(x, "isEligibleForDisplay", js.Any.fromFunction0(value))
    
    inline def setIsEligibleForSearch(value: () => Boolean): Self = StObject.set(x, "isEligibleForSearch", js.Any.fromFunction0(value))
    
    inline def setIsOpen(value: () => Boolean): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
    
    inline def setIsReadOnly(value: () => Boolean): Self = StObject.set(x, "isReadOnly", js.Any.fromFunction0(value))
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setSetDescription(value: String => Unit): Self = StObject.set(x, "setDescription", js.Any.fromFunction1(value))
    
    inline def setSetMembershipLifeSpan(value: Double => Unit): Self = StObject.set(x, "setMembershipLifeSpan", js.Any.fromFunction1(value))
    
    inline def setSetName(value: String => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    inline def setTargetedAdGroups(value: () => AdWordsSelector[AdGroup]): Self = StObject.set(x, "targetedAdGroups", js.Any.fromFunction0(value))
    
    inline def setTargetedCampaigns(value: () => AdWordsSelector[Campaign]): Self = StObject.set(x, "targetedCampaigns", js.Any.fromFunction0(value))
  }
}
