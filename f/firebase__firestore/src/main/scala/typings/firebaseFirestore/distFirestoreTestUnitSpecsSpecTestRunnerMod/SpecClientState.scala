package typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod

import typings.firebaseFirestore.firebaseFirestoreBooleans.`true`
import typings.std.DocumentVisibilityState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecClientState extends StObject {
  
  /** Whether this tab should try to forcefully become primary. */
  var primary: js.UndefOr[`true`] = js.undefined
  
  /** The visibility state of the browser tab running the client. */
  var visibility: js.UndefOr[DocumentVisibilityState] = js.undefined
}
object SpecClientState {
  
  inline def apply(): SpecClientState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecClientState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecClientState] (val x: Self) extends AnyVal {
    
    inline def setPrimary(value: `true`): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setVisibility(value: DocumentVisibilityState): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
