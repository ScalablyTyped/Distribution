package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  stream ? :boolean} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
trait streambooleanBaseRequestO
  extends /* key */ StringDictionary[js.Any] {
  var stream: js.UndefOr[Boolean] = js.undefined
  var sudo: js.UndefOr[String | Double] = js.undefined
}

object streambooleanBaseRequestO {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    stream: js.UndefOr[Boolean] = js.undefined,
    sudo: String | Double = null
  ): streambooleanBaseRequestO = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.get.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[streambooleanBaseRequestO]
  }
}

