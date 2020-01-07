package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A transformation to apply to text that is identified as a specific
  * info_type.
  */
@js.native
trait Schema$InfoTypeTransformation extends js.Object {
  /**
    * Config for character mask.
    */
  var characterMaskConfig: js.UndefOr[Schema$CharacterMaskConfig] = js.native
  /**
    * Config for crypto hash.
    */
  var cryptoHashConfig: js.UndefOr[Schema$CryptoHashConfig] = js.native
  /**
    * Config for date shift.
    */
  var dateShiftConfig: js.UndefOr[Schema$DateShiftConfig] = js.native
  /**
    * InfoTypes to apply this transformation to. If this is not specified, the
    * transformation applies to any info_type.
    */
  var infoTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Config for text redaction.
    */
  var redactConfig: js.UndefOr[Schema$RedactConfig] = js.native
  /**
    * Config for replace with InfoType.
    */
  var replaceWithInfoTypeConfig: js.UndefOr[Schema$ReplaceWithInfoTypeConfig] = js.native
}

object Schema$InfoTypeTransformation {
  @scala.inline
  def apply(
    characterMaskConfig: Schema$CharacterMaskConfig = null,
    cryptoHashConfig: Schema$CryptoHashConfig = null,
    dateShiftConfig: Schema$DateShiftConfig = null,
    infoTypes: js.Array[String] = null,
    redactConfig: Schema$RedactConfig = null,
    replaceWithInfoTypeConfig: Schema$ReplaceWithInfoTypeConfig = null
  ): Schema$InfoTypeTransformation = {
    val __obj = js.Dynamic.literal()
    if (characterMaskConfig != null) __obj.updateDynamic("characterMaskConfig")(characterMaskConfig.asInstanceOf[js.Any])
    if (cryptoHashConfig != null) __obj.updateDynamic("cryptoHashConfig")(cryptoHashConfig.asInstanceOf[js.Any])
    if (dateShiftConfig != null) __obj.updateDynamic("dateShiftConfig")(dateShiftConfig.asInstanceOf[js.Any])
    if (infoTypes != null) __obj.updateDynamic("infoTypes")(infoTypes.asInstanceOf[js.Any])
    if (redactConfig != null) __obj.updateDynamic("redactConfig")(redactConfig.asInstanceOf[js.Any])
    if (replaceWithInfoTypeConfig != null) __obj.updateDynamic("replaceWithInfoTypeConfig")(replaceWithInfoTypeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InfoTypeTransformation]
  }
}

