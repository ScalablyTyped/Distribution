package typings.googleAppsScript.GoogleAppsScript.Sites

import typings.googleAppsScript.GoogleAppsScript.Base.Date
import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Sites ListItem - a list element from a Sites List page.
  * A rebuilt
  * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
  * modify Sites made with this version, but script can still access
  * classic Sites.
  */
trait ListItem extends js.Object {
  def deleteListItem(): Unit
  def getDatePublished(): Date
  def getLastUpdated(): Date
  def getParent(): Page
  def getValueByIndex(index: Integer): String
  def getValueByName(name: String): String
  def setParent(parent: Page): ListItem
  def setValueByIndex(index: Integer, value: String): ListItem
  def setValueByName(name: String, value: String): ListItem
}

object ListItem {
  @scala.inline
  def apply(
    deleteListItem: () => Unit,
    getDatePublished: () => Date,
    getLastUpdated: () => Date,
    getParent: () => Page,
    getValueByIndex: Integer => String,
    getValueByName: String => String,
    setParent: Page => ListItem,
    setValueByIndex: (Integer, String) => ListItem,
    setValueByName: (String, String) => ListItem
  ): ListItem = {
    val __obj = js.Dynamic.literal(deleteListItem = js.Any.fromFunction0(deleteListItem), getDatePublished = js.Any.fromFunction0(getDatePublished), getLastUpdated = js.Any.fromFunction0(getLastUpdated), getParent = js.Any.fromFunction0(getParent), getValueByIndex = js.Any.fromFunction1(getValueByIndex), getValueByName = js.Any.fromFunction1(getValueByName), setParent = js.Any.fromFunction1(setParent), setValueByIndex = js.Any.fromFunction2(setValueByIndex), setValueByName = js.Any.fromFunction2(setValueByName))
  
    __obj.asInstanceOf[ListItem]
  }
}

