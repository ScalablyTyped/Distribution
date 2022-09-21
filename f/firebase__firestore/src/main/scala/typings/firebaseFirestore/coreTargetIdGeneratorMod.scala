package typings.firebaseFirestore

import typings.firebaseFirestore.coreTypesMod.TargetId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreTargetIdGeneratorMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/target_id_generator", "TargetIdGenerator")
  @js.native
  open class TargetIdGenerator protected () extends StObject {
    def this(lastId: Double) = this()
    
    /* private */ var lastId: Any = js.native
    
    def next(): TargetId = js.native
  }
  /* static members */
  object TargetIdGenerator {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/core/target_id_generator", "TargetIdGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def forSyncEngine(): TargetIdGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("forSyncEngine")().asInstanceOf[TargetIdGenerator]
    
    inline def forTargetCache(): TargetIdGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("forTargetCache")().asInstanceOf[TargetIdGenerator]
  }
}
