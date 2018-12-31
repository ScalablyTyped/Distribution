package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FHIR API instance which can be used to make API calls to the FHIR server.
  * This exposes all the methods implemented by jqFhir.js adapter of fhir.js client library
  * https://github.com/FHIR/fhir.js
  */
trait Api extends js.Object {
  /**
    * GET BASEURL/metadata
    *
    * @param input : An override to the base config object or just an empty object {}
    */
  def conformance(input: js.Any): js.Promise[Response]
  /**
    * POST BASEURL/{resourceType} BODY: {entry without id}
    * @param entry : A valid FHIR entry containing the resource.
    */
  def create(entry: Entry): js.Promise[Response]
  /**
    * DELETE BASEURL/{resourceType} BODY {entry with id}
    * @param entry : A valid FHIR entry object containing the resource object
    * or an object containing the id property(id of the resource to be deleted)
    */
  def delete(entry: Entry): js.Promise[Response]
  /**
    * POST BASEURL/Document
    * @param document
    */
  def document(document: Entry): js.Promise[Response]
  /**
    * GET BASEURL/{resourceType}?searchParams
    * Fetch all the resources based on the search parameter (keeps on calling next method to gett all the pages)
    * and process the result set of each page
    * @param params Search Parameter, same as parameter of the Search method
    * @param process Function called by passing the result set of each page fetched.
    * @param done Function called once all the resources are fetched
    * @param fail Function called when an error occurs in the process
    */
  def drain(
    params: SearchParams,
    process: js.Function1[/* entries */ js.Array[Entry], _],
    done: js.Function0[_],
    fail: js.Function1[/* error */ js.Any, _]
  ): scala.Unit
  /**
    * GET BASEURL/{resourceType}?searchParams
    * Fetch all the resources of a particular resource type and that meets the search filter.
    * @param params Search Parameter, same as parameter of the Search method
    * Returns a promise
    * Resolve: (entries:any[]) => { console.log(entries); }
    * Reject: (error:any) => { console.log(error); }
    */
  def fetchAll(params: SearchParams): js.Promise[js.Array[Entry]]
  /**
    * GET BASEURL/{resourceType}?searchParams
    * GET BASEURL/{referencedType} referencedType based on the resolveParams
    * @param params Search Parameter, same as parameter of the Search method
    * @param resolveParams Resolve Parameter, an array of string containing the each parameter in the format TargetResourceType.TargetElement
    * eg. ['Observation.subject',Observation.context']
    * Returns a promise.
    * Resolve: (entries:Entry[],resolvedReferences:[index: string]: Resource) => { console.log(entries); console.log(resolvedReferences);}
    * Reject: (error:any) => { console.log(error); }
    */
  def fetchAllWithReferences(params: SearchParams, resolveParams: js.Array[java.lang.String]): js.Any
  /**
    * GET BASEURL/_history?historyParams
    * Calls the _history API with the parameters specified
    * @param params
    */
  def history(params: HistoryParams): js.Promise[Response]
  /**
    * GET BASEURL/_getpages=XXXX : Next link in the bundle
    * Fetches the next page based on the input bundle resource's next link.
    * @param bundle Input bundle resource containing the next link.
    */
  def nextPage(bundle: Bundle): js.Promise[Response]
  /**
    * GET BASEURL/_getpages=XXXX : Prev link in the bundle
    * Fetches the previous page based on the input bundle resource's previous link.
    * @param bundle Input bundle resource containing the previous link
    */
  def prevPage(bundle: Bundle): js.Promise[Response]
  /**
    * GET BASEURL/Profile/{resourceType}
    * @param resourceType
    */
  def profile(resourceType: ResourceType): js.Promise[Response]
  /**
    * GET BASEURL/{resourceType}/{id}
    * @param params An object with id and resourceType property
    */
  def read(params: ReadParams): js.Promise[Response]
  /**
    * Pass the node containing the property reference, which needs to be resolved. eg. myObservation.resource.subject
    * The resource node should be present if the reference is contained within the resource.
    * If a bundle resource is passed, will try to resolve within that bundle first before querying the server
    * @param params The reference node to be resolved along with the resource and the bundle to be searched if the reference is a contained one.
    */
  def resolve(params: ResolveParams): js.Promise[Response]
  /**
    * GET BASEURL/{resourceType}/{id}/_history?otherHistoryParams
    * @param params Should provide, resourceType and id either through id and type properties or the resource property
    */
  def resourceHistory(params: HistoryParams): js.Promise[Response]
  /**
    * GET BASEURL/{resourceType}?searchParams
    * @param searchParams Filters to be applied to the API call
    */
  def search(params: SearchParams): js.Promise[Response]
  /**
    * POST BASEURL Body: Bundle with entries containing a node 'request': { 'method': 'POST' }. The value of 'method' can be DELETE,POST,PUT or GET.
    * @param bundle
    */
  def transaction(bundle: Bundle): js.Promise[Response]
  /**
    * GET BASEURL/{resourceType}/_history?historyParams
    * @param params
    */
  def typeHistory(params: HistoryParams): js.Promise[Response]
  /**
    * PUT BASEURL/{resourceType}/{id}
    * @param entry : Entry containing the Resource to be updated
    */
  def update(entry: Entry): js.Promise[Response]
  /**
    * POST BASEURL/{resourceType}/_validate BODY: Resource to be validated
    * PS: Cannot find the _validate endpoint on the SMART on FHIR open server. But $validate exists.
    * @param entry
    */
  def validate(entry: Entry): js.Promise[Response]
  /**
    * GET BASEURL/{resourceType}/{id}/_history/{versionId}
    * Fetches the specific historic version of the resource.
    * @param params ResourceType, ResourceId and the VersionId
    */
  def vread(params: VersionReadParams): js.Promise[Response]
}

