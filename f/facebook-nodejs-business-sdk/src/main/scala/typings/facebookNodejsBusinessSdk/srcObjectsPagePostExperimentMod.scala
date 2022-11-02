package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsPagePostExperimentMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/page-post-experiment", JSImport.Default)
  @js.native
  open class default () extends PagePostExperiment
  
  @js.native
  trait PagePostExperiment extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[PagePostExperiment] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[PagePostExperiment] = js.native
  }
}
