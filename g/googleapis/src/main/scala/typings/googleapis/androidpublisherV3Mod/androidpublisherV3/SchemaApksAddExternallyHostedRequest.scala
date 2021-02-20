package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaApksAddExternallyHostedRequest extends StObject {
  
  /**
    * The definition of the externally-hosted APK and where it is located.
    */
  var externallyHostedApk: js.UndefOr[SchemaExternallyHostedApk] = js.native
}
object SchemaApksAddExternallyHostedRequest {
  
  @scala.inline
  def apply(): SchemaApksAddExternallyHostedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApksAddExternallyHostedRequest]
  }
  
  @scala.inline
  implicit class SchemaApksAddExternallyHostedRequestMutableBuilder[Self <: SchemaApksAddExternallyHostedRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternallyHostedApk(value: SchemaExternallyHostedApk): Self = StObject.set(x, "externallyHostedApk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternallyHostedApkUndefined: Self = StObject.set(x, "externallyHostedApk", js.undefined)
  }
}
