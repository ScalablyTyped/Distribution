package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionHeaderItem extends js.Object {
  def duplicate(): SectionHeaderItem
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getTitle(): String
  def getType(): ItemType
  def setHelpText(text: String): SectionHeaderItem
  def setTitle(title: String): SectionHeaderItem
}

object SectionHeaderItem {
  @scala.inline
  def apply(
    duplicate: () => SectionHeaderItem,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    setHelpText: String => SectionHeaderItem,
    setTitle: String => SectionHeaderItem
  ): SectionHeaderItem = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction0(duplicate), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), setHelpText = js.Any.fromFunction1(setHelpText), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[SectionHeaderItem]
  }
}

