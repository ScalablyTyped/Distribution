package typings.enzyme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentType[Props] = typings.enzyme.mod.ComponentClass[Props] | typings.enzyme.mod.StatelessComponent[Props]
  type EnzymePropSelector = org.scalablytyped.runtime.StringDictionary[js.Any]
  type EnzymeSelector = java.lang.String | typings.enzyme.mod.StatelessComponent[js.Any] | typings.enzyme.mod.ComponentClass[js.Any] | typings.enzyme.mod.EnzymePropSelector
  type HTMLAttributes = typings.react.mod.AllHTMLAttributes[js.Object] with typings.react.mod.SVGAttributes[js.Object]
  type Intercepter[T] = js.Function1[/* intercepter */ T, scala.Unit]
  type Parameters[T] = js.Any
  type StatelessComponent[Props] = js.Function2[
    /* props */ Props, 
    /* context */ js.UndefOr[js.Any], 
    typings.react.mod._Global_.JSX.Element | scala.Null
  ]
}
