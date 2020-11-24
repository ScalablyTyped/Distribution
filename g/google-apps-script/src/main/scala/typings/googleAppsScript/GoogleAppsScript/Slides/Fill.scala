package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the page element's background
  */
@js.native
trait Fill extends js.Object {
  
  def getSolidFill(): SolidFill = js.native
  
  def getType(): FillType = js.native
  
  def isVisible(): Boolean = js.native
  
  def setSolidFill(color: Color): Unit = js.native
  def setSolidFill(color: Color, alpha: Double): Unit = js.native
  def setSolidFill(color: ThemeColorType): Unit = js.native
  def setSolidFill(color: ThemeColorType, alpha: Double): Unit = js.native
  def setSolidFill(hexString: String): Unit = js.native
  def setSolidFill(hexString: String, alpha: Double): Unit = js.native
  def setSolidFill(red: Integer, green: Integer, blue: Integer): Unit = js.native
  def setSolidFill(red: Integer, green: Integer, blue: Integer, alpha: Double): Unit = js.native
  
  def setTransparent(): Unit = js.native
}
