package typings.firebaseAppTypes.privateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformLoggerService extends js.Object {
  
  def getPlatformInfoString(): String = js.native
}
object PlatformLoggerService {
  
  @scala.inline
  def apply(getPlatformInfoString: () => String): PlatformLoggerService = {
    val __obj = js.Dynamic.literal(getPlatformInfoString = js.Any.fromFunction0(getPlatformInfoString))
    __obj.asInstanceOf[PlatformLoggerService]
  }
  
  @scala.inline
  implicit class PlatformLoggerServiceOps[Self <: PlatformLoggerService] (val x: Self) extends AnyVal {
    
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
    def setGetPlatformInfoString(value: () => String): Self = this.set("getPlatformInfoString", js.Any.fromFunction0(value))
  }
}
