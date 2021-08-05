package typings.filterCss

import typings.css.mod.AtRule
import typings.css.mod.Comment
import typings.css.mod.Rule
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(inputStylesheet: String, ignorePattern: js.Array[Pattern]): String = (^.asInstanceOf[js.Dynamic].apply(inputStylesheet.asInstanceOf[js.Any], ignorePattern.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(inputStylesheet: String, ignorePattern: js.Array[Pattern], options: Options): String = (^.asInstanceOf[js.Dynamic].apply(inputStylesheet.asInstanceOf[js.Any], ignorePattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(inputStylesheet: String, ignorePattern: Pattern): String = (^.asInstanceOf[js.Dynamic].apply(inputStylesheet.asInstanceOf[js.Any], ignorePattern.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(inputStylesheet: String, ignorePattern: Pattern, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(inputStylesheet.asInstanceOf[js.Any], ignorePattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("filter-css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.filterCss.filterCssStrings.`type`
    - typings.filterCss.filterCssStrings.media
    - typings.filterCss.filterCssStrings.selector
    - typings.filterCss.filterCssStrings.declarationProperty
    - typings.filterCss.filterCssStrings.declarationValue
  */
  trait Context extends StObject
  object Context {
    
    inline def declarationProperty: typings.filterCss.filterCssStrings.declarationProperty = "declarationProperty".asInstanceOf[typings.filterCss.filterCssStrings.declarationProperty]
    
    inline def declarationValue: typings.filterCss.filterCssStrings.declarationValue = "declarationValue".asInstanceOf[typings.filterCss.filterCssStrings.declarationValue]
    
    inline def media: typings.filterCss.filterCssStrings.media = "media".asInstanceOf[typings.filterCss.filterCssStrings.media]
    
    inline def selector: typings.filterCss.filterCssStrings.selector = "selector".asInstanceOf[typings.filterCss.filterCssStrings.selector]
    
    inline def `type`: typings.filterCss.filterCssStrings.`type` = "type".asInstanceOf[typings.filterCss.filterCssStrings.`type`]
  }
  
  trait Options extends StObject {
    
    /**
      * Whether to match CSS properties like `background-image`.
      * @default true
      */
    var matchDeclarationProperties: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to match CSS values like `url(...)`.
      * @default true
      */
    var matchDeclarationValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to match media queries like `min-device-pixel-ratio: 2`.
      * @default true
      */
    var matchMedia: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to match CSS selectors.
      * @default true
      */
    var matchSelectors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to match [AST Node types]{@link https://github.com/reworkcss/css#types} like `font-face`.
      * @default true
      */
    var matchTypes: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMatchDeclarationProperties(value: Boolean): Self = StObject.set(x, "matchDeclarationProperties", value.asInstanceOf[js.Any])
      
      inline def setMatchDeclarationPropertiesUndefined: Self = StObject.set(x, "matchDeclarationProperties", js.undefined)
      
      inline def setMatchDeclarationValues(value: Boolean): Self = StObject.set(x, "matchDeclarationValues", value.asInstanceOf[js.Any])
      
      inline def setMatchDeclarationValuesUndefined: Self = StObject.set(x, "matchDeclarationValues", js.undefined)
      
      inline def setMatchMedia(value: Boolean): Self = StObject.set(x, "matchMedia", value.asInstanceOf[js.Any])
      
      inline def setMatchMediaUndefined: Self = StObject.set(x, "matchMedia", js.undefined)
      
      inline def setMatchSelectors(value: Boolean): Self = StObject.set(x, "matchSelectors", value.asInstanceOf[js.Any])
      
      inline def setMatchSelectorsUndefined: Self = StObject.set(x, "matchSelectors", js.undefined)
      
      inline def setMatchTypes(value: Boolean): Self = StObject.set(x, "matchTypes", value.asInstanceOf[js.Any])
      
      inline def setMatchTypesUndefined: Self = StObject.set(x, "matchTypes", js.undefined)
    }
  }
  
  type Pattern = String | RegExp | PatternFunction
  
  /**
    * @param context The current matching context.
    * @param value The current value.
    * @param node The current AST node generated by [`css`]{@link https://github.com/reworkcss/css} being processed.
    * @returns Whether the element should be discarded.
    */
  type PatternFunction = js.Function3[
    /* context */ Context, 
    /* value */ js.UndefOr[String], 
    /* node */ Rule | Comment | AtRule, 
    Boolean
  ]
}
