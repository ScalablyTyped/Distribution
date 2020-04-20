package typings.googleAppsScript.GoogleAppsScript.Forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The bean implementation of a Feedback, which contains properties common to all feedback, such as
  * display text or links.
  *
  * Feedback can be added to gradeable Form items.
  *
  *     // Setting feedback which should be automatically shown when a user responds to a question
  *     // incorrectly.
  *     var textItem = form.addTextItem().setTitle('Re-hydrating dried fruit is an example of what?');
  *     var feedback = FormApp.createFeedback()
  *       .setDisplayText(
  *           “Good answer, but not quite right.  Please review chapter 4 before next time.”)
  *       .addLink("http://wikipedia.com/osmosis");
  *     textItem.setFeedbackForIncorrect(feedback);
  */
trait QuizFeedback extends js.Object {
  def getLinkUrls(): js.Array[String]
  def getText(): String
}

object QuizFeedback {
  @scala.inline
  def apply(getLinkUrls: () => js.Array[String], getText: () => String): QuizFeedback = {
    val __obj = js.Dynamic.literal(getLinkUrls = js.Any.fromFunction0(getLinkUrls), getText = js.Any.fromFunction0(getText))
    __obj.asInstanceOf[QuizFeedback]
  }
}

