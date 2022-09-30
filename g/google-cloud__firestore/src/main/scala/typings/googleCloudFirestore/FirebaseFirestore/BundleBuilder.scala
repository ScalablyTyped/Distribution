package typings.googleCloudFirestore.FirebaseFirestore

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BundleBuilder extends StObject {
  
  /**
    * Adds a Firestore `DocumentSnapshot` to the bundle. Both the documents data and the document
    * read time will be included in the bundle.
    *
    * @param documentSnapshot A `DocumentSnapshot` to add.
    * @returns This instance.
    */
  def add[T](documentSnapshot: DocumentSnapshot[T]): BundleBuilder = js.native
  /**
    * Adds a Firestore `QuerySnapshot` to the bundle. Both the documents in the query results and
    * the query read time will be included in the bundle.
    *
    * @param queryName The name of the query to add.
    * @param querySnapshot A `QuerySnapshot` to add to the bundle.
    * @returns This instance.
    */
  def add[T](queryName: String, querySnapshot: QuerySnapshot[T]): BundleBuilder = js.native
  
  /**
    * Builds the bundle and returns the result as a `Buffer` instance.
    */
  def build(): Buffer = js.native
  
  /** The ID of this bundle. */
  val bundleId: String = js.native
}
