package typings.expo

import typings.expo.buildLaunchAppLoadingMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnError extends Props {
  var onError: Null
  var onFinish: Null
  var startAsync: Null
}

object Anon_OnError {
  @scala.inline
  def apply(onError: Null, onFinish: Null, startAsync: Null): Anon_OnError = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], onFinish = onFinish.asInstanceOf[js.Any], startAsync = startAsync.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_OnError]
  }
}

