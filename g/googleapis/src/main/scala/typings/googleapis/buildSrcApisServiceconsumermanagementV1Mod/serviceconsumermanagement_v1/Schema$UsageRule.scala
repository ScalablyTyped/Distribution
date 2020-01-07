package typings.googleapis.buildSrcApisServiceconsumermanagementV1Mod.serviceconsumermanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Usage configuration rules for the service.  NOTE: Under development.   Use
  * this rule to configure unregistered calls for the service. Unregistered
  * calls are calls that do not contain consumer project identity. (Example:
  * calls that do not contain an API key). By default, API methods do not allow
  * unregistered calls, and each method call must be identified by a consumer
  * project identity. Use this rule to allow/disallow unregistered calls.
  * Example of an API that wants to allow unregistered calls for entire
  * service.      usage:       rules:       - selector: &quot;*&quot;
  * allow_unregistered_calls: true  Example of a method that wants to allow
  * unregistered calls.      usage:       rules:       - selector:
  * &quot;google.example.library.v1.LibraryService.CreateBook&quot;
  * allow_unregistered_calls: true
  */
@js.native
trait Schema$UsageRule extends js.Object {
  /**
    * If true, the selected method allows unregistered calls, e.g. calls that
    * don&#39;t identify any user or application.
    */
  var allowUnregisteredCalls: js.UndefOr[Boolean] = js.native
  /**
    * Selects the methods to which this rule applies. Use &#39;*&#39; to
    * indicate all methods in all APIs.  Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.native
  /**
    * If true, the selected method should skip service control and the control
    * plane features, such as quota and billing, will not be available. This
    * flag is used by Google Cloud Endpoints to bypass checks for internal
    * methods, such as service health check methods.
    */
  var skipServiceControl: js.UndefOr[Boolean] = js.native
}

object Schema$UsageRule {
  @scala.inline
  def apply(
    allowUnregisteredCalls: js.UndefOr[Boolean] = js.undefined,
    selector: String = null,
    skipServiceControl: js.UndefOr[Boolean] = js.undefined
  ): Schema$UsageRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnregisteredCalls)) __obj.updateDynamic("allowUnregisteredCalls")(allowUnregisteredCalls.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(skipServiceControl)) __obj.updateDynamic("skipServiceControl")(skipServiceControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UsageRule]
  }
}

