package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFWrite extends js.Object {
  /**
    * Configures how the PDF generating is done
    * @method Dynamsoft.WebTwain.Addon.PDF.Write#jsonWriteSetting
    * @param {any} jsonWriteSetting detailed settings for PDF writing.
    * @return {boolean}
    */
  def Setup(jsonWriteSetting: js.Any): Unit
}

object PDFWrite {
  @scala.inline
  def apply(Setup: js.Any => Unit): PDFWrite = {
    val __obj = js.Dynamic.literal(Setup = js.Any.fromFunction1(Setup))
  
    __obj.asInstanceOf[PDFWrite]
  }
}

