package typings.electron.global.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.WebContents")
@js.native
class WebContents_ ()
  extends typings.electron.Electron.WebContents_
object WebContents_ {
  
  @JSGlobal("Electron.WebContents")
  @js.native
  val ^ : js.Any = js.native
  
  // Docs: https://electronjs.org/docs/api/web-contents
  /**
    * A WebContents instance with the given ID.
    */
  /* static member */
  @scala.inline
  def fromId(id: Double): typings.electron.Electron.WebContents_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(id.asInstanceOf[js.Any]).asInstanceOf[typings.electron.Electron.WebContents_]
  
  /**
    * An array of all `WebContents` instances. This will contain web contents for all
    * windows, webviews, opened devtools, and devtools extension background pages.
    */
  /* static member */
  @scala.inline
  def getAllWebContents(): js.Array[typings.electron.Electron.WebContents_] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllWebContents")().asInstanceOf[js.Array[typings.electron.Electron.WebContents_]]
  
  /**
    * The web contents that is focused in this application, otherwise returns `null`.
    */
  /* static member */
  @scala.inline
  def getFocusedWebContents(): typings.electron.Electron.WebContents_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusedWebContents")().asInstanceOf[typings.electron.Electron.WebContents_]
}
