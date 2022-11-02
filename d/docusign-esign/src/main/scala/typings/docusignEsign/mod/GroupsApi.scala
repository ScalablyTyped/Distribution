package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "GroupsApi")
@js.native
open class GroupsApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def createGroups(accountId: String): js.Promise[GroupInformation] = js.native
  def createGroups(accountId: String, optsOrCallback: Any): js.Promise[GroupInformation] = js.native
  def createGroups(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[GroupInformation] = js.native
  def createGroups(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[GroupInformation] = js.native
  def createGroups(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[GroupInformation] = js.native
  def createGroups(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[GroupInformation] = js.native
  
  def deleteBrands(accountId: String, groupId: String): js.Promise[BrandsResponse] = js.native
  def deleteBrands(accountId: String, groupId: String, optsOrCallback: Any): js.Promise[BrandsResponse] = js.native
  def deleteBrands(accountId: String, groupId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[BrandsResponse] = js.native
  def deleteBrands(
    accountId: String,
    groupId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BrandsResponse] = js.native
  def deleteBrands(accountId: String, groupId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BrandsResponse] = js.native
  def deleteBrands(
    accountId: String,
    groupId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BrandsResponse] = js.native
  
  def deleteGroupUsers(accountId: String, groupId: String): js.Promise[UsersResponse] = js.native
  def deleteGroupUsers(accountId: String, groupId: String, optsOrCallback: Any): js.Promise[UsersResponse] = js.native
  def deleteGroupUsers(accountId: String, groupId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[UsersResponse] = js.native
  def deleteGroupUsers(
    accountId: String,
    groupId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[UsersResponse] = js.native
  def deleteGroupUsers(accountId: String, groupId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[UsersResponse] = js.native
  def deleteGroupUsers(
    accountId: String,
    groupId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[UsersResponse] = js.native
  
  def deleteGroups(accountId: String): js.Promise[GroupInformation] = js.native
  def deleteGroups(accountId: String, optsOrCallback: Any): js.Promise[GroupInformation] = js.native
  def deleteGroups(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[GroupInformation] = js.native
  def deleteGroups(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[GroupInformation] = js.native
  def deleteGroups(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[GroupInformation] = js.native
  def deleteGroups(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[GroupInformation] = js.native
  
  def getBrands(accountId: String, groupId: String): js.Promise[BrandsResponse] = js.native
  def getBrands(accountId: String, groupId: String, callback: js.Function0[Unit]): js.Promise[BrandsResponse] = js.native
  def getBrands(
    accountId: String,
    groupId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BrandsResponse] = js.native
  
  def listGroupUsers(accountId: String, groupId: String): js.Promise[UsersResponse] = js.native
  def listGroupUsers(accountId: String, groupId: String, optsOrCallback: Any): js.Promise[UsersResponse] = js.native
  def listGroupUsers(accountId: String, groupId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[UsersResponse] = js.native
  def listGroupUsers(
    accountId: String,
    groupId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[UsersResponse] = js.native
  def listGroupUsers(accountId: String, groupId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[UsersResponse] = js.native
  def listGroupUsers(
    accountId: String,
    groupId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[UsersResponse] = js.native
  
  def listGroups(accountId: String): js.Promise[GroupInformation] = js.native
  def listGroups(accountId: String, optsOrCallback: Any): js.Promise[GroupInformation] = js.native
  def listGroups(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[GroupInformation] = js.native
  def listGroups(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[GroupInformation] = js.native
  def listGroups(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[GroupInformation] = js.native
  def listGroups(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[GroupInformation] = js.native
  
  def updateBrands(accountId: String, groupId: String): js.Promise[BrandsResponse] = js.native
  def updateBrands(accountId: String, groupId: String, optsOrCallback: Any): js.Promise[BrandsResponse] = js.native
  def updateBrands(accountId: String, groupId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[BrandsResponse] = js.native
  def updateBrands(
    accountId: String,
    groupId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BrandsResponse] = js.native
  def updateBrands(accountId: String, groupId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BrandsResponse] = js.native
  def updateBrands(
    accountId: String,
    groupId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BrandsResponse] = js.native
  
  def updateGroupUsers(accountId: String, groupId: String): js.Promise[UsersResponse] = js.native
  def updateGroupUsers(accountId: String, groupId: String, optsOrCallback: Any): js.Promise[UsersResponse] = js.native
  def updateGroupUsers(accountId: String, groupId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[UsersResponse] = js.native
  def updateGroupUsers(
    accountId: String,
    groupId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[UsersResponse] = js.native
  def updateGroupUsers(accountId: String, groupId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[UsersResponse] = js.native
  def updateGroupUsers(
    accountId: String,
    groupId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[UsersResponse] = js.native
  
  def updateGroups(accountId: String): js.Promise[GroupInformation] = js.native
  def updateGroups(accountId: String, optsOrCallback: Any): js.Promise[GroupInformation] = js.native
  def updateGroups(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[GroupInformation] = js.native
  def updateGroups(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[GroupInformation] = js.native
  def updateGroups(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[GroupInformation] = js.native
  def updateGroups(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[GroupInformation] = js.native
}
