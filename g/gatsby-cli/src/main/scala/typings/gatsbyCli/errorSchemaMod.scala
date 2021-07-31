package typings.gatsbyCli

import typings.gatsbyCli.structuredErrorsTypesMod.ILocationPosition
import typings.gatsbyCli.structuredErrorsTypesMod.IStructuredError
import typings.hapiJoi.mod.ObjectSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorSchemaMod {
  
  @JSImport("gatsby-cli/lib/structured-errors/error-schema", "Position")
  @js.native
  val Position: ObjectSchema[ILocationPosition] = js.native
  
  @JSImport("gatsby-cli/lib/structured-errors/error-schema", "errorSchema")
  @js.native
  val errorSchema: ObjectSchema[IStructuredError] = js.native
}
