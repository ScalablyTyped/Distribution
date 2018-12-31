package typings
package glueLib.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var preConnections: js.UndefOr[
    js.Function2[
      /* Server */ hapiLib.hapiMod.Server, 
      /* next */ js.Function1[/* err */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var preRegister: js.UndefOr[
    js.Function2[
      /* Server */ hapiLib.hapiMod.Server, 
      /* next */ js.Function1[/* err */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var relativeTo: java.lang.String
}

