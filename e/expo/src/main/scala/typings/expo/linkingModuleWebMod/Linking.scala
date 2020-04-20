package typings.expo.linkingModuleWebMod

import typings.expo.expoStrings.url
import typings.expo.linkingTypesMod.URLListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Linking extends js.Object {
  @JSName("addEventListener")
  def addEventListener_url(`type`: url, listener: URLListener): Unit
  def canOpenURL(url: String): js.Promise[Boolean]
  def getInitialURL(): js.Promise[String]
  def openURL(url: String): js.Promise[Unit]
  @JSName("removeEventListener")
  def removeEventListener_url(`type`: url, listener: URLListener): Unit
}

object Linking {
  @scala.inline
  def apply(
    addEventListener: (url, URLListener) => Unit,
    canOpenURL: String => js.Promise[Boolean],
    getInitialURL: () => js.Promise[String],
    openURL: String => js.Promise[Unit],
    removeEventListener: (url, URLListener) => Unit
  ): Linking = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), canOpenURL = js.Any.fromFunction1(canOpenURL), getInitialURL = js.Any.fromFunction0(getInitialURL), openURL = js.Any.fromFunction1(openURL), removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[Linking]
  }
}

