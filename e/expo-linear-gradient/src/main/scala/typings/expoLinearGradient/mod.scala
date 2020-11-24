package typings.expoLinearGradient

import typings.expoLinearGradient.anon.Colors
import typings.expoLinearGradient.anon.TypeofView
import typings.expoLinearGradient.anon.X
import typings.expoLinearGradient.nativeLinearGradientTypesMod.NativeLinearGradientPoint
import typings.react.mod.ComponentProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-linear-gradient", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def LinearGradient(hasColorsLocationsStartEndProps: PropsWithChildren[LinearGradientProps]): ReactElement = js.native
  
  type LinearGradientPoint = X | NativeLinearGradientPoint
  
  type LinearGradientProps = Colors with ComponentProps[TypeofView]
}
