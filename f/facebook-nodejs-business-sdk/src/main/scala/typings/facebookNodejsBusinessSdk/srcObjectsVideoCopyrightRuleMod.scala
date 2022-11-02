package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsVideoCopyrightRuleMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/video-copyright-rule", JSImport.Default)
  @js.native
  open class default () extends VideoCopyrightRule
  
  @js.native
  trait VideoCopyrightRule extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[VideoCopyrightRule] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[VideoCopyrightRule] = js.native
  }
}
