package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryParams
  extends StObject
     with CommonQueryFilters {
  
  /**
    * Resource ID,  if the history to be fetched is resource specific.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the resource,  if the history to be fetched is resource specific.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object HistoryParams {
  
  @scala.inline
  def apply(): HistoryParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryParams]
  }
  
  @scala.inline
  implicit class HistoryParamsMutableBuilder[Self <: HistoryParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
