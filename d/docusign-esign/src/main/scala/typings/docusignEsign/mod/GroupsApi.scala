package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "GroupsApi")
@js.native
class GroupsApi protected () extends js.Object {
  def this(apiClient: ApiClient) = this()
  
  def createGroups(accountId: String): js.Promise[GroupInformation] = js.native
  def createGroups(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[GroupInformation] = js.native
  def createGroups(accountId: String, optsOrCallback: js.Any): js.Promise[GroupInformation] = js.native
  def createGroups(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[GroupInformation] = js.native
  
  def deleteBrands(accountId: String, groupId: String): js.Promise[BrandsResponse] = js.native
  def deleteBrands(
    accountId: String,
    groupId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[BrandsResponse] = js.native
  def deleteBrands(accountId: String, groupId: String, optsOrCallback: js.Any): js.Promise[BrandsResponse] = js.native
  def deleteBrands(accountId: String, groupId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BrandsResponse] = js.native
  
  def deleteGroupUsers(accountId: String, groupId: String): js.Promise[UsersResponse] = js.native
  def deleteGroupUsers(
    accountId: String,
    groupId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[UsersResponse] = js.native
  def deleteGroupUsers(accountId: String, groupId: String, optsOrCallback: js.Any): js.Promise[UsersResponse] = js.native
  def deleteGroupUsers(accountId: String, groupId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[UsersResponse] = js.native
  
  def deleteGroups(accountId: String): js.Promise[GroupInformation] = js.native
  def deleteGroups(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[GroupInformation] = js.native
  def deleteGroups(accountId: String, optsOrCallback: js.Any): js.Promise[GroupInformation] = js.native
  def deleteGroups(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[GroupInformation] = js.native
  
  def getBrands(accountId: String, groupId: String): js.Promise[BrandsResponse] = js.native
  def getBrands(accountId: String, groupId: String, callback: js.Function0[Unit]): js.Promise[BrandsResponse] = js.native
  
  def listGroupUsers(accountId: String, groupId: String): js.Promise[UsersResponse] = js.native
  def listGroupUsers(
    accountId: String,
    groupId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[UsersResponse] = js.native
  def listGroupUsers(accountId: String, groupId: String, optsOrCallback: js.Any): js.Promise[UsersResponse] = js.native
  def listGroupUsers(accountId: String, groupId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[UsersResponse] = js.native
  
  def listGroups(accountId: String): js.Promise[GroupInformation] = js.native
  def listGroups(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[GroupInformation] = js.native
  def listGroups(accountId: String, optsOrCallback: js.Any): js.Promise[GroupInformation] = js.native
  def listGroups(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[GroupInformation] = js.native
  
  def updateBrands(accountId: String, groupId: String): js.Promise[BrandsResponse] = js.native
  def updateBrands(
    accountId: String,
    groupId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[BrandsResponse] = js.native
  def updateBrands(accountId: String, groupId: String, optsOrCallback: js.Any): js.Promise[BrandsResponse] = js.native
  def updateBrands(accountId: String, groupId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BrandsResponse] = js.native
  
  def updateGroupUsers(accountId: String, groupId: String): js.Promise[UsersResponse] = js.native
  def updateGroupUsers(
    accountId: String,
    groupId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[UsersResponse] = js.native
  def updateGroupUsers(accountId: String, groupId: String, optsOrCallback: js.Any): js.Promise[UsersResponse] = js.native
  def updateGroupUsers(accountId: String, groupId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[UsersResponse] = js.native
  
  def updateGroups(accountId: String): js.Promise[GroupInformation] = js.native
  def updateGroups(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[GroupInformation] = js.native
  def updateGroups(accountId: String, optsOrCallback: js.Any): js.Promise[GroupInformation] = js.native
  def updateGroups(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[GroupInformation] = js.native
}
