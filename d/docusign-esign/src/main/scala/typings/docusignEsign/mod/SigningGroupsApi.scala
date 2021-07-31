package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "SigningGroupsApi")
@js.native
class SigningGroupsApi protected () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def createList(accountId: String): js.Promise[SigningGroupInformation] = js.native
  def createList(accountId: String, optsOrCallback: js.Any): js.Promise[SigningGroupInformation] = js.native
  def createList(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[SigningGroupInformation] = js.native
  def createList(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[SigningGroupInformation] = js.native
  
  def deleteList(accountId: String): js.Promise[SigningGroupInformation] = js.native
  def deleteList(accountId: String, optsOrCallback: js.Any): js.Promise[SigningGroupInformation] = js.native
  def deleteList(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[SigningGroupInformation] = js.native
  def deleteList(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[SigningGroupInformation] = js.native
  
  def deleteUsers(accountId: String, signingGroupId: String): js.Promise[SigningGroupUsers] = js.native
  def deleteUsers(accountId: String, signingGroupId: String, optsOrCallback: js.Any): js.Promise[SigningGroupUsers] = js.native
  def deleteUsers(accountId: String, signingGroupId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[SigningGroupUsers] = js.native
  def deleteUsers(accountId: String, signingGroupId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[SigningGroupUsers] = js.native
  
  def get(accountId: String, signingGroupId: String): js.Promise[SigningGroup] = js.native
  def get(accountId: String, signingGroupId: String, callback: js.Function0[Unit]): js.Promise[SigningGroup] = js.native
  
  def list(accountId: String): js.Promise[SigningGroupInformation] = js.native
  def list(accountId: String, optsOrCallback: js.Any): js.Promise[SigningGroupInformation] = js.native
  def list(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[SigningGroupInformation] = js.native
  def list(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[SigningGroupInformation] = js.native
  
  def listUsers(accountId: String, signingGroupId: String): js.Promise[SigningGroupUsers] = js.native
  def listUsers(accountId: String, signingGroupId: String, callback: js.Function0[Unit]): js.Promise[SigningGroupUsers] = js.native
  
  def update(accountId: String, signingGroupId: String): js.Promise[SigningGroup] = js.native
  def update(accountId: String, signingGroupId: String, optsOrCallback: js.Any): js.Promise[SigningGroup] = js.native
  def update(accountId: String, signingGroupId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[SigningGroup] = js.native
  def update(accountId: String, signingGroupId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[SigningGroup] = js.native
  
  def updateList(accountId: String): js.Promise[SigningGroupInformation] = js.native
  def updateList(accountId: String, optsOrCallback: js.Any): js.Promise[SigningGroupInformation] = js.native
  def updateList(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[SigningGroupInformation] = js.native
  def updateList(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[SigningGroupInformation] = js.native
  
  def updateUsers(accountId: String, signingGroupId: String): js.Promise[SigningGroupUsers] = js.native
  def updateUsers(accountId: String, signingGroupId: String, optsOrCallback: js.Any): js.Promise[SigningGroupUsers] = js.native
  def updateUsers(accountId: String, signingGroupId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[SigningGroupUsers] = js.native
  def updateUsers(accountId: String, signingGroupId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[SigningGroupUsers] = js.native
}
