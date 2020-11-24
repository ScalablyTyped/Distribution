package typings.fastify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object schemaMod {
  
  type FastifySchemaCompiler = js.Function1[
    /* routeSchema */ typings.fastify.schemaMod.FastifyRouteSchemaDef, 
    typings.fastify.schemaMod.FastifyValidationResult
  ]
}
