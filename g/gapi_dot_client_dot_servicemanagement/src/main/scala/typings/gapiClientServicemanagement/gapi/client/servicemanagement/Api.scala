package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Api extends js.Object {
  /** The methods of this interface, in unspecified order. */
  var methods: js.UndefOr[js.Array[Method]] = js.native
  /** Included interfaces. See Mixin. */
  var mixins: js.UndefOr[js.Array[Mixin]] = js.native
  /**
    * The fully qualified name of this interface, including package name
    * followed by the interface's simple name.
    */
  var name: js.UndefOr[String] = js.native
  /** Any metadata attached to the interface. */
  var options: js.UndefOr[js.Array[Option]] = js.native
  /**
    * Source context for the protocol buffer service represented by this
    * message.
    */
  var sourceContext: js.UndefOr[SourceContext] = js.native
  /** The source syntax of the service. */
  var syntax: js.UndefOr[String] = js.native
  /**
    * A version string for this interface. If specified, must have the form
    * `major-version.minor-version`, as in `1.10`. If the minor version is
    * omitted, it defaults to zero. If the entire version field is empty, the
    * major version is derived from the package name, as outlined below. If the
    * field is not empty, the version in the package name will be verified to be
    * consistent with what is provided here.
    *
    * The versioning schema uses [semantic
    * versioning](http://semver.org) where the major version number
    * indicates a breaking change and the minor version an additive,
    * non-breaking change. Both version numbers are signals to users
    * what to expect from different versions, and should be carefully
    * chosen based on the product plan.
    *
    * The major version is also reflected in the package name of the
    * interface, which must end in `v<major-version>`, as in
    * `google.feature.v1`. For major versions 0 and 1, the suffix can
    * be omitted. Zero major versions must only be used for
    * experimental, non-GA interfaces.
    */
  var version: js.UndefOr[String] = js.native
}

object Api {
  @scala.inline
  def apply(): Api = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Api]
  }
  @scala.inline
  implicit class ApiOps[Self <: Api] (val x: Self) extends AnyVal {
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
    def setMethodsVarargs(value: Method*): Self = this.set("methods", js.Array(value :_*))
    @scala.inline
    def setMethods(value: js.Array[Method]): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    @scala.inline
    def setMixinsVarargs(value: Mixin*): Self = this.set("mixins", js.Array(value :_*))
    @scala.inline
    def setMixins(value: js.Array[Mixin]): Self = this.set("mixins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMixins: Self = this.set("mixins", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: Option*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[Option]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setSourceContext(value: SourceContext): Self = this.set("sourceContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceContext: Self = this.set("sourceContext", js.undefined)
    @scala.inline
    def setSyntax(value: String): Self = this.set("syntax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyntax: Self = this.set("syntax", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

