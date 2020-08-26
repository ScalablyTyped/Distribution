package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdWordsTargeting[A, E] extends js.Object {
  def audiences(): AdWordsSelector[A] = js.native
  def exculdedAudiences(): AdWordsSelector[E] = js.native
}

object AdWordsTargeting {
  @scala.inline
  def apply[A, E](audiences: () => AdWordsSelector[A], exculdedAudiences: () => AdWordsSelector[E]): AdWordsTargeting[A, E] = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), exculdedAudiences = js.Any.fromFunction0(exculdedAudiences))
    __obj.asInstanceOf[AdWordsTargeting[A, E]]
  }
  @scala.inline
  implicit class AdWordsTargetingOps[Self <: AdWordsTargeting[_, _], A, E] (val x: Self with (AdWordsTargeting[A, E])) extends AnyVal {
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
    def setAudiences(value: () => AdWordsSelector[A]): Self = this.set("audiences", js.Any.fromFunction0(value))
    @scala.inline
    def setExculdedAudiences(value: () => AdWordsSelector[E]): Self = this.set("exculdedAudiences", js.Any.fromFunction0(value))
  }
  
}

