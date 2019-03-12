package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Labels
trait Label extends AdWordsEntity {
  def adGroups(): AdWordsSelector[AdGroup]
  def ads(): AdWordsSelector[Ad]
  def campaigns(): AdWordsSelector[Campaign]
  def getColor(): java.lang.String
  def getDescription(): java.lang.String
  def getId(): java.lang.String
  def getName(): java.lang.String
  def keywords(): AdWordsSelector[Keyword]
  def remove(): scala.Unit
  def setColor(color: java.lang.String): scala.Unit
  def setDescription(description: java.lang.String): scala.Unit
  def setName(name: java.lang.String): scala.Unit
}

object Label {
  @scala.inline
  def apply(
    adGroups: () => AdWordsSelector[AdGroup],
    ads: () => AdWordsSelector[Ad],
    campaigns: () => AdWordsSelector[Campaign],
    getColor: () => java.lang.String,
    getDescription: () => java.lang.String,
    getId: () => java.lang.String,
    getName: () => java.lang.String,
    keywords: () => AdWordsSelector[Keyword],
    remove: () => scala.Unit,
    setColor: java.lang.String => scala.Unit,
    setDescription: java.lang.String => scala.Unit,
    setName: java.lang.String => scala.Unit,
    getEntityType: () => java.lang.String = null
  ): Label = {
    val __obj = js.Dynamic.literal(adGroups = js.Any.fromFunction0(adGroups), ads = js.Any.fromFunction0(ads), campaigns = js.Any.fromFunction0(campaigns), getColor = js.Any.fromFunction0(getColor), getDescription = js.Any.fromFunction0(getDescription), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), keywords = js.Any.fromFunction0(keywords), remove = js.Any.fromFunction0(remove), setColor = js.Any.fromFunction1(setColor), setDescription = js.Any.fromFunction1(setDescription), setName = js.Any.fromFunction1(setName))
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(js.Any.fromFunction0(getEntityType))
    __obj.asInstanceOf[Label]
  }
}

