package typings
package googleDashMapsLib.googleDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-maps", JSImport.Namespace)
@js.native
object googleDashMapsModMembers extends js.Object {
  var CHANNEL: java.lang.String = js.native
  var CLIENT: java.lang.String = js.native
  var KEY: java.lang.String = js.native
  var LANGUAGE: java.lang.String = js.native
  var LIBRARIES: js.Array[java.lang.String] = js.native
  var REGION: java.lang.String = js.native
  var URL: java.lang.String = js.native
  var VERSION: java.lang.String = js.native
  var WINDOW_CALLBACK_NAME: java.lang.String = js.native
  def createLoader(): scala.Unit = js.native
  def createUrl(): java.lang.String = js.native
  def isLoaded(): scala.Boolean = js.native
  def load(): scala.Unit = js.native
  def load(callBack: googleDashMapsLib.googleDashMapsMod.GoogleMapsLoaderNs.CallBack): scala.Unit = js.native
  def makeMock(): scala.Unit = js.native
  def onLoad(): scala.Unit = js.native
  def onLoad(callBack: googleDashMapsLib.googleDashMapsMod.GoogleMapsLoaderNs.CallBack): scala.Unit = js.native
  def release(callBack: js.Function): scala.Unit = js.native
}

