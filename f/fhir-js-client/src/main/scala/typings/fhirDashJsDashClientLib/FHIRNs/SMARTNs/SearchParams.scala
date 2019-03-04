package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

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
  var patient: js.UndefOr[java.lang.String] = js.undefined
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
  var `type`: java.lang.String
}

object SearchParams {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    count: scala.Int | scala.Double = null,
    params: fhirDashJsDashClientLib.Anon_At = null,
    patient: java.lang.String = null,
    query: js.Any = null,
    since: java.lang.String = null
  ): SearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (patient != null) __obj.updateDynamic("patient")(patient)
    if (query != null) __obj.updateDynamic("query")(query)
    if (since != null) __obj.updateDynamic("since")(since)
    __obj.asInstanceOf[SearchParams]
  }
}

