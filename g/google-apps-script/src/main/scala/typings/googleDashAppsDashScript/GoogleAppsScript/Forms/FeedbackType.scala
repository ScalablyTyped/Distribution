package typings.googleDashAppsDashScript.GoogleAppsScript.Forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FeedbackType extends js.Object

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
object FeedbackType extends js.Object {
  @js.native
  sealed trait CORRECT extends FeedbackType
  
  @js.native
  sealed trait GENERAL extends FeedbackType
  
  @js.native
  sealed trait INCORRECT extends FeedbackType
  
  /* 0 */ val CORRECT: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.FeedbackType.CORRECT with Double = js.native
  /* 2 */ val GENERAL: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.FeedbackType.GENERAL with Double = js.native
  /* 1 */ val INCORRECT: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.FeedbackType.INCORRECT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FeedbackType with Double] = js.native
}

