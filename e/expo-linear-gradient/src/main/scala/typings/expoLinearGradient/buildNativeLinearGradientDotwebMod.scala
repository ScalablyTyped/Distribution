package typings.expoLinearGradient

import typings.expoLinearGradient.buildNativeLinearGradientDottypesMod.NativeLinearGradientPoint
import typings.expoLinearGradient.buildNativeLinearGradientDottypesMod.NativeLinearGradientProps
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildNativeLinearGradientDotwebMod {
  
  @JSImport("expo-linear-gradient/build/NativeLinearGradient.web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: NativeLinearGradientProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def getLinearGradientBackgroundImage(
    colors: js.Array[Double | String],
    locations: js.UndefOr[js.Array[Double] | Null],
    startPoint: js.UndefOr[NativeLinearGradientPoint | Null],
    endPoint: js.UndefOr[NativeLinearGradientPoint | Null],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getLinearGradientBackgroundImage")(colors.asInstanceOf[js.Any], locations.asInstanceOf[js.Any], startPoint.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[String]
}
