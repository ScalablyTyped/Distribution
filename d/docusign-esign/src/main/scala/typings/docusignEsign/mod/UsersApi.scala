package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "UsersApi")
@js.native
class UsersApi protected () extends js.Object {
  def this(apiClient: ApiClient) = this()
  
  def _delete(accountId: String): js.Promise[UsersResponse] = js.native
  def _delete(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[UsersResponse] = js.native
  def _delete(accountId: String, optsOrCallback: js.Any): js.Promise[UsersResponse] = js.native
  def _delete(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[UsersResponse] = js.native
  
  def create(accountId: String): js.Promise[NewUsersSummary] = js.native
  def create(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[NewUsersSummary] = js.native
  def create(accountId: String, optsOrCallback: js.Any): js.Promise[NewUsersSummary] = js.native
  def create(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[NewUsersSummary] = js.native
  
  def createSignatures(accountId: String, userId: String): js.Promise[UserSignaturesInformation] = js.native
  def createSignatures(
    accountId: String,
    userId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[UserSignaturesInformation] = js.native
  def createSignatures(accountId: String, userId: String, optsOrCallback: js.Any): js.Promise[UserSignaturesInformation] = js.native
  def createSignatures(accountId: String, userId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[UserSignaturesInformation] = js.native
  
  def deleteContactWithId(accountId: String, contactId: String): js.Promise[ContactUpdateResponse] = js.native
  def deleteContactWithId(accountId: String, contactId: String, callback: js.Function0[Unit]): js.Promise[ContactUpdateResponse] = js.native
  
  def deleteContacts(accountId: String): js.Promise[ContactUpdateResponse] = js.native
  def deleteContacts(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[ContactUpdateResponse] = js.native
  def deleteContacts(accountId: String, optsOrCallback: js.Any): js.Promise[ContactUpdateResponse] = js.native
  def deleteContacts(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[ContactUpdateResponse] = js.native
  
  def deleteCustomSettings(accountId: String, userId: String): js.Promise[CustomSettingsInformation] = js.native
  def deleteCustomSettings(
    accountId: String,
    userId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[CustomSettingsInformation] = js.native
  def deleteCustomSettings(accountId: String, userId: String, optsOrCallback: js.Any): js.Promise[CustomSettingsInformation] = js.native
  def deleteCustomSettings(accountId: String, userId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[CustomSettingsInformation] = js.native
  
  def deleteProfileImage(accountId: String, userId: String): js.Promise[Unit] = js.native
  def deleteProfileImage(accountId: String, userId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def deleteSignature(accountId: String, userId: String, signatureId: String): js.Promise[Unit] = js.native
  def deleteSignature(accountId: String, userId: String, signatureId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def deleteSignatureImage(accountId: String, userId: String, signatureId: String, imageType: String): js.Promise[UserSignature] = js.native
  def deleteSignatureImage(
    accountId: String,
    userId: String,
    signatureId: String,
    imageType: String,
    callback: js.Function0[Unit]
  ): js.Promise[UserSignature] = js.native
  
  def getContactById(accountId: String, contactId: String): js.Promise[ContactGetResponse] = js.native
  def getContactById(
    accountId: String,
    contactId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[ContactGetResponse] = js.native
  def getContactById(accountId: String, contactId: String, optsOrCallback: js.Any): js.Promise[ContactGetResponse] = js.native
  def getContactById(accountId: String, contactId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[ContactGetResponse] = js.native
  
  def getInformation(accountId: String, userId: String): js.Promise[UserInformation] = js.native
  def getInformation(
    accountId: String,
    userId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[UserInformation] = js.native
  def getInformation(accountId: String, userId: String, optsOrCallback: js.Any): js.Promise[UserInformation] = js.native
  def getInformation(accountId: String, userId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[UserInformation] = js.native
  
  def getProfile(accountId: String, userId: String): js.Promise[UserProfile] = js.native
  def getProfile(accountId: String, userId: String, callback: js.Function0[Unit]): js.Promise[UserProfile] = js.native
  
  def getProfileImage(accountId: String, userId: String): js.Promise[js.Object] = js.native
  def getProfileImage(
    accountId: String,
    userId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[js.Object] = js.native
  def getProfileImage(accountId: String, userId: String, optsOrCallback: js.Any): js.Promise[js.Object] = js.native
  def getProfileImage(accountId: String, userId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[js.Object] = js.native
  
  def getSettings(accountId: String, userId: String): js.Promise[UserSettingsInformation] = js.native
  def getSettings(accountId: String, userId: String, callback: js.Function0[Unit]): js.Promise[UserSettingsInformation] = js.native
  
  def getSignature(accountId: String, userId: String, signatureId: String): js.Promise[UserSignature] = js.native
  def getSignature(accountId: String, userId: String, signatureId: String, callback: js.Function0[Unit]): js.Promise[UserSignature] = js.native
  
  def getSignatureImage(accountId: String, userId: String, signatureId: String, imageType: String): js.Promise[js.Object] = js.native
  def getSignatureImage(
    accountId: String,
    userId: String,
    signatureId: String,
    imageType: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[js.Object] = js.native
  def getSignatureImage(accountId: String, userId: String, signatureId: String, imageType: String, optsOrCallback: js.Any): js.Promise[js.Object] = js.native
  def getSignatureImage(
    accountId: String,
    userId: String,
    signatureId: String,
    imageType: String,
    optsOrCallback: js.Any,
    callback: js.Function0[Unit]
  ): js.Promise[js.Object] = js.native
  
  def list(accountId: String): js.Promise[UserInformationList] = js.native
  def list(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[UserInformationList] = js.native
  def list(accountId: String, optsOrCallback: js.Any): js.Promise[UserInformationList] = js.native
  def list(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[UserInformationList] = js.native
  
  def listCustomSettings(accountId: String, userId: String): js.Promise[CustomSettingsInformation] = js.native
  def listCustomSettings(accountId: String, userId: String, callback: js.Function0[Unit]): js.Promise[CustomSettingsInformation] = js.native
  
  def listSignatures(accountId: String, userId: String): js.Promise[UserSignaturesInformation] = js.native
  def listSignatures(
    accountId: String,
    userId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[UserSignaturesInformation] = js.native
  def listSignatures(accountId: String, userId: String, optsOrCallback: js.Any): js.Promise[UserSignaturesInformation] = js.native
  def listSignatures(accountId: String, userId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[UserSignaturesInformation] = js.native
  
  def postContacts(accountId: String): js.Promise[ContactUpdateResponse] = js.native
  def postContacts(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[ContactUpdateResponse] = js.native
  def postContacts(accountId: String, optsOrCallback: js.Any): js.Promise[ContactUpdateResponse] = js.native
  def postContacts(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[ContactUpdateResponse] = js.native
  
  def putContacts(accountId: String): js.Promise[ContactUpdateResponse] = js.native
  def putContacts(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[ContactUpdateResponse] = js.native
  def putContacts(accountId: String, optsOrCallback: js.Any): js.Promise[ContactUpdateResponse] = js.native
  def putContacts(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[ContactUpdateResponse] = js.native
  
  def updateCustomSettings(accountId: String, userId: String): js.Promise[CustomSettingsInformation] = js.native
  def updateCustomSettings(
    accountId: String,
    userId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[CustomSettingsInformation] = js.native
  def updateCustomSettings(accountId: String, userId: String, optsOrCallback: js.Any): js.Promise[CustomSettingsInformation] = js.native
  def updateCustomSettings(accountId: String, userId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[CustomSettingsInformation] = js.native
  
  def updateProfile(accountId: String, userId: String): js.Promise[Unit] = js.native
  def updateProfile(
    accountId: String,
    userId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  def updateProfile(accountId: String, userId: String, optsOrCallback: js.Any): js.Promise[Unit] = js.native
  def updateProfile(accountId: String, userId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def updateProfileImage(accountId: String, userId: String): js.Promise[Unit] = js.native
  def updateProfileImage(accountId: String, userId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def updateSettings(accountId: String, userId: String): js.Promise[Unit] = js.native
  def updateSettings(
    accountId: String,
    userId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  def updateSettings(accountId: String, userId: String, optsOrCallback: js.Any): js.Promise[Unit] = js.native
  def updateSettings(accountId: String, userId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def updateSignature(accountId: String, userId: String, signatureId: String): js.Promise[UserSignature] = js.native
  def updateSignature(
    accountId: String,
    userId: String,
    signatureId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[UserSignature] = js.native
  def updateSignature(accountId: String, userId: String, signatureId: String, optsOrCallback: js.Any): js.Promise[UserSignature] = js.native
  def updateSignature(
    accountId: String,
    userId: String,
    signatureId: String,
    optsOrCallback: js.Any,
    callback: js.Function0[Unit]
  ): js.Promise[UserSignature] = js.native
  
  def updateSignatureImage(accountId: String, userId: String, signatureId: String, imageType: String): js.Promise[UserSignature] = js.native
  def updateSignatureImage(
    accountId: String,
    userId: String,
    signatureId: String,
    imageType: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[UserSignature] = js.native
  def updateSignatureImage(accountId: String, userId: String, signatureId: String, imageType: String, optsOrCallback: js.Any): js.Promise[UserSignature] = js.native
  def updateSignatureImage(
    accountId: String,
    userId: String,
    signatureId: String,
    imageType: String,
    optsOrCallback: js.Any,
    callback: js.Function0[Unit]
  ): js.Promise[UserSignature] = js.native
  
  def updateSignatures(accountId: String, userId: String): js.Promise[UserSignaturesInformation] = js.native
  def updateSignatures(
    accountId: String,
    userId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[UserSignaturesInformation] = js.native
  def updateSignatures(accountId: String, userId: String, optsOrCallback: js.Any): js.Promise[UserSignaturesInformation] = js.native
  def updateSignatures(accountId: String, userId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[UserSignaturesInformation] = js.native
  
  def updateUser(accountId: String, userId: String): js.Promise[UserInformation] = js.native
  def updateUser(
    accountId: String,
    userId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[UserInformation] = js.native
  def updateUser(accountId: String, userId: String, optsOrCallback: js.Any): js.Promise[UserInformation] = js.native
  def updateUser(accountId: String, userId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[UserInformation] = js.native
  
  def updateUsers(accountId: String): js.Promise[UserInformationList] = js.native
  def updateUsers(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[UserInformationList] = js.native
  def updateUsers(accountId: String, optsOrCallback: js.Any): js.Promise[UserInformationList] = js.native
  def updateUsers(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[UserInformationList] = js.native
}
