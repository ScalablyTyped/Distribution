package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Shared request options for all RPC methods.
  */
@js.native
trait Schema$RequestOptions extends js.Object {
  /**
    * Debug options of the request
    */
  var debugOptions: js.UndefOr[Schema$DebugOptions] = js.native
  /**
    * The BCP-47 language code, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. For
    * translations.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Id of the application created using SearchApplicationsService.
    */
  var searchApplicationId: js.UndefOr[String] = js.native
  /**
    * Current user&#39;s time zone id, such as &quot;America/Los_Angeles&quot;
    * or &quot;Australia/Sydney&quot;. These IDs are defined by [Unicode Common
    * Locale Data Repository (CLDR)](http://cldr.unicode.org/) project, and
    * currently available in the file
    * [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml)
    */
  var timeZone: js.UndefOr[String] = js.native
}

object Schema$RequestOptions {
  @scala.inline
  def apply(
    debugOptions: Schema$DebugOptions = null,
    languageCode: String = null,
    searchApplicationId: String = null,
    timeZone: String = null
  ): Schema$RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (debugOptions != null) __obj.updateDynamic("debugOptions")(debugOptions.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (searchApplicationId != null) __obj.updateDynamic("searchApplicationId")(searchApplicationId.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RequestOptions]
  }
}

