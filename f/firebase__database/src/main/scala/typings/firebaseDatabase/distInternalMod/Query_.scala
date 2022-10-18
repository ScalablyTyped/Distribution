package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query_
  extends StObject
     with QueryContext {
  
  /**
    * Returns whether or not the current and provided queries represent the same
    * location, have the same query parameters, and are from the same instance of
    * `FirebaseApp`.
    *
    * Two `DatabaseReference` objects are equivalent if they represent the same location
    * and are from the same instance of `FirebaseApp`.
    *
    * Two `Query` objects are equivalent if they represent the same location,
    * have the same query parameters, and are from the same instance of
    * `FirebaseApp`. Equivalent queries share the same sort order, limits, and
    * starting and ending points.
    *
    * @param other - The query to compare against.
    * @returns Whether or not the current and provided queries are equivalent.
    */
  def isEqual(): Boolean = js.native
  def isEqual(other: Query_): Boolean = js.native
  
  /** The `DatabaseReference` for the `Query`'s location. */
  val ref: DatabaseReference = js.native
  
  /**
    * Returns a JSON-serializable representation of this object.
    *
    * @returns A JSON-serializable representation of this object.
    */
  def toJSON(): String = js.native
}
