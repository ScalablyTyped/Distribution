package typings.fluentuiUtilities

import typings.fluentuiMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.fluentuiMergeStyles.libIstylesetMod.IProcessedStyleSet
import typings.fluentuiMergeStyles.libIstylesetMod.IStyleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassNamesFunctionMod {
  
  @JSImport("@fluentui/utilities/lib/classNamesFunction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def classNamesFunction[TStyleProps /* <: js.Object */, TStyleSet /* <: IStyleSet[TStyleSet] */](): js.Function2[
    /* getStyles */ js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]], 
    /* styleProps */ js.UndefOr[TStyleProps], 
    IProcessedStyleSet[TStyleSet]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("classNamesFunction")().asInstanceOf[js.Function2[
    /* getStyles */ js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]], 
    /* styleProps */ js.UndefOr[TStyleProps], 
    IProcessedStyleSet[TStyleSet]
  ]]
  inline def classNamesFunction[TStyleProps /* <: js.Object */, TStyleSet /* <: IStyleSet[TStyleSet] */](options: IClassNamesFunctionOptions): js.Function2[
    /* getStyles */ js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]], 
    /* styleProps */ js.UndefOr[TStyleProps], 
    IProcessedStyleSet[TStyleSet]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("classNamesFunction")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* getStyles */ js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]], 
    /* styleProps */ js.UndefOr[TStyleProps], 
    IProcessedStyleSet[TStyleSet]
  ]]
  
  trait IClassNamesFunctionOptions extends StObject {
    
    /**
      * Size of the cache. It overwrites default cache size when defined.
      */
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Disables class caching for scenarios where styleProp parts mutate frequently.
      */
    var disableCaching: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true if component base styles are implemented in scss instead of css-in-js.
      */
    var useStaticStyles: js.UndefOr[Boolean] = js.undefined
  }
  object IClassNamesFunctionOptions {
    
    inline def apply(): IClassNamesFunctionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClassNamesFunctionOptions]
    }
    
    extension [Self <: IClassNamesFunctionOptions](x: Self) {
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setDisableCaching(value: Boolean): Self = StObject.set(x, "disableCaching", value.asInstanceOf[js.Any])
      
      inline def setDisableCachingUndefined: Self = StObject.set(x, "disableCaching", js.undefined)
      
      inline def setUseStaticStyles(value: Boolean): Self = StObject.set(x, "useStaticStyles", value.asInstanceOf[js.Any])
      
      inline def setUseStaticStylesUndefined: Self = StObject.set(x, "useStaticStyles", js.undefined)
    }
  }
}
