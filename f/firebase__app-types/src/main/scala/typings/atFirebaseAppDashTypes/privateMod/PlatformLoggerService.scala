package typings.atFirebaseAppDashTypes.privateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformLoggerService extends js.Object {
  def getPlatformInfoString(): String
}

object PlatformLoggerService {
  @scala.inline
  def apply(getPlatformInfoString: () => String): PlatformLoggerService = {
    val __obj = js.Dynamic.literal(getPlatformInfoString = js.Any.fromFunction0(getPlatformInfoString))
  
    __obj.asInstanceOf[PlatformLoggerService]
  }
}

