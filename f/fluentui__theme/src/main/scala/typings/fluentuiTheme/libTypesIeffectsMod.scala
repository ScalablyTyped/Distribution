package typings.fluentuiTheme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesIeffectsMod {
  
  trait IEffects extends StObject {
    
    /**
      * Used to provide a visual affordance that this element is elevated above the surface it rests on.
      * This is lower than elevations with a higher value, and higher than elevations with a lower value.
      * The shadow's color should not change with the theme, because colored shadows look unnatural.
      * Used for: search result dropdowns, hover cards, tooltips, help bubbles
      */
    var elevation16: String
    
    /**
      * Used to provide a visual affordance that this element is elevated above the surface it rests on.
      * This is lower than elevations with a higher value, and higher than elevations with a lower value.
      * The shadow's color should not change with the theme, because colored shadows look unnatural.
      * Used for: cards, grid items
      */
    var elevation4: String
    
    /**
      * Used to provide a visual affordance that this element is elevated above the surface it rests on.
      * This is lower than elevations with a higher value, and higher than elevations with a lower value.
      * The shadow's color should not change with the theme, because colored shadows look unnatural.
      * Used for: Panels, Dialogs
      */
    var elevation64: String
    
    /**
      * Used to provide a visual affordance that this element is elevated above the surface it rests on.
      * This is lower than elevations with a higher value, and higher than elevations with a lower value.
      * The shadow's color should not change with the theme, because colored shadows look unnatural.
      * Used for: menus, command surfaces
      */
    var elevation8: String
    
    /**
      * Rounded corner value, for use with border-radius. Smaller values indicate less rounding.
      * Smaller elements should get less rounding than larger elements.
      * Used for: buttons
      */
    var roundedCorner2: String
    
    /**
      * Rounded corner value, for use with border-radius. Smaller values indicate less rounding.
      * Smaller elements should get less rounding than larger elements.
      * Used for: cards
      */
    var roundedCorner4: String
    
    /**
      * Rounded corner value, for use with border-radius. Smaller values indicate less rounding.
      * Smaller elements should get less rounding than larger elements.
      * Used for: surfaces
      */
    var roundedCorner6: String
  }
  object IEffects {
    
    inline def apply(
      elevation16: String,
      elevation4: String,
      elevation64: String,
      elevation8: String,
      roundedCorner2: String,
      roundedCorner4: String,
      roundedCorner6: String
    ): IEffects = {
      val __obj = js.Dynamic.literal(elevation16 = elevation16.asInstanceOf[js.Any], elevation4 = elevation4.asInstanceOf[js.Any], elevation64 = elevation64.asInstanceOf[js.Any], elevation8 = elevation8.asInstanceOf[js.Any], roundedCorner2 = roundedCorner2.asInstanceOf[js.Any], roundedCorner4 = roundedCorner4.asInstanceOf[js.Any], roundedCorner6 = roundedCorner6.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEffects]
    }
    
    extension [Self <: IEffects](x: Self) {
      
      inline def setElevation16(value: String): Self = StObject.set(x, "elevation16", value.asInstanceOf[js.Any])
      
      inline def setElevation4(value: String): Self = StObject.set(x, "elevation4", value.asInstanceOf[js.Any])
      
      inline def setElevation64(value: String): Self = StObject.set(x, "elevation64", value.asInstanceOf[js.Any])
      
      inline def setElevation8(value: String): Self = StObject.set(x, "elevation8", value.asInstanceOf[js.Any])
      
      inline def setRoundedCorner2(value: String): Self = StObject.set(x, "roundedCorner2", value.asInstanceOf[js.Any])
      
      inline def setRoundedCorner4(value: String): Self = StObject.set(x, "roundedCorner4", value.asInstanceOf[js.Any])
      
      inline def setRoundedCorner6(value: String): Self = StObject.set(x, "roundedCorner6", value.asInstanceOf[js.Any])
    }
  }
}
