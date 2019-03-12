package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayKeywordBuilder[DisplayKeyword] extends DisplayBuilder[DisplayKeywordBuilder[DisplayKeyword]] {
  def withText(text: java.lang.String): DisplayKeywordBuilder[DisplayKeyword]
}

object DisplayKeywordBuilder {
  @scala.inline
  def apply[DisplayKeyword](
    build: () => AdWordsOperation[DisplayKeywordBuilder[DisplayKeyword]],
    exclude: () => AdWordsOperation[DisplayKeywordBuilder[DisplayKeyword]],
    withCpc: scala.Double => DisplayKeywordBuilder[DisplayKeyword],
    withCpm: scala.Double => DisplayKeywordBuilder[DisplayKeyword],
    withText: java.lang.String => DisplayKeywordBuilder[DisplayKeyword]
  ): DisplayKeywordBuilder[DisplayKeyword] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withText = js.Any.fromFunction1(withText))
  
    __obj.asInstanceOf[DisplayKeywordBuilder[DisplayKeyword]]
  }
}

