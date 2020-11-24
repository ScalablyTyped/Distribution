package typings.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "GeoPoint")
@js.native
class GeoPoint protected () extends js.Object {
  def this(latitude: Double, longitude: Double) = this()
  
  def isEqual(other: GeoPoint): Boolean = js.native
  
  val latitude: Double = js.native
  
  val longitude: Double = js.native
}
