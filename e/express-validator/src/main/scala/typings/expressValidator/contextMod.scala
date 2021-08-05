package typings.expressValidator

import typings.expressValidator.anon.RequiredOnly
import typings.expressValidator.baseMod.FieldInstance
import typings.expressValidator.baseMod.Location
import typings.expressValidator.baseMod.Meta
import typings.expressValidator.baseMod.ValidationError
import typings.expressValidator.contextItemMod.ContextItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("express-validator/src/context", "Context")
  @js.native
  class Context protected () extends StObject {
    def this(
      fields: js.Array[String],
      locations: js.Array[Location],
      stack: js.Array[ContextItem],
      optional: Optional
    ) = this()
    def this(
      fields: js.Array[String],
      locations: js.Array[Location],
      stack: js.Array[ContextItem],
      optional: Optional,
      message: js.Any
    ) = this()
    
    /* private */ val _errors: js.Any = js.native
    
    def addError(message: js.Any, nestedErrors: js.Array[ValidationError]): Unit = js.native
    def addError(message: js.Any, value: js.Any, meta: Meta): Unit = js.native
    
    def addFieldInstances(instances: js.Array[FieldInstance]): Unit = js.native
    
    /* private */ val dataMap: js.Any = js.native
    
    def errors: js.Array[ValidationError] = js.native
    
    val fields: js.Array[String] = js.native
    
    def getData(): js.Array[FieldInstance] = js.native
    def getData(options: RequiredOnly): js.Array[FieldInstance] = js.native
    
    val locations: js.Array[Location] = js.native
    
    val message: js.UndefOr[js.Any] = js.native
    
    val optional: Optional = js.native
    
    def setData(path: String, value: js.Any, location: Location): Unit = js.native
    
    val stack: js.Array[ContextItem] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressValidator.anon.Nullable
    - typings.expressValidator.expressValidatorBooleans.`false`
  */
  trait Optional extends StObject
  
  /* Inlined std.Pick<express-validator.express-validator/src/context.Context, std.Exclude<keyof express-validator.express-validator/src/context.Context, 'setData' | 'addFieldInstances' | 'addError'>> */
  trait ReadonlyContext extends StObject {
    
    var _errors: js.Any
    
    @JSName("constructor")
    var constructor_Original: js.Function5[
        /* fields */ js.Array[String], 
        /* locations */ js.Array[Location], 
        /* stack */ js.Array[ContextItem], 
        /* optional */ Optional, 
        /* message */ js.UndefOr[js.Any], 
        js.Any
      ]
    
    var dataMap: js.Any
    
    def errors(): js.Array[ValidationError]
    @JSName("errors")
    var errors_Original: js.Function0[js.Array[ValidationError]]
    
    var fields: js.Array[String]
    
    def getData(): js.Array[FieldInstance]
    def getData(options: RequiredOnly): js.Array[FieldInstance]
    @JSName("getData")
    var getData_Original: js.Function1[/* options */ js.UndefOr[RequiredOnly], js.Array[FieldInstance]]
    
    var locations: js.Array[Location]
    
    var message: js.UndefOr[js.Any] = js.undefined
    
    var optional: Optional
    
    var stack: js.Array[ContextItem]
  }
  object ReadonlyContext {
    
    inline def apply(
      _errors: js.Any,
      constructor: (/* fields */ js.Array[String], /* locations */ js.Array[Location], /* stack */ js.Array[ContextItem], /* optional */ Optional, /* message */ js.UndefOr[js.Any]) => js.Any,
      dataMap: js.Any,
      errors: () => js.Array[ValidationError],
      fields: js.Array[String],
      getData: /* options */ js.UndefOr[RequiredOnly] => js.Array[FieldInstance],
      locations: js.Array[Location],
      optional: Optional,
      stack: js.Array[ContextItem]
    ): ReadonlyContext = {
      val __obj = js.Dynamic.literal(_errors = _errors.asInstanceOf[js.Any], constructor = js.Any.fromFunction5(constructor), dataMap = dataMap.asInstanceOf[js.Any], errors = js.Any.fromFunction0(errors), fields = fields.asInstanceOf[js.Any], getData = js.Any.fromFunction1(getData), locations = locations.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyContext]
    }
    
    extension [Self <: ReadonlyContext](x: Self) {
      
      inline def setConstructor(
        value: (/* fields */ js.Array[String], /* locations */ js.Array[Location], /* stack */ js.Array[ContextItem], /* optional */ Optional, /* message */ js.UndefOr[js.Any]) => js.Any
      ): Self = StObject.set(x, "constructor", js.Any.fromFunction5(value))
      
      inline def setDataMap(value: js.Any): Self = StObject.set(x, "dataMap", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: () => js.Array[ValidationError]): Self = StObject.set(x, "errors", js.Any.fromFunction0(value))
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      inline def setGetData(value: /* options */ js.UndefOr[RequiredOnly] => js.Array[FieldInstance]): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
      
      inline def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      inline def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOptional(value: Optional): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setStack(value: js.Array[ContextItem]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: ContextItem*): Self = StObject.set(x, "stack", js.Array(value :_*))
      
      inline def set_errors(value: js.Any): Self = StObject.set(x, "_errors", value.asInstanceOf[js.Any])
    }
  }
}
