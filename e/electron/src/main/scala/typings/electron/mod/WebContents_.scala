package typings.electron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "WebContents")
@js.native
class WebContents_ ()
  extends typings.electron.Electron.WebContents_

/* static members */
@JSImport("electron", "WebContents")
@js.native
object WebContents_ extends js.Object {
  // Docs: http://electronjs.org/docs/api/web-contents
  def fromId(id: Double): typings.electron.Electron.WebContents_ = js.native
  def getAllWebContents(): js.Array[typings.electron.Electron.WebContents_] = js.native
  def getFocusedWebContents(): typings.electron.Electron.WebContents_ = js.native
}

