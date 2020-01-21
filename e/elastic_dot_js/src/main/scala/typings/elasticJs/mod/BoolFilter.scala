package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "BoolFilter")
@js.native
/*
  A Filter that matches documents matching boolean combinations of other
  filters.
  */
class BoolFilter () extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): BoolFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): BoolFilter = js.native
  def must(oFilter: js.Array[Filter]): BoolFilter = js.native
  /*
    Adds filter to boolean container. Given filter "must" appear in
    matching documents.  If passed a single Filter it is added to the
    list of existing filters.  If passed an array of Filters, they
    replace all existing filters.
    */
  def must(oFilter: Filter): BoolFilter = js.native
  def mustNot(oFilter: js.Array[Filter]): BoolFilter = js.native
  /*
    Adds filter to boolean container. Given filter "must not" appear
    in matching documents. If passed a single Filter it is added to
    the list of existing filters.  If passed an array of Filters,
    they replace all existing filters.
    */
  def mustNot(oFilter: Filter): BoolFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: String): BoolFilter = js.native
  def should(oFilter: js.Array[Filter]): BoolFilter = js.native
  /*
    Adds filter to boolean container. Given filter "should" appear in
    matching documents. If passed a single Filter it is added to
    the list of existing filters.  If passed an array of Filters,
    they replace all existing filters.
    */
  def should(oFilter: Filter): BoolFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): BoolFilter = js.native
}

