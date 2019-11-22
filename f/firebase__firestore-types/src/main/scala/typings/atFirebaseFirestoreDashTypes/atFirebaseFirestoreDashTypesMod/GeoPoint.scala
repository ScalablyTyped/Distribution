package typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "GeoPoint")
@js.native
class GeoPoint protected () extends js.Object {
  def this(latitude: Double, longitude: Double) = this()
  val latitude: Double = js.native
  val longitude: Double = js.native
  def isEqual(other: GeoPoint): Boolean = js.native
}

