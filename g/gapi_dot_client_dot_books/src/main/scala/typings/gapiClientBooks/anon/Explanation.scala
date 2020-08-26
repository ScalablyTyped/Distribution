package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Explanation extends js.Object {
  /** A text explaining why this volume is recommended. */
  var explanation: js.UndefOr[String] = js.native
}

object Explanation {
  @scala.inline
  def apply(): Explanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Explanation]
  }
  @scala.inline
  implicit class ExplanationOps[Self <: Explanation] (val x: Self) extends AnyVal {
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
    def setExplanation(value: String): Self = this.set("explanation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplanation: Self = this.set("explanation", js.undefined)
  }
  
}

