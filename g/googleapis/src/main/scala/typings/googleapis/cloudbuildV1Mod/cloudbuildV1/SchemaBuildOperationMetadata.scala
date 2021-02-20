package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for build operations.
  */
@js.native
trait SchemaBuildOperationMetadata extends StObject {
  
  /**
    * The build that the operation is tracking.
    */
  var build: js.UndefOr[SchemaBuild] = js.native
}
object SchemaBuildOperationMetadata {
  
  @scala.inline
  def apply(): SchemaBuildOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildOperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaBuildOperationMetadataMutableBuilder[Self <: SchemaBuildOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: SchemaBuild): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
  }
}
