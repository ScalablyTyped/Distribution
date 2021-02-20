package typings.googleAppsScript.GoogleAppsScript.Forms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PageNavigationType extends StObject
/**
  * An enum representing the supported types of page navigation. Page navigation types can be
  * accessed from FormApp.PageNavigationType.
  *
  * The page navigation occurs after the respondent completes a page that contains the option, and
  * only if the respondent chose that option. If the respondent chose multiple options with
  * page-navigation instructions on the same page, only the last navigation option has any effect.
  * Page navigation also has no effect on the last page of a form.
  *
  * Choices that use page navigation cannot be combined in the same item with choices that do not
  * use page navigation.
  *
  *     // Create a form and add a new multiple-choice item and a page-break item.
  *     var form = FormApp.create('Form Name');
  *     var item = form.addMultipleChoiceItem();
  *     var pageBreak = form.addPageBreakItem();
  *
  *     // Set some choices with go-to-page logic.
  *     var rightChoice = item.createChoice('Vanilla', FormApp.PageNavigationType.SUBMIT);
  *     var wrongChoice = item.createChoice('Chocolate', FormApp.PageNavigationType.RESTART);
  *
  *     // For GO_TO_PAGE, just pass in the page break item. For CONTINUE (normally the default), pass in
  *     // CONTINUE explicitly because page navigation cannot be mixed with non-navigation choices.
  *     var iffyChoice = item.createChoice('Peanut', pageBreak);
  *     var otherChoice = item.createChoice('Strawberry', FormApp.PageNavigationType.CONTINUE);
  *     item.setChoices([rightChoice, wrongChoice, iffyChoice, otherChoice]);
  */
@JSGlobal("GoogleAppsScript.Forms.PageNavigationType")
@js.native
object PageNavigationType extends StObject {
  
  @js.native
  sealed trait CONTINUE extends PageNavigationType
  
  @js.native
  sealed trait GO_TO_PAGE extends PageNavigationType
  
  @js.native
  sealed trait RESTART extends PageNavigationType
  
  @js.native
  sealed trait SUBMIT extends PageNavigationType
}
