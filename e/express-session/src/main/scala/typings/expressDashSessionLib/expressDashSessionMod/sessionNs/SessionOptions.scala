package typings
package expressDashSessionLib.expressDashSessionMod.sessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SessionOptions extends js.Object {
  var cookie: js.UndefOr[expressLib.expressMod.eNs.CookieOptions] = js.undefined
  var genid: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var proxy: js.UndefOr[scala.Boolean] = js.undefined
  var resave: js.UndefOr[scala.Boolean] = js.undefined
  var rolling: js.UndefOr[scala.Boolean] = js.undefined
  var saveUninitialized: js.UndefOr[scala.Boolean] = js.undefined
  var secret: java.lang.String | js.Array[java.lang.String]
  var store: js.UndefOr[Store | MemoryStore] = js.undefined
  var unset: js.UndefOr[java.lang.String] = js.undefined
}

