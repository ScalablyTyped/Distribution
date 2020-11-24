package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayKeywordBuilder[DisplayKeyword] extends DisplayBuilder[DisplayKeywordBuilder[DisplayKeyword]] {
  
  def withText(text: String): DisplayKeywordBuilder[DisplayKeyword] = js.native
}
object DisplayKeywordBuilder {
  
  @scala.inline
  def apply[DisplayKeyword](
    build: () => AdWordsOperation[DisplayKeywordBuilder[DisplayKeyword]],
    exclude: () => AdWordsOperation[DisplayKeywordBuilder[DisplayKeyword]],
    withCpc: Double => DisplayKeywordBuilder[DisplayKeyword],
    withCpm: Double => DisplayKeywordBuilder[DisplayKeyword],
    withText: String => DisplayKeywordBuilder[DisplayKeyword]
  ): DisplayKeywordBuilder[DisplayKeyword] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withText = js.Any.fromFunction1(withText))
    __obj.asInstanceOf[DisplayKeywordBuilder[DisplayKeyword]]
  }
  
  @scala.inline
  implicit class DisplayKeywordBuilderOps[Self <: DisplayKeywordBuilder[_], DisplayKeyword] (val x: Self with DisplayKeywordBuilder[DisplayKeyword]) extends AnyVal {
    
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
    def setWithText(value: String => DisplayKeywordBuilder[DisplayKeyword]): Self = this.set("withText", js.Any.fromFunction1(value))
  }
}
