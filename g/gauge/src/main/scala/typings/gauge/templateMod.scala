package typings.gauge

import typings.gauge.gaugeStrings.activityIndicator
import typings.gauge.gaugeStrings.center
import typings.gauge.gaugeStrings.completed
import typings.gauge.gaugeStrings.left
import typings.gauge.gaugeStrings.progressbar
import typings.gauge.gaugeStrings.right
import typings.gauge.gaugeStrings.section
import typings.gauge.gaugeStrings.subsection
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateMod {
  
  type LiteralUnion[T, BaseType /* <: Primitive */] = T | (BaseType & (Record[scala.Nothing, scala.Nothing]))
  
  type Primitive = js.UndefOr[String | Double | Boolean | Null]
  
  type Status = Partial[Record[TemplateType, Primitive]]
  
  type Template = js.Array[String | TemplateObject]
  
  trait TemplateObject extends StObject {
    
    /**
      * A default value to use for this template item if a value wasn't otherwise
      * passed in.
      */
    var default: js.UndefOr[Primitive] = js.undefined
    
    /**
      * Works as you'd expect from word processors.
      * @default 'left'
      */
    var align: js.UndefOr[left | right | center] = js.undefined
    
    /**
      * Number of spaces that must be between this item and other items, if this
      * item is displayed at all.
      */
    var kerning: js.UndefOr[Double] = js.undefined
    
    /**
      * Provides a single value for both minLength and maxLength. If both length
      * and minLength or maxLength are specified then the latter take precedence.
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum length for this element. If its value is longer it will be
      * truncated.
      */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum length for this element. If its value is shorter it will be
      * padded according to the align value.
      */
    var minLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Can be any of the following plus any keys you pass into gauge.show plus any
      * keys you have on a custom theme.
      */
    var `type`: TemplateType
    
    /**
      * A literal value to use for this template item.
      */
    var value: js.UndefOr[Primitive] = js.undefined
  }
  object TemplateObject {
    
    inline def apply(`type`: TemplateType): TemplateObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateObject] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: left | right | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setDefault(value: Primitive): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setKerning(value: Double): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      inline def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setType(value: TemplateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Primitive): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type TemplateType = LiteralUnion[section | subsection | progressbar | activityIndicator | completed, String]
}
