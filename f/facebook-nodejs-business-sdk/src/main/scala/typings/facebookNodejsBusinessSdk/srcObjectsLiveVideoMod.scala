package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.facebookNodejsBusinessSdkBooleans.`false`
import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsLiveVideoMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/live-video", JSImport.Default)
  @js.native
  open class default () extends LiveVideo
  
  @js.native
  trait LiveVideo extends AbstractCrudObject {
    
    def createInputStream(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsLiveVideoInputStreamMod.default] = js.native
    def createInputStream(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsLiveVideoInputStreamMod.default] = js.native
    def createInputStream(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsLiveVideoInputStreamMod.default] = js.native
    def createInputStream(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsLiveVideoInputStreamMod.default] = js.native
    
    def createPoll(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsVideoPollMod.default] = js.native
    def createPoll(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsVideoPollMod.default] = js.native
    def createPoll(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsVideoPollMod.default] = js.native
    def createPoll(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsVideoPollMod.default] = js.native
    
    def delete(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def delete(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    
    def get(fields: js.Array[String]): js.Promise[LiveVideo] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[LiveVideo] = js.native
    
    def getBlockedUsers(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getBlockedUsers(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getBlockedUsers(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getBlockedUsers(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getBlockedUsers")
    def getBlockedUsers_Promise(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getBlockedUsers")
    def getBlockedUsers_Promise(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getBlockedUsers")
    def getBlockedUsers_false(fields: js.Array[String], params: Unit, fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    @JSName("getBlockedUsers")
    def getBlockedUsers_false(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getComments(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getComments(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getComments(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getComments(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getComments")
    def getComments_Promise(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getComments")
    def getComments_Promise(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getComments")
    def getComments_false(fields: js.Array[String], params: Unit, fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    @JSName("getComments")
    def getComments_false(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getCrosspostSharedPages(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getCrosspostSharedPages(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getCrosspostSharedPages(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getCrosspostSharedPages(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getCrosspostSharedPages")
    def getCrosspostSharedPages_Promise(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getCrosspostSharedPages")
    def getCrosspostSharedPages_Promise(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getCrosspostSharedPages")
    def getCrosspostSharedPages_false(fields: js.Array[String], params: Unit, fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    @JSName("getCrosspostSharedPages")
    def getCrosspostSharedPages_false(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getCrosspostedBroadcasts(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getCrosspostedBroadcasts(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getCrosspostedBroadcasts(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getCrosspostedBroadcasts(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getCrosspostedBroadcasts")
    def getCrosspostedBroadcasts_Promise(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getCrosspostedBroadcasts")
    def getCrosspostedBroadcasts_Promise(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getCrosspostedBroadcasts")
    def getCrosspostedBroadcasts_false(fields: js.Array[String], params: Unit, fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    @JSName("getCrosspostedBroadcasts")
    def getCrosspostedBroadcasts_false(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getErrors(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getErrors(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getErrors(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getErrors(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getErrors")
    def getErrors_Promise(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getErrors")
    def getErrors_Promise(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getErrors")
    def getErrors_false(fields: js.Array[String], params: Unit, fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    @JSName("getErrors")
    def getErrors_false(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getPolls(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getPolls(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getPolls(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getPolls(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getPolls")
    def getPolls_Promise(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getPolls")
    def getPolls_Promise(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getPolls")
    def getPolls_false(fields: js.Array[String], params: Unit, fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    @JSName("getPolls")
    def getPolls_false(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getReactions(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getReactions(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getReactions(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getReactions(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getReactions")
    def getReactions_Promise(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getReactions")
    def getReactions_Promise(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getReactions")
    def getReactions_false(fields: js.Array[String], params: Unit, fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    @JSName("getReactions")
    def getReactions_false(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def update(fields: js.Array[String]): js.Promise[LiveVideo] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[LiveVideo] = js.native
  }
}
