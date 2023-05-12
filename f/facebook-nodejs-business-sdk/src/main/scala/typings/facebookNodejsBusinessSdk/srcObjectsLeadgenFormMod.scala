package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.facebookNodejsBusinessSdkBooleans.`false`
import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsLeadgenFormMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/leadgen-form", JSImport.Default)
  @js.native
  open class default () extends LeadgenForm
  
  @js.native
  trait LeadgenForm extends AbstractCrudObject {
    
    def createTestLead(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsLeadMod.default] = js.native
    def createTestLead(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsLeadMod.default] = js.native
    def createTestLead(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsLeadMod.default] = js.native
    def createTestLead(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsLeadMod.default] = js.native
    
    def get(fields: js.Array[String]): js.Promise[LeadgenForm] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[LeadgenForm] = js.native
    
    def getLeads(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getLeads(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getLeads(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getLeads(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getLeads")
    def getLeads_Promise(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getLeads")
    def getLeads_Promise(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getLeads")
    def getLeads_false(fields: js.Array[String], params: Unit, fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    @JSName("getLeads")
    def getLeads_false(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getTestLeads(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getTestLeads(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getTestLeads(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getTestLeads(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getTestLeads")
    def getTestLeads_Promise(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getTestLeads")
    def getTestLeads_Promise(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getTestLeads")
    def getTestLeads_false(fields: js.Array[String], params: Unit, fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    @JSName("getTestLeads")
    def getTestLeads_false(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def update(fields: js.Array[String]): js.Promise[LeadgenForm] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[LeadgenForm] = js.native
  }
}
