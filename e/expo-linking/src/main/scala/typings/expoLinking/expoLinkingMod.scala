package typings.expoLinking

import org.scalablytyped.runtime.Shortcut
import typings.reactNative.mod.LinkingStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoLinkingMod extends Shortcut {
  
  @JSImport("expo-linking/build/ExpoLinking", JSImport.Default)
  @js.native
  val default: LinkingStatic = js.native
  
  type _To = LinkingStatic
  
  /* This means you don't have to write `default`, but can instead just say `expoLinkingMod.foo` */
  override def _to: LinkingStatic = default
}
