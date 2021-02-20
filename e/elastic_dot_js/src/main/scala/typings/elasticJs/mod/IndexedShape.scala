package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "IndexedShape")
@js.native
class IndexedShape protected () extends Geo {
  /*
    Defines a shape that already exists in an index/type.
    */
  def this(`type`: String, id: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the document id of the indexed shape.
    */
  def id(id: String): IndexedShape = js.native
  
  /*
    Sets the index which the shape is indexed under.
    Defaults to "shapes".
    */
  def index(idx: String): IndexedShape = js.native
  
  /*
    Sets the field name containing the indexed shape.
    Defaults to "shape".
    */
  def shapeFieldName(field: String): IndexedShape = js.native
  
  /*
    Retrieves the internal script object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  
  /*
    Sets the type which the shape is indexed under.
    */
  def `type`(t: String): IndexedShape = js.native
}
