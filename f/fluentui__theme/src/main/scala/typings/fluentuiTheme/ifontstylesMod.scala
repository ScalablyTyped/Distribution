package typings.fluentuiTheme

import typings.uifabricMergeStyles.irawstyleMod.IRawStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ifontstylesMod {
  
  @js.native
  trait IFontStyles extends StObject {
    
    var large: IRawStyle = js.native
    
    var medium: IRawStyle = js.native
    
    var mediumPlus: IRawStyle = js.native
    
    var mega: IRawStyle = js.native
    
    var small: IRawStyle = js.native
    
    var smallPlus: IRawStyle = js.native
    
    var superLarge: IRawStyle = js.native
    
    var tiny: IRawStyle = js.native
    
    var xLarge: IRawStyle = js.native
    
    /**
      * @deprecated Exists for forward compatibility with Fabric 7's Fluent theme.
      * Not recommended for use with Fabric 6.
      */
    var xLargePlus: IRawStyle = js.native
    
    var xSmall: IRawStyle = js.native
    
    var xxLarge: IRawStyle = js.native
    
    /**
      * @deprecated Exists for forward compatibility with Fabric 7's Fluent theme
      * Not recommended for use with Fabric 6.
      */
    var xxLargePlus: IRawStyle = js.native
  }
  object IFontStyles {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IFontStylesMutableBuilder[Self <: IFontStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLarge(value: IRawStyle): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedium(value: IRawStyle): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediumPlus(value: IRawStyle): Self = StObject.set(x, "mediumPlus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMega(value: IRawStyle): Self = StObject.set(x, "mega", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmall(value: IRawStyle): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallPlus(value: IRawStyle): Self = StObject.set(x, "smallPlus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperLarge(value: IRawStyle): Self = StObject.set(x, "superLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiny(value: IRawStyle): Self = StObject.set(x, "tiny", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXLarge(value: IRawStyle): Self = StObject.set(x, "xLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXLargePlus(value: IRawStyle): Self = StObject.set(x, "xLargePlus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXSmall(value: IRawStyle): Self = StObject.set(x, "xSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxLarge(value: IRawStyle): Self = StObject.set(x, "xxLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxLargePlus(value: IRawStyle): Self = StObject.set(x, "xxLargePlus", value.asInstanceOf[js.Any])
    }
  }
}
