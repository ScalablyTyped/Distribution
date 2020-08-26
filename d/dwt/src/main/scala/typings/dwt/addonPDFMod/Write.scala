package typings.dwt.addonPDFMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Write extends js.Object {
  /**
    * Set up the PDF writing engine.
    * @param settings Configures how the PDF is generated.
    */
  def Setup(settings: PDFWSetting): Unit = js.native
}

object Write {
  @scala.inline
  def apply(Setup: PDFWSetting => Unit): Write = {
    val __obj = js.Dynamic.literal(Setup = js.Any.fromFunction1(Setup))
    __obj.asInstanceOf[Write]
  }
  @scala.inline
  implicit class WriteOps[Self <: Write] (val x: Self) extends AnyVal {
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
    def setSetup(value: PDFWSetting => Unit): Self = this.set("Setup", js.Any.fromFunction1(value))
  }
  
}

