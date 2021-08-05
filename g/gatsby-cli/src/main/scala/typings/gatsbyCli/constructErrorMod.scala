package typings.gatsbyCli

import typings.gatsbyCli.errorMapMod.ErrorId
import typings.gatsbyCli.errorMapMod.IErrorMapEntry
import typings.gatsbyCli.structuredErrorsTypesMod.IConstructError
import typings.gatsbyCli.structuredErrorsTypesMod.IStructuredError
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constructErrorMod {
  
  @JSImport("gatsby-cli/lib/structured-errors/construct-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasHasIdOtherDetails: IConstructError, suppliedErrorMap: Record[ErrorId, IErrorMapEntry]): IStructuredError = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasHasIdOtherDetails.asInstanceOf[js.Any], suppliedErrorMap.asInstanceOf[js.Any])).asInstanceOf[IStructuredError]
}
