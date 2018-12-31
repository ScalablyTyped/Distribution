package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.Cookies")
@js.native
class Cookies () extends EventEmitter {
  def addListener(
    event: electronLib.electronLibStrings.changed,
    listener: js.Function4[
      /* event */ Event, 
      /* cookie */ Cookie, 
      /* cause */ electronLib.electronLibStrings.explicit | electronLib.electronLibStrings.overwrite | electronLib.electronLibStrings.expired | electronLib.electronLibStrings.evicted | electronLib.electronLibStrings.`expired-overwrite`, 
      /* removed */ scala.Boolean, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Writes any unwritten cookies data to disk.
    */
  def flushStore(callback: js.Function): scala.Unit = js.native
  /**
    * Sends a request to get all cookies matching filter, callback will be called with
    * callback(error, cookies) on complete.
    */
  def get(
    filter: Filter,
    callback: js.Function2[/* error */ nodeLib.Error, /* cookies */ js.Array[Cookie], scala.Unit]
  ): scala.Unit = js.native
  // Docs: http://electronjs.org/docs/api/cookies
  /**
    * Emitted when a cookie is changed because it was added, edited, removed, or
    * expired.
    */
  def on(
    event: electronLib.electronLibStrings.changed,
    listener: js.Function4[
      /* event */ Event, 
      /* cookie */ Cookie, 
      /* cause */ electronLib.electronLibStrings.explicit | electronLib.electronLibStrings.overwrite | electronLib.electronLibStrings.expired | electronLib.electronLibStrings.evicted | electronLib.electronLibStrings.`expired-overwrite`, 
      /* removed */ scala.Boolean, 
      scala.Unit
    ]
  ): this.type = js.native
  def once(
    event: electronLib.electronLibStrings.changed,
    listener: js.Function4[
      /* event */ Event, 
      /* cookie */ Cookie, 
      /* cause */ electronLib.electronLibStrings.explicit | electronLib.electronLibStrings.overwrite | electronLib.electronLibStrings.expired | electronLib.electronLibStrings.evicted | electronLib.electronLibStrings.`expired-overwrite`, 
      /* removed */ scala.Boolean, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Removes the cookies matching url and name, callback will called with callback()
    * on complete.
    */
  def remove(url: java.lang.String, name: java.lang.String, callback: js.Function): scala.Unit = js.native
  def removeListener(
    event: electronLib.electronLibStrings.changed,
    listener: js.Function4[
      /* event */ Event, 
      /* cookie */ Cookie, 
      /* cause */ electronLib.electronLibStrings.explicit | electronLib.electronLibStrings.overwrite | electronLib.electronLibStrings.expired | electronLib.electronLibStrings.evicted | electronLib.electronLibStrings.`expired-overwrite`, 
      /* removed */ scala.Boolean, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Sets a cookie with details, callback will be called with callback(error) on
    * complete.
    */
  def set(details: Details, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
}

