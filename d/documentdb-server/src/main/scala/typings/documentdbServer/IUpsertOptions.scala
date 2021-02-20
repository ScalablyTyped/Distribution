package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options associated with a upsert operation. */
@js.native
trait IUpsertOptions extends StObject {
  
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
  implicit class IUpsertOptionsMutableBuilder[Self <: IUpsertOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableAutomaticIdGeneration(value: String): Self = StObject.set(x, "disableAutomaticIdGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAutomaticIdGenerationUndefined: Self = StObject.set(x, "disableAutomaticIdGeneration", js.undefined)
    
    @scala.inline
    def setIndexAction(value: String): Self = StObject.set(x, "indexAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexActionUndefined: Self = StObject.set(x, "indexAction", js.undefined)
  }
}
