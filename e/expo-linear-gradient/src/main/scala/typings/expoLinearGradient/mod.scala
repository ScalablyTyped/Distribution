package typings.expoLinearGradient

import typings.expoLinearGradient.anon.Colors
import typings.expoLinearGradient.anon.TypeofView
import typings.expoLinearGradient.anon.X
import typings.expoLinearGradient.nativeLinearGradientTypesMod.NativeLinearGradientPoint
import typings.react.mod.ComponentProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-linear-gradient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def LinearGradient(hasColorsLocationsStartEndProps: PropsWithChildren[LinearGradientProps]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("LinearGradient")(hasColorsLocationsStartEndProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  type LinearGradientPoint = X | NativeLinearGradientPoint
  
  type LinearGradientProps = Colors & ComponentProps[TypeofView]
}
