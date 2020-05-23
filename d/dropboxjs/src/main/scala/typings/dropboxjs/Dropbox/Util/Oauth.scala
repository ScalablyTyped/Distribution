package typings.dropboxjs.Dropbox.Util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Oauth extends js.Object {
  def checkAuthStateParam(stateParam: String): Boolean
}

object Oauth {
  @scala.inline
  def apply(checkAuthStateParam: String => Boolean): Oauth = {
    val __obj = js.Dynamic.literal(checkAuthStateParam = js.Any.fromFunction1(checkAuthStateParam))
    __obj.asInstanceOf[Oauth]
  }
}

