package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsTargeting[A, E] extends js.Object {
  def audiences(): AdWordsSelector[A]
  def exculdedAudiences(): AdWordsSelector[E]
}

object AdWordsTargeting {
  @scala.inline
  def apply[A, E](audiences: () => AdWordsSelector[A], exculdedAudiences: () => AdWordsSelector[E]): AdWordsTargeting[A, E] = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), exculdedAudiences = js.Any.fromFunction0(exculdedAudiences))
  
    __obj.asInstanceOf[AdWordsTargeting[A, E]]
  }
}

