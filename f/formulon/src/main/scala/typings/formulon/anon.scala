package typings.formulon

import typings.formulon.formulonStrings.`null`
import typings.formulon.formulonStrings.checkbox
import typings.formulon.formulonStrings.date
import typings.formulon.formulonStrings.datetime
import typings.formulon.formulonStrings.geolocation
import typings.formulon.formulonStrings.literal
import typings.formulon.formulonStrings.number
import typings.formulon.formulonStrings.text
import typings.formulon.formulonStrings.time
import typings.formulon.mod.Literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Length extends StObject {
    
    var length: Double
    
    var scale: Double
  }
  object Length {
    
    inline def apply(length: Double, scale: Double): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  trait LengthNumber extends StObject {
    
    var length: Double
  }
  object LengthNumber {
    
    inline def apply(length: Double): LengthNumber = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[LengthNumber]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LengthNumber] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined formulon.formulon.TypeInfoNumber & {  type :'literal',   value :string | number | boolean} */
  trait TypeInfoNumbertypeliteral
    extends StObject
       with Literal {
    
    var dataType: number
    
    var options: Length
    
    var `type`: literal
    
    var value: String | Double | Boolean
  }
  object TypeInfoNumbertypeliteral {
    
    inline def apply(options: Length, value: String | Double | Boolean): TypeInfoNumbertypeliteral = {
      val __obj = js.Dynamic.literal(dataType = "number", options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("literal")
      __obj.asInstanceOf[TypeInfoNumbertypeliteral]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeInfoNumbertypeliteral] (val x: Self) extends AnyVal {
      
      inline def setDataType(value: number): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Length): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setType(value: literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined formulon.formulon.TypeInfoOther & {  type :'literal',   value :string | number | boolean} */
  trait TypeInfoOthertypeliteralv
    extends StObject
       with Literal {
    
    var dataType: checkbox | date | time | datetime | geolocation | `null`
    
    var options: js.UndefOr[js.Object] = js.undefined
    
    var `type`: literal
    
    var value: String | Double | Boolean
  }
  object TypeInfoOthertypeliteralv {
    
    inline def apply(
      dataType: checkbox | date | time | datetime | geolocation | `null`,
      value: String | Double | Boolean
    ): TypeInfoOthertypeliteralv = {
      val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("literal")
      __obj.asInstanceOf[TypeInfoOthertypeliteralv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeInfoOthertypeliteralv] (val x: Self) extends AnyVal {
      
      inline def setDataType(value: checkbox | date | time | datetime | geolocation | `null`): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setType(value: literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined formulon.formulon.TypeInfoText & {  type :'literal',   value :string | number | boolean} */
  trait TypeInfoTexttypeliteralva
    extends StObject
       with Literal {
    
    var dataType: text
    
    var options: LengthNumber
    
    var `type`: literal
    
    var value: String | Double | Boolean
  }
  object TypeInfoTexttypeliteralva {
    
    inline def apply(options: LengthNumber, value: String | Double | Boolean): TypeInfoTexttypeliteralva = {
      val __obj = js.Dynamic.literal(dataType = "text", options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("literal")
      __obj.asInstanceOf[TypeInfoTexttypeliteralva]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeInfoTexttypeliteralva] (val x: Self) extends AnyVal {
      
      inline def setDataType(value: text): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: LengthNumber): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setType(value: literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
