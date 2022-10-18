package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distLiteFirestoreSrcModelMutationMod.Mutation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcModelOverlayMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/overlay", "Overlay")
  @js.native
  open class Overlay protected () extends StObject {
    def this(largestBatchId: Double, mutation: Mutation) = this()
    
    def getKey(): DocumentKey = js.native
    
    def isEqual(): Boolean = js.native
    def isEqual(other: Overlay): Boolean = js.native
    
    val largestBatchId: Double = js.native
    
    val mutation: Mutation = js.native
  }
}
