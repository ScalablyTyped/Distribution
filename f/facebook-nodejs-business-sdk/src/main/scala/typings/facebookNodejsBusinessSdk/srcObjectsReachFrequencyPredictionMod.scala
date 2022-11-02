package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsReachFrequencyPredictionMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/reach-frequency-prediction", JSImport.Default)
  @js.native
  open class default () extends ReachFrequencyPrediction
  
  @js.native
  trait ReachFrequencyPrediction extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[ReachFrequencyPrediction] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[ReachFrequencyPrediction] = js.native
  }
}
