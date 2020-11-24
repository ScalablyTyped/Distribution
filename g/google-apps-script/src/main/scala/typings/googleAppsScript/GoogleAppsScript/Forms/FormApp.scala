package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Base.Ui
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
trait FormApp extends js.Object {
  
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
  implicit class FormAppOps[Self <: FormApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlignment(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Alignment */ js.Any): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DestinationType */ js.Any
    ): Self = this.set("DestinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeedbackType */ js.Any
    ): Self = this.set("FeedbackType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemType */ js.Any): Self = this.set("ItemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNavigationType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageNavigationType */ js.Any
    ): Self = this.set("PageNavigationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate(value: String => Form): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateCheckboxGridValidation(value: () => CheckboxGridValidationBuilder): Self = this.set("createCheckboxGridValidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateCheckboxValidation(value: () => CheckboxValidationBuilder): Self = this.set("createCheckboxValidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateFeedback(value: () => QuizFeedbackBuilder): Self = this.set("createFeedback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateGridValidation(value: () => GridValidationBuilder): Self = this.set("createGridValidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateParagraphTextValidation(value: () => ParagraphTextValidationBuilder): Self = this.set("createParagraphTextValidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateTextValidation(value: () => TextValidationBuilder): Self = this.set("createTextValidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveForm(value: () => Form): Self = this.set("getActiveForm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUi(value: () => Ui): Self = this.set("getUi", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenById(value: String => Form): Self = this.set("openById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenByUrl(value: String => Form): Self = this.set("openByUrl", js.Any.fromFunction1(value))
  }
}
