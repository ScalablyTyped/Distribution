package typings.framerMotion.mod

import typings.framerMotion.anon.Children
import typings.framerMotion.anon.colorstringundefinedtrans
import typings.framerMotion.framerMotionStrings.values
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Reorder {
  
  @JSImport("framer-motion", "Reorder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("framer-motion", "Reorder.Group")
  @js.native
  def Group: ForwardRefExoticComponent[
    Props[Any] & (Omit[HTMLMotionProps[Any], values]) & Children & RefAttributes[Any]
  ] = js.native
  inline def Group_=(
    x: ForwardRefExoticComponent[
      Props[Any] & (Omit[HTMLMotionProps[Any], values]) & Children & RefAttributes[Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
  
  @JSImport("framer-motion", "Reorder.Item")
  @js.native
  def Item: ForwardRefExoticComponent[colorstringundefinedtrans] = js.native
  inline def Item_=(x: ForwardRefExoticComponent[colorstringundefinedtrans]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
