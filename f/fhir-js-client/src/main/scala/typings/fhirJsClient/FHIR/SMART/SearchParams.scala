package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FHIR Search parameter : The parameter used to by the FHIR api methods to perform search on a particular resource.
  */
@js.native
trait SearchParams extends CommonQueryFilters {
  
  /**
    * The patient id. If provided, will make the search query patient specific by adding the patien query parameter
    */
  var patient: js.UndefOr[String] = js.native
  
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
  var query: js.UndefOr[js.Any] = js.native
  
  /**
    * The name of the resource type on which the query is performed
    */
  var `type`: String = js.native
}
object SearchParams {
  
  @scala.inline
  def apply(`type`: String): SearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParams]
  }
  
  @scala.inline
  implicit class SearchParamsMutableBuilder[Self <: SearchParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPatient(value: String): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    @scala.inline
    def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
