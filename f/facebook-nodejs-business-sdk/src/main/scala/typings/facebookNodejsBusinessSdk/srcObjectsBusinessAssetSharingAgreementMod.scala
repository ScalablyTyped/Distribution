package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsBusinessAssetSharingAgreementMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/business-asset-sharing-agreement", JSImport.Default)
  @js.native
  open class default () extends BusinessAssetSharingAgreement
  
  @js.native
  trait BusinessAssetSharingAgreement extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[BusinessAssetSharingAgreement] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[BusinessAssetSharingAgreement] = js.native
    
    def update(fields: js.Array[String]): js.Promise[BusinessAssetSharingAgreement] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[BusinessAssetSharingAgreement] = js.native
  }
}
