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
    adGroups: js.Function0[AdWordsSelector[AdGroup]],
    ads: js.Function0[AdWordsSelector[Ad]],
    campaigns: js.Function0[AdWordsSelector[Campaign]],
    getColor: js.Function0[java.lang.String],
    getDescription: js.Function0[java.lang.String],
    getId: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    keywords: js.Function0[AdWordsSelector[Keyword]],
    remove: js.Function0[scala.Unit],
    setColor: js.Function1[java.lang.String, scala.Unit],
    setDescription: js.Function1[java.lang.String, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    getEntityType: js.Function0[java.lang.String] = null
  ): Label = {
    val __obj = js.Dynamic.literal(adGroups = adGroups, ads = ads, campaigns = campaigns, getColor = getColor, getDescription = getDescription, getId = getId, getName = getName, keywords = keywords, remove = remove, setColor = setColor, setDescription = setDescription, setName = setName)
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(getEntityType)
    __obj.asInstanceOf[Label]
  }
}

