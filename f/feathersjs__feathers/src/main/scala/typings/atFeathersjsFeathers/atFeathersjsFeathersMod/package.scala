package typings.atFeathersjsFeathers

import org.scalablytyped.runtime.StringDictionary
import typings.atFeathersjsFeathers.atFeathersjsFeathersStrings.__feathersSkipHooks
import typings.atFeathersjsFeathers.atFeathersjsFeathersStrings.paginate
import typings.atFeathersjsFeathers.atFeathersjsFeathersStrings.query
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atFeathersjsFeathersMod {
  type ClientSideParams = Pick[Params, query | paginate]
  // tslint:disable-next-line void-return
  type Hook = js.Function1[
    /* hook */ HookContext[js.Any], 
    (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
  ]
  type Id = Double | String
  type NullableId = Id | Null
  type Query = StringDictionary[js.Any]
  type ServerSideParams = Params
  type Service[T] = ServiceOverloads[T] with ServiceAddons[T] with ServiceMethods[T]
  type SkipSymbol = js.Symbol | __feathersSkipHooks
}
