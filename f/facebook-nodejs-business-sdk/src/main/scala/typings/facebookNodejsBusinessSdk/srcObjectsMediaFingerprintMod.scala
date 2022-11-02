package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsMediaFingerprintMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/media-fingerprint", JSImport.Default)
  @js.native
  open class default () extends MediaFingerprint
  
  @js.native
  trait MediaFingerprint extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[MediaFingerprint] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[MediaFingerprint] = js.native
    
    def update(fields: js.Array[String]): js.Promise[MediaFingerprint] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[MediaFingerprint] = js.native
  }
}
