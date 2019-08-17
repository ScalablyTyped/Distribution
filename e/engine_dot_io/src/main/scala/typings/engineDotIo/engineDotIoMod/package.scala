package typings.engineDotIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object engineDotIoMod {
  import typings.node.Buffer
  import typings.node.httpMod.IncomingMessage
  import typings.std.ArrayBuffer
  import typings.std.ArrayBufferView

  type AllowRequestFunction = js.Function2[
    /* req */ IncomingMessage, 
    /* fn */ js.Function2[/* err */ js.UndefOr[String | Null], /* success */ Boolean, Unit], 
    Unit
  ]
  type Message = String | Buffer | ArrayBuffer | ArrayBufferView
}
