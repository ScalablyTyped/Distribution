package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "CustomTabsApi")
@js.native
class CustomTabsApi protected () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def _delete(accountId: String, customTabId: String): js.Promise[Unit] = js.native
  def _delete(accountId: String, customTabId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def create(accountId: String): js.Promise[TabMetadata] = js.native
  def create(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[TabMetadata] = js.native
  def create(accountId: String, optsOrCallback: js.Any): js.Promise[TabMetadata] = js.native
  def create(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[TabMetadata] = js.native
  
  def get(accountId: String, customTabId: String): js.Promise[TabMetadata] = js.native
  def get(accountId: String, customTabId: String, callback: js.Function0[Unit]): js.Promise[TabMetadata] = js.native
  
  def list(accountId: String): js.Promise[TabMetadataList] = js.native
  def list(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[TabMetadataList] = js.native
  def list(accountId: String, optsOrCallback: js.Any): js.Promise[TabMetadataList] = js.native
  def list(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[TabMetadataList] = js.native
  
  def update(accountId: String, customTabId: String): js.Promise[TabMetadata] = js.native
  def update(
    accountId: String,
    customTabId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[TabMetadata] = js.native
  def update(accountId: String, customTabId: String, optsOrCallback: js.Any): js.Promise[TabMetadata] = js.native
  def update(accountId: String, customTabId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[TabMetadata] = js.native
}
