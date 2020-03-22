package typings.electron.Electron

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.session")
@js.native
object session extends Instantiable0[Session_] {
  /**
    * A `Session` object, the default session object of the app.
    */
  var defaultSession: Session_ = js.native
  // Docs: http://electronjs.org/docs/api/session
  /**
    * A session instance from `partition` string. When there is an existing `Session`
    * with the same `partition`, it will be returned; otherwise a new `Session`
    * instance will be created with `options`.
    *
    * If `partition` starts with `persist:`, the page will use a persistent session
    * available to all pages in the app with the same `partition`. if there is no
    * `persist:` prefix, the page will use an in-memory session. If the `partition` is
    * empty then default session of the app will be returned.
    *
    * To create a `Session` with `options`, you have to ensure the `Session` with the
    * `partition` has never been used before. There is no way to change the `options`
    * of an existing `Session` object.
    */
  def fromPartition(partition: String): Session_ = js.native
  def fromPartition(partition: String, options: FromPartitionOptions): Session_ = js.native
}

