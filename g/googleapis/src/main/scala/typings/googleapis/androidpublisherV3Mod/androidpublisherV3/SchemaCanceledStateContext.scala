package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCanceledStateContext extends StObject {
  
  /**
    * Subscription was canceled by the developer.
    */
  var developerInitiatedCancellation: js.UndefOr[SchemaDeveloperInitiatedCancellation] = js.undefined
  
  /**
    * Subscription was replaced by a new subscription.
    */
  var replacementCancellation: js.UndefOr[SchemaReplacementCancellation] = js.undefined
  
  /**
    * Subscription was canceled by the system, for example because of a billing problem.
    */
  var systemInitiatedCancellation: js.UndefOr[SchemaSystemInitiatedCancellation] = js.undefined
  
  /**
    * Subscription was canceled by user.
    */
  var userInitiatedCancellation: js.UndefOr[SchemaUserInitiatedCancellation] = js.undefined
}
object SchemaCanceledStateContext {
  
  inline def apply(): SchemaCanceledStateContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCanceledStateContext]
  }
  
  extension [Self <: SchemaCanceledStateContext](x: Self) {
    
    inline def setDeveloperInitiatedCancellation(value: SchemaDeveloperInitiatedCancellation): Self = StObject.set(x, "developerInitiatedCancellation", value.asInstanceOf[js.Any])
    
    inline def setDeveloperInitiatedCancellationUndefined: Self = StObject.set(x, "developerInitiatedCancellation", js.undefined)
    
    inline def setReplacementCancellation(value: SchemaReplacementCancellation): Self = StObject.set(x, "replacementCancellation", value.asInstanceOf[js.Any])
    
    inline def setReplacementCancellationUndefined: Self = StObject.set(x, "replacementCancellation", js.undefined)
    
    inline def setSystemInitiatedCancellation(value: SchemaSystemInitiatedCancellation): Self = StObject.set(x, "systemInitiatedCancellation", value.asInstanceOf[js.Any])
    
    inline def setSystemInitiatedCancellationUndefined: Self = StObject.set(x, "systemInitiatedCancellation", js.undefined)
    
    inline def setUserInitiatedCancellation(value: SchemaUserInitiatedCancellation): Self = StObject.set(x, "userInitiatedCancellation", value.asInstanceOf[js.Any])
    
    inline def setUserInitiatedCancellationUndefined: Self = StObject.set(x, "userInitiatedCancellation", js.undefined)
  }
}
