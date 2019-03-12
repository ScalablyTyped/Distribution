package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexedShape extends Geo {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the document id of the indexed shape.
    */
  def id(id: java.lang.String): IndexedShape
  /*
    Sets the index which the shape is indexed under.
    Defaults to "shapes".
    */
  def index(idx: java.lang.String): IndexedShape
  /*
    Sets the field name containing the indexed shape.
    Defaults to "shape".
    */
  def shapeFieldName(field: java.lang.String): IndexedShape
  /*
    Retrieves the internal script object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
  /*
    Sets the type which the shape is indexed under.
    */
  def `type`(t: java.lang.String): IndexedShape
}

object IndexedShape {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    id: java.lang.String => IndexedShape,
    index: java.lang.String => IndexedShape,
    shapeFieldName: java.lang.String => IndexedShape,
    toJSON: () => js.Any,
    `type`: java.lang.String => IndexedShape
  ): IndexedShape = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), id = js.Any.fromFunction1(id), index = js.Any.fromFunction1(index), shapeFieldName = js.Any.fromFunction1(shapeFieldName), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[IndexedShape]
  }
}

