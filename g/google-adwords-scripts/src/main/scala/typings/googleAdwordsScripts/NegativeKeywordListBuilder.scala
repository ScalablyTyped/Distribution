package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NegativeKeywordListBuilder[NegativeKeywordList] extends AdWordsBuilder[NegativeKeywordList] {
  
  def withName(name: String): NegativeKeywordListBuilder[NegativeKeywordList] = js.native
}
object NegativeKeywordListBuilder {
  
  @scala.inline
  def apply[NegativeKeywordList](
    build: () => AdWordsOperation[NegativeKeywordList],
    withName: String => NegativeKeywordListBuilder[NegativeKeywordList]
  ): NegativeKeywordListBuilder[NegativeKeywordList] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[NegativeKeywordListBuilder[NegativeKeywordList]]
  }
  
  @scala.inline
  implicit class NegativeKeywordListBuilderMutableBuilder[Self <: NegativeKeywordListBuilder[_], NegativeKeywordList] (val x: Self with NegativeKeywordListBuilder[NegativeKeywordList]) extends AnyVal {
    
    @scala.inline
    def setWithName(value: String => NegativeKeywordListBuilder[NegativeKeywordList]): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
