package typings.elasticElasticsearch.libHelpersMod

import typings.elasticElasticsearch.libApiTypesMod.SearchRequest
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Helpers extends StObject {
  
  /**
    * Creates a bulk helper instance. Once you configure it, you can pick which operation
    * to execute with the given dataset, index, create, update, and delete.
    * @param {object} options - The configuration of the bulk operation.
    * @param {object} reqOptions - The client optional configuration for this request.
    * @return {object} The possible operations to run with the datasource.
    */
  def bulk[TDocument](options: BulkHelperOptions[TDocument]): BulkHelper[TDocument] = js.native
  def bulk[TDocument](options: BulkHelperOptions[TDocument], reqOptions: TransportRequestOptions): BulkHelper[TDocument] = js.native
  
  /**
    * Creates a msearch helper instance. Once you configure it, you can use the provided
    * `search` method to add new searches in the queue.
    * @param {object} options - The configuration of the msearch operations.
    * @param {object} reqOptions - The client optional configuration for this request.
    * @return {object} The possible operations to run.
    */
  def msearch(): MsearchHelper = js.native
  def msearch(options: Unit, reqOptions: TransportRequestOptions): MsearchHelper = js.native
  def msearch(options: MsearchHelperOptions): MsearchHelper = js.native
  def msearch(options: MsearchHelperOptions, reqOptions: TransportRequestOptions): MsearchHelper = js.native
  
  /**
    * Runs a scroll search operation. This function returns an async iterator, allowing
    * the user to use a for await loop to get all the documents of a given search.
    * ```js
    * for await (const document of client.helpers.scrollSearch({ params })) {
    *   console.log(document)
    * }
    * ```
    * Each document is what you will find by running a scrollSearch and iterating on the hits array.
    * This helper automatically adds `filter_path=hits.hits._source` to the querystring,
    * as it will only need the documents source.
    * @param {object} params - The Elasticsearch's search parameters.
    * @param {object} options - The client optional configuration for this request.
    * @return {iterator} the async iterator
    */
  def scrollDocuments[TDocument](params: SearchRequest): AsyncIterable[TDocument] = js.native
  def scrollDocuments[TDocument](params: SearchRequest, options: ScrollSearchOptions): AsyncIterable[TDocument] = js.native
  
  /**
    * Runs a scroll search operation. This function returns an async iterator, allowing
    * the user to use a for await loop to get all the results of a given search.
    * ```js
    * for await (const result of client.helpers.scrollSearch({ params })) {
    *   console.log(result)
    * }
    * ```
    * Each result represents the entire body of a single scroll search request,
    * if you just need to scroll the results, use scrollDocuments.
    * This function handles automatically retries on 429 status code.
    * @param {object} params - The Elasticsearch's search parameters.
    * @param {object} options - The client optional configuration for this request.
    * @return {iterator} the async iterator
    */
  def scrollSearch[TDocument, TAggregations](params: SearchRequest): AsyncIterable[ScrollSearchResponse[TDocument, TAggregations]] = js.native
  def scrollSearch[TDocument, TAggregations](params: SearchRequest, options: ScrollSearchOptions): AsyncIterable[ScrollSearchResponse[TDocument, TAggregations]] = js.native
  
  /**
    * Runs a search operation. The only difference between client.search and this utility,
    * is that we are only returning the hits to the user and not the full ES response.
    * This helper automatically adds `filter_path=hits.hits._source` to the querystring,
    * as it will only need the documents source.
    * @param {object} params - The Elasticsearch's search parameters.
    * @param {object} options - The client optional configuration for this request.
    * @return {array} The documents that matched the request.
    */
  def search[TDocument](params: SearchRequest): js.Promise[js.Array[TDocument]] = js.native
  def search[TDocument](params: SearchRequest, options: TransportRequestOptions): js.Promise[js.Array[TDocument]] = js.native
}
