package typings.expoConstants

import org.scalablytyped.runtime.Shortcut
import typings.expoConstants.constantsTypesMod.NativeConstants
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exponentConstantsWebMod extends Shortcut {
  
  @JSImport("expo-constants/build/ExponentConstants.web", JSImport.Default)
  @js.native
  val default: NativeConstants = js.native
  
  type _To = NativeConstants
  
  /* This means you don't have to write `default`, but can instead just say `exponentConstantsWebMod.foo` */
  override def _to: NativeConstants = default
}
