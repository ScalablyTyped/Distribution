package typings.expressSession.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * **Warning:** the default server-side session storage, `MemoryStore`, is purposely not designed for a production environment.
  * It will leak memory under most conditions, does not scale past a single process, and is only meant for debugging and developing.
  */
@JSImport("express-session", "MemoryStore")
@js.native
class MemoryStore () extends Store {
  
  @JSName("all")
  def all_MMemoryStore(
    callback: js.Function2[/* err */ js.Any, /* obj */ js.UndefOr[StringDictionary[SessionData] | Null], Unit]
  ): Unit = js.native
  
  @JSName("clear")
  def clear_MMemoryStore(): Unit = js.native
  @JSName("clear")
  def clear_MMemoryStore(callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  @JSName("length")
  def length_MMemoryStore(callback: js.Function2[/* err */ js.Any, /* length */ Double, Unit]): Unit = js.native
  
  @JSName("touch")
  def touch_MMemoryStore(sid: String, session: SessionData): Unit = js.native
  @JSName("touch")
  def touch_MMemoryStore(sid: String, session: SessionData, callback: js.Function0[Unit]): Unit = js.native
}
