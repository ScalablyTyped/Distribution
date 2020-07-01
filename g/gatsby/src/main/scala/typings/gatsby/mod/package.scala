package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type PluginCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* result */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type PluginRef = java.lang.String | typings.gatsby.mod.IPluginRefObject
  type ReactProps[T /* <: typings.std.Element */] = typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[T], T]
  type RenderCallback[T] = js.Function1[/* data */ T, typings.react.mod.ReactNode]
  type Reporter = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof reporter */ js.Any
}
