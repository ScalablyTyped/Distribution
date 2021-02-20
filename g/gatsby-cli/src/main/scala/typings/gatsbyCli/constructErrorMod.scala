package typings.gatsbyCli

import typings.gatsbyCli.errorMapMod.ErrorId
import typings.gatsbyCli.errorMapMod.IErrorMapEntry
import typings.gatsbyCli.structuredErrorsTypesMod.IConstructError
import typings.gatsbyCli.structuredErrorsTypesMod.IStructuredError
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constructErrorMod {
  
  @JSImport("gatsby-cli/lib/structured-errors/construct-error", JSImport.Default)
  @js.native
  def default(hasDetails: IConstructError, suppliedErrorMap: Record[ErrorId, IErrorMapEntry]): IStructuredError = js.native
}
