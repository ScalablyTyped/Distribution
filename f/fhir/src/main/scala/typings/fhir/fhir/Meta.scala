package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a resource
  */
@js.native
trait Meta extends Element {
  /**
    * Contains extended information for property 'lastUpdated'.
    */
  var _lastUpdated: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'versionId'.
    */
  var _versionId: js.UndefOr[Element] = js.native
  /**
    * When the resource version last changed
    */
  var lastUpdated: js.UndefOr[instant] = js.native
  /**
    * Profiles this resource claims to conform to
    */
  var profile: js.UndefOr[js.Array[uri]] = js.native
  /**
    * Security Labels applied to this resource
    */
  var security: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * Tags applied to this resource
    */
  var tag: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * Version specific identifier
    */
  var versionId: js.UndefOr[id] = js.native
}

object Meta {
  @scala.inline
  def apply(): Meta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Meta]
  }
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
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
    def set_lastUpdated(value: Element): Self = this.set("_lastUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_lastUpdated: Self = this.set("_lastUpdated", js.undefined)
    @scala.inline
    def set_profileVarargs(value: Element*): Self = this.set("_profile", js.Array(value :_*))
    @scala.inline
    def set_profile(value: js.Array[Element]): Self = this.set("_profile", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_profile: Self = this.set("_profile", js.undefined)
    @scala.inline
    def set_versionId(value: Element): Self = this.set("_versionId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_versionId: Self = this.set("_versionId", js.undefined)
    @scala.inline
    def setLastUpdated(value: instant): Self = this.set("lastUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdated: Self = this.set("lastUpdated", js.undefined)
    @scala.inline
    def setProfileVarargs(value: uri*): Self = this.set("profile", js.Array(value :_*))
    @scala.inline
    def setProfile(value: js.Array[uri]): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setSecurityVarargs(value: Coding*): Self = this.set("security", js.Array(value :_*))
    @scala.inline
    def setSecurity(value: js.Array[Coding]): Self = this.set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    @scala.inline
    def setTagVarargs(value: Coding*): Self = this.set("tag", js.Array(value :_*))
    @scala.inline
    def setTag(value: js.Array[Coding]): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setVersionId(value: id): Self = this.set("versionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
  }
  
}

