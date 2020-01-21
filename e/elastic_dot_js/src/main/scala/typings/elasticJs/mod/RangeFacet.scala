package typings.elasticJs.mod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "RangeFacet")
@js.native
class RangeFacet protected () extends Facet {
  /*
    A facet which provides information over a range of numeric intervals.
    */
  def this(name: String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Adds a new bounded range.
    */
  def addRange(from: Number, to: Number): RangeFacet = js.native
  /*
    Adds a new unbounded lower limit.
    */
  def addUnboundedFrom(from: Number): RangeFacet = js.native
  /*
    Adds a new unbounded upper limit.
    */
  def addUnboundedTo(to: Number): RangeFacet = js.native
  /*
    Enables caching of the facetFilter
    */
  def cacheFilter(trueFalse: Boolean): RangeFacet = js.native
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  def facetFilter(oFilter: js.Object): RangeFacet = js.native
  /*
    Sets the document field to be used for the facet.
    */
  def field(fieldName: String): RangeFacet = js.native
  /*
    Computes values across the entire index
    */
  def global(trueFalse: Boolean): RangeFacet = js.native
  /*
    Allows you to specify an alternate key field to be used to compute the interval.
    */
  def keyField(fieldName: String): RangeFacet = js.native
  /*
    Allows you modify the key field using a script. The modified value
    is then used to generate the interval.
    */
  def keyScript(scriptCode: String): RangeFacet = js.native
  /*
    The script language being used. Currently supported values are
    javascript, groovy, and mvel.
    */
  def lang(language: String): RangeFacet = js.native
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  def mode(m: String): RangeFacet = js.native
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  def nested(path: String): RangeFacet = js.native
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): RangeFacet = js.native
  /*
    Computes values across the the specified scope
    */
  def scope(scope: String): RangeFacet = js.native
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  /*
    Allows you to specify an alternate value field to be used to compute statistical information.
    */
  def valueField(fieldName: String): RangeFacet = js.native
  /*
    Allows you modify the value field using a script. The modified value
    is then used to compute the statistical data.
    */
  def valueScript(scriptCode: String): RangeFacet = js.native
}

