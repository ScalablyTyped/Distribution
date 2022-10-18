package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewSnapshot extends StObject {
  
  val docChanges: js.Array[DocumentViewChange] = js.native
  
  val docs: DocumentSet = js.native
  
  val excludesMetadataChanges: Boolean = js.native
  
  val fromCache: Boolean = js.native
  
  val hasCachedResults: Boolean = js.native
  
  def hasPendingWrites: Boolean = js.native
  
  def isEqual(other: ViewSnapshot): Boolean = js.native
  
  val mutatedKeys: DocumentKeySet = js.native
  
  val oldDocs: DocumentSet = js.native
  
  val query: Query2 = js.native
  
  val syncStateChanged: Boolean = js.native
}
