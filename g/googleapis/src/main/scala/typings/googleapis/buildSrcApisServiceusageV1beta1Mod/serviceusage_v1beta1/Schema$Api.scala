package typings.googleapis.buildSrcApisServiceusageV1beta1Mod.serviceusage_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Api is a light-weight descriptor for an API Interface.  Interfaces are also
  * described as &quot;protocol buffer services&quot; in some contexts, such as
  * by the &quot;service&quot; keyword in a .proto file, but they are different
  * from API Services, which represent a concrete implementation of an
  * interface as opposed to simply a description of methods and bindings. They
  * are also sometimes simply referred to as &quot;APIs&quot; in other
  * contexts, such as the name of this message itself. See
  * https://cloud.google.com/apis/design/glossary for detailed terminology.
  */
@js.native
trait Schema$Api extends js.Object {
  /**
    * The methods of this interface, in unspecified order.
    */
  var methods: js.UndefOr[js.Array[Schema$Method]] = js.native
  /**
    * Included interfaces. See Mixin.
    */
  var mixins: js.UndefOr[js.Array[Schema$Mixin]] = js.native
  /**
    * The fully qualified name of this interface, including package name
    * followed by the interface&#39;s simple name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Any metadata attached to the interface.
    */
  var options: js.UndefOr[js.Array[Schema$Option]] = js.native
  /**
    * Source context for the protocol buffer service represented by this
    * message.
    */
  var sourceContext: js.UndefOr[Schema$SourceContext] = js.native
  /**
    * The source syntax of the service.
    */
  var syntax: js.UndefOr[String] = js.native
  /**
    * A version string for this interface. If specified, must have the form
    * `major-version.minor-version`, as in `1.10`. If the minor version is
    * omitted, it defaults to zero. If the entire version field is empty, the
    * major version is derived from the package name, as outlined below. If the
    * field is not empty, the version in the package name will be verified to
    * be consistent with what is provided here.  The versioning schema uses
    * [semantic versioning](http://semver.org) where the major version number
    * indicates a breaking change and the minor version an additive,
    * non-breaking change. Both version numbers are signals to users what to
    * expect from different versions, and should be carefully chosen based on
    * the product plan.  The major version is also reflected in the package
    * name of the interface, which must end in `v&lt;major-version&gt;`, as in
    * `google.feature.v1`. For major versions 0 and 1, the suffix can be
    * omitted. Zero major versions must only be used for experimental, non-GA
    * interfaces.
    */
  var version: js.UndefOr[String] = js.native
}

object Schema$Api {
  @scala.inline
  def apply(
    methods: js.Array[Schema$Method] = null,
    mixins: js.Array[Schema$Mixin] = null,
    name: String = null,
    options: js.Array[Schema$Option] = null,
    sourceContext: Schema$SourceContext = null,
    syntax: String = null,
    version: String = null
  ): Schema$Api = {
    val __obj = js.Dynamic.literal()
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Api]
  }
}

