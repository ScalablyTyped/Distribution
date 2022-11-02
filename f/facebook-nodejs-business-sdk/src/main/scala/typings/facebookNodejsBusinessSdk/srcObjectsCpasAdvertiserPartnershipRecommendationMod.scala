package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsCpasAdvertiserPartnershipRecommendationMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/cpas-advertiser-partnership-recommendation", JSImport.Default)
  @js.native
  open class default () extends CPASAdvertiserPartnershipRecommendation
  
  @js.native
  trait CPASAdvertiserPartnershipRecommendation extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[CPASAdvertiserPartnershipRecommendation] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[CPASAdvertiserPartnershipRecommendation] = js.native
  }
}
