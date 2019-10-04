package typings.electron.ElectronNs

import typings.electron.electronStrings.`expired-overwrite`
import typings.electron.electronStrings.changed
import typings.electron.electronStrings.evicted
import typings.electron.electronStrings.expired
import typings.electron.electronStrings.explicit
import typings.electron.electronStrings.overwrite
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.Cookies")
@js.native
class Cookies () extends EventEmitter {
  def addListener(
    event: changed,
    listener: js.Function4[
      /* event */ Event, 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Writes any unwritten cookies data to disk.
    */
  def flushStore(): js.Promise[Unit] = js.native
  /**
    * Writes any unwritten cookies data to disk. Deprecated Soon
    */
  def flushStore(callback: js.Function): Unit = js.native
  /**
    * Sends a request to get all cookies matching filter, and resolves a promise with
    * the response.
    */
  def get(filter: Filter): js.Promise[js.Array[Cookie]] = js.native
  /**
    * Sends a request to get all cookies matching filter, callback will be called with
    * callback(error, cookies) on complete. Deprecated Soon
    */
  def get(filter: Filter, callback: js.Function2[/* error */ Error, /* cookies */ js.Array[Cookie], Unit]): Unit = js.native
  // Docs: http://electronjs.org/docs/api/cookies
  /**
    * Emitted when a cookie is changed because it was added, edited, removed, or
    * expired.
    */
  def on(
    event: changed,
    listener: js.Function4[
      /* event */ Event, 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  def once(
    event: changed,
    listener: js.Function4[
      /* event */ Event, 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Removes the cookies matching url and name
    */
  def remove(url: String, name: String): js.Promise[Unit] = js.native
  /**
    * Removes the cookies matching url and name, callback will called with callback()
    * on complete. Deprecated Soon
    */
  def remove(url: String, name: String, callback: js.Function): Unit = js.native
  def removeListener(
    event: changed,
    listener: js.Function4[
      /* event */ Event, 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Sets a cookie with details.
    */
  def set(details: Details): js.Promise[Unit] = js.native
  /**
    * Sets a cookie with details, callback will be called with callback(error) on
    * complete. Deprecated Soon
    */
  def set(details: Details, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
}

