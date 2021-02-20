package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "IdsQuery")
@js.native
class IdsQuery protected () extends Query {
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
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): IdsQuery = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  
  /*
    Sets the type as a single type or an array of types.  If type is a
    string, it is added to the list of existing types.  If type is an
    array, it is set as the types and overwrites an existing types. This
    parameter is optional.
    */
  def `type`(`type`: String): IdsQuery = js.native
  def `type`(`type`: js.Array[String]): IdsQuery = js.native
  
  /*
    Sets the values array or adds a new value. if val is a string, it
    is added to the list of existing document ids.  If val is an
    array it is set as the document values and replaces any existing values.
    */
  def values(`val`: String): IdsQuery = js.native
  def values(`val`: js.Array[String]): IdsQuery = js.native
}
