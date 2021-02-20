package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Base.Ui
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows a script to open an existing Form or create a new one.
  *
  *     // Open a form by ID.
  *     var existingForm = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *
  *     // Create and open a form.
  *     var newForm = FormApp.create('Form Name');
  */
@js.native
trait FormApp extends StObject {
  
  var Alignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Alignment */ js.Any = js.native
  
  var DestinationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DestinationType */ js.Any = js.native
  
  var FeedbackType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeedbackType */ js.Any = js.native
  
  var ItemType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemType */ js.Any = js.native
  
  var PageNavigationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageNavigationType */ js.Any = js.native
  
  def create(title: String): Form = js.native
  
  def createCheckboxGridValidation(): CheckboxGridValidationBuilder = js.native
  
  def createCheckboxValidation(): CheckboxValidationBuilder = js.native
  
  def createFeedback(): QuizFeedbackBuilder = js.native
  
  def createGridValidation(): GridValidationBuilder = js.native
  
  def createParagraphTextValidation(): ParagraphTextValidationBuilder = js.native
  
  def createTextValidation(): TextValidationBuilder = js.native
  
  def getActiveForm(): Form = js.native
  
  def getUi(): Ui = js.native
  
  def openById(id: String): Form = js.native
  
  def openByUrl(url: String): Form = js.native
}
object FormApp {
  
  @scala.inline
  def apply(
    Alignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Alignment */ js.Any,
    DestinationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DestinationType */ js.Any,
    FeedbackType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeedbackType */ js.Any,
    ItemType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemType */ js.Any,
    PageNavigationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageNavigationType */ js.Any,
    create: String => Form,
    createCheckboxGridValidation: () => CheckboxGridValidationBuilder,
    createCheckboxValidation: () => CheckboxValidationBuilder,
    createFeedback: () => QuizFeedbackBuilder,
    createGridValidation: () => GridValidationBuilder,
    createParagraphTextValidation: () => ParagraphTextValidationBuilder,
    createTextValidation: () => TextValidationBuilder,
    getActiveForm: () => Form,
    getUi: () => Ui,
    openById: String => Form,
    openByUrl: String => Form
  ): FormApp = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], DestinationType = DestinationType.asInstanceOf[js.Any], FeedbackType = FeedbackType.asInstanceOf[js.Any], ItemType = ItemType.asInstanceOf[js.Any], PageNavigationType = PageNavigationType.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), createCheckboxGridValidation = js.Any.fromFunction0(createCheckboxGridValidation), createCheckboxValidation = js.Any.fromFunction0(createCheckboxValidation), createFeedback = js.Any.fromFunction0(createFeedback), createGridValidation = js.Any.fromFunction0(createGridValidation), createParagraphTextValidation = js.Any.fromFunction0(createParagraphTextValidation), createTextValidation = js.Any.fromFunction0(createTextValidation), getActiveForm = js.Any.fromFunction0(getActiveForm), getUi = js.Any.fromFunction0(getUi), openById = js.Any.fromFunction1(openById), openByUrl = js.Any.fromFunction1(openByUrl))
    __obj.asInstanceOf[FormApp]
  }
  
  @scala.inline
  implicit class FormAppMutableBuilder[Self <: FormApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Alignment */ js.Any): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate(value: String => Form): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateCheckboxGridValidation(value: () => CheckboxGridValidationBuilder): Self = StObject.set(x, "createCheckboxGridValidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateCheckboxValidation(value: () => CheckboxValidationBuilder): Self = StObject.set(x, "createCheckboxValidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateFeedback(value: () => QuizFeedbackBuilder): Self = StObject.set(x, "createFeedback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateGridValidation(value: () => GridValidationBuilder): Self = StObject.set(x, "createGridValidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateParagraphTextValidation(value: () => ParagraphTextValidationBuilder): Self = StObject.set(x, "createParagraphTextValidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateTextValidation(value: () => TextValidationBuilder): Self = StObject.set(x, "createTextValidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestinationType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DestinationType */ js.Any
    ): Self = StObject.set(x, "DestinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeedbackType */ js.Any
    ): Self = StObject.set(x, "FeedbackType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetActiveForm(value: () => Form): Self = StObject.set(x, "getActiveForm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUi(value: () => Ui): Self = StObject.set(x, "getUi", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItemType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemType */ js.Any): Self = StObject.set(x, "ItemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenById(value: String => Form): Self = StObject.set(x, "openById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenByUrl(value: String => Form): Self = StObject.set(x, "openByUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPageNavigationType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageNavigationType */ js.Any
    ): Self = StObject.set(x, "PageNavigationType", value.asInstanceOf[js.Any])
  }
}
