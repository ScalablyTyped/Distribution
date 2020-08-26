package typings.dwt.addonOCRProMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  /**
    * Return the index of the image or path of the file.
    */
  def GetInput(): Double | String = js.native
  /**
    * Return the error message.
    */
  def GetMessage(): String = js.native
  /**
    * Return the number of the page on which the error was thrown.
    * If the input is a file, this returns the index of the page in that file.
    * If the input is an image in the buffer, this always returns 0.
    */
  def GetPage(): Double = js.native
}

object Error {
  @scala.inline
  def apply(GetInput: () => Double | String, GetMessage: () => String, GetPage: () => Double): Error = {
    val __obj = js.Dynamic.literal(GetInput = js.Any.fromFunction0(GetInput), GetMessage = js.Any.fromFunction0(GetMessage), GetPage = js.Any.fromFunction0(GetPage))
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
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
    def setGetInput(value: () => Double | String): Self = this.set("GetInput", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMessage(value: () => String): Self = this.set("GetMessage", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPage(value: () => Double): Self = this.set("GetPage", js.Any.fromFunction0(value))
  }
  
}

