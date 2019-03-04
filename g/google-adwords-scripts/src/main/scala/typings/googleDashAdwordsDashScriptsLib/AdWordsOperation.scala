package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsOperation[E] extends js.Object {
  def getErrors(): js.Array[java.lang.String]
  def getResult(): E
  def isSuccessful(): scala.Boolean
}

object AdWordsOperation {
  @scala.inline
  def apply[E](
    getErrors: js.Function0[js.Array[java.lang.String]],
    getResult: js.Function0[E],
    isSuccessful: js.Function0[scala.Boolean]
  ): AdWordsOperation[E] = {
    val __obj = js.Dynamic.literal(getErrors = getErrors, getResult = getResult, isSuccessful = isSuccessful)
  
    __obj.asInstanceOf[AdWordsOperation[E]]
  }
}

