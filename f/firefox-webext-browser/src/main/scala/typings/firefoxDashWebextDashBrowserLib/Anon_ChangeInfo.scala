package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangeInfo extends js.Object {
  /** Fired when a new container is created. */
  val onCreated: WebExtEvent[js.Function1[/* changeInfo */ Anon_ContextualIdentity, scala.Unit]]
  /** Fired when a container is removed. */
  val onRemoved: WebExtEvent[js.Function1[/* changeInfo */ Anon_ContextualIdentity, scala.Unit]]
  /* contextualIdentities events */
  /** Fired when a container is updated. */
  val onUpdated: WebExtEvent[js.Function1[/* changeInfo */ Anon_ContextualIdentity, scala.Unit]]
  /**
    * Creates a contextual identity with the given data.
    * @param details Details about the contextual identity being created.
    */
  def create(details: Anon_Color): js.Promise[
    firefoxDashWebextDashBrowserLib.browserNs.contextualIdentitiesNs.ContextualIdentity
  ]
  /* contextualIdentities functions */
  /**
    * Retrieves information about a single contextual identity.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    */
  def get(cookieStoreId: java.lang.String): js.Promise[
    firefoxDashWebextDashBrowserLib.browserNs.contextualIdentitiesNs.ContextualIdentity
  ]
  /**
    * Retrieves all contextual identities
    * @param details Information to filter the contextual identities being retrieved.
    */
  def query(details: Anon_Name): js.Promise[
    js.Array[
      firefoxDashWebextDashBrowserLib.browserNs.contextualIdentitiesNs.ContextualIdentity
    ]
  ]
  /**
    * Deletes a contetual identity by its cookie Store ID.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    */
  def remove(cookieStoreId: java.lang.String): js.Promise[
    firefoxDashWebextDashBrowserLib.browserNs.contextualIdentitiesNs.ContextualIdentity
  ]
  /**
    * Updates a contextual identity with the given data.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    * @param details Details about the contextual identity being created.
    */
  def update(cookieStoreId: java.lang.String, details: Anon_ColorIcon): js.Promise[
    firefoxDashWebextDashBrowserLib.browserNs.contextualIdentitiesNs.ContextualIdentity
  ]
}

object Anon_ChangeInfo {
  @scala.inline
  def apply(
    create: js.Function1[
      Anon_Color, 
      js.Promise[
        firefoxDashWebextDashBrowserLib.browserNs.contextualIdentitiesNs.ContextualIdentity
      ]
    ],
    get: js.Function1[
      java.lang.String, 
      js.Promise[
        firefoxDashWebextDashBrowserLib.browserNs.contextualIdentitiesNs.ContextualIdentity
      ]
    ],
    onCreated: WebExtEvent[js.Function1[/* changeInfo */ Anon_ContextualIdentity, scala.Unit]],
    onRemoved: WebExtEvent[js.Function1[/* changeInfo */ Anon_ContextualIdentity, scala.Unit]],
    onUpdated: WebExtEvent[js.Function1[/* changeInfo */ Anon_ContextualIdentity, scala.Unit]],
    query: js.Function1[
      Anon_Name, 
      js.Promise[
        js.Array[
          firefoxDashWebextDashBrowserLib.browserNs.contextualIdentitiesNs.ContextualIdentity
        ]
      ]
    ],
    remove: js.Function1[
      java.lang.String, 
      js.Promise[
        firefoxDashWebextDashBrowserLib.browserNs.contextualIdentitiesNs.ContextualIdentity
      ]
    ],
    update: js.Function2[
      java.lang.String, 
      Anon_ColorIcon, 
      js.Promise[
        firefoxDashWebextDashBrowserLib.browserNs.contextualIdentitiesNs.ContextualIdentity
      ]
    ]
  ): Anon_ChangeInfo = {
    val __obj = js.Dynamic.literal(create = create, get = get, onCreated = onCreated, onRemoved = onRemoved, onUpdated = onUpdated, query = query, remove = remove, update = update)
  
    __obj.asInstanceOf[Anon_ChangeInfo]
  }
}

