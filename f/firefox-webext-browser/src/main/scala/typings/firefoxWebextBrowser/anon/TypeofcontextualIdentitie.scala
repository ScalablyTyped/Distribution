package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofcontextualIdentitie extends js.Object {
  /** Fired when a new container is created. */
  val onCreated: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]] = js.native
  /** Fired when a container is removed. */
  val onRemoved: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]] = js.native
  /* contextualIdentities events */
  /** Fired when a container is updated. */
  val onUpdated: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]] = js.native
  /**
    * Creates a contextual identity with the given data.
    * @param details Details about the contextual identity being created.
    */
  def create(details: Icon): js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity] = js.native
  /* contextualIdentities functions */
  /**
    * Retrieves information about a single contextual identity.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    */
  def get(cookieStoreId: String): js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity] = js.native
  /**
    * Retrieves all contextual identities
    * @param details Information to filter the contextual identities being retrieved.
    */
  def query(details: Name): js.Promise[
    js.Array[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity]
  ] = js.native
  /**
    * Deletes a contetual identity by its cookie Store ID.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    */
  def remove(cookieStoreId: String): js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity] = js.native
  /**
    * Updates a contextual identity with the given data.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    * @param details Details about the contextual identity being created.
    */
  def update(cookieStoreId: String, details: ColorIcon): js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity] = js.native
}

object TypeofcontextualIdentitie {
  @scala.inline
  def apply(
    create: Icon => js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity],
    get: String => js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity],
    onCreated: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]],
    onRemoved: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]],
    onUpdated: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]],
    query: Name => js.Promise[
      js.Array[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity]
    ],
    remove: String => js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity],
    update: (String, ColorIcon) => js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity]
  ): TypeofcontextualIdentitie = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), onCreated = onCreated.asInstanceOf[js.Any], onRemoved = onRemoved.asInstanceOf[js.Any], onUpdated = onUpdated.asInstanceOf[js.Any], query = js.Any.fromFunction1(query), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[TypeofcontextualIdentitie]
  }
  @scala.inline
  implicit class TypeofcontextualIdentitieOps[Self <: TypeofcontextualIdentitie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(
      value: Icon => js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity]
    ): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(
      value: String => js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity]
    ): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setOnCreated(value: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]]): Self = this.set("onCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRemoved(value: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]]): Self = this.set("onRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnUpdated(value: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]]): Self = this.set("onUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(
      value: Name => js.Promise[
          js.Array[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity]
        ]
    ): Self = this.set("query", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(
      value: String => js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity]
    ): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(
      value: (String, ColorIcon) => js.Promise[typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity]
    ): Self = this.set("update", js.Any.fromFunction2(value))
  }
  
}

