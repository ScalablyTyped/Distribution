package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsAdStudyMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/ad-study", JSImport.Default)
  @js.native
  open class default () extends AdStudy
  
  @js.native
  trait AdStudy extends AbstractCrudObject {
    
    def createCheckPoint(fields: js.Array[String]): js.Promise[AdStudy] = js.native
    def createCheckPoint(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[AdStudy] = js.native
    def createCheckPoint(fields: js.Array[String], params: Record[String, Any]): js.Promise[AdStudy] = js.native
    def createCheckPoint(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[AdStudy] = js.native
    
    def createInstance(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsPrivateLiftStudyInstanceMod.default] = js.native
    def createInstance(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsPrivateLiftStudyInstanceMod.default] = js.native
    def createInstance(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsPrivateLiftStudyInstanceMod.default] = js.native
    def createInstance(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsPrivateLiftStudyInstanceMod.default] = js.native
    
    def delete(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def delete(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    
    def get(fields: js.Array[String]): js.Promise[AdStudy] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[AdStudy] = js.native
    
    def getCells(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getCells(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getCells(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getCells(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getInstances(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getInstances(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getInstances(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getInstances(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getObjectives(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getObjectives(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getObjectives(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getObjectives(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def update(fields: js.Array[String]): js.Promise[AdStudy] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[AdStudy] = js.native
  }
}
