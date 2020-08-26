package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlMap extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  /** The URL of the BackendService resource if none of the hostRules match. */
  var defaultService: js.UndefOr[String] = js.native
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  /**
    * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when
    * inserting a UrlMap. An up-to-date fingerprint must be provided in order to update the UrlMap.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /** The list of HostRules to use against the URL. */
  var hostRules: js.UndefOr[js.Array[HostRule]] = js.native
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  /** [Output Only] Type of the resource. Always compute#urlMaps for url maps. */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  /** The list of named PathMatchers to use against the URL. */
  var pathMatchers: js.UndefOr[js.Array[PathMatcher]] = js.native
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** The list of expected URL mappings. Request to update this UrlMap will succeed only if all of the test cases pass. */
  var tests: js.UndefOr[js.Array[UrlMapTest]] = js.native
}

object UrlMap {
  @scala.inline
  def apply(): UrlMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMap]
  }
  @scala.inline
  implicit class UrlMapOps[Self <: UrlMap] (val x: Self) extends AnyVal {
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
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setDefaultService(value: String): Self = this.set("defaultService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultService: Self = this.set("defaultService", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    @scala.inline
    def setHostRulesVarargs(value: HostRule*): Self = this.set("hostRules", js.Array(value :_*))
    @scala.inline
    def setHostRules(value: js.Array[HostRule]): Self = this.set("hostRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostRules: Self = this.set("hostRules", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPathMatchersVarargs(value: PathMatcher*): Self = this.set("pathMatchers", js.Array(value :_*))
    @scala.inline
    def setPathMatchers(value: js.Array[PathMatcher]): Self = this.set("pathMatchers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathMatchers: Self = this.set("pathMatchers", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setTestsVarargs(value: UrlMapTest*): Self = this.set("tests", js.Array(value :_*))
    @scala.inline
    def setTests(value: js.Array[UrlMapTest]): Self = this.set("tests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTests: Self = this.set("tests", js.undefined)
  }
  
}

