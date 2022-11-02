package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsCanvasMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/canvas", JSImport.Default)
  @js.native
  open class default () extends Canvas
  
  @js.native
  trait Canvas extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[Canvas] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[Canvas] = js.native
    
    def getPreViews(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPreViews(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPreViews(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPreViews(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def update(fields: js.Array[String]): js.Promise[Canvas] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[Canvas] = js.native
  }
}
