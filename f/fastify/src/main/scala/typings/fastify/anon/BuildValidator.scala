package typings.fastify.anon

import typings.fastJsonStringify.mod.Options
import typings.fastify.typesSchemaMod.FastifySerializerCompiler
import typings.fastifyAjvCompiler.mod.Ajv
import typings.fastifyAjvCompiler.mod.ValidatorCompiler
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildValidator extends StObject {
  
  var buildSerializer: js.UndefOr[
    js.Function2[
      /* externalSchemas */ Any, 
      /* serializerOptsServerOption */ js.UndefOr[Options | (Record[String, Any])], 
      FastifySerializerCompiler[Any]
    ]
  ] = js.undefined
  
  var buildValidator: js.UndefOr[ValidatorCompiler] = js.undefined
}
object BuildValidator {
  
  inline def apply(): BuildValidator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildValidator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildValidator] (val x: Self) extends AnyVal {
    
    inline def setBuildSerializer(
      value: (/* externalSchemas */ Any, /* serializerOptsServerOption */ js.UndefOr[Options | (Record[String, Any])]) => FastifySerializerCompiler[Any]
    ): Self = StObject.set(x, "buildSerializer", js.Any.fromFunction2(value))
    
    inline def setBuildSerializerUndefined: Self = StObject.set(x, "buildSerializer", js.undefined)
    
    inline def setBuildValidator(value: (/* externalSchemas */ Any, /* options */ typings.ajv.distCoreMod.Options) => Ajv): Self = StObject.set(x, "buildValidator", js.Any.fromFunction2(value))
    
    inline def setBuildValidatorUndefined: Self = StObject.set(x, "buildValidator", js.undefined)
  }
}
