package typings.engineIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AllowRequestFunction = js.Function2[
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* fn */ js.Function2[
      /* err */ js.UndefOr[java.lang.String | scala.Null], 
      /* success */ scala.Boolean, 
      scala.Unit
    ], 
    scala.Unit
  ]
  type Message = java.lang.String | typings.node.Buffer | typings.std.ArrayBuffer | typings.std.ArrayBufferView
}
