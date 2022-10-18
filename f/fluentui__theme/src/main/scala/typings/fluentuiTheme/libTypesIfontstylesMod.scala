package typings.fluentuiTheme

import typings.fluentuiMergeStyles.libIrawstyleMod.IRawStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesIfontstylesMod {
  
  trait IFontStyles extends StObject {
    
    var large: IRawStyle
    
    var medium: IRawStyle
    
    var mediumPlus: IRawStyle
    
    var mega: IRawStyle
    
    var small: IRawStyle
    
    var smallPlus: IRawStyle
    
    var superLarge: IRawStyle
    
    var tiny: IRawStyle
    
    var xLarge: IRawStyle
    
    /**
      * @deprecated Exists for forward compatibility with Fabric 7's Fluent theme.
      * Not recommended for use with Fabric 6.
      */
    var xLargePlus: IRawStyle
    
    var xSmall: IRawStyle
    
    var xxLarge: IRawStyle
    
    /**
      * @deprecated Exists for forward compatibility with Fabric 7's Fluent theme
      * Not recommended for use with Fabric 6.
      */
    var xxLargePlus: IRawStyle
  }
  object IFontStyles {
    
    inline def apply(
      large: IRawStyle,
      medium: IRawStyle,
      mediumPlus: IRawStyle,
      mega: IRawStyle,
      small: IRawStyle,
      smallPlus: IRawStyle,
      superLarge: IRawStyle,
      tiny: IRawStyle,
      xLarge: IRawStyle,
      xLargePlus: IRawStyle,
      xSmall: IRawStyle,
      xxLarge: IRawStyle,
      xxLargePlus: IRawStyle
    ): IFontStyles = {
      val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], mediumPlus = mediumPlus.asInstanceOf[js.Any], mega = mega.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], smallPlus = smallPlus.asInstanceOf[js.Any], superLarge = superLarge.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any], xLarge = xLarge.asInstanceOf[js.Any], xLargePlus = xLargePlus.asInstanceOf[js.Any], xSmall = xSmall.asInstanceOf[js.Any], xxLarge = xxLarge.asInstanceOf[js.Any], xxLargePlus = xxLargePlus.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFontStyles]
    }
    
    extension [Self <: IFontStyles](x: Self) {
      
      inline def setLarge(value: IRawStyle): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setMedium(value: IRawStyle): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setMediumPlus(value: IRawStyle): Self = StObject.set(x, "mediumPlus", value.asInstanceOf[js.Any])
      
      inline def setMega(value: IRawStyle): Self = StObject.set(x, "mega", value.asInstanceOf[js.Any])
      
      inline def setSmall(value: IRawStyle): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallPlus(value: IRawStyle): Self = StObject.set(x, "smallPlus", value.asInstanceOf[js.Any])
      
      inline def setSuperLarge(value: IRawStyle): Self = StObject.set(x, "superLarge", value.asInstanceOf[js.Any])
      
      inline def setTiny(value: IRawStyle): Self = StObject.set(x, "tiny", value.asInstanceOf[js.Any])
      
      inline def setXLarge(value: IRawStyle): Self = StObject.set(x, "xLarge", value.asInstanceOf[js.Any])
      
      inline def setXLargePlus(value: IRawStyle): Self = StObject.set(x, "xLargePlus", value.asInstanceOf[js.Any])
      
      inline def setXSmall(value: IRawStyle): Self = StObject.set(x, "xSmall", value.asInstanceOf[js.Any])
      
      inline def setXxLarge(value: IRawStyle): Self = StObject.set(x, "xxLarge", value.asInstanceOf[js.Any])
      
      inline def setXxLargePlus(value: IRawStyle): Self = StObject.set(x, "xxLargePlus", value.asInstanceOf[js.Any])
    }
  }
}
