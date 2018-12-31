package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("documentdb", "QueryIterator")
@js.native
class QueryIterator[TResultRow] protected () extends js.Object {
  /**
    * Constructs a QueryIterator object
    * @param documentclient    - The documentclient object.
    * @param query             - A SQL query.
    * @param options           - Represents the feed options.
    * @param fetchFunctions    - A function to retrieve each page of data. An array of functions may be used to query more than one partition.
    * @param resourceLinkopt   - An optional parameter that represents the resourceLink (will be used in orderby/top/parallel query)
    */
  def this(documentclient: DocumentClient, query: DocumentQuery, options: FeedOptions, fetchFunctions: RequestCallback[TResultRow]) = this()
  def this(documentclient: DocumentClient, query: DocumentQuery, options: FeedOptions, fetchFunctions: js.Array[RequestCallback[TResultRow]]) = this()
  def this(documentclient: DocumentClient, query: DocumentQuery, options: FeedOptions, fetchFunctions: RequestCallback[TResultRow], resourceLinkopt: java.lang.String) = this()
  def this(documentclient: DocumentClient, query: DocumentQuery, options: FeedOptions, fetchFunctions: js.Array[RequestCallback[TResultRow]], resourceLinkopt: java.lang.String) = this()
  /**
    * Retrieve the current element on the QueryIterator.
    * @param callback Function to execute for the current element.
    */
  def current(callback: RequestCallback[TResultRow]): scala.Unit = js.native
  /**
    * Retrieve the next batch of the feed and pass them as an array to a function
    * @param callback Function execute on the feed response.
    */
  def executeNext(callback: RequestCallback[js.Array[TResultRow]]): scala.Unit = js.native
  /**
    * Execute a provided function once per feed element.
    * @param callback Function to execute for each element. the function takes two parameters error, element. Note: the last element the callback
    *        will be called on will be undefined. If the callback explicitly returned false, the loop gets stopped.
    */
  def forEach(callback: RequestCallback[TResultRow]): scala.Unit = js.native
  /**
    * DEPRECATED
    *
    * Instead check if callback(undefined, undefined) is invoked by nextItem(callback) or current(callback)
    *
    * Determine if there are still remaining resources to processs based on the value of the continuation token
    * or the elements remaining on the current batch in the QueryIterator.
    * @deprecated
    */
  def hasMoreResults(): scala.Boolean = js.native
  /**
    * Execute a provided function on the next element in the QueryIterator.
    * @param callback Function to execute for each element.
    */
  def nextItem(callback: RequestCallback[TResultRow]): scala.Unit = js.native
  /**
    * Reset the QueryIterator to the beginning and clear all the resources inside it
    */
  def reset(): scala.Unit = js.native
  /**
    * Retrieve all the elements of the feed and pass them as an array to a function
    * @param callback Function execute on the feed response.
    */
  def toArray(callback: RequestCallback[js.Array[TResultRow]]): scala.Unit = js.native
}

