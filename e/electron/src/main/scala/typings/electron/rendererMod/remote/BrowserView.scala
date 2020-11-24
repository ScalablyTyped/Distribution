package typings.electron.rendererMod.remote

import typings.electron.Electron.BrowserViewConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron/renderer", "remote.BrowserView")
@js.native
// Docs: https://electronjs.org/docs/api/browser-view
/**
  * BrowserView
  */
class BrowserView ()
  extends typings.electron.Electron.BrowserView {
  def this(options: BrowserViewConstructorOptions) = this()
}
