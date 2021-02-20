package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies a single production run
  */
@js.native
trait MedicationPackageBatch extends BackboneElement {
  
  /**
    * Contains extended information for property 'expirationDate'.
    */
  var _expirationDate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'lotNumber'.
    */
  var _lotNumber: js.UndefOr[Element] = js.native
  
  /**
    * When batch will expire
    */
  var expirationDate: js.UndefOr[dateTime] = js.native
  
  /**
    * Identifier assigned to batch
    */
  var lotNumber: js.UndefOr[String] = js.native
}
object MedicationPackageBatch {
  
  @scala.inline
  def apply(): MedicationPackageBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationPackageBatch]
  }
  
  @scala.inline
  implicit class MedicationPackageBatchMutableBuilder[Self <: MedicationPackageBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationDate(value: dateTime): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    @scala.inline
    def setLotNumber(value: String): Self = StObject.set(x, "lotNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLotNumberUndefined: Self = StObject.set(x, "lotNumber", js.undefined)
    
    @scala.inline
    def set_expirationDate(value: Element): Self = StObject.set(x, "_expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_expirationDateUndefined: Self = StObject.set(x, "_expirationDate", js.undefined)
    
    @scala.inline
    def set_lotNumber(value: Element): Self = StObject.set(x, "_lotNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lotNumberUndefined: Self = StObject.set(x, "_lotNumber", js.undefined)
  }
}
