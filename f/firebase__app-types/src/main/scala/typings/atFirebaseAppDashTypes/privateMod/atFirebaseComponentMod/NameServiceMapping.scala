package typings.atFirebaseAppDashTypes.privateMod.atFirebaseComponentMod

import typings.atFirebaseAppDashTypes.privateMod.PlatformLoggerService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameServiceMapping extends js.Object {
  var `platform-logger`: PlatformLoggerService
}

object NameServiceMapping {
  @scala.inline
  def apply(`platform-logger`: PlatformLoggerService): NameServiceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("platform-logger")(`platform-logger`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameServiceMapping]
  }
}

