package typings.gm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gmMod {
  import typings.node.streamMod.Readable
  import typings.std.Error

  type CompareCallback = js.Function4[
    /* err */ Error | Null, 
    /* isEqual */ Boolean, 
    /* equality */ Double, 
    /* raw */ Double, 
    js.Any
  ]
  type GetterCallback[T] = js.Function2[/* err */ Error | Null, /* value */ T, js.Any]
  type WriteCallback = js.Function4[
    /* err */ Error | Null, 
    /* stdout */ Readable, 
    /* stderr */ Readable, 
    /* cmd */ String, 
    js.Any
  ]
}
