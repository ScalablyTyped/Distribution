package typings.emberData

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registriesTransformMod {
  
  @js.native
  trait TransformRegistry extends StObject {
    
    var boolean: Boolean = js.native
    
    var date: Date = js.native
    
    var number: Double = js.native
    
    var string: String = js.native
  }
  object TransformRegistry {
    
    @scala.inline
    def apply(boolean: Boolean, date: Date, number: Double, string: String): TransformRegistry = {
      val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformRegistry]
    }
    
    @scala.inline
    implicit class TransformRegistryMutableBuilder[Self <: TransformRegistry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoolean(value: Boolean): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
