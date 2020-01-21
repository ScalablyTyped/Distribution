package typings.fhirJsClient.FHIR.SMART

import typings.fhirJsClient.AnonAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FHIR Search parameter : The parameter used to by the FHIR api methods to perform search on a particular resource.
  */
trait SearchParams extends CommonQueryFilters {
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
  var query: js.UndefOr[js.Any] = js.undefined
  /**
    * The name of the resource type on which the query is performed
    */
  var `type`: String
}

object SearchParams {
  @scala.inline
  def apply(
    `type`: String,
    count: Int | Double = null,
    params: AnonAt = null,
    patient: String = null,
    query: js.Any = null,
    since: String = null
  ): SearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (patient != null) __obj.updateDynamic("patient")(patient.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParams]
  }
}

