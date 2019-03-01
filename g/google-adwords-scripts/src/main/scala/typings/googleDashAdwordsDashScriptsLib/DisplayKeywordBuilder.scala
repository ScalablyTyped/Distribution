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
    build: js.Function0[AdWordsOperation[DisplayKeywordBuilder[DisplayKeyword]]],
    exclude: js.Function0[AdWordsOperation[DisplayKeywordBuilder[DisplayKeyword]]],
    withCpc: js.Function1[scala.Double, DisplayKeywordBuilder[DisplayKeyword]],
    withCpm: js.Function1[scala.Double, DisplayKeywordBuilder[DisplayKeyword]],
    withText: js.Function1[java.lang.String, DisplayKeywordBuilder[DisplayKeyword]]
  ): DisplayKeywordBuilder[DisplayKeyword] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("exclude")(exclude)
    __obj.updateDynamic("withCpc")(withCpc)
    __obj.updateDynamic("withCpm")(withCpm)
    __obj.updateDynamic("withText")(withText)
    __obj.asInstanceOf[DisplayKeywordBuilder[DisplayKeyword]]
  }
}

