package typings.googleapis.cloudassetV1Mod.cloudassetV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output configuration for export assets destination.
  */
@js.native
trait SchemaOutputConfig extends js.Object {
  
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
  implicit class SchemaOutputConfigOps[Self <: SchemaOutputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGcsDestination(value: SchemaGcsDestination): Self = this.set("gcsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsDestination: Self = this.set("gcsDestination", js.undefined)
  }
}
