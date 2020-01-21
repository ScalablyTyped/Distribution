package typings.feathersjsFeathers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ClientSideParams = typings.std.Pick[
    typings.feathersjsFeathers.mod.Params, 
    typings.feathersjsFeathers.feathersjsFeathersStrings.query | typings.feathersjsFeathers.feathersjsFeathersStrings.paginate
  ]
  // tslint:disable-next-line void-return
  type Hook = js.Function1[
    /* hook */ typings.feathersjsFeathers.mod.HookContext[js.Any], 
    (js.Promise[
      typings.feathersjsFeathers.mod.HookContext[js.Any] | typings.feathersjsFeathers.mod.SkipSymbol | scala.Unit
    ]) | typings.feathersjsFeathers.mod.HookContext[js.Any] | typings.feathersjsFeathers.mod.SkipSymbol | scala.Unit
  ]
  type Id = scala.Double | java.lang.String
  type NullableId = typings.feathersjsFeathers.mod.Id | scala.Null
  type Query = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ServerSideParams = typings.feathersjsFeathers.mod.Params
  type Service[T] = typings.feathersjsFeathers.mod.ServiceOverloads[T] with typings.feathersjsFeathers.mod.ServiceAddons[T] with typings.feathersjsFeathers.mod.ServiceMethods[T]
  type SkipSymbol = js.Symbol | typings.feathersjsFeathers.feathersjsFeathersStrings.__feathersSkipHooks
}
