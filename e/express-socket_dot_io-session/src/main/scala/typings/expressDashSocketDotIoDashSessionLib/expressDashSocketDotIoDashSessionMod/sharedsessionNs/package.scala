package typings
package expressDashSocketDotIoDashSessionLib.expressDashSocketDotIoDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sharedsessionNs {
  type SocketIoSharedSessionMiddleware = js.Function2[
    /* socket */ socketDotIoLib.socketDotIoMod.SocketIONs.Socket, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
}
