package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NegativeKeywordListBuilder[NegativeKeywordList] extends AdWordsBuilder[NegativeKeywordList] {
  def withName(name: java.lang.String): NegativeKeywordListBuilder[NegativeKeywordList]
}

object NegativeKeywordListBuilder {
  @scala.inline
  def apply[NegativeKeywordList](
    build: js.Function0[AdWordsOperation[NegativeKeywordList]],
    withName: js.Function1[java.lang.String, NegativeKeywordListBuilder[NegativeKeywordList]]
  ): NegativeKeywordListBuilder[NegativeKeywordList] = {
    val __obj = js.Dynamic.literal(build = build, withName = withName)
  
    __obj.asInstanceOf[NegativeKeywordListBuilder[NegativeKeywordList]]
  }
}

