package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VideoSettings extends js.Object {
  /** Settings for the companion creatives of video creatives served to this placement. */
  var companionSettings: js.UndefOr[CompanionSetting] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoSettings". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Settings for the skippability of video creatives served to this placement. If this object is provided, the creative-level skippable settings will be
               * overridden.
               */
  var skippableSettings: js.UndefOr[SkippableSetting] = js.undefined
  /**
               * Settings for the transcodes of video creatives served to this placement. If this object is provided, the creative-level transcode settings will be
               * overridden.
               */
  var transcodeSettings: js.UndefOr[TranscodeSetting] = js.undefined
}

