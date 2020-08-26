package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message destination application(s)
  */
@js.native
trait MessageHeaderDestination extends BackboneElement {
  /**
    * Contains extended information for property 'endpoint'.
    */
  var _endpoint: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Actual destination address or id
    */
  var endpoint: uri = js.native
  /**
    * Name of system
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Particular delivery destination within the destination
    */
  var target: js.UndefOr[Reference] = js.native
}

object MessageHeaderDestination {
  @scala.inline
  def apply(endpoint: uri): MessageHeaderDestination = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderDestination]
  }
  @scala.inline
  implicit class MessageHeaderDestinationOps[Self <: MessageHeaderDestination] (val x: Self) extends AnyVal {
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
    def setEndpoint(value: uri): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def set_endpoint(value: Element): Self = this.set("_endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_endpoint: Self = this.set("_endpoint", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTarget(value: Reference): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

