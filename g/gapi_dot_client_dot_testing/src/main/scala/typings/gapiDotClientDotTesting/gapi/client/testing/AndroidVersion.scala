package typings.gapiDotClientDotTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidVersion extends js.Object {
  /**
    * The API level for this Android version.
    * Examples: 18, 19
    * @OutputOnly
    */
  var apiLevel: js.UndefOr[Double] = js.undefined
  /**
    * The code name for this Android version.
    * Examples: "JellyBean", "KitKat"
    * @OutputOnly
    */
  var codeName: js.UndefOr[String] = js.undefined
  /**
    * Market share for this version.
    * @OutputOnly
    */
  var distribution: js.UndefOr[Distribution] = js.undefined
  /**
    * An opaque id for this Android version.
    * Use this id to invoke the TestExecutionService.
    * @OutputOnly
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The date this Android version became available in the market.
    * @OutputOnly
    */
  var releaseDate: js.UndefOr[Date] = js.undefined
  /**
    * Tags for this dimension.
    * Examples: "default", "preview", "deprecated"
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A string representing this version of the Android OS.
    * Examples: "4.3", "4.4"
    * @OutputOnly
    */
  var versionString: js.UndefOr[String] = js.undefined
}

object AndroidVersion {
  @scala.inline
  def apply(
    apiLevel: Int | Double = null,
    codeName: String = null,
    distribution: Distribution = null,
    id: String = null,
    releaseDate: Date = null,
    tags: js.Array[String] = null,
    versionString: String = null
  ): AndroidVersion = {
    val __obj = js.Dynamic.literal()
    if (apiLevel != null) __obj.updateDynamic("apiLevel")(apiLevel.asInstanceOf[js.Any])
    if (codeName != null) __obj.updateDynamic("codeName")(codeName.asInstanceOf[js.Any])
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (releaseDate != null) __obj.updateDynamic("releaseDate")(releaseDate.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (versionString != null) __obj.updateDynamic("versionString")(versionString.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidVersion]
  }
}

