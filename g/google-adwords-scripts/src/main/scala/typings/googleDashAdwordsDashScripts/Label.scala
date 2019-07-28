package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Labels
trait Label extends AdWordsEntity {
  def adGroups(): AdWordsSelector[AdGroup]
  def ads(): AdWordsSelector[Ad]
  def campaigns(): AdWordsSelector[Campaign]
  def getColor(): String
  def getDescription(): String
  def getId(): String
  def getName(): String
  def keywords(): AdWordsSelector[Keyword]
  def remove(): Unit
  def setColor(color: String): Unit
  def setDescription(description: String): Unit
  def setName(name: String): Unit
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
    setName: String => Unit,
    getEntityType: () => String = null
  ): Label = {
    val __obj = js.Dynamic.literal(adGroups = js.Any.fromFunction0(adGroups), ads = js.Any.fromFunction0(ads), campaigns = js.Any.fromFunction0(campaigns), getColor = js.Any.fromFunction0(getColor), getDescription = js.Any.fromFunction0(getDescription), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), keywords = js.Any.fromFunction0(keywords), remove = js.Any.fromFunction0(remove), setColor = js.Any.fromFunction1(setColor), setDescription = js.Any.fromFunction1(setDescription), setName = js.Any.fromFunction1(setName))
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(js.Any.fromFunction0(getEntityType))
    __obj.asInstanceOf[Label]
  }
}

