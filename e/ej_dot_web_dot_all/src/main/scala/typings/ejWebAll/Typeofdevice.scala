package typings.ejWebAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdevice extends js.Object {
  def isAndroid(): Boolean
  def isFlat(): Boolean
  def isIOS(): Boolean
  def isIOS7(): Boolean
  def isWindows(): Boolean
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
}

