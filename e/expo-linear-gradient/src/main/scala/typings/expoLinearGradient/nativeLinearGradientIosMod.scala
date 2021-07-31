package typings.expoLinearGradient

import org.scalablytyped.runtime.Shortcut
import typings.expoLinearGradient.nativeLinearGradientTypesMod.NativeLinearGradientProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeLinearGradientIosMod extends Shortcut {
  
  @JSImport("expo-linear-gradient/build/NativeLinearGradient.ios", JSImport.Default)
  @js.native
  val default: FC[NativeLinearGradientProps] = js.native
  
  type _To = FC[NativeLinearGradientProps]
  
  /* This means you don't have to write `default`, but can instead just say `nativeLinearGradientIosMod.foo` */
  override def _to: FC[NativeLinearGradientProps] = default
}
