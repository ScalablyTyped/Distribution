package typings.expo.anon

import typings.expo.appLoadingMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnError extends Props {
  var onError: Null
  var onFinish: Null
  var startAsync: Null
}

object OnError {
  @scala.inline
  def apply(onError: Null, onFinish: Null, startAsync: Null): OnError = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], onFinish = onFinish.asInstanceOf[js.Any], startAsync = startAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnError]
  }
}

