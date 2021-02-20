package typings.gaugejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Color extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var font: String = js.native
    
    var fractionDigits: js.UndefOr[Double] = js.native
    
    var labels: js.Array[Double] = js.native
  }
  object Color {
    
    @scala.inline
    def apply(font: String, labels: js.Array[Double]): Color = {
      val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFractionDigits(value: Double): Self = StObject.set(x, "fractionDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFractionDigitsUndefined: Self = StObject.set(x, "fractionDigits", js.undefined)
      
      @scala.inline
      def setLabels(value: js.Array[Double]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsVarargs(value: Double*): Self = StObject.set(x, "labels", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DivColor extends StObject {
    
    var divColor: String = js.native
    
    var divLength: Double = js.native
    
    var divWidth: Double = js.native
    
    var divisions: Double = js.native
    
    var subColor: String = js.native
    
    var subDivisions: Double = js.native
    
    var subLength: Double = js.native
    
    var subWidth: Double = js.native
  }
  object DivColor {
    
    @scala.inline
    def apply(
      divColor: String,
      divLength: Double,
      divWidth: Double,
      divisions: Double,
      subColor: String,
      subDivisions: Double,
      subLength: Double,
      subWidth: Double
    ): DivColor = {
      val __obj = js.Dynamic.literal(divColor = divColor.asInstanceOf[js.Any], divLength = divLength.asInstanceOf[js.Any], divWidth = divWidth.asInstanceOf[js.Any], divisions = divisions.asInstanceOf[js.Any], subColor = subColor.asInstanceOf[js.Any], subDivisions = subDivisions.asInstanceOf[js.Any], subLength = subLength.asInstanceOf[js.Any], subWidth = subWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[DivColor]
    }
    
    @scala.inline
    implicit class DivColorMutableBuilder[Self <: DivColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDivColor(value: String): Self = StObject.set(x, "divColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivLength(value: Double): Self = StObject.set(x, "divLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivWidth(value: Double): Self = StObject.set(x, "divWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivisions(value: Double): Self = StObject.set(x, "divisions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubColor(value: String): Self = StObject.set(x, "subColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubDivisions(value: Double): Self = StObject.set(x, "subDivisions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubLength(value: Double): Self = StObject.set(x, "subLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubWidth(value: Double): Self = StObject.set(x, "subWidth", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FontSize extends StObject {
    
    var fontSize: String = js.native
  }
  object FontSize {
    
    @scala.inline
    def apply(fontSize: String): FontSize = {
      val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontSize]
    }
    
    @scala.inline
    implicit class FontSizeMutableBuilder[Self <: FontSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined gaugejs.gaugejs.PointerOptions & {  iconPath :string | undefined,   iconScale :number | undefined,   iconAngle :number | undefined} */
  @js.native
  trait PointerOptionsiconPathstr extends StObject {
    
    var color: String = js.native
    
    var iconAngle: js.UndefOr[Double] = js.native
    
    var iconPath: js.UndefOr[String] = js.native
    
    var iconScale: js.UndefOr[Double] = js.native
    
    var length: Double = js.native
    
    var strokeWidth: Double = js.native
  }
  object PointerOptionsiconPathstr {
    
    @scala.inline
    def apply(color: String, length: Double, strokeWidth: Double): PointerOptionsiconPathstr = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointerOptionsiconPathstr]
    }
    
    @scala.inline
    implicit class PointerOptionsiconPathstrMutableBuilder[Self <: PointerOptionsiconPathstr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconAngle(value: Double): Self = StObject.set(x, "iconAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconAngleUndefined: Self = StObject.set(x, "iconAngle", js.undefined)
      
      @scala.inline
      def setIconPath(value: String): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
      
      @scala.inline
      def setIconScale(value: Double): Self = StObject.set(x, "iconScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconScaleUndefined: Self = StObject.set(x, "iconScale", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined gaugejs.gaugejs.StaticZoneOptions & {  height :number} */
  @js.native
  trait StaticZoneOptionsheightnu extends StObject {
    
    var height: Double = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    var strokeStyle: String = js.native
  }
  object StaticZoneOptionsheightnu {
    
    @scala.inline
    def apply(height: Double, max: Double, min: Double, strokeStyle: String): StaticZoneOptionsheightnu = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticZoneOptionsheightnu]
    }
    
    @scala.inline
    implicit class StaticZoneOptionsheightnuMutableBuilder[Self <: StaticZoneOptionsheightnu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    }
  }
}
