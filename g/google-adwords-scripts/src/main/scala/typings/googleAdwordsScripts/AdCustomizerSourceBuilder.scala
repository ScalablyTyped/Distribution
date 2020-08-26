package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdCustomizerSourceBuilder[AdCustomizerSource] extends AdWordsBuilder[AdCustomizerSource] {
  def addAttribute(name: String, `type`: String): AdCustomizerSourceBuilder[AdCustomizerSource] = js.native
  def addAttributes(attributes: js.Object): AdCustomizerSourceBuilder[AdCustomizerSource] = js.native
  def withName(name: String): AdCustomizerSourceBuilder[AdCustomizerSource] = js.native
}

object AdCustomizerSourceBuilder {
  @scala.inline
  def apply[AdCustomizerSource](
    addAttribute: (String, String) => AdCustomizerSourceBuilder[AdCustomizerSource],
    addAttributes: js.Object => AdCustomizerSourceBuilder[AdCustomizerSource],
    build: () => AdWordsOperation[AdCustomizerSource],
    withName: String => AdCustomizerSourceBuilder[AdCustomizerSource]
  ): AdCustomizerSourceBuilder[AdCustomizerSource] = {
    val __obj = js.Dynamic.literal(addAttribute = js.Any.fromFunction2(addAttribute), addAttributes = js.Any.fromFunction1(addAttributes), build = js.Any.fromFunction0(build), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[AdCustomizerSourceBuilder[AdCustomizerSource]]
  }
  @scala.inline
  implicit class AdCustomizerSourceBuilderOps[Self <: AdCustomizerSourceBuilder[_], AdCustomizerSource] (val x: Self with AdCustomizerSourceBuilder[AdCustomizerSource]) extends AnyVal {
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
    def setAddAttribute(value: (String, String) => AdCustomizerSourceBuilder[AdCustomizerSource]): Self = this.set("addAttribute", js.Any.fromFunction2(value))
    @scala.inline
    def setAddAttributes(value: js.Object => AdCustomizerSourceBuilder[AdCustomizerSource]): Self = this.set("addAttributes", js.Any.fromFunction1(value))
    @scala.inline
    def setWithName(value: String => AdCustomizerSourceBuilder[AdCustomizerSource]): Self = this.set("withName", js.Any.fromFunction1(value))
  }
  
}

