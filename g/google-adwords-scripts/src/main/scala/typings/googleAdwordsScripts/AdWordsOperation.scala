package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsOperation[E] extends js.Object {
  def getErrors(): js.Array[String]
  def getResult(): E
  def isSuccessful(): Boolean
}

object AdWordsOperation {
  @scala.inline
  def apply[E](getErrors: () => js.Array[String], getResult: () => E, isSuccessful: () => Boolean): AdWordsOperation[E] = {
    val __obj = js.Dynamic.literal(getErrors = js.Any.fromFunction0(getErrors), getResult = js.Any.fromFunction0(getResult), isSuccessful = js.Any.fromFunction0(isSuccessful))
    __obj.asInstanceOf[AdWordsOperation[E]]
  }
}

