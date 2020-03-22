package typings.electron

import org.scalablytyped.runtime.Instantiable0
import typings.electron.Electron.WebContents_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofWebContents extends Instantiable0[WebContents_] {
  // Docs: http://electronjs.org/docs/api/web-contents
  /**
    * A WebContents instance with the given ID.
    */
  def fromId(id: Double): WebContents_ = js.native
  /**
    * An array of all `WebContents` instances. This will contain web contents for all
    * windows, webviews, opened devtools, and devtools extension background pages.
    */
  def getAllWebContents(): js.Array[WebContents_] = js.native
  /**
    * The web contents that is focused in this application, otherwise returns `null`.
    */
  def getFocusedWebContents(): WebContents_ = js.native
}

