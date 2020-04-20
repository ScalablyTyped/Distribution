package typings.expo

import typings.expo.appLoadingMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnError extends Props {
  var onError: Null
  var onFinish: Null
  var startAsync: Null
}

object AnonOnError {
  @scala.inline
  def apply(onError: Null, onFinish: Null, startAsync: Null): AnonOnError = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], onFinish = onFinish.asInstanceOf[js.Any], startAsync = startAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnError]
  }
}

