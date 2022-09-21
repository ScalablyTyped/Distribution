package typings.evernote.mod

import typings.evernote.anon.China
import typings.evernote.mod.Types.LinkedNotebook
import typings.oauth.mod.OAuth
import typings.oauth.mod.oauth1tokenCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Client")
@js.native
open class Client protected () extends StObject {
  def this(config: China) = this()
  
  def getAccessToken(oauthToken: String, oauthTokenSecret: String, oauthVerifier: String, callback: oauth1tokenCallback): Unit = js.native
  
  def getAuthorizeUrl(oauthToken: String): String = js.native
  
  def getBusinessNoteStore(): NoteStoreClient = js.native
  
  def getEndpoint(path: String): String = js.native
  
  def getNoteStore(): NoteStoreClient = js.native
  def getNoteStore(noteStoreUrl: String): NoteStoreClient = js.native
  
  def getOAuthClient(callbackUrl: String): OAuth = js.native
  
  def getRequestToken(callbackUrl: String, callback: oauth1tokenCallback): Unit = js.native
  
  def getSharedNoteStore(linkedNotebook: LinkedNotebook): NoteStoreClient = js.native
  
  def getUserStore(): UserStoreClient = js.native
}
