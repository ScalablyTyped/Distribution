package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInfoForObservedBeaconsRequest extends js.Object {
  /**
    * Specifies what kind of attachments to include in the response.
    * When given, the response will include only attachments of the given types.
    * When empty, no attachments will be returned. Must be in the format
    * <var>namespace/type</var>. Accepts `&#42;` to specify all types in
    * all namespaces owned by the client.
    * Optional.
    */
  var namespacedTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The beacons that the client has encountered.
    * At least one must be given.
    */
  var observations: js.UndefOr[js.Array[Observation]] = js.native
}

object GetInfoForObservedBeaconsRequest {
  @scala.inline
  def apply(): GetInfoForObservedBeaconsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInfoForObservedBeaconsRequest]
  }
  @scala.inline
  implicit class GetInfoForObservedBeaconsRequestOps[Self <: GetInfoForObservedBeaconsRequest] (val x: Self) extends AnyVal {
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
    def setNamespacedTypesVarargs(value: String*): Self = this.set("namespacedTypes", js.Array(value :_*))
    @scala.inline
    def setNamespacedTypes(value: js.Array[String]): Self = this.set("namespacedTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespacedTypes: Self = this.set("namespacedTypes", js.undefined)
    @scala.inline
    def setObservationsVarargs(value: Observation*): Self = this.set("observations", js.Array(value :_*))
    @scala.inline
    def setObservations(value: js.Array[Observation]): Self = this.set("observations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObservations: Self = this.set("observations", js.undefined)
  }
  
}

