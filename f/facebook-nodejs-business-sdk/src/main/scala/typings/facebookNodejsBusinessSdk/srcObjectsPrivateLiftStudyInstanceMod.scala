package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsPrivateLiftStudyInstanceMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/private-lift-study-instance", JSImport.Default)
  @js.native
  open class default () extends PrivateLiftStudyInstance
  
  @js.native
  trait PrivateLiftStudyInstance extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[PrivateLiftStudyInstance] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[PrivateLiftStudyInstance] = js.native
    
    def update(fields: js.Array[String]): js.Promise[PrivateLiftStudyInstance] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[PrivateLiftStudyInstance] = js.native
  }
}
