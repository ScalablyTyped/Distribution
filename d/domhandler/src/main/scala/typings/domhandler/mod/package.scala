package typings.domhandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* dom */ js.Array[typings.domhandler.nodeMod.Node], 
    scala.Unit
  ]
  type ElementCallback = js.Function1[/* element */ typings.domhandler.nodeMod.Element, scala.Unit]
}
