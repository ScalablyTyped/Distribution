package typings.firefoxDashWebextDashBrowser.browserNs.contextualIdentitiesNs

import typings.firefoxDashWebextDashBrowser.Anon_Color
import typings.firefoxDashWebextDashBrowser.Anon_ColorIcon
import typings.firefoxDashWebextDashBrowser.Anon_ContextualIdentity
import typings.firefoxDashWebextDashBrowser.Anon_Name
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.contextualIdentities")
@js.native
object ^ extends js.Object {
  /** Fired when a new container is created. */
  val onCreated: WebExtEvent[js.Function1[/* changeInfo */ Anon_ContextualIdentity, Unit]] = js.native
  /** Fired when a container is removed. */
  val onRemoved: WebExtEvent[js.Function1[/* changeInfo */ Anon_ContextualIdentity, Unit]] = js.native
  /* contextualIdentities events */
  /** Fired when a container is updated. */
  val onUpdated: WebExtEvent[js.Function1[/* changeInfo */ Anon_ContextualIdentity, Unit]] = js.native
  /**
    * Creates a contextual identity with the given data.
    * @param details Details about the contextual identity being created.
    */
  def create(details: Anon_Color): js.Promise[ContextualIdentity] = js.native
  /* contextualIdentities functions */
  /**
    * Retrieves information about a single contextual identity.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    */
  def get(cookieStoreId: String): js.Promise[ContextualIdentity] = js.native
  /**
    * Retrieves all contextual identities
    * @param details Information to filter the contextual identities being retrieved.
    */
  def query(details: Anon_Name): js.Promise[js.Array[ContextualIdentity]] = js.native
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
  def update(cookieStoreId: String, details: Anon_ColorIcon): js.Promise[ContextualIdentity] = js.native
}

