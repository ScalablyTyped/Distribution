package typings.emberUtils

import typings.emberUtils.emberUtilsStrings.`object`
import typings.std.Date
import typings.std.Error
import typings.std.FileList
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type FunctionArgs[F] = (js.Tuple5[js.Any, js.Any, js.Any, js.Any, js.Any]) | (js.Tuple4[js.Any, js.Any, js.Any, js.Any]) | (js.Tuple3[js.Any, js.Any, js.Any]) | (js.Tuple2[js.Any, js.Any]) | js.Array[js.Any]
  
  type KeysOfType[Base, Condition] = /* keyof std.Pick<Base, {[ Key in keyof Base ]: Base[Key] extends Condition? Key : never}[keyof Base]> */ String
  
  trait TypeLookup extends StObject {
    
    var array: js.Array[js.Any]
    
    var boolean: Boolean
    
    var date: Date
    
    var error: Error
    
    var filelist: FileList
    
    def function(args: js.Any*): js.Any
    
    var `null`: Null
    
    var number: Double
    
    var regexp: RegExp
    
    var string: String
    
    var undefined: Unit
  }
  object TypeLookup {
    
    inline def apply(
      array: js.Array[js.Any],
      boolean: Boolean,
      date: Date,
      error: Error,
      filelist: FileList,
      function: /* repeated */ js.Any => js.Any,
      `null`: Null,
      number: Double,
      regexp: RegExp,
      string: String,
      undefined: Unit
    ): TypeLookup = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], filelist = filelist.asInstanceOf[js.Any], function = js.Any.fromFunction1(function), number = number.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
      __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeLookup]
    }
    
    extension [Self <: TypeLookup](x: Self) {
      
      inline def setArray(value: js.Array[js.Any]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayVarargs(value: js.Any*): Self = StObject.set(x, "array", js.Array(value :_*))
      
      inline def setBoolean(value: Boolean): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFilelist(value: FileList): Self = StObject.set(x, "filelist", value.asInstanceOf[js.Any])
      
      inline def setFunction(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "function", js.Any.fromFunction1(value))
      
      inline def setNull(value: Null): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setRegexp(value: RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setUndefined(value: Unit): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeOf[Base, Condition] = (KeysOfType[Base, Condition]) | `object`
}
