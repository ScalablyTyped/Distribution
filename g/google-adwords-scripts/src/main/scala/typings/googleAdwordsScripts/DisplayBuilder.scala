package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Display
@js.native
trait DisplayBuilder[T] extends AdWordsBuilder[T] {
  
  def exclude(): AdWordsOperation[T] = js.native
  
  def withCpc(cpc: Double): T = js.native
  
  def withCpm(cpm: Double): T = js.native
}
object DisplayBuilder {
  
  @scala.inline
  def apply[T](
    build: () => AdWordsOperation[T],
    exclude: () => AdWordsOperation[T],
    withCpc: Double => T,
    withCpm: Double => T
  ): DisplayBuilder[T] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm))
    __obj.asInstanceOf[DisplayBuilder[T]]
  }
  
  @scala.inline
  implicit class DisplayBuilderOps[Self <: DisplayBuilder[_], T] (val x: Self with DisplayBuilder[T]) extends AnyVal {
    
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
    def setExclude(value: () => AdWordsOperation[T]): Self = this.set("exclude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWithCpc(value: Double => T): Self = this.set("withCpc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithCpm(value: Double => T): Self = this.set("withCpm", js.Any.fromFunction1(value))
  }
}
