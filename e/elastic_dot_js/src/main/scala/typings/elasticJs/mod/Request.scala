package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "Request")
@js.native
class Request protected () extends js.Object {
  /*
    Provides methods for generating request bodies.
    */
  def this(conf: js.Object) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Add an aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations that will be executed
    at the same time as the search request.  Alias for the aggregation method.
    */
  def agg(agg: Aggregation): Request = js.native
  
  /*
    Add an aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations that will be executed
    at the same time as the search request.
    */
  def aggregation(agg: Aggregation): Request = js.native
  
  /*
    Enable/Disable explanation of score for each search result.
    */
  def explain(trueFalse: Boolean): Request = js.native
  
  /*
    Allows you to set the specified facet on this request object. Multiple facets can
    be set, all of which will be returned when the search is executed.
    */
  def facet(facet: Facet): Request = js.native
  
  /*
    By default, searches return full documents, meaning every property or field.
    This method allows you to specify which fields you want returned.
    Pass a single field name and it is appended to the current list of
    fields.  Pass an array of fields and it replaces all existing
    fields.
    */
  def fields(s: String): Request = js.native
  def fields(s: js.Array[String]): Request = js.native
  
  /*
    Allows you to set a specified filter on this request object.
    */
  def filter(filter: Filter): Request = js.native
  
  /*
    A search result set could be very large (think Google). Setting the
    from parameter allows you to page through the result set
    by making multiple request. This parameters specifies the starting
    result/document number point. Combine with size() to achieve paging.
    */
  def from(f: Double): Request = js.native
  
  /*
    Performs highlighting based on the Highlight
    settings.
    */
  def highlight(h: Highlight): Request = js.native
  
  /*
    Boosts hits in the specified index by the given boost value.
    */
  def indexBoost(index: String, boost: Double): Request = js.native
  
  /*
    Filters out search results will scores less than the specified minimum score.
    */
  def minScore(min: Double): Request = js.native
  
  /*
    Allows you to set the specified query on this search object. This is the
    query that will be used when the search is executed.
    */
  def query(someQuery: Query): Request = js.native
  
  /*
    Once a query executes, you can use rescore to run a secondary, more
    expensive query to re-order the results.
    */
  def rescore(r: Rescore): Request = js.native
  
  /*
    Computes a document property dynamically based on the supplied ScriptField.
    */
  def scriptField(oScriptField: ScriptField): Request = js.native
  
  /*
    Sets the number of results/documents to be returned. This is set on a per page basis.
    */
  def size(s: Double): Request = js.native
  
  /*
    Sets the sorting for the query.  This accepts many input formats.
    sort() - The current sorting values are returned.
    sort(fieldName) - Adds the field to the current list of sorting values.
    sort(fieldName, order) - Adds the field to the current list of
    sorting with the specified order.  Order must be asc or desc.
    sort(ejs.Sort) - Adds the Sort value to the current list of sorting values.
    sort(array) - Replaces all current sorting values with values
    from the array.  The array must contain only strings and Sort objects.
    Multi-level sorting is supported so the order in which sort fields
    are added to the query requests is relevant.
    It is recommended to use Sort objects when possible.
    */
  def sort(): Request = js.native
  def sort(fieldName: js.UndefOr[scala.Nothing], order: String): Request = js.native
  def sort(fieldName: String): Request = js.native
  def sort(fieldName: String, order: String): Request = js.native
  def sort(fieldName: js.Array[_]): Request = js.native
  def sort(fieldName: js.Array[_], order: String): Request = js.native
  def sort(fieldName: Sort): Request = js.native
  def sort(fieldName: Sort, order: String): Request = js.native
  
  /*
    Allows to control how the _source field is returned with every hit.
    By default operations return the contents of the _source field
    unless you have used the fields parameter or if the _source field
    is disabled.  Set the includes parameter to false to completely
    disable returning the source field.
    */
  def source(includes: String, excludes: String): Request = js.native
  def source(includes: String, excludes: js.Array[String]): Request = js.native
  def source(includes: js.Array[String], excludes: String): Request = js.native
  def source(includes: js.Array[String], excludes: js.Array[String]): Request = js.native
  def source(includes: Boolean, excludes: String): Request = js.native
  def source(includes: Boolean, excludes: js.Array[String]): Request = js.native
  
  /*
    Allows you to set the specified suggester on this request object.
    Multiple suggesters can be set, all of which will be returned when
    the search is executed.  Global suggestion text can be set by
    passing in a string vs. a Suggest object.
    */
  def suggest(s: String): Request = js.native
  def suggest(s: Suggest): Request = js.native
  
  /*
    A timeout, bounding the request to be executed within the
    specified time value and bail when expired. Defaults to no timeout.
    This option is valid during the following operations:
    search and delete by query
    */
  def timeout(t: Double): Request = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  
  /*
    Enables score computation and tracking during sorting.  Be default,
    when sorting scores are not computed.
    */
  def trackScores(trueFalse: Boolean): Request = js.native
  
  /*
    Enable/Disable returning version number for each search result.
    */
  def version(trueFalse: Boolean): Request = js.native
}
