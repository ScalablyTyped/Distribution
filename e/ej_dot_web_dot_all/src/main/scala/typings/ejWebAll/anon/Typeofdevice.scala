package typings.ejWebAll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdevice extends js.Object {
  def isAndroid(): Boolean = js.native
  def isFlat(): Boolean = js.native
  def isIOS(): Boolean = js.native
  def isIOS7(): Boolean = js.native
  def isWindows(): Boolean = js.native
}

object Typeofdevice {
  @scala.inline
  def apply(
    isAndroid: () => Boolean,
    isFlat: () => Boolean,
    isIOS: () => Boolean,
    isIOS7: () => Boolean,
    isWindows: () => Boolean
  ): Typeofdevice = {
    val __obj = js.Dynamic.literal(isAndroid = js.Any.fromFunction0(isAndroid), isFlat = js.Any.fromFunction0(isFlat), isIOS = js.Any.fromFunction0(isIOS), isIOS7 = js.Any.fromFunction0(isIOS7), isWindows = js.Any.fromFunction0(isWindows))
    __obj.asInstanceOf[Typeofdevice]
  }
  @scala.inline
  implicit class TypeofdeviceOps[Self <: Typeofdevice] (val x: Self) extends AnyVal {
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
    def setIsAndroid(value: () => Boolean): Self = this.set("isAndroid", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFlat(value: () => Boolean): Self = this.set("isFlat", js.Any.fromFunction0(value))
    @scala.inline
    def setIsIOS(value: () => Boolean): Self = this.set("isIOS", js.Any.fromFunction0(value))
    @scala.inline
    def setIsIOS7(value: () => Boolean): Self = this.set("isIOS7", js.Any.fromFunction0(value))
    @scala.inline
    def setIsWindows(value: () => Boolean): Self = this.set("isWindows", js.Any.fromFunction0(value))
  }
  
}

