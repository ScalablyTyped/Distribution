package typings.firebaseFirestore.userDataReaderMod

import typings.firebaseFirestoreTypes.mod.DocumentData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntypedFirestoreDataConverter[T] extends js.Object {
  def fromFirestore(snapshot: js.Any): T = js.native
  def fromFirestore(snapshot: js.Any, options: js.Any): T = js.native
  def toFirestore(modelObject: T): DocumentData = js.native
}

