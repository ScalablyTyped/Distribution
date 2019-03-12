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
  def apply[E](getErrors: () => js.Array[java.lang.String], getResult: () => E, isSuccessful: () => scala.Boolean): AdWordsOperation[E] = {
    val __obj = js.Dynamic.literal(getErrors = js.Any.fromFunction0(getErrors), getResult = js.Any.fromFunction0(getResult), isSuccessful = js.Any.fromFunction0(isSuccessful))
  
    __obj.asInstanceOf[AdWordsOperation[E]]
  }
}

