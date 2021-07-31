package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestSimulateParams
  extends StObject
     with GenericParams {
  
  var id: String
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object IngestSimulateParams {
  
  @scala.inline
  def apply(id: String): IngestSimulateParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestSimulateParams]
  }
  
  @scala.inline
  implicit class IngestSimulateParamsMutableBuilder[Self <: IngestSimulateParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
