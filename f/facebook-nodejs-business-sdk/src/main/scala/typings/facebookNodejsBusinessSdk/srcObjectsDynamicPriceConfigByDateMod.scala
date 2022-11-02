package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsDynamicPriceConfigByDateMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/dynamic-price-config-by-date", JSImport.Default)
  @js.native
  open class default () extends DynamicPriceConfigByDate
  
  @js.native
  trait DynamicPriceConfigByDate extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[DynamicPriceConfigByDate] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[DynamicPriceConfigByDate] = js.native
  }
}
