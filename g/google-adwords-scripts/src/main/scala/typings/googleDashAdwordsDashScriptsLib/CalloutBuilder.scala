package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalloutBuilder[Callout]
  extends AdWordsBuilder[Callout]
     with hasMobilePreferredBuilder[CalloutBuilder[Callout]]
     with hasSchedulesBuilder[CalloutBuilder[Callout]]
     with hasStartAndEndDateBuilder[CalloutBuilder[Callout]] {
  def withText(text: java.lang.String): CalloutBuilder[Callout] = js.native
}

