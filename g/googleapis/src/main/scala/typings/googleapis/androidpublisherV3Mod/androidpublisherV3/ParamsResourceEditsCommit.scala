package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEditsCommit
  extends StObject
     with StandardParameters {
  
  /**
    * Indicates that the changes in this edit will not be reviewed until they are explicitly sent for review from the Google Play Console UI. These changes will be added to any other changes that are not yet sent for review.
    */
  var changesNotSentForReview: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifier of the edit.
    */
  var editId: js.UndefOr[String] = js.undefined
  
  /**
    * Package name of the app.
    */
  var packageName: js.UndefOr[String] = js.undefined
}
object ParamsResourceEditsCommit {
  
  inline def apply(): ParamsResourceEditsCommit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEditsCommit]
  }
  
  extension [Self <: ParamsResourceEditsCommit](x: Self) {
    
    inline def setChangesNotSentForReview(value: Boolean): Self = StObject.set(x, "changesNotSentForReview", value.asInstanceOf[js.Any])
    
    inline def setChangesNotSentForReviewUndefined: Self = StObject.set(x, "changesNotSentForReview", js.undefined)
    
    inline def setEditId(value: String): Self = StObject.set(x, "editId", value.asInstanceOf[js.Any])
    
    inline def setEditIdUndefined: Self = StObject.set(x, "editId", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
