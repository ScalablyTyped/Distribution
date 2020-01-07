package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Android configuration that can be selected at the time a test is run.
  */
@js.native
trait Schema$AndroidRuntimeConfiguration extends js.Object {
  /**
    * The set of available locales.
    */
  var locales: js.UndefOr[js.Array[Schema$Locale]] = js.native
  /**
    * The set of available orientations.
    */
  var orientations: js.UndefOr[js.Array[Schema$Orientation]] = js.native
}

object Schema$AndroidRuntimeConfiguration {
  @scala.inline
  def apply(locales: js.Array[Schema$Locale] = null, orientations: js.Array[Schema$Orientation] = null): Schema$AndroidRuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (orientations != null) __obj.updateDynamic("orientations")(orientations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AndroidRuntimeConfiguration]
  }
}

