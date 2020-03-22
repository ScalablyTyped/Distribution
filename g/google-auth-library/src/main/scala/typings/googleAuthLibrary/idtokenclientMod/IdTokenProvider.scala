package typings.googleAuthLibrary.idtokenclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdTokenProvider extends js.Object {
  def fetchIdToken(targetAudience: String): js.Promise[String]
}

object IdTokenProvider {
  @scala.inline
  def apply(fetchIdToken: String => js.Promise[String]): IdTokenProvider = {
    val __obj = js.Dynamic.literal(fetchIdToken = js.Any.fromFunction1(fetchIdToken))
  
    __obj.asInstanceOf[IdTokenProvider]
  }
}

