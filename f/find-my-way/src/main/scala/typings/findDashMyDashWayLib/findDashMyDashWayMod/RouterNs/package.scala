package typings
package findDashMyDashWayLib.findDashMyDashWayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RouterNs {
  type Handler[V /* <: HTTPVersion */] = js.Function4[
    /* req */ nodeLib.http2Mod.Http2ServerRequest | nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.http2Mod.Http2ServerResponse | nodeLib.httpMod.ServerResponse, 
    /* params */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]], 
    /* store */ js.Any, 
    scala.Unit
  ]
}
