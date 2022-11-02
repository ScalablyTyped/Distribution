package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsAdRuleExecutionSpecMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/ad-rule-execution-spec", JSImport.Default)
  @js.native
  open class default () extends AdRuleExecutionSpec
  
  @js.native
  trait AdRuleExecutionSpec extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[AdRuleExecutionSpec] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[AdRuleExecutionSpec] = js.native
  }
}
