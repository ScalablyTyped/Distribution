package typings.fastify.anon

import typings.fastify.typesInstanceMod.FastifyInstance
import typings.fastify.typesLoggerMod.FastifyBaseLogger
import typings.fastify.typesTypeProviderMod.FastifyTypeProviderDefault
import typings.fastify.typesUtilsMod.RawReplyDefaultExpression
import typings.fastify.typesUtilsMod.RawRequestDefaultExpression
import typings.fastify.typesUtilsMod.RawServerDefault
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
    
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
