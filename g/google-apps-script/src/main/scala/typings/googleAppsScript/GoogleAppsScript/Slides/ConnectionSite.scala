package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The connection site on a PageElement that can connect to a connector.
  */
trait ConnectionSite extends js.Object {
  def getIndex(): Integer
  def getPageElement(): PageElement
}

object ConnectionSite {
  @scala.inline
  def apply(getIndex: () => Integer, getPageElement: () => PageElement): ConnectionSite = {
    val __obj = js.Dynamic.literal(getIndex = js.Any.fromFunction0(getIndex), getPageElement = js.Any.fromFunction0(getPageElement))
    __obj.asInstanceOf[ConnectionSite]
  }
}

