package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FormApp extends js.Object {
  var Alignment: js.Any
  var DestinationType: js.Any
  var FeedbackType: js.Any
  var ItemType: js.Any
  var PageNavigationType: js.Any
  def create(title: java.lang.String): Form
  def createCheckboxGridValidation(): CheckboxGridValidationBuilder
  def createCheckboxValidation(): CheckboxValidationBuilder
  def createFeedback(): QuizFeedbackBuilder
  def createGridValidation(): GridValidationBuilder
  def createParagraphTextValidation(): ParagraphTextValidationBuilder
  def createTextValidation(): TextValidationBuilder
  def getActiveForm(): Form
  def getUi(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Ui
  def openById(id: java.lang.String): Form
  def openByUrl(url: java.lang.String): Form
}

