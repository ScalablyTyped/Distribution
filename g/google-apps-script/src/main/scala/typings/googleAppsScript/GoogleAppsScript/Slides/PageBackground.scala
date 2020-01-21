package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the page's background
  */
@js.native
trait PageBackground extends js.Object {
  def getPictureFill(): PictureFill = js.native
  def getSolidFill(): SolidFill = js.native
  def getType(): PageBackgroundType = js.native
  def isVisible(): Boolean = js.native
  def setPictureFill(blobSource: BlobSource): Unit = js.native
  def setPictureFill(imageUrl: String): Unit = js.native
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

