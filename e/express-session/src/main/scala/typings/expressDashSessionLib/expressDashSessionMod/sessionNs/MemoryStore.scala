package typings
package expressDashSessionLib.expressDashSessionMod.sessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryStore extends BaseMemoryStore {
  def all(
    callback: js.Function2[
      /* err */ js.Any, 
      /* obj */ js.UndefOr[
        ScalablyTyped.runtime.StringDictionary[expressDashSessionLib.expressDashSessionMod.Global.ExpressNs.SessionData] | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("clear")
  def clear_MMemoryStore(): scala.Unit = js.native
  @JSName("clear")
  def clear_MMemoryStore(callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  @JSName("length")
  def length_MMemoryStore(
    callback: js.Function2[/* err */ js.Any, /* length */ js.UndefOr[scala.Double | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def set(
    sid: java.lang.String,
    session: expressDashSessionLib.expressDashSessionMod.Global.ExpressNs.SessionData
  ): scala.Unit = js.native
  def set(
    sid: java.lang.String,
    session: expressDashSessionLib.expressDashSessionMod.Global.ExpressNs.SessionData,
    callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def touch(
    sid: java.lang.String,
    session: expressDashSessionLib.expressDashSessionMod.Global.ExpressNs.SessionData
  ): scala.Unit = js.native
  def touch(
    sid: java.lang.String,
    session: expressDashSessionLib.expressDashSessionMod.Global.ExpressNs.SessionData,
    callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
}

