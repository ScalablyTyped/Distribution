package typings.gatsbyPluginUtils

import org.scalablytyped.runtime.Shortcut
import typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.PluginOptionsSchemaJoi
import typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.ValidationError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joiMod {
  
  object Joi extends Shortcut {
    
    @JSImport("gatsby-plugin-utils/dist/joi", "Joi")
    @js.native
    val ^ : PluginOptionsSchemaJoi = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("gatsby-plugin-utils/dist/joi", "Joi.ValidationError")
    @js.native
    class ValidationErrorCls protected () extends ValidationError {
      def this(message: String, details: js.Any, original: js.Any) = this()
    }
    
    type _To = PluginOptionsSchemaJoi
    
    /* This means you don't have to write `^`, but can instead just say `Joi.foo` */
    override def _to: PluginOptionsSchemaJoi = ^
  }
}
