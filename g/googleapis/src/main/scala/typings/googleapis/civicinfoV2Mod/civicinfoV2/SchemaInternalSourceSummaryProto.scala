package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInternalSourceSummaryProto extends StObject {
  
  var dataset: js.UndefOr[String] = js.native
  
  var provider: js.UndefOr[String] = js.native
}
object SchemaInternalSourceSummaryProto {
  
  @scala.inline
  def apply(): SchemaInternalSourceSummaryProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInternalSourceSummaryProto]
  }
  
  @scala.inline
  implicit class SchemaInternalSourceSummaryProtoMutableBuilder[Self <: SchemaInternalSourceSummaryProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    @scala.inline
    def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
  }
}
