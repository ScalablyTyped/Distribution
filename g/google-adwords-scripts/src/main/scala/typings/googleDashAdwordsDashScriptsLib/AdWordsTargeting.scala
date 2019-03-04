package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsTargeting[A, E] extends js.Object {
  def audiences(): AdWordsSelector[A]
  def exculdedAudiences(): AdWordsSelector[E]
}

object AdWordsTargeting {
  @scala.inline
  def apply[A, E](audiences: js.Function0[AdWordsSelector[A]], exculdedAudiences: js.Function0[AdWordsSelector[E]]): AdWordsTargeting[A, E] = {
    val __obj = js.Dynamic.literal(audiences = audiences, exculdedAudiences = exculdedAudiences)
  
    __obj.asInstanceOf[AdWordsTargeting[A, E]]
  }
}

