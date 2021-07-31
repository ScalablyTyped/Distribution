package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NegativeKeywordListBuilder[NegativeKeywordList]
  extends StObject
     with AdWordsBuilder[NegativeKeywordList] {
  
  def withName(name: String): NegativeKeywordListBuilder[NegativeKeywordList]
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
  implicit class NegativeKeywordListBuilderMutableBuilder[Self <: NegativeKeywordListBuilder[?], NegativeKeywordList] (val x: Self & NegativeKeywordListBuilder[NegativeKeywordList]) extends AnyVal {
    
    @scala.inline
    def setWithName(value: String => NegativeKeywordListBuilder[NegativeKeywordList]): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
