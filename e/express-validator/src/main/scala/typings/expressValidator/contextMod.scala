package typings.expressValidator

import typings.expressValidator.anon.RequiredOnly
import typings.expressValidator.baseMod.FieldInstance
import typings.expressValidator.baseMod.Location
import typings.expressValidator.baseMod.Meta
import typings.expressValidator.baseMod.ValidationError
import typings.expressValidator.contextItemMod.ContextItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    val _errors: js.Any = js.native
    
    def addError(message: js.Any, nestedErrors: js.Array[ValidationError]): Unit = js.native
    def addError(message: js.Any, value: js.Any, meta: Meta): Unit = js.native
    
    def addFieldInstances(instances: js.Array[FieldInstance]): Unit = js.native
    
    val dataMap: js.Any = js.native
    
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
  @js.native
  trait ReadonlyContext extends StObject {
    
    var _errors: js.Any = js.native
    
    @JSName("constructor")
    var constructor_Original: js.Function5[
        /* fields */ js.Array[String], 
        /* locations */ js.Array[Location], 
        /* stack */ js.Array[ContextItem], 
        /* optional */ Optional, 
        /* message */ js.UndefOr[js.Any], 
        js.Any
      ] = js.native
    
    var dataMap: js.Any = js.native
    
    def errors(): js.Array[ValidationError] = js.native
    @JSName("errors")
    var errors_Original: js.Function0[js.Array[ValidationError]] = js.native
    
    var fields: js.Array[String] = js.native
    
    def getData(): js.Array[FieldInstance] = js.native
    def getData(options: RequiredOnly): js.Array[FieldInstance] = js.native
    @JSName("getData")
    var getData_Original: js.Function1[/* options */ js.UndefOr[RequiredOnly], js.Array[FieldInstance]] = js.native
    
    var locations: js.Array[Location] = js.native
    
    var message: js.UndefOr[js.Any] = js.native
    
    var optional: Optional = js.native
    
    var stack: js.Array[ContextItem] = js.native
  }
}
