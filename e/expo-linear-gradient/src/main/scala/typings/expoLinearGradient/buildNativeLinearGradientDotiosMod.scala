package typings.expoLinearGradient

import org.scalablytyped.runtime.Shortcut
import typings.expoLinearGradient.buildNativeLinearGradientDottypesMod.NativeLinearGradientProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildNativeLinearGradientDotiosMod extends Shortcut {
  
  @JSImport("expo-linear-gradient/build/NativeLinearGradient.ios", JSImport.Default)
  @js.native
  val default: FC[NativeLinearGradientProps] = js.native
  
  type _To = FC[NativeLinearGradientProps]
  
  /* This means you don't have to write `default`, but can instead just say `buildNativeLinearGradientDotiosMod.foo` */
  override def _to: FC[NativeLinearGradientProps] = default
}
