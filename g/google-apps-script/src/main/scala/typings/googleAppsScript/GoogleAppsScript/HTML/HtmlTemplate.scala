package typings.googleAppsScript.GoogleAppsScript.HTML

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A template object for dynamically constructing HTML. For more information, see the guide to templates.
  */
@js.native
trait HtmlTemplate
  extends /* propName */ StringDictionary[js.Any] {
  def evaluate(): HtmlOutput = js.native
  def getCode(): String = js.native
  def getCodeWithComments(): String = js.native
  def getRawContent(): String = js.native
}

object HtmlTemplate {
  @scala.inline
  def apply(
    evaluate: () => HtmlOutput,
    getCode: () => String,
    getCodeWithComments: () => String,
    getRawContent: () => String
  ): HtmlTemplate = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction0(evaluate), getCode = js.Any.fromFunction0(getCode), getCodeWithComments = js.Any.fromFunction0(getCodeWithComments), getRawContent = js.Any.fromFunction0(getRawContent))
    __obj.asInstanceOf[HtmlTemplate]
  }
  @scala.inline
  implicit class HtmlTemplateOps[Self <: HtmlTemplate] (val x: Self) extends AnyVal {
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
    def setEvaluate(value: () => HtmlOutput): Self = this.set("evaluate", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCode(value: () => String): Self = this.set("getCode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCodeWithComments(value: () => String): Self = this.set("getCodeWithComments", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRawContent(value: () => String): Self = this.set("getRawContent", js.Any.fromFunction0(value))
  }
  
}

