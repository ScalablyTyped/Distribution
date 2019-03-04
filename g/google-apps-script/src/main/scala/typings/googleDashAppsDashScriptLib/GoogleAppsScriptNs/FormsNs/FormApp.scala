package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormApp extends js.Object {
  var Alignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Alignment */ js.Any
  var DestinationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DestinationType */ js.Any
  var FeedbackType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeedbackType */ js.Any
  var ItemType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemType */ js.Any
  var PageNavigationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageNavigationType */ js.Any
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

object FormApp {
  @scala.inline
  def apply(
    Alignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Alignment */ js.Any,
    DestinationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DestinationType */ js.Any,
    FeedbackType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeedbackType */ js.Any,
    ItemType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemType */ js.Any,
    PageNavigationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageNavigationType */ js.Any,
    create: js.Function1[java.lang.String, Form],
    createCheckboxGridValidation: js.Function0[CheckboxGridValidationBuilder],
    createCheckboxValidation: js.Function0[CheckboxValidationBuilder],
    createFeedback: js.Function0[QuizFeedbackBuilder],
    createGridValidation: js.Function0[GridValidationBuilder],
    createParagraphTextValidation: js.Function0[ParagraphTextValidationBuilder],
    createTextValidation: js.Function0[TextValidationBuilder],
    getActiveForm: js.Function0[Form],
    getUi: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Ui],
    openById: js.Function1[java.lang.String, Form],
    openByUrl: js.Function1[java.lang.String, Form]
  ): FormApp = {
    val __obj = js.Dynamic.literal(Alignment = Alignment, DestinationType = DestinationType, FeedbackType = FeedbackType, ItemType = ItemType, PageNavigationType = PageNavigationType, create = create, createCheckboxGridValidation = createCheckboxGridValidation, createCheckboxValidation = createCheckboxValidation, createFeedback = createFeedback, createGridValidation = createGridValidation, createParagraphTextValidation = createParagraphTextValidation, createTextValidation = createTextValidation, getActiveForm = getActiveForm, getUi = getUi, openById = openById, openByUrl = openByUrl)
  
    __obj.asInstanceOf[FormApp]
  }
}

