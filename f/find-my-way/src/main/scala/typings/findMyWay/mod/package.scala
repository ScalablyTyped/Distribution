package typings.findMyWay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Handler[V /* <: typings.findMyWay.mod.HTTPVersion */] = js.Function4[
    /* req */ typings.findMyWay.mod.Req[V], 
    /* res */ typings.findMyWay.mod.Res[V], 
    /* params */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]], 
    /* store */ js.Any, 
    scala.Unit
  ]
  
  type Req[V] = typings.node.http2Mod.Http2ServerRequest | typings.node.httpMod.IncomingMessage
  
  type Res[V] = typings.node.http2Mod.Http2ServerResponse | typings.node.httpMod.ServerResponse
}
