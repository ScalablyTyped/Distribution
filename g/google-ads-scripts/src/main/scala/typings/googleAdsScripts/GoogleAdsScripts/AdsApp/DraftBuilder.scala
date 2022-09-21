package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for Draft objects.
  *
  * Example usage:
  *
  *      // Create a draft builder.
  *      var draftBuilder = AdsApp.campaigns().get().next().newDraftBuilder();
  *
  *      // Create a draft operation.
  *      var draftOperation = draftBuilder
  *       .withName("Sample Draft")                // required
  *        .build();
  *
  *      // Optional: examine the outcome. The call to isSuccessful()
  *      // will block until the operation completes.
  *      if (draftOperation.isSuccessful()) {
  *        // Get the result.
  *        var draft = draftOperation.getResult();
  *      } else {
  *        // Handle the errors.
  *        var errors = draftOperation.getErrors();
  *      }
  */
trait DraftBuilder
  extends StObject
     with Builder[DraftOperation] {
  
  /** Sets the name of the new draft to the specified value. */
  def withName(name: String): this.type
}
object DraftBuilder {
  
  inline def apply(build: () => DraftOperation, withName: String => DraftBuilder): DraftBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[DraftBuilder]
  }
  
  extension [Self <: DraftBuilder](x: Self) {
    
    inline def setWithName(value: String => DraftBuilder): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
