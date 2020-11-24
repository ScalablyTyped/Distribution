package typings.expressSession.mod

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-session", "Store")
@js.native
abstract class Store () extends EventEmitter {
  
  /** Returns all sessions in the store */
  // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/38783, https://github.com/expressjs/session/pull/700#issuecomment-540855551
  var all: js.UndefOr[
    js.Function1[
      /* callback */ js.Function2[
        /* err */ js.Any, 
        /* obj */ js.UndefOr[js.Array[SessionData] | StringDictionary[SessionData] | Null], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /** Delete all sessions from the store. */
  var clear: js.UndefOr[
    js.Function1[/* callback */ js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Any], Unit]], Unit]
  ] = js.native
  
  def createSession(req: Request_[ParamsDictionary, _, _, Query], session: SessionData): Unit = js.native
  
  /** Destroys the dession with the given session ID. */
  def destroy(sid: String): Unit = js.native
  def destroy(sid: String, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  /**
    * Gets the session from the store given a session ID and passes it to `callback`.
    *
    * The `session` argument should be a `Session` object if found, otherwise `null` or `undefined` if the session was not found and there was no error.
    * A special case is made when `error.code === 'ENOENT'` to act like `callback(null, null)`.
    */
  def get(
    sid: String,
    callback: js.Function2[/* err */ js.Any, /* session */ js.UndefOr[SessionData | Null], Unit]
  ): Unit = js.native
  
  /** Returns the amount of sessions in the store. */
  var length: js.UndefOr[
    js.Function1[/* callback */ js.Function2[/* err */ js.Any, /* length */ Double, Unit], Unit]
  ] = js.native
  
  def load(sid: String, callback: js.Function2[/* err */ js.Any, /* session */ js.UndefOr[SessionData], _]): Unit = js.native
  
  def regenerate(
    req: Request_[ParamsDictionary, _, _, Query],
    callback: js.Function1[/* err */ js.UndefOr[js.Any], _]
  ): Unit = js.native
  
  /** Upsert a session in the store given a session ID and `SessionData` */
  def set(sid: String, session: SessionData): Unit = js.native
  def set(sid: String, session: SessionData, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  /** "Touches" a given session, resetting the idle timer. */
  var touch: js.UndefOr[
    js.Function3[
      /* sid */ String, 
      /* session */ SessionData, 
      /* callback */ js.UndefOr[js.Function0[Unit]], 
      Unit
    ]
  ] = js.native
}
