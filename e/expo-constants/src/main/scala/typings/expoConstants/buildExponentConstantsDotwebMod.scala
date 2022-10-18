package typings.expoConstants

import org.scalablytyped.runtime.Shortcut
import typings.expoConstants.buildConstantsDottypesMod.NativeConstants
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildExponentConstantsDotwebMod extends Shortcut {
  
  @JSImport("expo-constants/build/ExponentConstants.web", JSImport.Default)
  @js.native
  val default: NativeConstants = js.native
  
  type _To = NativeConstants
  
  /* This means you don't have to write `default`, but can instead just say `buildExponentConstantsDotwebMod.foo` */
  override def _to: NativeConstants = default
}
