package typings.fscreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Handler = js.Function1[/* e */ js.UndefOr[typings.std.Event], scala.Unit]
  
  type RequestFullScreenFunction = js.Function1[/* element */ typings.std.Element, scala.Unit]
}
