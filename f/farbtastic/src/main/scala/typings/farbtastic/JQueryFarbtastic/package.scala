package typings.farbtastic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object JQueryFarbtastic {
  
  type Callback = typings.farbtastic.JQueryFarbtastic.CallbackFunction | typings.farbtastic.JQueryFarbtastic.Placeholder
  
  type CallbackFunction = js.Function1[/* color */ java.lang.String, js.Any]
  
  type Placeholder = java.lang.String | typings.std.Element | typings.farbtastic.JQuery
}
