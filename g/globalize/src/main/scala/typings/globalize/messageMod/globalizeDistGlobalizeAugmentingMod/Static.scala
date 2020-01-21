package typings.globalize.messageMod.globalizeDistGlobalizeAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Static extends js.Object {
  /**
  		 * Load messages data.
  		 * @param {Object} json JSON object of messages data. Keys can use any character, except /, { and }. Values (i.e., the message content itself) can contain any character.
  		 * @returns {void}
  		 */
  def loadMessages(json: js.Object): Unit
}

object Static {
  @scala.inline
  def apply(loadMessages: js.Object => Unit): Static = {
    val __obj = js.Dynamic.literal(loadMessages = js.Any.fromFunction1(loadMessages))
  
    __obj.asInstanceOf[Static]
  }
}

