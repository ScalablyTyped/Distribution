package typings.findMyWay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Handler[V /* <: typings.findMyWay.mod.HTTPVersion */] = js.Function4[
    /* req */ typings.node.http2Mod.Http2ServerRequest | typings.node.httpMod.IncomingMessage, 
    /* res */ typings.node.http2Mod.Http2ServerResponse | typings.node.httpMod.ServerResponse, 
    /* params */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]], 
    /* store */ js.Any, 
    scala.Unit
  ]
}
