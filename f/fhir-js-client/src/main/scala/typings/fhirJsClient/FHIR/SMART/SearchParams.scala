package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FHIR Search parameter : The parameter used to by the FHIR api methods to perform search on a particular resource.
  */
trait SearchParams
  extends StObject
     with CommonQueryFilters {
  
  /**
    * The patient id. If provided, will make the search query patient specific by adding the patien query parameter
    */
  var patient: js.UndefOr[String] = js.undefined
  
  /**
    * The Search filter query object
    * This object syntaxs adopts mongodb-like query syntax ([see](http://docs.mongodb.org/manual/tutorial/query-documents/)
    * eg:
    * {name: 'maud'}
    * //=> name=maud
    *
    * {name: {$exact: 'maud'}}
    * //=> name:exact=maud
    *
    * {name: {$or: ['maud','dave']}}
    * //=> name=maud,dave
    *
    * {name: {$and: ['maud',{$exact: 'dave'}]}}
    * //=> name=maud&name:exact=Dave
    *
    * {birthDate: {$gt: '1970', $lte: '1980'}}
    * //=> birthDate=gt1970&birthDate=lte1980
    *
    * {subject: {$type: 'Patient', name: 'maud', birthDate: {$gt: '1970'}}}
    * //=> subject:Patient.name=maud&subject:Patient.birthDate=gt1970
    *
    * {'subject.name': {$exact: 'maud'}}
    * //=> subject.name:exact=maud
    */
  var query: js.UndefOr[Any] = js.undefined
  
  /**
    * The name of the resource type on which the query is performed
    */
  var `type`: String
}
object SearchParams {
  
  inline def apply(`type`: String): SearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParams]
  }
  
  extension [Self <: SearchParams](x: Self) {
    
    inline def setPatient(value: String): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
