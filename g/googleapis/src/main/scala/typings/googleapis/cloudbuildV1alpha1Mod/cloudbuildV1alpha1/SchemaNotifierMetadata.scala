package typings.googleapis.cloudbuildV1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNotifierMetadata extends StObject {
  
  /**
    * The human-readable and user-given name for the notifier. For example: "repo-merge-email-notifier".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The string representing the name and version of notifier to deploy. Expected to be of the form of "/:". For example: "gcr.io/my-project/notifiers/smtp:1.2.34".
    */
  var notifier: js.UndefOr[String | Null] = js.undefined
}
object SchemaNotifierMetadata {
  
  inline def apply(): SchemaNotifierMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotifierMetadata]
  }
  
  extension [Self <: SchemaNotifierMetadata](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotifier(value: String): Self = StObject.set(x, "notifier", value.asInstanceOf[js.Any])
    
    inline def setNotifierNull: Self = StObject.set(x, "notifier", null)
    
    inline def setNotifierUndefined: Self = StObject.set(x, "notifier", js.undefined)
  }
}
