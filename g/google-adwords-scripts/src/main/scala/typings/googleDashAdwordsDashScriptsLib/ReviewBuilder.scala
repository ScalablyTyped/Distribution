package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewBuilder[Review]
  extends AdWordsBuilder[Review]
     with hasMobilePreferredBuilder[ReviewBuilder[Review]]
     with hasStartAndEndDateBuilder[ReviewBuilder[Review]]
     with hasSchedulesBuilder[ReviewBuilder[Review]] {
  def withExactlyQuoted(exactlyQuoted: scala.Boolean): ReviewBuilder[Review] = js.native
  def withSourceName(sourceName: java.lang.String): ReviewBuilder[Review] = js.native
  def withSourceUrl(sourceUrl: java.lang.String): ReviewBuilder[Review] = js.native
  def withText(text: java.lang.String): ReviewBuilder[Review] = js.native
}

