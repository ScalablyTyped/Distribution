package typings.gitlab.distSrcCoreInfrastructureMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseRequestOptions
  extends Sudo
     with /* key */ StringDictionary[js.Any]

object BaseRequestOptions {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, sudo: String | Double = null): BaseRequestOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseRequestOptions]
  }
}

