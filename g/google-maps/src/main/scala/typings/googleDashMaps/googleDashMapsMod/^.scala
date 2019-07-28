package typings.googleDashMaps.googleDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-maps", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var CHANNEL: String = js.native
  var CLIENT: String = js.native
  var KEY: String = js.native
  var LANGUAGE: String = js.native
  var LIBRARIES: js.Array[String] = js.native
  var REGION: String = js.native
  var URL: String = js.native
  var VERSION: String = js.native
  var WINDOW_CALLBACK_NAME: String = js.native
  def createLoader(): Unit = js.native
  def createUrl(): String = js.native
  def isLoaded(): Boolean = js.native
  def load(): Unit = js.native
  def load(callBack: CallBack): Unit = js.native
  def makeMock(): Unit = js.native
  def onLoad(): Unit = js.native
  def onLoad(callBack: CallBack): Unit = js.native
  def release(callBack: js.Function): Unit = js.native
}

