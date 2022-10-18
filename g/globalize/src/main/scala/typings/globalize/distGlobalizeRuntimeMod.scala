package typings.globalize

import org.scalablytyped.runtime.Shortcut
import typings.cldrjs.mod.CldrStatic
import typings.globalize.distGlobalizeMod.Shared
import typings.globalize.distGlobalizeMod.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGlobalizeRuntimeMod extends Shortcut {
  
  @JSImport("globalize/dist/globalize-runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Static = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("globalize/dist/globalize-runtime", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends StObject
       with Shared {
    /**
      * Create a Globalize instance.
      * @param cldr Cldr instance of the instance.
      * @returns {Globalize} A Globalize instance
      */
    def this(cldr: CldrStatic) = this()
    /**
      * Create a Globalize instance.
      * @param {string} Locale string of the instance.
      * @returns {Globalize} A Globalize instance
      */
    def this(locale: String) = this()
  }
  
  type _To = js.Object & Static
  
  /* This means you don't have to write `^`, but can instead just say `distGlobalizeRuntimeMod.foo` */
  override def _to: js.Object & Static = ^
}
