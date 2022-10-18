package typings.expoLinearGradient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildNormalizeColorMod {
  
  @JSImport("expo-linear-gradient/build/normalizeColor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeColor(): Unit | String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")().asInstanceOf[Unit | String]
  inline def normalizeColor(color: String): Unit | String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any]).asInstanceOf[Unit | String]
  inline def normalizeColor(color: String, opacity: Double): Unit | String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[Unit | String]
  inline def normalizeColor(color: Double): Unit | String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any]).asInstanceOf[Unit | String]
  inline def normalizeColor(color: Double, opacity: Double): Unit | String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[Unit | String]
  inline def normalizeColor(color: Unit, opacity: Double): Unit | String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[Unit | String]
}
