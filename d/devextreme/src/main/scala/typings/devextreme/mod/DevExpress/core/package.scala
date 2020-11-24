package typings.devextreme.mod.DevExpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object core {
  
  type dxElement = typings.std.HTMLElement with typings.devextreme.mod.global.JQuery
  
  type dxSVGElement = typings.std.SVGElement with typings.devextreme.mod.global.JQuery
  
  type template = java.lang.String | js.Function | typings.std.Element | typings.devextreme.mod.global.JQuery
}
