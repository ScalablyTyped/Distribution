package typings.fluentuiUtilities

import typings.fluentuiUtilities.anon.DefaultRender
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object icomponentasMod {
  
  type IComponentAs[T] = ComponentType[IComponentAsProps[T]]
  
  type IComponentAsProps[T] = T & DefaultRender[T]
}
