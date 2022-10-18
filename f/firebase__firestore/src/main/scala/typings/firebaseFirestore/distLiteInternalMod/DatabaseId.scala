package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the database ID a Firestore client is associated with.
  * @internal
  */
@js.native
trait DatabaseId extends StObject {
  
  val database: String = js.native
  
  def isDefaultDatabase: Boolean = js.native
  
  def isEqual(other: js.Object): Boolean = js.native
  
  val projectId: String = js.native
}
