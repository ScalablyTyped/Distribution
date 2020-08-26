package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Another Implementation guide this depends on
  */
@js.native
trait ImplementationGuideDependency extends BackboneElement {
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'uri'.
    */
  var _uri: js.UndefOr[Element] = js.native
  /**
    * reference | inclusion
    */
  var `type`: code = js.native
  /**
    * Where to find dependency
    */
  var uri: typings.fhir.fhir.uri = js.native
}

object ImplementationGuideDependency {
  @scala.inline
  def apply(`type`: code, uri: uri): ImplementationGuideDependency = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuideDependency]
  }
  @scala.inline
  implicit class ImplementationGuideDependencyOps[Self <: ImplementationGuideDependency] (val x: Self) extends AnyVal {
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
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: uri): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def set_uri(value: Element): Self = this.set("_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_uri: Self = this.set("_uri", js.undefined)
  }
  
}

