package typings.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "GeoPoint")
@js.native
open class GeoPoint protected () extends StObject {
  def this(latitude: Double, longitude: Double) = this()
  
  def isEqual(other: GeoPoint): Boolean = js.native
  
  val latitude: Double = js.native
  
  val longitude: Double = js.native
}
