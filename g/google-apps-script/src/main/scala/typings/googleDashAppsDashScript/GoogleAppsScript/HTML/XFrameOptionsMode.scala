package typings.googleDashAppsDashScript.GoogleAppsScript.HTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XFrameOptionsMode extends js.Object

/**
  * An enum representing the X-Frame-Options modes that can be used for client-side HtmlService scripts. These values can be accessed from HtmlService.XFrameOptionsMode,
  * and set by calling HtmlOutput.setXFrameOptionsMode(mode).
  *
  * Setting XFrameOptionsMode.ALLOWALL will let any site iframe the page, so the developer
  * should implement their own protection against clickjacking.
  *
  * If a script does not set an X-Frame-Options mode, Apps Script uses DEFAULT
  * mode as the default.
  *
  *     // Serve HTML with no X-Frame-Options header (in Apps Script server-side code).
  *     var output = HtmlService.createHtmlOutput('<b>Hello, world!</b>');
  *     output.setXFrameOptionsMode(HtmlService.XFrameOptionsMode.ALLOWALL);
  */
@JSGlobal("GoogleAppsScript.HTML.XFrameOptionsMode")
@js.native
object XFrameOptionsMode extends js.Object {
  @js.native
  sealed trait ALLOWALL extends XFrameOptionsMode
  
  @js.native
  sealed trait DEFAULT extends XFrameOptionsMode
  
  /* 0 */ val ALLOWALL: typings.googleDashAppsDashScript.GoogleAppsScript.HTML.XFrameOptionsMode.ALLOWALL with Double = js.native
  /* 1 */ val DEFAULT: typings.googleDashAppsDashScript.GoogleAppsScript.HTML.XFrameOptionsMode.DEFAULT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XFrameOptionsMode with Double] = js.native
}

