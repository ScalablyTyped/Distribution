package typings.gm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CompareCallback = js.Function4[
    /* err */ typings.std.Error | scala.Null, 
    /* isEqual */ scala.Boolean, 
    /* equality */ scala.Double, 
    /* raw */ scala.Double, 
    js.Any
  ]
  type GetterCallback[T] = js.Function2[/* err */ typings.std.Error | scala.Null, /* value */ T, js.Any]
  type WriteCallback = js.Function4[
    /* err */ typings.std.Error | scala.Null, 
    /* stdout */ typings.node.streamMod.Readable, 
    /* stderr */ typings.node.streamMod.Readable, 
    /* cmd */ java.lang.String, 
    js.Any
  ]
}
