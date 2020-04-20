package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NegativeKeywordListBuilder[NegativeKeywordList] extends AdWordsBuilder[NegativeKeywordList] {
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
}

