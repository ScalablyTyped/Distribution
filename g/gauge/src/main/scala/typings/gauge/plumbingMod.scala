package typings.gauge

import typings.gauge.libPlumbingMod.default
import typings.gauge.libThemesMod.ThemeName
import typings.gauge.libThemesMod.ThemeObject
import typings.gauge.libThemesMod.ThemeOpts
import typings.gauge.templateMod.Template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plumbingMod {
  
  @JSImport("gauge/plumbing", JSImport.Namespace)
  @js.native
  open class ^ protected () extends default {
    /**
      * @param theme - The theme to use.
      * @param template - The template to use.
      * @param width - How wide your gauge should be.
      */
    def this(theme: ThemeName, template: Template, width: Double) = this()
    def this(theme: ThemeObject, template: Template, width: Double) = this()
    def this(theme: ThemeOpts, template: Template, width: Double) = this()
  }
}
