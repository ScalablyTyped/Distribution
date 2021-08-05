package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import typings.gatsbyPluginUtils.anon.Array
import typings.gatsbyPluginUtils.gatsbyPluginUtilsBooleans.`false`
import typings.gatsbyPluginUtils.gatsbyPluginUtilsStrings.key
import typings.gatsbyPluginUtils.gatsbyPluginUtilsStrings.path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorFormattingOptions extends StObject {
  
  /**
    * when true, error message templates will escape special characters to HTML entities, for security purposes.
    *
    * @default false
    */
  var escapeHtml: js.UndefOr[Boolean] = js.undefined
  
  /**
    * defines the value used to set the label context variable.
    */
  var label: js.UndefOr[path | key | `false`] = js.undefined
  
  /**
    * The preferred language code for error messages.
    * The value is matched against keys at the root of the messages object, and then the error code as a child key of that.
    * Can be a reference to the value, global context, or local context which is the root value passed to the validation function.
    *
    * Note that references to the value are usually not what you want as they move around the value structure relative to where the error happens.
    * Instead, either use the global context, or the absolute value (e.g. `Joi.ref('/variable')`)
    */
  var language: js.UndefOr[
    /* keyof gatsby-plugin-utils.gatsby-plugin-utils/dist/utils/plugin-options-schema-joi-type.LanguageMessages */ String
  ] = js.undefined
  
  /**
    * when false, skips rendering error templates. Useful when error messages are generated elsewhere to save processing time.
    *
    * @default true
    */
  var render: js.UndefOr[Boolean] = js.undefined
  
  /**
    * when true, the main error will possess a stack trace, otherwise it will be disabled.
    * Defaults to false for performances reasons. Has no effect on platforms other than V8/node.js as it uses the Stack trace API.
    *
    * @default false
    */
  var stack: js.UndefOr[Boolean] = js.undefined
  
  /**
    * overrides the way values are wrapped (e.g. `[]` arround arrays, `""` around labels).
    * Each key can be set to a string with one (same character before and after the value) or two characters (first character
    * before and second character after), or `false` to disable wrapping.
    */
  var wrap: js.UndefOr[Array] = js.undefined
}
object ErrorFormattingOptions {
  
  inline def apply(): ErrorFormattingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorFormattingOptions]
  }
  
  extension [Self <: ErrorFormattingOptions](x: Self) {
    
    inline def setEscapeHtml(value: Boolean): Self = StObject.set(x, "escapeHtml", value.asInstanceOf[js.Any])
    
    inline def setEscapeHtmlUndefined: Self = StObject.set(x, "escapeHtml", js.undefined)
    
    inline def setLabel(value: path | key | `false`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLanguage(
      value: /* keyof gatsby-plugin-utils.gatsby-plugin-utils/dist/utils/plugin-options-schema-joi-type.LanguageMessages */ String
    ): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setRender(value: Boolean): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setWrap(value: Array): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
