package typings.electron.global.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.WebContents")
@js.native
class WebContents_ ()
  extends typings.electron.Electron.WebContents_
object WebContents_ {
  
  // Docs: https://electronjs.org/docs/api/web-contents
  /**
    * A WebContents instance with the given ID.
    */
  /* static member */
  @JSGlobal("Electron.WebContents.fromId")
  @js.native
  def fromId(id: Double): typings.electron.Electron.WebContents_ = js.native
  
  /**
    * An array of all `WebContents` instances. This will contain web contents for all
    * windows, webviews, opened devtools, and devtools extension background pages.
    */
  /* static member */
  @JSGlobal("Electron.WebContents.getAllWebContents")
  @js.native
  def getAllWebContents(): js.Array[typings.electron.Electron.WebContents_] = js.native
  
  /**
    * The web contents that is focused in this application, otherwise returns `null`.
    */
  /* static member */
  @JSGlobal("Electron.WebContents.getFocusedWebContents")
  @js.native
  def getFocusedWebContents(): typings.electron.Electron.WebContents_ = js.native
}
