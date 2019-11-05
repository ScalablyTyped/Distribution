package typings.googleDashAppsDashScript.GoogleAppsScript.Forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base FeedbackBuilder that contains setters for properties common to all feedback, such as
  * display text. Used to build Feedback objects.
  *
  *     // Open a form by ID and add a new list item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addListItem();
  *     item.setTitle('Do you prefer cats or dogs?');
  *     item.setChoices([
  *       item.createChoice('Dogs', true),
  *       item.createChoice('Cats', false)]);
  *     // Add feedback which will be shown for correct responses; ie "Dogs".
  *     item.setFeedbackForCorrect(FormApp.createFeedback().setText("Dogs rule, cats drool.").build());
  */
@js.native
trait QuizFeedbackBuilder extends js.Object {
  def addLink(url: String): QuizFeedbackBuilder = js.native
  def addLink(url: String, displayText: String): QuizFeedbackBuilder = js.native
  def build(): QuizFeedback = js.native
  def copy(): QuizFeedbackBuilder = js.native
  def setText(text: String): QuizFeedbackBuilder = js.native
}

