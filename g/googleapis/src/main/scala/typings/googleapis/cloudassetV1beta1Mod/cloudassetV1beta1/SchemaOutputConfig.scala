package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output configuration for export assets destination.
  */
@js.native
trait SchemaOutputConfig extends StObject {
  
  /**
    * Destination on Cloud Storage.
    */
  var gcsDestination: js.UndefOr[SchemaGcsDestination] = js.native
}
object SchemaOutputConfig {
  
  @scala.inline
  def apply(): SchemaOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutputConfig]
  }
  
  @scala.inline
  implicit class SchemaOutputConfigMutableBuilder[Self <: SchemaOutputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcsDestination(value: SchemaGcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
