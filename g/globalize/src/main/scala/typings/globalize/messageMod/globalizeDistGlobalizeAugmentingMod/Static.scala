package typings.globalize.messageMod.globalizeDistGlobalizeAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static extends js.Object {
  
  /**
    * Load messages data.
    * @param {Object} json JSON object of messages data. Keys can use any character, except /, { and }. Values (i.e., the message content itself) can contain any character.
    * @returns {void}
    */
  def loadMessages(json: js.Object): Unit = js.native
}
object Static {
  
  @scala.inline
  def apply(loadMessages: js.Object => Unit): Static = {
    val __obj = js.Dynamic.literal(loadMessages = js.Any.fromFunction1(loadMessages))
    __obj.asInstanceOf[Static]
  }
  
  @scala.inline
  implicit class StaticOps[Self <: Static] (val x: Self) extends AnyVal {
    
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
    def setLoadMessages(value: js.Object => Unit): Self = this.set("loadMessages", js.Any.fromFunction1(value))
  }
}
