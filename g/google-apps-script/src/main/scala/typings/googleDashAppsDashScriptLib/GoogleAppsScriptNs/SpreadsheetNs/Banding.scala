package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Banding extends js.Object {
  def copyTo(range: Range): Banding
  def getFirstColumnColor(): java.lang.String
  def getFirstRowColor(): java.lang.String
  def getFooterColumnColor(): java.lang.String
  def getFooterRowColor(): java.lang.String
  def getHeaderColumnColor(): java.lang.String
  def getHeaderRowColor(): java.lang.String
  def getRange(): Range
  def getSecondColumnColor(): java.lang.String
  def getSecondRowColor(): java.lang.String
  def remove(): scala.Unit
  def setFirstColumnColor(color: java.lang.String): Banding
  def setFirstRowColor(color: java.lang.String): Banding
  def setFooterColumnColor(color: java.lang.String): Banding
  def setFooterRowColor(color: java.lang.String): Banding
  def setHeaderColumnColor(color: java.lang.String): Banding
  def setHeaderRowColor(color: java.lang.String): Banding
  def setRange(range: Range): Banding
  def setSecondColumnColor(color: java.lang.String): Banding
  def setSecondRowColor(color: java.lang.String): Banding
}

object Banding {
  @scala.inline
  def apply(
    copyTo: Range => Banding,
    getFirstColumnColor: () => java.lang.String,
    getFirstRowColor: () => java.lang.String,
    getFooterColumnColor: () => java.lang.String,
    getFooterRowColor: () => java.lang.String,
    getHeaderColumnColor: () => java.lang.String,
    getHeaderRowColor: () => java.lang.String,
    getRange: () => Range,
    getSecondColumnColor: () => java.lang.String,
    getSecondRowColor: () => java.lang.String,
    remove: () => scala.Unit,
    setFirstColumnColor: java.lang.String => Banding,
    setFirstRowColor: java.lang.String => Banding,
    setFooterColumnColor: java.lang.String => Banding,
    setFooterRowColor: java.lang.String => Banding,
    setHeaderColumnColor: java.lang.String => Banding,
    setHeaderRowColor: java.lang.String => Banding,
    setRange: Range => Banding,
    setSecondColumnColor: java.lang.String => Banding,
    setSecondRowColor: java.lang.String => Banding
  ): Banding = {
    val __obj = js.Dynamic.literal(copyTo = js.Any.fromFunction1(copyTo), getFirstColumnColor = js.Any.fromFunction0(getFirstColumnColor), getFirstRowColor = js.Any.fromFunction0(getFirstRowColor), getFooterColumnColor = js.Any.fromFunction0(getFooterColumnColor), getFooterRowColor = js.Any.fromFunction0(getFooterRowColor), getHeaderColumnColor = js.Any.fromFunction0(getHeaderColumnColor), getHeaderRowColor = js.Any.fromFunction0(getHeaderRowColor), getRange = js.Any.fromFunction0(getRange), getSecondColumnColor = js.Any.fromFunction0(getSecondColumnColor), getSecondRowColor = js.Any.fromFunction0(getSecondRowColor), remove = js.Any.fromFunction0(remove), setFirstColumnColor = js.Any.fromFunction1(setFirstColumnColor), setFirstRowColor = js.Any.fromFunction1(setFirstRowColor), setFooterColumnColor = js.Any.fromFunction1(setFooterColumnColor), setFooterRowColor = js.Any.fromFunction1(setFooterRowColor), setHeaderColumnColor = js.Any.fromFunction1(setHeaderColumnColor), setHeaderRowColor = js.Any.fromFunction1(setHeaderRowColor), setRange = js.Any.fromFunction1(setRange), setSecondColumnColor = js.Any.fromFunction1(setSecondColumnColor), setSecondRowColor = js.Any.fromFunction1(setSecondRowColor))
  
    __obj.asInstanceOf[Banding]
  }
}

