package typings.googleAppsScript.GoogleAppsScript.Base

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class provides access to dialog boxes specific to Google Sheets.
  *
  * The methods in this class are only available for use in the context of a Google Spreadsheet.
  * Please use G Suite dialogs instead.
  * See also
  *
  * ButtonSet
  */
@js.native
trait Browser extends StObject {
  
  var Buttons: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonSet */ Any = js.native
  
  def inputBox(prompt: String): String = js.native
  def inputBox(prompt: String, buttons: ButtonSet): String = js.native
  def inputBox(title: String, prompt: String, buttons: ButtonSet): String = js.native
  
  def msgBox(prompt: String): String = js.native
  def msgBox(prompt: String, buttons: ButtonSet): String = js.native
  def msgBox(title: String, prompt: String, buttons: ButtonSet): String = js.native
}
