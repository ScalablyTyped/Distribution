package typings.dwt.addonPDFMod

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTConvertMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDF extends js.Object {
  /**
    * Set up the PDF writing engine.
    */
  var Write: typings.dwt.addonPDFMod.Write = js.native
  /**
    * Convert the specified PDF file to image(s).
    * @param path The path of the PDF file.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def ConvertToImage(
    path: String,
    resolution: Double,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  /**
    * Return the convert mode.
    */
  def GetConvertMode(): Double = js.native
  /**
    * Return whether the PDF module has been installed.
    */
  def IsModuleInstalled(): Boolean = js.native
  /**
    * Detect whether a local PDF file is text based or not.
    * @path Specify the path of the PDF file.
    */
  def IsTextBasedPDF(path: String): Boolean = js.native
  def SetConvertMode(mode: Double): Boolean = js.native
  /**
    * Set the convert mode.
    * @param mode Specify the mode.
    */
  def SetConvertMode(mode: EnumDWTConvertMode): Boolean = js.native
  /**
    * Set the password for reading encrypted PDF files.
    * @param password Specify the password.
    */
  def SetPassword(password: String): Boolean = js.native
  /**
    * Set the resolution for rasterizing.
    * @param resolution Specify the resolution.
    */
  def SetResolution(resolution: Double): Boolean = js.native
}

