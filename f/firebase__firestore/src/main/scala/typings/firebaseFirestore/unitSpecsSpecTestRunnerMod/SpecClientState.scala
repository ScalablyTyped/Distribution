package typings.firebaseFirestore.unitSpecsSpecTestRunnerMod

import typings.firebaseFirestore.firebaseFirestoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecClientState extends StObject {
  
  /** Whether this tab should try to forcefully become primary. */
  var primary: js.UndefOr[`true`] = js.undefined
  
  /** The visibility state of the browser tab running the client. */
  var visibility: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VisibilityState */ Any
  ] = js.undefined
}
object SpecClientState {
  
  inline def apply(): SpecClientState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecClientState]
  }
  
  extension [Self <: SpecClientState](x: Self) {
    
    inline def setPrimary(value: `true`): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setVisibility(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VisibilityState */ Any
    ): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
