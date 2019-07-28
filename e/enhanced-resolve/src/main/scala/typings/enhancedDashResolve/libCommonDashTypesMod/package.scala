package typings.enhancedDashResolve

import typings.node.NodeJSNs.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCommonDashTypesMod {
  type CommonFileSystemMethod = js.Function2[
    /* name */ String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* repeated */ js.Any, Unit], 
    Unit
  ]
  type ErrorCallback[T] = js.Function2[/* err */ T | Null, /* repeated */ js.Any, js.Any]
}
