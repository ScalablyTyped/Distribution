package typings.figma.figmaMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientStorageAPI extends js.Object {
  def getAsync(key: String): js.Promise[_]
  def setAsync(key: String, value: js.Any): js.Promise[Unit]
}

object ClientStorageAPI {
  @scala.inline
  def apply(getAsync: String => js.Promise[_], setAsync: (String, js.Any) => js.Promise[Unit]): ClientStorageAPI = {
    val __obj = js.Dynamic.literal(getAsync = js.Any.fromFunction1(getAsync), setAsync = js.Any.fromFunction2(setAsync))
  
    __obj.asInstanceOf[ClientStorageAPI]
  }
}

