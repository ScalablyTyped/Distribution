package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads user list. */
trait UserList extends StObject {
  
  /** Close user list so it will no longer accumulate new members. */
  def close(): Unit
  
  /** Returns a selector of all the search ad groups negatively targeting this user list. */
  def excludedAdGroups(): AdGroupSelector
  
  /** Returns a selector of all the search campaigns negatively targeting this user list. */
  def excludedCampaigns(): CampaignSelector
  
  /** Returns the description of the user list. */
  def getDescription(): String
  
  /** Returns the type of this entity as a String, in this case, "UserList". */
  def getEntityType(): String
  
  /** Returns the ID of the user list. */
  def getId(): Double
  
  /** Returns the number of days a user's cookie stays on your list since its most recent addition to the list. */
  def getMembershipLifeSpan(): Double
  
  /** Returns the name of the user list. */
  def getName(): String
  
  /** Estimated number of users in this user list, on the Google Display Network. */
  def getSizeForDisplay(): Double
  
  /** Estimated number of users in this user list in the google.com domain. */
  def getSizeForSearch(): Double
  
  /** Size range in terms of number of users of the UserList for ads on Google Display Network. */
  def getSizeRangeForDisplay(): String
  
  /** Size range in terms of number of users of the UserList, for Search ads. */
  def getSizeRangeForSearch(): String
  
  /** Type of this list: remarketing/logical/external remarketing. */
  def getType(): String
  
  /** Is the user list closed to new members being added. */
  def isClosed(): Boolean
  
  /** Is the user list eligible for display campaigns/ad groups. */
  def isEligibleForDisplay(): Boolean
  
  /** Is the user list eligible for search campaigns/ad groups. */
  def isEligibleForSearch(): Boolean
  
  /** Is the user list accruing new members. */
  def isOpen(): Boolean
  
  /** Is the user list read only. */
  def isReadOnly(): Boolean
  
  /** Open user list to accrue new members. */
  def open(): Unit
  
  /** Sets the description of the user list. */
  def setDescription(description: String): Unit
  
  /** Sets the number of days a user's cookie stays on your list since its most recent addition to the list. */
  def setMembershipLifeSpan(membershipLifeSpan: Double): Unit
  
  /** Sets the name of the user list. */
  def setName(name: String): Unit
  
  /** Returns a selector of all the search ad groups targeting this user list. */
  def targetedAdGroups(): AdGroupSelector
  
  /** Returns a selector of all the search campaigns targeting this user list. */
  def targetedCampaigns(): CampaignSelector
}
object UserList {
  
  inline def apply(
    close: () => Unit,
    excludedAdGroups: () => AdGroupSelector,
    excludedCampaigns: () => CampaignSelector,
    getDescription: () => String,
    getEntityType: () => String,
    getId: () => Double,
    getMembershipLifeSpan: () => Double,
    getName: () => String,
    getSizeForDisplay: () => Double,
    getSizeForSearch: () => Double,
    getSizeRangeForDisplay: () => String,
    getSizeRangeForSearch: () => String,
    getType: () => String,
    isClosed: () => Boolean,
    isEligibleForDisplay: () => Boolean,
    isEligibleForSearch: () => Boolean,
    isOpen: () => Boolean,
    isReadOnly: () => Boolean,
    open: () => Unit,
    setDescription: String => Unit,
    setMembershipLifeSpan: Double => Unit,
    setName: String => Unit,
    targetedAdGroups: () => AdGroupSelector,
    targetedCampaigns: () => CampaignSelector
  ): UserList = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), excludedAdGroups = js.Any.fromFunction0(excludedAdGroups), excludedCampaigns = js.Any.fromFunction0(excludedCampaigns), getDescription = js.Any.fromFunction0(getDescription), getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getMembershipLifeSpan = js.Any.fromFunction0(getMembershipLifeSpan), getName = js.Any.fromFunction0(getName), getSizeForDisplay = js.Any.fromFunction0(getSizeForDisplay), getSizeForSearch = js.Any.fromFunction0(getSizeForSearch), getSizeRangeForDisplay = js.Any.fromFunction0(getSizeRangeForDisplay), getSizeRangeForSearch = js.Any.fromFunction0(getSizeRangeForSearch), getType = js.Any.fromFunction0(getType), isClosed = js.Any.fromFunction0(isClosed), isEligibleForDisplay = js.Any.fromFunction0(isEligibleForDisplay), isEligibleForSearch = js.Any.fromFunction0(isEligibleForSearch), isOpen = js.Any.fromFunction0(isOpen), isReadOnly = js.Any.fromFunction0(isReadOnly), open = js.Any.fromFunction0(open), setDescription = js.Any.fromFunction1(setDescription), setMembershipLifeSpan = js.Any.fromFunction1(setMembershipLifeSpan), setName = js.Any.fromFunction1(setName), targetedAdGroups = js.Any.fromFunction0(targetedAdGroups), targetedCampaigns = js.Any.fromFunction0(targetedCampaigns))
    __obj.asInstanceOf[UserList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserList] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setExcludedAdGroups(value: () => AdGroupSelector): Self = StObject.set(x, "excludedAdGroups", js.Any.fromFunction0(value))
    
    inline def setExcludedCampaigns(value: () => CampaignSelector): Self = StObject.set(x, "excludedCampaigns", js.Any.fromFunction0(value))
    
    inline def setGetDescription(value: () => String): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetMembershipLifeSpan(value: () => Double): Self = StObject.set(x, "getMembershipLifeSpan", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetSizeForDisplay(value: () => Double): Self = StObject.set(x, "getSizeForDisplay", js.Any.fromFunction0(value))
    
    inline def setGetSizeForSearch(value: () => Double): Self = StObject.set(x, "getSizeForSearch", js.Any.fromFunction0(value))
    
    inline def setGetSizeRangeForDisplay(value: () => String): Self = StObject.set(x, "getSizeRangeForDisplay", js.Any.fromFunction0(value))
    
    inline def setGetSizeRangeForSearch(value: () => String): Self = StObject.set(x, "getSizeRangeForSearch", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setIsClosed(value: () => Boolean): Self = StObject.set(x, "isClosed", js.Any.fromFunction0(value))
    
    inline def setIsEligibleForDisplay(value: () => Boolean): Self = StObject.set(x, "isEligibleForDisplay", js.Any.fromFunction0(value))
    
    inline def setIsEligibleForSearch(value: () => Boolean): Self = StObject.set(x, "isEligibleForSearch", js.Any.fromFunction0(value))
    
    inline def setIsOpen(value: () => Boolean): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
    
    inline def setIsReadOnly(value: () => Boolean): Self = StObject.set(x, "isReadOnly", js.Any.fromFunction0(value))
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setSetDescription(value: String => Unit): Self = StObject.set(x, "setDescription", js.Any.fromFunction1(value))
    
    inline def setSetMembershipLifeSpan(value: Double => Unit): Self = StObject.set(x, "setMembershipLifeSpan", js.Any.fromFunction1(value))
    
    inline def setSetName(value: String => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    inline def setTargetedAdGroups(value: () => AdGroupSelector): Self = StObject.set(x, "targetedAdGroups", js.Any.fromFunction0(value))
    
    inline def setTargetedCampaigns(value: () => CampaignSelector): Self = StObject.set(x, "targetedCampaigns", js.Any.fromFunction0(value))
  }
}
