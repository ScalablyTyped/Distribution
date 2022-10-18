package typings.fastify.anon

import typings.fastJsonStringify.mod.Options
import typings.fastifyAjvCompiler.mod.Ajv
import typings.fastifyAjvCompiler.mod.ValidatorCompiler
import typings.fastifyFastJsonStringifyCompiler.mod.SerializerCompiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildSerializer extends StObject {
  
  var buildSerializer: js.UndefOr[SerializerCompiler] = js.undefined
  
  var buildValidator: js.UndefOr[ValidatorCompiler] = js.undefined
}
object BuildSerializer {
  
  inline def apply(): BuildSerializer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildSerializer]
  }
  
  extension [Self <: BuildSerializer](x: Self) {
    
    inline def setBuildSerializer(value: (/* externalSchemas */ Any, /* options */ Options) => js.Function1[/* doc */ Any, String]): Self = StObject.set(x, "buildSerializer", js.Any.fromFunction2(value))
    
    inline def setBuildSerializerUndefined: Self = StObject.set(x, "buildSerializer", js.undefined)
    
    inline def setBuildValidator(value: (/* externalSchemas */ Any, /* options */ typings.ajv.distCoreMod.Options) => Ajv): Self = StObject.set(x, "buildValidator", js.Any.fromFunction2(value))
    
    inline def setBuildValidatorUndefined: Self = StObject.set(x, "buildValidator", js.undefined)
  }
}
