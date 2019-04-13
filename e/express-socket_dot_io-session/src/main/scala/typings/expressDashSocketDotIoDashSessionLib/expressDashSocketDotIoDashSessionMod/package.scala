package typings
package expressDashSocketDotIoDashSessionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashSocketDotIoDashSessionMod {
  type SocketIoSharedSessionMiddleware = js.Function2[
    /* socket */ socketDotIoLib.socketDotIoMod.Socket, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
}
