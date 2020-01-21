package typings.electronStore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
Simple data persistence for your [Electron](https://electronjs.org) app or module - Save and load user preferences, app state, cache, etc.
*/
@js.native
trait ElectronStore[T]
  extends typings.conf.mod.^[T] {
  /**
  	Open the storage file in the user's editor.
  	*/
  def openInEditor(): Unit = js.native
}

