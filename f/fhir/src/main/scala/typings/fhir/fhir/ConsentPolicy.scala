package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Policies covered by this consent
  */
@js.native
trait ConsentPolicy extends BackboneElement {
  /**
    * Contains extended information for property 'authority'.
    */
  var _authority: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'uri'.
    */
  var _uri: js.UndefOr[Element] = js.native
  /**
    * Enforcement source for policy
    */
  var authority: js.UndefOr[uri] = js.native
  /**
    * Specific policy covered by this consent
    */
  var uri: js.UndefOr[typings.fhir.fhir.uri] = js.native
}

object ConsentPolicy {
  @scala.inline
  def apply(): ConsentPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsentPolicy]
  }
  @scala.inline
  implicit class ConsentPolicyOps[Self <: ConsentPolicy] (val x: Self) extends AnyVal {
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
    def set_authority(value: Element): Self = this.set("_authority", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_authority: Self = this.set("_authority", js.undefined)
    @scala.inline
    def set_uri(value: Element): Self = this.set("_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_uri: Self = this.set("_uri", js.undefined)
    @scala.inline
    def setAuthority(value: uri): Self = this.set("authority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthority: Self = this.set("authority", js.undefined)
    @scala.inline
    def setUri(value: uri): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

