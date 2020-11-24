package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdWordsBuilder[E] extends js.Object {
  
  def build(): AdWordsOperation[E] = js.native
}
object AdWordsBuilder {
  
  @scala.inline
  def apply[E](build: () => AdWordsOperation[E]): AdWordsBuilder[E] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build))
    __obj.asInstanceOf[AdWordsBuilder[E]]
  }
  
  @scala.inline
  implicit class AdWordsBuilderOps[Self <: AdWordsBuilder[_], E] (val x: Self with AdWordsBuilder[E]) extends AnyVal {
    
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
    def setBuild(value: () => AdWordsOperation[E]): Self = this.set("build", js.Any.fromFunction0(value))
  }
}
