package typings.gaugejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Color extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var font: String
    
    var fractionDigits: js.UndefOr[Double] = js.undefined
    
    var labels: js.Array[Double]
  }
  object Color {
    
    inline def apply(font: String, labels: js.Array[Double]): Color = {
      val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFractionDigits(value: Double): Self = StObject.set(x, "fractionDigits", value.asInstanceOf[js.Any])
      
      inline def setFractionDigitsUndefined: Self = StObject.set(x, "fractionDigits", js.undefined)
      
      inline def setLabels(value: js.Array[Double]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsVarargs(value: Double*): Self = StObject.set(x, "labels", js.Array(value*))
    }
  }
  
  trait DivColor extends StObject {
    
    var divColor: String
    
    var divLength: Double
    
    var divWidth: Double
    
    var divisions: Double
    
    var subColor: String
    
    var subDivisions: Double
    
    var subLength: Double
    
    var subWidth: Double
  }
  object DivColor {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: DivColor] (val x: Self) extends AnyVal {
      
      inline def setDivColor(value: String): Self = StObject.set(x, "divColor", value.asInstanceOf[js.Any])
      
      inline def setDivLength(value: Double): Self = StObject.set(x, "divLength", value.asInstanceOf[js.Any])
      
      inline def setDivWidth(value: Double): Self = StObject.set(x, "divWidth", value.asInstanceOf[js.Any])
      
      inline def setDivisions(value: Double): Self = StObject.set(x, "divisions", value.asInstanceOf[js.Any])
      
      inline def setSubColor(value: String): Self = StObject.set(x, "subColor", value.asInstanceOf[js.Any])
      
      inline def setSubDivisions(value: Double): Self = StObject.set(x, "subDivisions", value.asInstanceOf[js.Any])
      
      inline def setSubLength(value: Double): Self = StObject.set(x, "subLength", value.asInstanceOf[js.Any])
      
      inline def setSubWidth(value: Double): Self = StObject.set(x, "subWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait FontSize extends StObject {
    
    var fontSize: String
  }
  object FontSize {
    
    inline def apply(fontSize: String): FontSize = {
      val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FontSize] (val x: Self) extends AnyVal {
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined gaugejs.gaugejs.PointerOptions & {  iconPath :string | undefined,   iconScale :number | undefined,   iconAngle :number | undefined} */
  trait PointerOptionsiconPathstr extends StObject {
    
    var color: String
    
    var iconAngle: js.UndefOr[Double] = js.undefined
    
    var iconPath: js.UndefOr[String] = js.undefined
    
    var iconScale: js.UndefOr[Double] = js.undefined
    
    var length: Double
    
    var strokeWidth: Double
  }
  object PointerOptionsiconPathstr {
    
    inline def apply(color: String, length: Double, strokeWidth: Double): PointerOptionsiconPathstr = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointerOptionsiconPathstr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointerOptionsiconPathstr] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setIconAngle(value: Double): Self = StObject.set(x, "iconAngle", value.asInstanceOf[js.Any])
      
      inline def setIconAngleUndefined: Self = StObject.set(x, "iconAngle", js.undefined)
      
      inline def setIconPath(value: String): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
      
      inline def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
      
      inline def setIconScale(value: Double): Self = StObject.set(x, "iconScale", value.asInstanceOf[js.Any])
      
      inline def setIconScaleUndefined: Self = StObject.set(x, "iconScale", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined gaugejs.gaugejs.StaticZoneOptions & {  height :number} */
  trait StaticZoneOptionsheightnu extends StObject {
    
    var height: Double
    
    var max: Double
    
    var min: Double
    
    var strokeStyle: String
  }
  object StaticZoneOptionsheightnu {
    
    inline def apply(height: Double, max: Double, min: Double, strokeStyle: String): StaticZoneOptionsheightnu = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticZoneOptionsheightnu]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StaticZoneOptionsheightnu] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    }
  }
}
