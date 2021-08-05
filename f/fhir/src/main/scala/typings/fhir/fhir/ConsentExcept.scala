package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional rule -  addition or removal of permissions
  */
trait ConsentExcept
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Actions controlled by this exception
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Who|what controlled by this exception (or group, by role)
    */
  var actor: js.UndefOr[js.Array[ConsentExceptActor]] = js.undefined
  
  /**
    * e.g. Resource Type, Profile, or CDA etc
    */
  var `class`: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * e.g. LOINC or SNOMED CT code, etc in the content
    */
  var code: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Data controlled by this exception
    */
  var data: js.UndefOr[js.Array[ConsentExceptData]] = js.undefined
  
  /**
    * Timeframe for data controlled by this exception
    */
  var dataPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Timeframe for this exception
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Context of activities covered by this exception
    */
  var purpose: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Security Labels that define affected resources
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * deny | permit
    */
  var `type`: code
}
object ConsentExcept {
  
  inline def apply(`type`: code): ConsentExcept = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsentExcept]
  }
  
  extension [Self <: ConsentExcept](x: Self) {
    
    inline def setAction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: CodeableConcept*): Self = StObject.set(x, "action", js.Array(value :_*))
    
    inline def setActor(value: js.Array[ConsentExceptActor]): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setActorVarargs(value: ConsentExceptActor*): Self = StObject.set(x, "actor", js.Array(value :_*))
    
    inline def setClass(value: js.Array[Coding]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setClassVarargs(value: Coding*): Self = StObject.set(x, "class", js.Array(value :_*))
    
    inline def setCode(value: js.Array[Coding]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: Coding*): Self = StObject.set(x, "code", js.Array(value :_*))
    
    inline def setData(value: js.Array[ConsentExceptData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataPeriod(value: Period): Self = StObject.set(x, "dataPeriod", value.asInstanceOf[js.Any])
    
    inline def setDataPeriodUndefined: Self = StObject.set(x, "dataPeriod", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: ConsentExceptData*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPurpose(value: js.Array[Coding]): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setPurposeVarargs(value: Coding*): Self = StObject.set(x, "purpose", js.Array(value :_*))
    
    inline def setSecurityLabel(value: js.Array[Coding]): Self = StObject.set(x, "securityLabel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabelUndefined: Self = StObject.set(x, "securityLabel", js.undefined)
    
    inline def setSecurityLabelVarargs(value: Coding*): Self = StObject.set(x, "securityLabel", js.Array(value :_*))
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
