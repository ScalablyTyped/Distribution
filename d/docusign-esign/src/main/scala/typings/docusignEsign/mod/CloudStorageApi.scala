package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "CloudStorageApi")
@js.native
class CloudStorageApi protected () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def createProvider(accountId: String, userId: String): js.Promise[CloudStorageProviders] = js.native
  def createProvider(accountId: String, userId: String, optsOrCallback: js.Any): js.Promise[CloudStorageProviders] = js.native
  def createProvider(accountId: String, userId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[CloudStorageProviders] = js.native
  def createProvider(accountId: String, userId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[CloudStorageProviders] = js.native
  
  def deleteProvider(accountId: String, userId: String, serviceId: String): js.Promise[CloudStorageProviders] = js.native
  def deleteProvider(accountId: String, userId: String, serviceId: String, callback: js.Function0[Unit]): js.Promise[CloudStorageProviders] = js.native
  
  def deleteProviders(accountId: String, userId: String): js.Promise[CloudStorageProviders] = js.native
  def deleteProviders(accountId: String, userId: String, optsOrCallback: js.Any): js.Promise[CloudStorageProviders] = js.native
  def deleteProviders(accountId: String, userId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[CloudStorageProviders] = js.native
  def deleteProviders(accountId: String, userId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[CloudStorageProviders] = js.native
  
  def getProvider(accountId: String, userId: String, serviceId: String): js.Promise[CloudStorageProviders] = js.native
  def getProvider(accountId: String, userId: String, serviceId: String, optsOrCallback: js.Any): js.Promise[CloudStorageProviders] = js.native
  def getProvider(
    accountId: String,
    userId: String,
    serviceId: String,
    optsOrCallback: js.Any,
    callback: js.Function0[Unit]
  ): js.Promise[CloudStorageProviders] = js.native
  def getProvider(
    accountId: String,
    userId: String,
    serviceId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[CloudStorageProviders] = js.native
  
  def list(accountId: String, userId: String, serviceId: String, folderId: String): js.Promise[ExternalFolder] = js.native
  def list(accountId: String, userId: String, serviceId: String, folderId: String, optsOrCallback: js.Any): js.Promise[ExternalFolder] = js.native
  def list(
    accountId: String,
    userId: String,
    serviceId: String,
    folderId: String,
    optsOrCallback: js.Any,
    callback: js.Function0[Unit]
  ): js.Promise[ExternalFolder] = js.native
  def list(
    accountId: String,
    userId: String,
    serviceId: String,
    folderId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[ExternalFolder] = js.native
  
  def listFolders(accountId: String, userId: String, serviceId: String): js.Promise[ExternalFolder] = js.native
  def listFolders(accountId: String, userId: String, serviceId: String, optsOrCallback: js.Any): js.Promise[ExternalFolder] = js.native
  def listFolders(
    accountId: String,
    userId: String,
    serviceId: String,
    optsOrCallback: js.Any,
    callback: js.Function0[Unit]
  ): js.Promise[ExternalFolder] = js.native
  def listFolders(
    accountId: String,
    userId: String,
    serviceId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[ExternalFolder] = js.native
  
  def listProviders(accountId: String, userId: String): js.Promise[CloudStorageProviders] = js.native
  def listProviders(accountId: String, userId: String, optsOrCallback: js.Any): js.Promise[CloudStorageProviders] = js.native
  def listProviders(accountId: String, userId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[CloudStorageProviders] = js.native
  def listProviders(accountId: String, userId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[CloudStorageProviders] = js.native
}
