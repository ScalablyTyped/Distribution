package typings.expo.anon

import typings.expo.appLoadingMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnError extends Props {
  var onError: Null = js.native
  var onFinish: Null = js.native
  var startAsync: Null = js.native
}

object OnError {
  @scala.inline
  def apply(onError: Null, onFinish: Null, startAsync: Null): OnError = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], onFinish = onFinish.asInstanceOf[js.Any], startAsync = startAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnError]
  }
  @scala.inline
  implicit class OnErrorOps[Self <: OnError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnError(value: Null): Self = this.set("onError", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnFinish(value: Null): Self = this.set("onFinish", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartAsync(value: Null): Self = this.set("startAsync", value.asInstanceOf[js.Any])
  }
  
}

