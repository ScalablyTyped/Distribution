package typings.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options associated with a upsert operation. */
@js.native
trait IUpsertOptions extends js.Object {
  
  /** Disables automatic generation of "id" field of the document to be upserted (if it is not provided) */
  var disableAutomaticIdGeneration: js.UndefOr[String] = js.native
  
  /** Specifies indexing directives. */
  var indexAction: js.UndefOr[String] = js.native
}
object IUpsertOptions {
  
  @scala.inline
  def apply(): IUpsertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpsertOptions]
  }
  
  @scala.inline
  implicit class IUpsertOptionsOps[Self <: IUpsertOptions] (val x: Self) extends AnyVal {
    
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
    def setDisableAutomaticIdGeneration(value: String): Self = this.set("disableAutomaticIdGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAutomaticIdGeneration: Self = this.set("disableAutomaticIdGeneration", js.undefined)
    
    @scala.inline
    def setIndexAction(value: String): Self = this.set("indexAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexAction: Self = this.set("indexAction", js.undefined)
  }
}
