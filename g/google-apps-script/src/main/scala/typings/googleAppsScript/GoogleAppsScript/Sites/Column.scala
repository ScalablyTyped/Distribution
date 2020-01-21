package typings.googleAppsScript.GoogleAppsScript.Sites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Sites Column - a column from a Sites List page.
  * A rebuilt
  * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
  * modify Sites made with this version, but script can still access
  * classic Sites.
  */
trait Column extends js.Object {
  def deleteColumn(): Unit
  def getName(): String
  def getParent(): Page
  def setName(name: String): Column
}

object Column {
  @scala.inline
  def apply(deleteColumn: () => Unit, getName: () => String, getParent: () => Page, setName: String => Column): Column = {
    val __obj = js.Dynamic.literal(deleteColumn = js.Any.fromFunction0(deleteColumn), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[Column]
  }
}

