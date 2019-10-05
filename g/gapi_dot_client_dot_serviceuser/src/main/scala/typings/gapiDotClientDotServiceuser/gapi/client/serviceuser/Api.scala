package typings.gapiDotClientDotServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  /** The methods of this interface, in unspecified order. */
  var methods: js.UndefOr[js.Array[Method]] = js.undefined
  /** Included interfaces. See Mixin. */
  var mixins: js.UndefOr[js.Array[Mixin]] = js.undefined
  /**
    * The fully qualified name of this interface, including package name
    * followed by the interface's simple name.
    */
  var name: js.UndefOr[String] = js.undefined
  /** Any metadata attached to the interface. */
  var options: js.UndefOr[js.Array[Option]] = js.undefined
  /**
    * Source context for the protocol buffer service represented by this
    * message.
    */
  var sourceContext: js.UndefOr[SourceContext] = js.undefined
  /** The source syntax of the service. */
  var syntax: js.UndefOr[String] = js.undefined
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
  var version: js.UndefOr[String] = js.undefined
}

object Api {
  @scala.inline
  def apply(
    methods: js.Array[Method] = null,
    mixins: js.Array[Mixin] = null,
    name: String = null,
    options: js.Array[Option] = null,
    sourceContext: SourceContext = null,
    syntax: String = null,
    version: String = null
  ): Api = {
    val __obj = js.Dynamic.literal()
    if (methods != null) __obj.updateDynamic("methods")(methods)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext)
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Api]
  }
}

