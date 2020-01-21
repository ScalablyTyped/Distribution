package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A segment of text terminated by a newline character.
  */
trait Paragraph extends js.Object {
  def getIndex(): Integer
  def getRange(): TextRange
}

object Paragraph {
  @scala.inline
  def apply(getIndex: () => Integer, getRange: () => TextRange): Paragraph = {
    val __obj = js.Dynamic.literal(getIndex = js.Any.fromFunction0(getIndex), getRange = js.Any.fromFunction0(getRange))
  
    __obj.asInstanceOf[Paragraph]
  }
}

