package typings.dxf

import org.scalablytyped.runtime.Shortcut
import typings.dxf.dxfMod.ColorNumbers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorsMod extends Shortcut {
  
  @JSImport("dxf/util/colors", JSImport.Default)
  @js.native
  val default: ColorNumbers = js.native
  
  type _To = ColorNumbers
  
  /* This means you don't have to write `default`, but can instead just say `colorsMod.foo` */
  override def _to: ColorNumbers = default
}
