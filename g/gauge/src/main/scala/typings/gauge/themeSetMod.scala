package typings.gauge

import org.scalablytyped.runtime.Shortcut
import typings.gauge.libThemeSetMod.ThemeSet
import typings.gauge.libThemesMod.Themes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeSetMod extends Shortcut {
  
  @JSImport("gauge/theme-set", JSImport.Namespace)
  @js.native
  val ^ : ThemeSet = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("gauge/theme-set", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with Themes
  
  type _To = ThemeSet
  
  /* This means you don't have to write `^`, but can instead just say `themeSetMod.foo` */
  override def _to: ThemeSet = ^
}
