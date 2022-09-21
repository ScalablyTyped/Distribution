package typings.firebaseFirestore.unitSpecsSpecTestRunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentOptions extends StObject {
  
  var hasCommittedMutations: js.UndefOr[Boolean] = js.undefined
  
  var hasLocalMutations: js.UndefOr[Boolean] = js.undefined
}
object DocumentOptions {
  
  inline def apply(): DocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentOptions]
  }
  
  extension [Self <: DocumentOptions](x: Self) {
    
    inline def setHasCommittedMutations(value: Boolean): Self = StObject.set(x, "hasCommittedMutations", value.asInstanceOf[js.Any])
    
    inline def setHasCommittedMutationsUndefined: Self = StObject.set(x, "hasCommittedMutations", js.undefined)
    
    inline def setHasLocalMutations(value: Boolean): Self = StObject.set(x, "hasLocalMutations", value.asInstanceOf[js.Any])
    
    inline def setHasLocalMutationsUndefined: Self = StObject.set(x, "hasLocalMutations", js.undefined)
  }
}
