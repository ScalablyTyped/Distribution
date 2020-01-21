package typings.flushWriteStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* error */ js.UndefOr[typings.std.Error], scala.Unit]
  type Flush = js.Function1[/* callback */ typings.flushWriteStream.mod.Callback, scala.Unit]
  type Write = js.Function3[
    /* chunk */ js.Any, 
    /* encoding */ java.lang.String, 
    /* callback */ typings.flushWriteStream.mod.Callback, 
    scala.Unit
  ]
}
