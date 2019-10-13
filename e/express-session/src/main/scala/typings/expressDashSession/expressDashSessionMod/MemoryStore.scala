package typings.expressDashSession.expressDashSessionMod

import org.scalablytyped.runtime.StringDictionary
import typings.expressDashSession.expressDashSessionMod._Global_.Express.SessionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-session", "MemoryStore")
@js.native
class MemoryStore () extends BaseMemoryStore {
  def all(
    callback: js.Function2[/* err */ js.Any, /* obj */ js.UndefOr[StringDictionary[SessionData] | Null], Unit]
  ): Unit = js.native
  @JSName("clear")
  def clear_MMemoryStore(): Unit = js.native
  @JSName("clear")
  def clear_MMemoryStore(callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  @JSName("length")
  def length_MMemoryStore(callback: js.Function2[/* err */ js.Any, /* length */ js.UndefOr[Double | Null], Unit]): Unit = js.native
  def set(sid: String, session: SessionData): Unit = js.native
  def set(sid: String, session: SessionData, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def touch(sid: String, session: SessionData): Unit = js.native
  def touch(sid: String, session: SessionData, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
}

