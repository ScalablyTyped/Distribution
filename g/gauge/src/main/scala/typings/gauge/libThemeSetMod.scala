package typings.gauge

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.gauge.libThemesMod.Themes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libThemeSetMod extends Shortcut {
  
  @JSImport("gauge/lib/theme-set", JSImport.Default)
  @js.native
  val default: ThemeSet = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("gauge/lib/theme-set", JSImport.Default)
  @js.native
  open class defaultCls ()
    extends StObject
       with Themes
  
  @js.native
  trait ThemeSet
    extends StObject
       with Instantiable0[Themes]
  
  type _To = ThemeSet
  
  /* This means you don't have to write `default`, but can instead just say `libThemeSetMod.foo` */
  override def _to: ThemeSet = default
}
