package typings
package expressDashWechatDashAccessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWechatDashAccessMod {
  type WeMiddleware = js.Function3[
    /* req */ js.Any, 
    /* res */ expressLib.expressMod.Response | nodeLib.httpMod.ServerResponse, 
    /* next */ expressLib.expressMod.NextFunction, 
    js.Any
  ]
}
