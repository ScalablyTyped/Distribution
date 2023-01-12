package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Base.Ui
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait FormApp extends StObject {
  
  var Alignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Alignment */ Any
  
  var DestinationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DestinationType */ Any
  
  var FeedbackType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeedbackType */ Any
  
  var ItemType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemType */ Any
  
  var PageNavigationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageNavigationType */ Any
  
  def create(title: String): Form
  
  def createCheckboxGridValidation(): CheckboxGridValidationBuilder
  
  def createCheckboxValidation(): CheckboxValidationBuilder
  
  def createFeedback(): QuizFeedbackBuilder
  
  def createGridValidation(): GridValidationBuilder
  
  def createParagraphTextValidation(): ParagraphTextValidationBuilder
  
  def createTextValidation(): TextValidationBuilder
  
  def getActiveForm(): Form
  
  def getUi(): Ui
  
  def openById(id: String): Form
  
  def openByUrl(url: String): Form
}
object FormApp {
  
  inline def apply(
    Alignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Alignment */ Any,
    DestinationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DestinationType */ Any,
    FeedbackType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeedbackType */ Any,
    ItemType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemType */ Any,
    PageNavigationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageNavigationType */ Any,
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
  implicit open class MutableBuilder[Self <: FormApp] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Alignment */ Any): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: String => Form): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setCreateCheckboxGridValidation(value: () => CheckboxGridValidationBuilder): Self = StObject.set(x, "createCheckboxGridValidation", js.Any.fromFunction0(value))
    
    inline def setCreateCheckboxValidation(value: () => CheckboxValidationBuilder): Self = StObject.set(x, "createCheckboxValidation", js.Any.fromFunction0(value))
    
    inline def setCreateFeedback(value: () => QuizFeedbackBuilder): Self = StObject.set(x, "createFeedback", js.Any.fromFunction0(value))
    
    inline def setCreateGridValidation(value: () => GridValidationBuilder): Self = StObject.set(x, "createGridValidation", js.Any.fromFunction0(value))
    
    inline def setCreateParagraphTextValidation(value: () => ParagraphTextValidationBuilder): Self = StObject.set(x, "createParagraphTextValidation", js.Any.fromFunction0(value))
    
    inline def setCreateTextValidation(value: () => TextValidationBuilder): Self = StObject.set(x, "createTextValidation", js.Any.fromFunction0(value))
    
    inline def setDestinationType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DestinationType */ Any
    ): Self = StObject.set(x, "DestinationType", value.asInstanceOf[js.Any])
    
    inline def setFeedbackType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeedbackType */ Any): Self = StObject.set(x, "FeedbackType", value.asInstanceOf[js.Any])
    
    inline def setGetActiveForm(value: () => Form): Self = StObject.set(x, "getActiveForm", js.Any.fromFunction0(value))
    
    inline def setGetUi(value: () => Ui): Self = StObject.set(x, "getUi", js.Any.fromFunction0(value))
    
    inline def setItemType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemType */ Any): Self = StObject.set(x, "ItemType", value.asInstanceOf[js.Any])
    
    inline def setOpenById(value: String => Form): Self = StObject.set(x, "openById", js.Any.fromFunction1(value))
    
    inline def setOpenByUrl(value: String => Form): Self = StObject.set(x, "openByUrl", js.Any.fromFunction1(value))
    
    inline def setPageNavigationType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageNavigationType */ Any
    ): Self = StObject.set(x, "PageNavigationType", value.asInstanceOf[js.Any])
  }
}
