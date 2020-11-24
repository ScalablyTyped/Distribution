package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// User Lists
@js.native
trait UserList extends js.Object {
  
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
  implicit class UserListOps[Self <: UserList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcludedAdGroups(value: () => AdWordsSelector[AdGroup]): Self = this.set("excludedAdGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcludedCampaigns(value: () => AdWordsSelector[Campaign]): Self = this.set("excludedCampaigns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDescription(value: () => String): Self = this.set("getDescription", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Double): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMembershipLifeSpan(value: () => Double): Self = this.set("getMembershipLifeSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSizeForDisplay(value: () => Double): Self = this.set("getSizeForDisplay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSizeForSearch(value: () => Double): Self = this.set("getSizeForSearch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSizeRangeForDisplay(value: () => UserListSizeRange): Self = this.set("getSizeRangeForDisplay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSizeRangeForSearch(value: () => UserListSizeRange): Self = this.set("getSizeRangeForSearch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => UserListType): Self = this.set("getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsClosed(value: () => Boolean): Self = this.set("isClosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEligibleForDisplay(value: () => Boolean): Self = this.set("isEligibleForDisplay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEligibleForSearch(value: () => Boolean): Self = this.set("isEligibleForSearch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOpen(value: () => Boolean): Self = this.set("isOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsReadOnly(value: () => Boolean): Self = this.set("isReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDescription(value: String => Unit): Self = this.set("setDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMembershipLifeSpan(value: Double => Unit): Self = this.set("setMembershipLifeSpan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetName(value: String => Unit): Self = this.set("setName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTargetedAdGroups(value: () => AdWordsSelector[AdGroup]): Self = this.set("targetedAdGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTargetedCampaigns(value: () => AdWordsSelector[Campaign]): Self = this.set("targetedCampaigns", js.Any.fromFunction0(value))
  }
}
