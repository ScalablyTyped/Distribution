package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsBuilder[E] extends js.Object {
  def build(): AdWordsOperation[E]
}

object AdWordsBuilder {
  @scala.inline
  def apply[E](build: () => AdWordsOperation[E]): AdWordsBuilder[E] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build))
    __obj.asInstanceOf[AdWordsBuilder[E]]
  }
}

