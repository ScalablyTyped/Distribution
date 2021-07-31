package typings.formSerializer

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormSerializer {
  
  trait FormSerializerPatterns extends StObject {
    
    var fixed: RegExp
    
    var key: RegExp
    
    var named: RegExp
    
    var push: RegExp
    
    var validate: RegExp
  }
  object FormSerializerPatterns {
    
    @scala.inline
    def apply(fixed: RegExp, key: RegExp, named: RegExp, push: RegExp, validate: RegExp): FormSerializerPatterns = {
      val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormSerializerPatterns]
    }
    
    @scala.inline
    implicit class FormSerializerPatternsMutableBuilder[Self <: FormSerializerPatterns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixed(value: RegExp): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: RegExp): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamed(value: RegExp): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPush(value: RegExp): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidate(value: RegExp): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    }
  }
}
