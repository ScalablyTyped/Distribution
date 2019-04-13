package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "IndexedShape")
@js.native
class IndexedShape protected () extends Geo {
  /*
    Defines a shape that already exists in an index/type.
    */
  def this(`type`: java.lang.String, id: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Sets the document id of the indexed shape.
    */
  def id(id: java.lang.String): IndexedShape = js.native
  /*
    Sets the index which the shape is indexed under.
    Defaults to "shapes".
    */
  def index(idx: java.lang.String): IndexedShape = js.native
  /*
    Sets the field name containing the indexed shape.
    Defaults to "shape".
    */
  def shapeFieldName(field: java.lang.String): IndexedShape = js.native
  /*
    Retrieves the internal script object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  /*
    Sets the type which the shape is indexed under.
    */
  def `type`(t: java.lang.String): IndexedShape = js.native
}

