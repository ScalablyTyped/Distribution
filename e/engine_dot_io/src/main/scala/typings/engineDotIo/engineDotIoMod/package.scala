package typings.engineDotIo

import typings.node.Buffer
import typings.node.httpMod.IncomingMessage
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object engineDotIoMod {
  type AllowRequestFunction = js.Function2[
    /* req */ IncomingMessage, 
    /* fn */ js.Function2[/* err */ js.UndefOr[String | Null], /* success */ Boolean, Unit], 
    Unit
  ]
  type Message = String | Buffer | ArrayBuffer | ArrayBufferView
}
