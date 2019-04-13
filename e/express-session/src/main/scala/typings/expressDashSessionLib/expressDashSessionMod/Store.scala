package typings
package expressDashSessionLib.expressDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-session", "Store")
@js.native
abstract class Store ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(config: js.Any) = this()
  def all(
    callback: js.Function2[
      /* err */ js.Any, 
      /* obj */ js.UndefOr[
        org.scalablytyped.runtime.StringDictionary[expressDashSessionLib.expressDashSessionMod.Global.ExpressNs.SessionData] | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def clear(callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def createSession(
    req: expressLib.expressMod.Request,
    sess: expressDashSessionLib.expressDashSessionMod.Global.ExpressNs.SessionData
  ): scala.Unit = js.native
  def destroy(sid: java.lang.String): scala.Unit = js.native
  def destroy(sid: java.lang.String, callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def get(
    sid: java.lang.String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* session */ js.UndefOr[
        expressDashSessionLib.expressDashSessionMod.Global.ExpressNs.SessionData | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def length(
    callback: js.Function2[/* err */ js.Any, /* length */ js.UndefOr[scala.Double | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def load(
    sid: java.lang.String,
    fn: js.Function2[
      /* err */ js.Any, 
      /* session */ js.UndefOr[
        expressDashSessionLib.expressDashSessionMod.Global.ExpressNs.SessionData | scala.Null
      ], 
      _
    ]
  ): scala.Unit = js.native
  def regenerate(req: expressLib.expressMod.Request, fn: js.Function1[/* err */ js.UndefOr[js.Any], _]): scala.Unit = js.native
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

