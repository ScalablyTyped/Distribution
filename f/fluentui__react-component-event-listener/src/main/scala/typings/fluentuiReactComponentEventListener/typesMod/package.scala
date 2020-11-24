package typings.fluentuiReactComponentEventListener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type EventHandler[T /* <: typings.fluentuiReactComponentEventListener.typesMod.EventTypes */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any, 
    scala.Unit
  ]
  
  type Target = typings.std.Node | typings.std.Window
  
  type TargetRef = typings.react.mod.RefObject[typings.fluentuiReactComponentEventListener.typesMod.Target]
}
