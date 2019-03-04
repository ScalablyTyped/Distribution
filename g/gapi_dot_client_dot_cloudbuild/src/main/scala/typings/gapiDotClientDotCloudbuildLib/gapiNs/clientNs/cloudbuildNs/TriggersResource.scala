package typings
package gapiDotClientDotCloudbuildLib.gapiNs.clientNs.cloudbuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggersResource extends js.Object {
  /**
    * Creates a new BuildTrigger.
    *
    * This API is experimental.
    */
  def create(request: gapiDotClientDotCloudbuildLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[BuildTrigger]
  /**
    * Deletes an BuildTrigger by its project ID and trigger ID.
    *
    * This API is experimental.
    */
  def delete(request: gapiDotClientDotCloudbuildLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Gets information about a BuildTrigger.
    *
    * This API is experimental.
    */
  def get(request: gapiDotClientDotCloudbuildLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[BuildTrigger]
  /**
    * Lists existing BuildTrigger.
    *
    * This API is experimental.
    */
  def list(request: gapiDotClientDotCloudbuildLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[ListBuildTriggersResponse]
  /**
    * Updates an BuildTrigger by its project ID and trigger ID.
    *
    * This API is experimental.
    */
  def patch(request: gapiDotClientDotCloudbuildLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[BuildTrigger]
}

object TriggersResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotCloudbuildLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[BuildTrigger]
    ],
    delete: js.Function1[
      gapiDotClientDotCloudbuildLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotCloudbuildLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[BuildTrigger]
    ],
    list: js.Function1[
      gapiDotClientDotCloudbuildLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListBuildTriggersResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotCloudbuildLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[BuildTrigger]
    ]
  ): TriggersResource = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, get = get, list = list, patch = patch)
  
    __obj.asInstanceOf[TriggersResource]
  }
}

