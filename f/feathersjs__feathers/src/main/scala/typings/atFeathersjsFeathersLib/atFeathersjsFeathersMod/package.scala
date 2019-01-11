package typings
package atFeathersjsFeathersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atFeathersjsFeathersMod {
  type ClientSideParams = stdLib.Pick[
    Params, 
    atFeathersjsFeathersLib.atFeathersjsFeathersLibStrings.query | atFeathersjsFeathersLib.atFeathersjsFeathersLibStrings.paginate
  ]
  type Hook = js.Function1[
    /* hook */ HookContext[js.Any], 
    (js.Promise[HookContext[js.Any] | SkipSymbol | scala.Unit]) | HookContext[js.Any] | SkipSymbol | scala.Unit
  ]
  type Id = scala.Double | java.lang.String
  type NullableId = Id | scala.Null
  type ServerSideParams = Params
  type Service[T] = ServiceOverloads[T] with ServiceAddons[T] with ServiceMethods[T]
  type SkipSymbol = js.Symbol | atFeathersjsFeathersLib.atFeathersjsFeathersLibStrings.__feathersSkipHooks
}
