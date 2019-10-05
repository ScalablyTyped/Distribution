package typings.electron.electronMod

import org.scalablytyped.runtime.Instantiable0
import typings.electron.Electron.FromPartitionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "Session")
@js.native
class Session ()
  extends typings.electron.Electron.Session

/* static members */
@JSImport("electron", "Session")
@js.native
object Session extends js.Object {
  /**
    * A Session object, the default session object of the app.
    */
  var defaultSession: js.UndefOr[typings.electron.Electron.Session] = js.native
  // Docs: http://electronjs.org/docs/api/session
  /**
    * If partition starts with persist:, the page will use a persistent session
    * available to all pages in the app with the same partition. if there is no
    * persist: prefix, the page will use an in-memory session. If the partition is
    * empty then default session of the app will be returned. To create a Session with
    * options, you have to ensure the Session with the partition has never been used
    * before. There is no way to change the options of an existing Session object.
    */
  def fromPartition(partition: String): typings.electron.Electron.Session = js.native
  def fromPartition(partition: String, options: FromPartitionOptions): typings.electron.Electron.Session = js.native
}

@JSImport("electron", "session")
@js.native
object session
  extends Instantiable0[typings.electron.Electron.Session] {
  /**
    * A Session object, the default session object of the app.
    */
  var defaultSession: js.UndefOr[typings.electron.Electron.Session] = js.native
  // Docs: http://electronjs.org/docs/api/session
  /**
    * If partition starts with persist:, the page will use a persistent session
    * available to all pages in the app with the same partition. if there is no
    * persist: prefix, the page will use an in-memory session. If the partition is
    * empty then default session of the app will be returned. To create a Session with
    * options, you have to ensure the Session with the partition has never been used
    * before. There is no way to change the options of an existing Session object.
    */
  def fromPartition(partition: String): typings.electron.Electron.Session = js.native
  def fromPartition(partition: String, options: FromPartitionOptions): typings.electron.Electron.Session = js.native
}

