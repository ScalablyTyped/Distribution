package typings.googleAppsScript.GoogleAppsScript.Forms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FeedbackType extends StObject
/**
  * An enum representing the supported types of feedback. Feedback types can be accessed from FormApp.FeedbackType.
  *
  *     // Open a form by ID and add a new list item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addListItem();
  *     item.setTitle('Do you prefer cats or dogs?');
  *     // Set "Dogs" as the correct answer to this question.
  *     item.setChoices([
  *       item.createChoice('Dogs', true),
  *       item.createChoice('Cats', false)]);
  *     // Add feedback which will be shown for correct responses; ie "Dogs".
  *     item.setFeedbackForCorrect(
  *         FormApp.createFeedback().setDisplayText("Dogs rule, cats drool.").build());
  */
@JSGlobal("GoogleAppsScript.Forms.FeedbackType")
@js.native
object FeedbackType extends StObject {
  
  @js.native
  sealed trait CORRECT
    extends StObject
       with FeedbackType
  
  @js.native
  sealed trait GENERAL
    extends StObject
       with FeedbackType
  
  @js.native
  sealed trait INCORRECT
    extends StObject
       with FeedbackType
}
