package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Labels
@js.native
trait Label extends AdWordsEntity {
  
  def adGroups(): AdWordsSelector[AdGroup] = js.native
  
  def ads(): AdWordsSelector[Ad] = js.native
  
  def campaigns(): AdWordsSelector[Campaign] = js.native
  
  def getColor(): String = js.native
  
  def getDescription(): String = js.native
  
  def getId(): String = js.native
  
  def getName(): String = js.native
  
  def keywords(): AdWordsSelector[Keyword] = js.native
  
  def remove(): Unit = js.native
  
  def setColor(color: String): Unit = js.native
  
  def setDescription(description: String): Unit = js.native
  
  def setName(name: String): Unit = js.native
}
object Label {
  
  @scala.inline
  def apply(
    adGroups: () => AdWordsSelector[AdGroup],
    ads: () => AdWordsSelector[Ad],
    campaigns: () => AdWordsSelector[Campaign],
    getColor: () => String,
    getDescription: () => String,
    getId: () => String,
    getName: () => String,
    keywords: () => AdWordsSelector[Keyword],
    remove: () => Unit,
    setColor: String => Unit,
    setDescription: String => Unit,
    setName: String => Unit
  ): Label = {
    val __obj = js.Dynamic.literal(adGroups = js.Any.fromFunction0(adGroups), ads = js.Any.fromFunction0(ads), campaigns = js.Any.fromFunction0(campaigns), getColor = js.Any.fromFunction0(getColor), getDescription = js.Any.fromFunction0(getDescription), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), keywords = js.Any.fromFunction0(keywords), remove = js.Any.fromFunction0(remove), setColor = js.Any.fromFunction1(setColor), setDescription = js.Any.fromFunction1(setDescription), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    
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
    def setAdGroups(value: () => AdWordsSelector[AdGroup]): Self = this.set("adGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAds(value: () => AdWordsSelector[Ad]): Self = this.set("ads", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCampaigns(value: () => AdWordsSelector[Campaign]): Self = this.set("campaigns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColor(value: () => String): Self = this.set("getColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDescription(value: () => String): Self = this.set("getDescription", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeywords(value: () => AdWordsSelector[Keyword]): Self = this.set("keywords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetColor(value: String => Unit): Self = this.set("setColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDescription(value: String => Unit): Self = this.set("setDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetName(value: String => Unit): Self = this.set("setName", js.Any.fromFunction1(value))
  }
}
