package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
import typings.firefoxWebextBrowser.browser.contextualIdentities.CreateDetails
import typings.firefoxWebextBrowser.browser.contextualIdentities.OnCreatedChangeInfo
import typings.firefoxWebextBrowser.browser.contextualIdentities.OnRemovedChangeInfo
import typings.firefoxWebextBrowser.browser.contextualIdentities.OnUpdatedChangeInfo
import typings.firefoxWebextBrowser.browser.contextualIdentities.QueryDetails
import typings.firefoxWebextBrowser.browser.contextualIdentities.UpdateDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.contextualIdentities` API to query and modify contextual identity, also called as containers.
  *
  * Permissions: `contextualIdentities`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.contextualIdentities")
@js.native
object contextualIdentities extends js.Object {
  
  /**
    * Creates a contextual identity with the given data.
    * @param details Details about the contextual identity being created.
    */
  def create(details: CreateDetails): js.Promise[ContextualIdentity] = js.native
  
  /* contextualIdentities functions */
  /**
    * Retrieves information about a single contextual identity.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    */
  def get(cookieStoreId: String): js.Promise[ContextualIdentity] = js.native
  
  /** Fired when a new container is created. */
  val onCreated: WebExtEvent[js.Function1[/* changeInfo */ OnCreatedChangeInfo, Unit]] = js.native
  
  /** Fired when a container is removed. */
  val onRemoved: WebExtEvent[js.Function1[/* changeInfo */ OnRemovedChangeInfo, Unit]] = js.native
  
  /* contextualIdentities events */
  /** Fired when a container is updated. */
  val onUpdated: WebExtEvent[js.Function1[/* changeInfo */ OnUpdatedChangeInfo, Unit]] = js.native
  
  /**
    * Retrieves all contextual identities
    * @param details Information to filter the contextual identities being retrieved.
    */
  def query(details: QueryDetails): js.Promise[js.Array[ContextualIdentity]] = js.native
  
  /**
    * Deletes a contetual identity by its cookie Store ID.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    */
  def remove(cookieStoreId: String): js.Promise[ContextualIdentity] = js.native
  
  /**
    * Updates a contextual identity with the given data.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    * @param details Details about the contextual identity being created.
    */
  def update(cookieStoreId: String, details: UpdateDetails): js.Promise[ContextualIdentity] = js.native
}
