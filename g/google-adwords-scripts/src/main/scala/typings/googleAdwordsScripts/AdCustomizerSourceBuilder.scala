package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdCustomizerSourceBuilder[AdCustomizerSource] extends AdWordsBuilder[AdCustomizerSource] {
  def addAttribute(name: String, `type`: String): AdCustomizerSourceBuilder[AdCustomizerSource]
  def addAttributes(attributes: js.Object): AdCustomizerSourceBuilder[AdCustomizerSource]
  def withName(name: String): AdCustomizerSourceBuilder[AdCustomizerSource]
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
}

