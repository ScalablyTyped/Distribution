package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsVideoPollMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/video-poll", JSImport.Default)
  @js.native
  open class default () extends VideoPoll
  
  @js.native
  trait VideoPoll extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[VideoPoll] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[VideoPoll] = js.native
    
    def getPollOptions(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPollOptions(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPollOptions(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPollOptions(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def update(fields: js.Array[String]): js.Promise[VideoPoll] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[VideoPoll] = js.native
  }
}
