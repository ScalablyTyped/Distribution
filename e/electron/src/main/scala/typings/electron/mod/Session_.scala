package typings.electron.mod

import typings.electron.Electron.FromPartitionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "Session")
@js.native
class Session_ ()
  extends typings.electron.Electron.Session_

/* static members */
@JSImport("electron", "Session")
@js.native
object Session_ extends js.Object {
  /**
    * A Session object, the default session object of the app.
    */
  var defaultSession: js.UndefOr[typings.electron.Electron.Session_] = js.native
  // Docs: http://electronjs.org/docs/api/session
  /**
    * If partition starts with persist:, the page will use a persistent session
    * available to all pages in the app with the same partition. if there is no
    * persist: prefix, the page will use an in-memory session. If the partition is
    * empty then default session of the app will be returned. To create a Session with
    * options, you have to ensure the Session with the partition has never been used
    * before. There is no way to change the options of an existing Session object.
    */
  def fromPartition(partition: String): typings.electron.Electron.Session_ = js.native
  def fromPartition(partition: String, options: FromPartitionOptions): typings.electron.Electron.Session_ = js.native
}

