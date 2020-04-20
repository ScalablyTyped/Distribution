package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofcontextualIdentitie extends js.Object {
  /** Fired when a new container is created. */
  val onCreated: WebExtEvent[js.Function1[/* changeInfo */ AnonContextualIdentity, Unit]]
  /** Fired when a container is removed. */
  val onRemoved: WebExtEvent[js.Function1[/* changeInfo */ AnonContextualIdentity, Unit]]
  /* contextualIdentities events */
  /** Fired when a container is updated. */
  val onUpdated: WebExtEvent[js.Function1[/* changeInfo */ AnonContextualIdentity, Unit]]
  /**
    * Creates a contextual identity with the given data.
    * @param details Details about the contextual identity being created.
    */
  def create(details: AnonColor): js.Promise[ContextualIdentity]
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
  def query(details: AnonName): js.Promise[js.Array[ContextualIdentity]]
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
  def update(cookieStoreId: String, details: AnonIcon): js.Promise[ContextualIdentity]
}

object TypeofcontextualIdentitie {
  @scala.inline
  def apply(
    create: AnonColor => js.Promise[ContextualIdentity],
    get: String => js.Promise[ContextualIdentity],
    onCreated: WebExtEvent[js.Function1[/* changeInfo */ AnonContextualIdentity, Unit]],
    onRemoved: WebExtEvent[js.Function1[/* changeInfo */ AnonContextualIdentity, Unit]],
    onUpdated: WebExtEvent[js.Function1[/* changeInfo */ AnonContextualIdentity, Unit]],
    query: AnonName => js.Promise[js.Array[ContextualIdentity]],
    remove: String => js.Promise[ContextualIdentity],
    update: (String, AnonIcon) => js.Promise[ContextualIdentity]
  ): TypeofcontextualIdentitie = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), onCreated = onCreated.asInstanceOf[js.Any], onRemoved = onRemoved.asInstanceOf[js.Any], onUpdated = onUpdated.asInstanceOf[js.Any], query = js.Any.fromFunction1(query), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[TypeofcontextualIdentitie]
  }
}

