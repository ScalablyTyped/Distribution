package typings.electron.Electron

import typings.electron.electronStrings.changed
import typings.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookies extends EventEmitter {
  @JSName("addListener")
  def addListener_changed(event: changed, listener: js.Function): this.type = js.native
  /**
    * A promise which resolves when the cookie store has been flushed
    * 
  Writes any unwritten cookies data to disk.
    */
  def flushStore(): js.Promise[Unit] = js.native
  /**
    * A promise which resolves an array of cookie objects.
    *
    * Sends a request to get all cookies matching `filter`, and resolves a promise
    * with the response.
    */
  def get(filter: CookiesGetFilter): js.Promise[js.Array[Cookie]] = js.native
  // Docs: http://electronjs.org/docs/api/cookies
  /**
    * Emitted when a cookie is changed because it was added, edited, removed, or
    * expired.
    */
  @JSName("on")
  def on_changed(event: changed, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_changed(event: changed, listener: js.Function): this.type = js.native
  /**
    * A promise which resolves when the cookie has been removed
    * 
  Removes the cookies matching `url` and `name`
    */
  def remove(url: String, name: String): js.Promise[Unit] = js.native
  @JSName("removeListener")
  def removeListener_changed(event: changed, listener: js.Function): this.type = js.native
  /**
    * A promise which resolves when the cookie has been set
    * 
  Sets a cookie with `details`.
    */
  def set(details: CookiesSetDetails): js.Promise[Unit] = js.native
}

