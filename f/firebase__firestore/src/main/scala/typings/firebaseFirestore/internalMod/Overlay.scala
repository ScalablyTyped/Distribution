package typings.firebaseFirestore.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of an overlay computed by Firestore.
  *
  * Holds information about a mutation and the largest batch id in Firestore when
  * the mutation was created.
  */
@js.native
trait Overlay extends StObject {
  
  def getKey(): DocumentKey = js.native
  
  def isEqual(): Boolean = js.native
  def isEqual(other: Overlay): Boolean = js.native
  
  val largestBatchId: Double = js.native
  
  val mutation: Mutation = js.native
}
