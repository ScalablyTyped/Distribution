package typings.firebase.mod.default.firestore

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirestoreDataConverter[T] extends StObject {
  
  /**
    * Called by the Firestore SDK to convert Firestore data into an object of
    * type T. You can access your data by calling: `snapshot.data(options)`.
    *
    * @param snapshot A QueryDocumentSnapshot containing your data and metadata.
    * @param options The SnapshotOptions from the initial call to `data()`.
    */
  def fromFirestore(
    snapshot: typings.firebase.mod.firebase.firestore.QueryDocumentSnapshot[typings.firebase.mod.firebase.firestore.DocumentData],
    options: typings.firebase.mod.firebase.firestore.SnapshotOptions
  ): T = js.native
  
  /**
    * Called by the Firestore SDK to convert a custom model object of type T
    * into a plain Javascript object (suitable for writing directly to the
    * Firestore database). To use `set()` with `merge` and `mergeFields`,
    * `toFirestore()` must be defined with `Partial<T>`.
    */
  def toFirestore(modelObject: T): typings.firebase.mod.firebase.firestore.DocumentData = js.native
  def toFirestore(modelObject: Partial[T], options: typings.firebase.mod.firebase.firestore.SetOptions): typings.firebase.mod.firebase.firestore.DocumentData = js.native
}
