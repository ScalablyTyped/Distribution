package typings.electron

import org.scalablytyped.runtime.Instantiable0
import typings.electron.Electron.WebContents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassWebContents extends Instantiable0[WebContents] {
  // Docs: http://electronjs.org/docs/api/web-contents
  def fromId(id: Double): WebContents = js.native
  def getAllWebContents(): js.Array[WebContents] = js.native
  def getFocusedWebContents(): WebContents = js.native
}

