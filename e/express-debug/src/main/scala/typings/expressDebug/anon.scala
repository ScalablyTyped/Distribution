package typings.expressDebug

import typings.expressDebug.mod.CustomPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Depth extends StObject {
    
    /**
      * How deep to recurse through printed objects. This is the default unless the
      * print_obj function is passed an options object with a 'depth' property.
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    /**
      * If you need to add arbitrary attributes to the containing element of EDT,
      * this allows you to.
      */
    var extra_attrs: js.UndefOr[String] = js.undefined
    
    /**
      * Additional panels to show.
      */
    var extra_panels: js.UndefOr[js.Array[CustomPanel]] = js.undefined
    
    /**
      * Allows changing the default panel.
      */
    var panels: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Path to render standalone express-debug.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Global option to determine sort order of printed object values. false for
      * default order, true for basic default sort, or a function to use for sort.
      */
    var sort: js.UndefOr[Boolean | (js.Function2[/* a */ Double, /* b */ Double, Double])] = js.undefined
    
    /**
      * Absolute path to a css file to include and override EDT's default css.
      */
    var theme: js.UndefOr[String] = js.undefined
  }
  object Depth {
    
    inline def apply(): Depth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Depth]
    }
    
    extension [Self <: Depth](x: Self) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setExtra_attrs(value: String): Self = StObject.set(x, "extra_attrs", value.asInstanceOf[js.Any])
      
      inline def setExtra_attrsUndefined: Self = StObject.set(x, "extra_attrs", js.undefined)
      
      inline def setExtra_panels(value: js.Array[CustomPanel]): Self = StObject.set(x, "extra_panels", value.asInstanceOf[js.Any])
      
      inline def setExtra_panelsUndefined: Self = StObject.set(x, "extra_panels", js.undefined)
      
      inline def setExtra_panelsVarargs(value: CustomPanel*): Self = StObject.set(x, "extra_panels", js.Array(value*))
      
      inline def setPanels(value: js.Array[String]): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
      
      inline def setPanelsUndefined: Self = StObject.set(x, "panels", js.undefined)
      
      inline def setPanelsVarargs(value: String*): Self = StObject.set(x, "panels", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSort(value: Boolean | (js.Function2[/* a */ Double, /* b */ Double, Double])): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortFunction2(value: (/* a */ Double, /* b */ Double) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
