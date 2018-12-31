package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsTargeting[A, E] extends js.Object {
  def audiences(): AdWordsSelector[A]
  def exculdedAudiences(): AdWordsSelector[E]
}

