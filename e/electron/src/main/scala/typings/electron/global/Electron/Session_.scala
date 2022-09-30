package typings.electron.global.Electron

import typings.electron.Electron.FromPartitionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.Session")
@js.native
open class Session_ ()
  extends typings.electron.Electron.Session_
object Session_ {
  
  @JSGlobal("Electron.Session")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A `Session` object, the default session object of the app.
    */
  /* static member */
  @JSGlobal("Electron.Session.defaultSession")
  @js.native
  def defaultSession: typings.electron.Electron.Session_ = js.native
  inline def defaultSession_=(x: typings.electron.Electron.Session_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSession")(x.asInstanceOf[js.Any])
  
  // Docs: https://electronjs.org/docs/api/session
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
  /* static member */
  inline def fromPartition(partition: String): typings.electron.Electron.Session_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPartition")(partition.asInstanceOf[js.Any]).asInstanceOf[typings.electron.Electron.Session_]
  inline def fromPartition(partition: String, options: FromPartitionOptions): typings.electron.Electron.Session_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPartition")(partition.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.electron.Electron.Session_]
}
