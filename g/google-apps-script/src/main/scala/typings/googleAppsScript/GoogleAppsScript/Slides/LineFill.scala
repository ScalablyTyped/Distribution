package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the fill of a line or outline
  */
@js.native
trait LineFill extends js.Object {
  def getFillType(): LineFillType = js.native
  def getSolidFill(): SolidFill = js.native
  def setSolidFill(color: Color): Unit = js.native
  def setSolidFill(color: Color, alpha: Double): Unit = js.native
  def setSolidFill(color: ThemeColorType): Unit = js.native
  def setSolidFill(color: ThemeColorType, alpha: Double): Unit = js.native
  def setSolidFill(hexString: String): Unit = js.native
  def setSolidFill(hexString: String, alpha: Double): Unit = js.native
  def setSolidFill(red: Integer, green: Integer, blue: Integer): Unit = js.native
  def setSolidFill(red: Integer, green: Integer, blue: Integer, alpha: Double): Unit = js.native
}

