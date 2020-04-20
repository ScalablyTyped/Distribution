package typings.fluentuiReactIcons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type SvgIconChildrenFn[TProps] = js.Function1[
    /* svgIcon */ typings.fluentuiReactIcons.typesMod.SvgIconFuncArg[TProps], 
    typings.react.mod.ReactNode
  ]
  type SvgIconChildrenFnWithRoot[TProps] = js.Function1[
    /* svgIcon */ typings.fluentuiReactIcons.typesMod.SvgIconFuncWithRootArg[TProps], 
    typings.react.mod.ReactElement
  ]
}
