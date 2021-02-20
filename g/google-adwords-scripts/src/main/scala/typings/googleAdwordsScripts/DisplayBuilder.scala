package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
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
  implicit class DisplayBuilderMutableBuilder[Self <: DisplayBuilder[_], T] (val x: Self with DisplayBuilder[T]) extends AnyVal {
    
    @scala.inline
    def setExclude(value: () => AdWordsOperation[T]): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWithCpc(value: Double => T): Self = StObject.set(x, "withCpc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithCpm(value: Double => T): Self = StObject.set(x, "withCpm", js.Any.fromFunction1(value))
  }
}
