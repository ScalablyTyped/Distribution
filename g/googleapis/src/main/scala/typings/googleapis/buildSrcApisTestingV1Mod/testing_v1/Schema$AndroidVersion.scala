package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A version of the Android OS.
  */
@js.native
trait Schema$AndroidVersion extends js.Object {
  /**
    * The API level for this Android version. Examples: 18, 19.
    */
  var apiLevel: js.UndefOr[Double] = js.native
  /**
    * The code name for this Android version. Examples: &quot;JellyBean&quot;,
    * &quot;KitKat&quot;.
    */
  var codeName: js.UndefOr[String] = js.native
  /**
    * Market share for this version.
    */
  var distribution: js.UndefOr[Schema$Distribution] = js.native
  /**
    * An opaque id for this Android version. Use this id to invoke the
    * TestExecutionService.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The date this Android version became available in the market.
    */
  var releaseDate: js.UndefOr[Schema$Date] = js.native
  /**
    * Tags for this dimension. Examples: &quot;default&quot;,
    * &quot;preview&quot;, &quot;deprecated&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /**
    * A string representing this version of the Android OS. Examples:
    * &quot;4.3&quot;, &quot;4.4&quot;.
    */
  var versionString: js.UndefOr[String] = js.native
}

object Schema$AndroidVersion {
  @scala.inline
  def apply(
    apiLevel: Int | Double = null,
    codeName: String = null,
    distribution: Schema$Distribution = null,
    id: String = null,
    releaseDate: Schema$Date = null,
    tags: js.Array[String] = null,
    versionString: String = null
  ): Schema$AndroidVersion = {
    val __obj = js.Dynamic.literal()
    if (apiLevel != null) __obj.updateDynamic("apiLevel")(apiLevel.asInstanceOf[js.Any])
    if (codeName != null) __obj.updateDynamic("codeName")(codeName.asInstanceOf[js.Any])
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (releaseDate != null) __obj.updateDynamic("releaseDate")(releaseDate.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (versionString != null) __obj.updateDynamic("versionString")(versionString.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AndroidVersion]
  }
}

