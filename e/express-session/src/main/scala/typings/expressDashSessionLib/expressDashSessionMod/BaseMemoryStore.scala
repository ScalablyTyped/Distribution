package typings
package expressDashSessionLib.expressDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseMemoryStore extends js.Object {
  var clear: js.UndefOr[
    js.Function1[
      /* callback */ js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]], 
      scala.Unit
    ]
  ] = js.native
  var length: js.UndefOr[
    js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* length */ js.UndefOr[scala.Double | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.native
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
  def set(
    sid: java.lang.String,
    session: expressDashSessionLib.expressDashSessionMod.Global.ExpressNs.Session
  ): scala.Unit = js.native
  def set(
    sid: java.lang.String,
    session: expressDashSessionLib.expressDashSessionMod.Global.ExpressNs.Session,
    callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
}

