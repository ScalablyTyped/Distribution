package typings.fastify.anon

import typings.fastify.instanceMod.FastifyInstance
import typings.fastify.loggerMod.FastifyBaseLogger
import typings.fastify.typeProviderMod.FastifyTypeProviderDefault
import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerDefault
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add extends StObject {
  
  def add(schema: Any): FastifyInstance[
    RawServerDefault, 
    RawRequestDefaultExpression[RawServerDefault], 
    RawReplyDefaultExpression[RawServerDefault], 
    FastifyBaseLogger, 
    FastifyTypeProviderDefault
  ]
  
  def getSchema(schemaId: String): Any
  
  def getSchemas(): Record[String, Any]
}
object Add {
  
  inline def apply(
    add: Any => FastifyInstance[
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      RawReplyDefaultExpression[RawServerDefault], 
      FastifyBaseLogger, 
      FastifyTypeProviderDefault
    ],
    getSchema: String => Any,
    getSchemas: () => Record[String, Any]
  ): Add = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getSchema = js.Any.fromFunction1(getSchema), getSchemas = js.Any.fromFunction0(getSchemas))
    __obj.asInstanceOf[Add]
  }
  
  extension [Self <: Add](x: Self) {
    
    inline def setAdd(
      value: Any => FastifyInstance[
          RawServerDefault, 
          RawRequestDefaultExpression[RawServerDefault], 
          RawReplyDefaultExpression[RawServerDefault], 
          FastifyBaseLogger, 
          FastifyTypeProviderDefault
        ]
    ): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setGetSchema(value: String => Any): Self = StObject.set(x, "getSchema", js.Any.fromFunction1(value))
    
    inline def setGetSchemas(value: () => Record[String, Any]): Self = StObject.set(x, "getSchemas", js.Any.fromFunction0(value))
  }
}
