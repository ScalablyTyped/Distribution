package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Banding extends js.Object {
  def copyTo(range: Range): Banding
  def getFirstColumnColor(): String
  def getFirstRowColor(): String
  def getFooterColumnColor(): String
  def getFooterRowColor(): String
  def getHeaderColumnColor(): String
  def getHeaderRowColor(): String
  def getRange(): Range
  def getSecondColumnColor(): String
  def getSecondRowColor(): String
  def remove(): Unit
  def setFirstColumnColor(color: String): Banding
  def setFirstRowColor(color: String): Banding
  def setFooterColumnColor(color: String): Banding
  def setFooterRowColor(color: String): Banding
  def setHeaderColumnColor(color: String): Banding
  def setHeaderRowColor(color: String): Banding
  def setRange(range: Range): Banding
  def setSecondColumnColor(color: String): Banding
  def setSecondRowColor(color: String): Banding
}

object Banding {
  @scala.inline
  def apply(
    copyTo: Range => Banding,
    getFirstColumnColor: () => String,
    getFirstRowColor: () => String,
    getFooterColumnColor: () => String,
    getFooterRowColor: () => String,
    getHeaderColumnColor: () => String,
    getHeaderRowColor: () => String,
    getRange: () => Range,
    getSecondColumnColor: () => String,
    getSecondRowColor: () => String,
    remove: () => Unit,
    setFirstColumnColor: String => Banding,
    setFirstRowColor: String => Banding,
    setFooterColumnColor: String => Banding,
    setFooterRowColor: String => Banding,
    setHeaderColumnColor: String => Banding,
    setHeaderRowColor: String => Banding,
    setRange: Range => Banding,
    setSecondColumnColor: String => Banding,
    setSecondRowColor: String => Banding
  ): Banding = {
    val __obj = js.Dynamic.literal(copyTo = js.Any.fromFunction1(copyTo), getFirstColumnColor = js.Any.fromFunction0(getFirstColumnColor), getFirstRowColor = js.Any.fromFunction0(getFirstRowColor), getFooterColumnColor = js.Any.fromFunction0(getFooterColumnColor), getFooterRowColor = js.Any.fromFunction0(getFooterRowColor), getHeaderColumnColor = js.Any.fromFunction0(getHeaderColumnColor), getHeaderRowColor = js.Any.fromFunction0(getHeaderRowColor), getRange = js.Any.fromFunction0(getRange), getSecondColumnColor = js.Any.fromFunction0(getSecondColumnColor), getSecondRowColor = js.Any.fromFunction0(getSecondRowColor), remove = js.Any.fromFunction0(remove), setFirstColumnColor = js.Any.fromFunction1(setFirstColumnColor), setFirstRowColor = js.Any.fromFunction1(setFirstRowColor), setFooterColumnColor = js.Any.fromFunction1(setFooterColumnColor), setFooterRowColor = js.Any.fromFunction1(setFooterRowColor), setHeaderColumnColor = js.Any.fromFunction1(setHeaderColumnColor), setHeaderRowColor = js.Any.fromFunction1(setHeaderRowColor), setRange = js.Any.fromFunction1(setRange), setSecondColumnColor = js.Any.fromFunction1(setSecondColumnColor), setSecondRowColor = js.Any.fromFunction1(setSecondRowColor))
  
    __obj.asInstanceOf[Banding]
  }
}

