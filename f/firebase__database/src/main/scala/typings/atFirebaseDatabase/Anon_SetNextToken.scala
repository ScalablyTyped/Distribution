package typings.atFirebaseDatabase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SetNextToken extends js.Object {
  def setNextToken(token: js.Any): Unit
  def setToken(token: js.Any): js.Promise[Unit]
}

object Anon_SetNextToken {
  @scala.inline
  def apply(setNextToken: js.Any => Unit, setToken: js.Any => js.Promise[Unit]): Anon_SetNextToken = {
    val __obj = js.Dynamic.literal(setNextToken = js.Any.fromFunction1(setNextToken), setToken = js.Any.fromFunction1(setToken))
  
    __obj.asInstanceOf[Anon_SetNextToken]
  }
}

