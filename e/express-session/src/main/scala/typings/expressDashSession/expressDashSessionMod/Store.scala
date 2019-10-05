package typings.expressDashSession.expressDashSessionMod

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.Request
import typings.expressDashSession.expressDashSessionMod.Global.Express.SessionData
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-session", "Store")
@js.native
abstract class Store () extends EventEmitter {
  def this(config: js.Any) = this()
  def all(
    callback: js.Function2[/* err */ js.Any, /* obj */ js.UndefOr[StringDictionary[SessionData] | Null], Unit]
  ): Unit = js.native
  def clear(): Unit = js.native
  def clear(callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def createSession(req: Request, sess: SessionData): Unit = js.native
  def destroy(sid: String): Unit = js.native
  def destroy(sid: String, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def get(
    sid: String,
    callback: js.Function2[/* err */ js.Any, /* session */ js.UndefOr[SessionData | Null], Unit]
  ): Unit = js.native
  def length(callback: js.Function2[/* err */ js.Any, /* length */ js.UndefOr[Double | Null], Unit]): Unit = js.native
  def load(sid: String, fn: js.Function2[/* err */ js.Any, /* session */ js.UndefOr[SessionData | Null], _]): Unit = js.native
  def regenerate(req: Request, fn: js.Function1[/* err */ js.UndefOr[js.Any], _]): Unit = js.native
  def set(sid: String, session: SessionData): Unit = js.native
  def set(sid: String, session: SessionData, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def touch(sid: String, session: SessionData): Unit = js.native
  def touch(sid: String, session: SessionData, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
}

