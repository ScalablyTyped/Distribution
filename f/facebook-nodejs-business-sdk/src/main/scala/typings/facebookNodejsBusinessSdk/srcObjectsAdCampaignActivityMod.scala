package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsAdCampaignActivityMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/ad-campaign-activity", JSImport.Default)
  @js.native
  open class default () extends AdCampaignActivity
  
  @js.native
  trait AdCampaignActivity extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[AdCampaignActivity] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[AdCampaignActivity] = js.native
  }
}
