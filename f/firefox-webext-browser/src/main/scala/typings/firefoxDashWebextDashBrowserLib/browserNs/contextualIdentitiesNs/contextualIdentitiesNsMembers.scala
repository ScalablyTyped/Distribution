package typings
package firefoxDashWebextDashBrowserLib.browserNs.contextualIdentitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.contextualIdentities")
@js.native
object contextualIdentitiesNsMembers extends js.Object {
  /** Fired when a new container is created. */
  val onCreated: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function1[
      /* changeInfo */ firefoxDashWebextDashBrowserLib.Anon_ContextualIdentity, 
      scala.Unit
    ]
  ] = js.native
  /** Fired when a container is removed. */
  val onRemoved: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function1[
      /* changeInfo */ firefoxDashWebextDashBrowserLib.Anon_ContextualIdentity, 
      scala.Unit
    ]
  ] = js.native
  /* contextualIdentities events */
  /** Fired when a container is updated. */
  val onUpdated: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function1[
      /* changeInfo */ firefoxDashWebextDashBrowserLib.Anon_ContextualIdentity, 
      scala.Unit
    ]
  ] = js.native
  /**
       * Creates a contextual identity with the given data.
       * @param details Details about the contextual identity being created.
       */
  def create(details: firefoxDashWebextDashBrowserLib.Anon_Color): js.Promise[ContextualIdentity] = js.native
  /* contextualIdentities functions */
  /**
       * Retrieves information about a single contextual identity.
       * @param cookieStoreId The ID of the contextual identity cookie store.
       */
  def get(cookieStoreId: java.lang.String): js.Promise[ContextualIdentity] = js.native
  /**
       * Retrieves all contextual identities
       * @param details Information to filter the contextual identities being retrieved.
       */
  def query(details: firefoxDashWebextDashBrowserLib.Anon_Name): js.Promise[js.Array[ContextualIdentity]] = js.native
  /**
       * Deletes a contetual identity by its cookie Store ID.
       * @param cookieStoreId The ID of the contextual identity cookie store.
       */
  def remove(cookieStoreId: java.lang.String): js.Promise[ContextualIdentity] = js.native
  /**
       * Updates a contextual identity with the given data.
       * @param cookieStoreId The ID of the contextual identity cookie store.
       * @param details Details about the contextual identity being created.
       */
  def update(cookieStoreId: java.lang.String, details: firefoxDashWebextDashBrowserLib.Anon_ColorName): js.Promise[ContextualIdentity] = js.native
}

