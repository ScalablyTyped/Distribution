package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to look up representative information for a single division.
  */
trait SchemaDivisionRepresentativeInfoRequest extends StObject {
  
  var contextParams: js.UndefOr[SchemaContextParams] = js.undefined
}
object SchemaDivisionRepresentativeInfoRequest {
  
  @scala.inline
  def apply(): SchemaDivisionRepresentativeInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDivisionRepresentativeInfoRequest]
  }
  
  @scala.inline
  implicit class SchemaDivisionRepresentativeInfoRequestMutableBuilder[Self <: SchemaDivisionRepresentativeInfoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextParams(value: SchemaContextParams): Self = StObject.set(x, "contextParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextParamsUndefined: Self = StObject.set(x, "contextParams", js.undefined)
  }
}
