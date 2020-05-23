package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofcontextualIdentitie extends js.Object {
  /** Fired when a new container is created. */
  val onCreated: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]]
  /** Fired when a container is removed. */
  val onRemoved: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]]
  /* contextualIdentities events */
  /** Fired when a container is updated. */
  val onUpdated: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]]
  /**
    * Creates a contextual identity with the given data.
    * @param details Details about the contextual identity being created.
    */
  def create(details: Color): js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity]
  /* contextualIdentities functions */
  /**
    * Retrieves information about a single contextual identity.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    */
  def get(cookieStoreId: String): js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity]
  /**
    * Retrieves all contextual identities
    * @param details Information to filter the contextual identities being retrieved.
    */
  def query(details: Name): js.Promise[
    js.Array[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity]
  ]
  /**
    * Deletes a contetual identity by its cookie Store ID.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    */
  def remove(cookieStoreId: String): js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity]
  /**
    * Updates a contextual identity with the given data.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    * @param details Details about the contextual identity being created.
    */
  def update(cookieStoreId: String, details: Icon): js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity]
}

object TypeofcontextualIdentitie {
  @scala.inline
  def apply(
    create: Color => js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity],
    get: String => js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity],
    onCreated: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]],
    onRemoved: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]],
    onUpdated: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]],
    query: Name => js.Promise[
      js.Array[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity]
    ],
    remove: String => js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity],
    update: (String, Icon) => js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity]
  ): TypeofcontextualIdentitie = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), onCreated = onCreated.asInstanceOf[js.Any], onRemoved = onRemoved.asInstanceOf[js.Any], onUpdated = onUpdated.asInstanceOf[js.Any], query = js.Any.fromFunction1(query), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[TypeofcontextualIdentitie]
  }
}

