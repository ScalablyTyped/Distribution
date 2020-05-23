package typings.dwt.dynamsoft.BarcodeReader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumErrorCode extends js.Object

@JSGlobal("dynamsoft.BarcodeReader.EnumErrorCode")
@js.native
object EnumErrorCode extends js.Object {
  @js.native
  sealed trait DBR_1D_LICENSE_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_BARCODE_FORMAT_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_BPP_NOT_SUPPORTED extends EnumErrorCode
  
  @js.native
  sealed trait DBR_CUSTOM_MODULESIZE_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_CUSTOM_REGION_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_CUSTOM_SIZE_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_DATAMATRIX_LICENSE_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_DBRERR_AZTEC_LICENSE_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_DIB_BUFFER_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_DOMAIN_NOT_MATCHED extends EnumErrorCode
  
  @js.native
  sealed trait DBR_FILETYPE_NOT_SUPPORTED extends EnumErrorCode
  
  @js.native
  sealed trait DBR_FILE_NOT_FOUND extends EnumErrorCode
  
  @js.native
  sealed trait DBR_IMAGE_READ_FAILED extends EnumErrorCode
  
  @js.native
  sealed trait DBR_INDEX_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_JSON_KEY_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_JSON_NAME_KEY_MISSING extends EnumErrorCode
  
  @js.native
  sealed trait DBR_JSON_NAME_REFERENCE_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_JSON_NAME_VALUE_DUPLICATED extends EnumErrorCode
  
  @js.native
  sealed trait DBR_JSON_PARSE_FAILED extends EnumErrorCode
  
  @js.native
  sealed trait DBR_JSON_TYPE_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_JSON_VALUE_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_LICENSE_EXPIRED extends EnumErrorCode
  
  @js.native
  sealed trait DBR_LICENSE_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_MAX_BARCODE_NUMBER_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_NO_MEMORY extends EnumErrorCode
  
  @js.native
  sealed trait DBR_NULL_REFERENCE extends EnumErrorCode
  
  @js.native
  sealed trait DBR_PAGE_NUMBER_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_PARAMETER_VALUE_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_PDF417_LICENSE_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_PDF_DLL_MISSING extends EnumErrorCode
  
  @js.native
  sealed trait DBR_PDF_READ_FAILED extends EnumErrorCode
  
  @js.native
  sealed trait DBR_QR_LICENSE_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_RECOGNITION_TIMEOUT extends EnumErrorCode
  
  @js.native
  sealed trait DBR_RESERVEDINFO_NOT_MATCHED extends EnumErrorCode
  
  @js.native
  sealed trait DBR_SUCCESS extends EnumErrorCode
  
  @js.native
  sealed trait DBR_SYSTEM_EXCEPTION extends EnumErrorCode
  
  @js.native
  sealed trait DBR_TEMPLATE_NAME_INVALID extends EnumErrorCode
  
  @js.native
  sealed trait DBR_TIFF_READ_FAILED extends EnumErrorCode
  
  @js.native
  sealed trait DBR_UNKNOWN extends EnumErrorCode
  
}

