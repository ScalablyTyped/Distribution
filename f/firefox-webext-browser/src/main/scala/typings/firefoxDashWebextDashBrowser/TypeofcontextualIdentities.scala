package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.contextualIdentities.ContextualIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofcontextualIdentities extends js.Object {
  /** Fired when a new container is created. */
  val onCreated: WebExtEvent[js.Function1[/* changeInfo */ Anon_ContextualIdentity, Unit]]
  /** Fired when a container is removed. */
  val onRemoved: WebExtEvent[js.Function1[/* changeInfo */ Anon_ContextualIdentity, Unit]]
  /* contextualIdentities events */
  /** Fired when a container is updated. */
  val onUpdated: WebExtEvent[js.Function1[/* changeInfo */ Anon_ContextualIdentity, Unit]]
  /**
    * Creates a contextual identity with the given data.
    * @param details Details about the contextual identity being created.
    */
  def create(details: Anon_Color): js.Promise[ContextualIdentity]
  /* contextualIdentities functions */
  /**
    * Retrieves information about a single contextual identity.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    */
  def get(cookieStoreId: String): js.Promise[ContextualIdentity]
  /**
    * Retrieves all contextual identities
    * @param details Information to filter the contextual identities being retrieved.
    */
  def query(details: Anon_Name): js.Promise[js.Array[ContextualIdentity]]
  /**
    * Deletes a contetual identity by its cookie Store ID.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    */
  def remove(cookieStoreId: String): js.Promise[ContextualIdentity]
  /**
    * Updates a contextual identity with the given data.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    * @param details Details about the contextual identity being created.
    */
  def update(cookieStoreId: String, details: Anon_ColorIcon): js.Promise[ContextualIdentity]
}

object TypeofcontextualIdentities {
  @scala.inline
  def apply(
    create: Anon_Color => js.Promise[ContextualIdentity],
    get: String => js.Promise[ContextualIdentity],
    onCreated: WebExtEvent[js.Function1[/* changeInfo */ Anon_ContextualIdentity, Unit]],
    onRemoved: WebExtEvent[js.Function1[/* changeInfo */ Anon_ContextualIdentity, Unit]],
    onUpdated: WebExtEvent[js.Function1[/* changeInfo */ Anon_ContextualIdentity, Unit]],
    query: Anon_Name => js.Promise[js.Array[ContextualIdentity]],
    remove: String => js.Promise[ContextualIdentity],
    update: (String, Anon_ColorIcon) => js.Promise[ContextualIdentity]
  ): TypeofcontextualIdentities = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), onCreated = onCreated, onRemoved = onRemoved, onUpdated = onUpdated, query = js.Any.fromFunction1(query), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[TypeofcontextualIdentities]
  }
}

