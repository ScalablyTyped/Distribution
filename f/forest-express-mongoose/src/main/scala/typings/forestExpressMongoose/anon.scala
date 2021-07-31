package typings.forestExpressMongoose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attributes extends StObject {
    
    var attributes: Value
    
    var id: String
    
    var `type`: String
  }
  object Attributes {
    
    @scala.inline
    def apply(attributes: Value, id: String, `type`: String): Attributes = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attributes]
    }
    
    @scala.inline
    implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Value): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var enums: js.UndefOr[js.Array[String]] = js.undefined
    
    var field: String
    
    var isRequired: js.UndefOr[Boolean] = js.undefined
    
    var reference: js.UndefOr[String] = js.undefined
    
    var `type`: String | js.Array[String]
  }
  object Description {
    
    @scala.inline
    def apply(field: String, `type`: String | js.Array[String]): Description = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEnums(value: js.Array[String]): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumsUndefined: Self = StObject.set(x, "enums", js.undefined)
      
      @scala.inline
      def setEnumsVarargs(value: String*): Self = StObject.set(x, "enums", js.Array(value :_*))
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
      
      @scala.inline
      def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
      
      @scala.inline
      def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
    }
  }
  
  trait Value extends StObject {
    
    var value: js.Array[js.Any]
  }
  object Value {
    
    @scala.inline
    def apply(value: js.Array[js.Any]): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
