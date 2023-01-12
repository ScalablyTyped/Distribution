package typings.expressValidator

import typings.expressValidator.anon.RequiredOnly
import typings.expressValidator.srcBaseMod.FieldInstance
import typings.expressValidator.srcBaseMod.Location
import typings.expressValidator.srcBaseMod.Meta
import typings.expressValidator.srcBaseMod.ValidationError
import typings.expressValidator.srcContextItemsContextItemMod.ContextItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcContextMod {
  
  @JSImport("express-validator/src/context", "Context")
  @js.native
  open class Context protected () extends StObject {
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
      message: Any
    ) = this()
    
    /* private */ val _errors: Any = js.native
    
    def addError(message: Any, nestedErrors: js.Array[ValidationError]): Unit = js.native
    def addError(message: Any, value: Any, meta: Meta): Unit = js.native
    
    def addFieldInstances(instances: js.Array[FieldInstance]): Unit = js.native
    
    /* private */ val dataMap: Any = js.native
    
    def errors: js.Array[ValidationError] = js.native
    
    val fields: js.Array[String] = js.native
    
    def getData(): js.Array[FieldInstance] = js.native
    def getData(options: RequiredOnly): js.Array[FieldInstance] = js.native
    
    val locations: js.Array[Location] = js.native
    
    val message: js.UndefOr[Any] = js.native
    
    val optional: Optional = js.native
    
    def setData(path: String, value: Any, location: Location): Unit = js.native
    
    val stack: js.Array[ContextItem] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressValidator.anon.Nullable
    - typings.expressValidator.expressValidatorBooleans.`false`
  */
  trait Optional extends StObject
  
  /* Inlined std.Pick<express-validator.express-validator/src/context.Context, std.Exclude<keyof express-validator.express-validator/src/context.Context, 'setData' | 'addFieldInstances' | 'addError'>> */
  trait ReadonlyContext extends StObject {
    
    var _errors: Any
    
    @JSName("constructor")
    var constructor_Original: js.Function5[
        /* fields */ js.Array[String], 
        /* locations */ js.Array[Location], 
        /* stack */ js.Array[ContextItem], 
        /* optional */ Optional, 
        /* message */ js.UndefOr[Any], 
        Any
      ]
    
    var dataMap: Any
    
    def errors(): js.Array[ValidationError]
    @JSName("errors")
    var errors_Original: js.Function0[js.Array[ValidationError]]
    
    var fields: js.Array[String]
    
    def getData(): js.Array[FieldInstance]
    def getData(options: RequiredOnly): js.Array[FieldInstance]
    @JSName("getData")
    var getData_Original: js.Function1[/* options */ js.UndefOr[RequiredOnly], js.Array[FieldInstance]]
    
    var locations: js.Array[Location]
    
    var message: js.UndefOr[Any] = js.undefined
    
    var optional: Optional
    
    var stack: js.Array[ContextItem]
  }
  object ReadonlyContext {
    
    inline def apply(
      _errors: Any,
      constructor: (/* fields */ js.Array[String], /* locations */ js.Array[Location], /* stack */ js.Array[ContextItem], /* optional */ Optional, /* message */ js.UndefOr[Any]) => Any,
      dataMap: Any,
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyContext] (val x: Self) extends AnyVal {
      
      inline def setConstructor(
        value: (/* fields */ js.Array[String], /* locations */ js.Array[Location], /* stack */ js.Array[ContextItem], /* optional */ Optional, /* message */ js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "constructor", js.Any.fromFunction5(value))
      
      inline def setDataMap(value: Any): Self = StObject.set(x, "dataMap", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: () => js.Array[ValidationError]): Self = StObject.set(x, "errors", js.Any.fromFunction0(value))
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setGetData(value: /* options */ js.UndefOr[RequiredOnly] => js.Array[FieldInstance]): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
      
      inline def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value*))
      
      inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOptional(value: Optional): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setStack(value: js.Array[ContextItem]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: ContextItem*): Self = StObject.set(x, "stack", js.Array(value*))
      
      inline def set_errors(value: Any): Self = StObject.set(x, "_errors", value.asInstanceOf[js.Any])
    }
  }
}
