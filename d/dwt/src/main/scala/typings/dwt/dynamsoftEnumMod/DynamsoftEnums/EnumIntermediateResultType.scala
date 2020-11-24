package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumIntermediateResultType extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumIntermediateResultType")
@js.native
object EnumIntermediateResultType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumIntermediateResultType with Double] = js.native
  
  @js.native
  sealed trait IRT_BINARIZED_IMAGE extends EnumIntermediateResultType
  /* 64 */ @js.native
  object IRT_BINARIZED_IMAGE extends TopLevel[IRT_BINARIZED_IMAGE with Double]
  
  @js.native
  sealed trait IRT_COLOUR_CLUSTERED_IMAGE extends EnumIntermediateResultType
  /* 2 */ @js.native
  object IRT_COLOUR_CLUSTERED_IMAGE extends TopLevel[IRT_COLOUR_CLUSTERED_IMAGE with Double]
  
  @js.native
  sealed trait IRT_COLOUR_CONVERTED_GRAYSCALE_IMAGE extends EnumIntermediateResultType
  /* 4 */ @js.native
  object IRT_COLOUR_CONVERTED_GRAYSCALE_IMAGE extends TopLevel[IRT_COLOUR_CONVERTED_GRAYSCALE_IMAGE with Double]
  
  @js.native
  sealed trait IRT_CONTOUR extends EnumIntermediateResultType
  /* 256 */ @js.native
  object IRT_CONTOUR extends TopLevel[IRT_CONTOUR with Double]
  
  @js.native
  sealed trait IRT_FORM extends EnumIntermediateResultType
  /* 1024 */ @js.native
  object IRT_FORM extends TopLevel[IRT_FORM with Double]
  
  @js.native
  sealed trait IRT_LINE_SEGMENT extends EnumIntermediateResultType
  /* 512 */ @js.native
  object IRT_LINE_SEGMENT extends TopLevel[IRT_LINE_SEGMENT with Double]
  
  @js.native
  sealed trait IRT_NO_RESULT extends EnumIntermediateResultType
  /* 0 */ @js.native
  object IRT_NO_RESULT extends TopLevel[IRT_NO_RESULT with Double]
  
  @js.native
  sealed trait IRT_ORIGINAL_IMAGE extends EnumIntermediateResultType
  /* 1 */ @js.native
  object IRT_ORIGINAL_IMAGE extends TopLevel[IRT_ORIGINAL_IMAGE with Double]
  
  @js.native
  sealed trait IRT_PREDETECTED_QUADRILATERAL extends EnumIntermediateResultType
  /* 8192 */ @js.native
  object IRT_PREDETECTED_QUADRILATERAL extends TopLevel[IRT_PREDETECTED_QUADRILATERAL with Double]
  
  @js.native
  sealed trait IRT_PREDETECTED_REGION extends EnumIntermediateResultType
  /* 16 */ @js.native
  object IRT_PREDETECTED_REGION extends TopLevel[IRT_PREDETECTED_REGION with Double]
  
  @js.native
  sealed trait IRT_PREPROCESSED_IMAGE extends EnumIntermediateResultType
  /* 32 */ @js.native
  object IRT_PREPROCESSED_IMAGE extends TopLevel[IRT_PREPROCESSED_IMAGE with Double]
  
  @js.native
  sealed trait IRT_SEGMENTATION_BLOCK extends EnumIntermediateResultType
  /* 2048 */ @js.native
  object IRT_SEGMENTATION_BLOCK extends TopLevel[IRT_SEGMENTATION_BLOCK with Double]
  
  @js.native
  sealed trait IRT_TEXT_ZONE extends EnumIntermediateResultType
  /* 128 */ @js.native
  object IRT_TEXT_ZONE extends TopLevel[IRT_TEXT_ZONE with Double]
  
  @js.native
  sealed trait IRT_TRANSFORMED_GRAYSCALE_IMAGE extends EnumIntermediateResultType
  /* 8 */ @js.native
  object IRT_TRANSFORMED_GRAYSCALE_IMAGE extends TopLevel[IRT_TRANSFORMED_GRAYSCALE_IMAGE with Double]
  
  @js.native
  sealed trait IRT_TYPED_BARCODE_ZONE extends EnumIntermediateResultType
  /* 4096 */ @js.native
  object IRT_TYPED_BARCODE_ZONE extends TopLevel[IRT_TYPED_BARCODE_ZONE with Double]
}
