package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "IdsFilter")
@js.native
class IdsFilter protected () extends Filter {
  /*
    Matches documents with the specified id(s).
    */
  def this(ids: String) = this()
  def this(ids: js.Array[String]) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): IdsFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): IdsFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: String): IdsFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): IdsFilter = js.native
  /*
    Sets the type as a single type or an array of types.  If type is a
    string, it is added to the list of existing types.  If type is an
    array, it is set as the types and overwrites an existing types. This
    parameter is optional.
    */
  def `type`(`type`: String): IdsFilter = js.native
  def `type`(`type`: js.Array[String]): IdsFilter = js.native
  /*
    Sets the values array or adds a new value. if val is a string, it
    is added to the list of existing document ids.  If val is an
    array it is set as the document values and replaces any existing values.
    */
  def values(`val`: String): IdsFilter = js.native
  def values(`val`: js.Array[String]): IdsFilter = js.native
}

