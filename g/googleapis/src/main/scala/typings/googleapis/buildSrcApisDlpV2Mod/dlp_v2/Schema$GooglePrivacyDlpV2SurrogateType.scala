package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for detecting output from deidentification transformations such as
  * [`CryptoReplaceFfxFpeConfig`](/dlp/docs/reference/rest/v2/organizations.deidentifyTemplates#cryptoreplaceffxfpeconfig).
  * These types of transformations are those that perform pseudonymization,
  * thereby producing a &quot;surrogate&quot; as output. This should be used in
  * conjunction with a field on the transformation such as
  * `surrogate_info_type`. This CustomInfoType does not support the use of
  * `detection_rules`.
  */
@js.native
trait Schema$GooglePrivacyDlpV2SurrogateType extends js.Object

