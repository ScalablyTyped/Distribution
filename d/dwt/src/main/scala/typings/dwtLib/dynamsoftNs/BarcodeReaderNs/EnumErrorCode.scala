package typings
package dwtLib.dynamsoftNs.BarcodeReaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumErrorCode extends js.Object

@JSGlobal("dynamsoft.BarcodeReader.EnumErrorCode")
@js.native
object EnumErrorCode extends js.Object {
  @js.native
  sealed trait DBR_1D_LICENSE_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_BARCODE_FORMAT_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_BPP_NOT_SUPPORTED
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_CUSTOM_MODULESIZE_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_CUSTOM_REGION_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_CUSTOM_SIZE_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_DATAMATRIX_LICENSE_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_DBRERR_AZTEC_LICENSE_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_DIB_BUFFER_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_DOMAIN_NOT_MATCHED
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_FILETYPE_NOT_SUPPORTED
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_FILE_NOT_FOUND
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_IMAGE_READ_FAILED
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_INDEX_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_JSON_KEY_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_JSON_NAME_KEY_MISSING
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_JSON_NAME_REFERENCE_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_JSON_NAME_VALUE_DUPLICATED
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_JSON_PARSE_FAILED
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_JSON_TYPE_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_JSON_VALUE_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_LICENSE_EXPIRED
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_LICENSE_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_MAX_BARCODE_NUMBER_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_NO_MEMORY
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_NULL_REFERENCE
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_PAGE_NUMBER_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_PARAMETER_VALUE_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_PDF417_LICENSE_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_PDF_DLL_MISSING
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_PDF_READ_FAILED
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_QR_LICENSE_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_RECOGNITION_TIMEOUT
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_RESERVEDINFO_NOT_MATCHED
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_SUCCESS
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_SYSTEM_EXCEPTION
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_TEMPLATE_NAME_INVALID
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_TIFF_READ_FAILED
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  @js.native
  sealed trait DBR_UNKNOWN
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode
  
  /* -10017 */ val DBR_1D_LICENSE_INVALID: DBR_1D_LICENSE_INVALID with scala.Double = js.native
  /* -10009 */ val DBR_BARCODE_FORMAT_INVALID: DBR_BARCODE_FORMAT_INVALID with scala.Double = js.native
  /* -10007 */ val DBR_BPP_NOT_SUPPORTED: DBR_BPP_NOT_SUPPORTED with scala.Double = js.native
  /* -10025 */ val DBR_CUSTOM_MODULESIZE_INVALID: DBR_CUSTOM_MODULESIZE_INVALID with scala.Double = js.native
  /* -10010 */ val DBR_CUSTOM_REGION_INVALID: DBR_CUSTOM_REGION_INVALID with scala.Double = js.native
  /* -10024 */ val DBR_CUSTOM_SIZE_INVALID: DBR_CUSTOM_SIZE_INVALID with scala.Double = js.native
  /* -10020 */ val DBR_DATAMATRIX_LICENSE_INVALID: DBR_DATAMATRIX_LICENSE_INVALID with scala.Double = js.native
  /* -10041 */ val DBR_DBRERR_AZTEC_LICENSE_INVALID: DBR_DBRERR_AZTEC_LICENSE_INVALID with scala.Double = js.native
  /* -10018 */ val DBR_DIB_BUFFER_INVALID: DBR_DIB_BUFFER_INVALID with scala.Double = js.native
  /* -10039 */ val DBR_DOMAIN_NOT_MATCHED: DBR_DOMAIN_NOT_MATCHED with scala.Double = js.native
  /* -10006 */ val DBR_FILETYPE_NOT_SUPPORTED: DBR_FILETYPE_NOT_SUPPORTED with scala.Double = js.native
  /* -10005 */ val DBR_FILE_NOT_FOUND: DBR_FILE_NOT_FOUND with scala.Double = js.native
  /* -10012 */ val DBR_IMAGE_READ_FAILED: DBR_IMAGE_READ_FAILED with scala.Double = js.native
  /* -10008 */ val DBR_INDEX_INVALID: DBR_INDEX_INVALID with scala.Double = js.native
  /* -10032 */ val DBR_JSON_KEY_INVALID: DBR_JSON_KEY_INVALID with scala.Double = js.native
  /* -10034 */ val DBR_JSON_NAME_KEY_MISSING: DBR_JSON_NAME_KEY_MISSING with scala.Double = js.native
  /* -10037 */ val DBR_JSON_NAME_REFERENCE_INVALID: DBR_JSON_NAME_REFERENCE_INVALID with scala.Double = js.native
  /* -10035 */ val DBR_JSON_NAME_VALUE_DUPLICATED: DBR_JSON_NAME_VALUE_DUPLICATED with scala.Double = js.native
  /* -10030 */ val DBR_JSON_PARSE_FAILED: DBR_JSON_PARSE_FAILED with scala.Double = js.native
  /* -10031 */ val DBR_JSON_TYPE_INVALID: DBR_JSON_TYPE_INVALID with scala.Double = js.native
  /* -10033 */ val DBR_JSON_VALUE_INVALID: DBR_JSON_VALUE_INVALID with scala.Double = js.native
  /* -10004 */ val DBR_LICENSE_EXPIRED: DBR_LICENSE_EXPIRED with scala.Double = js.native
  /* -10003 */ val DBR_LICENSE_INVALID: DBR_LICENSE_INVALID with scala.Double = js.native
  /* -10011 */ val DBR_MAX_BARCODE_NUMBER_INVALID: DBR_MAX_BARCODE_NUMBER_INVALID with scala.Double = js.native
  /* -10001 */ val DBR_NO_MEMORY: DBR_NO_MEMORY with scala.Double = js.native
  /* -10002 */ val DBR_NULL_REFERENCE: DBR_NULL_REFERENCE with scala.Double = js.native
  /* -10023 */ val DBR_PAGE_NUMBER_INVALID: DBR_PAGE_NUMBER_INVALID with scala.Double = js.native
  /* 10038 */ val DBR_PARAMETER_VALUE_INVALID: DBR_PARAMETER_VALUE_INVALID with scala.Double = js.native
  /* 10019 */ val DBR_PDF417_LICENSE_INVALID: DBR_PDF417_LICENSE_INVALID with scala.Double = js.native
  /* -10022 */ val DBR_PDF_DLL_MISSING: DBR_PDF_DLL_MISSING with scala.Double = js.native
  /* -10021 */ val DBR_PDF_READ_FAILED: DBR_PDF_READ_FAILED with scala.Double = js.native
  /* -10016 */ val DBR_QR_LICENSE_INVALID: DBR_QR_LICENSE_INVALID with scala.Double = js.native
  /* -10026 */ val DBR_RECOGNITION_TIMEOUT: DBR_RECOGNITION_TIMEOUT with scala.Double = js.native
  /* -10040 */ val DBR_RESERVEDINFO_NOT_MATCHED: DBR_RESERVEDINFO_NOT_MATCHED with scala.Double = js.native
  /* 0 */ val DBR_SUCCESS: DBR_SUCCESS with scala.Double = js.native
  /* 1 */ val DBR_SYSTEM_EXCEPTION: DBR_SYSTEM_EXCEPTION with scala.Double = js.native
  /* -10036 */ val DBR_TEMPLATE_NAME_INVALID: DBR_TEMPLATE_NAME_INVALID with scala.Double = js.native
  /* -10013 */ val DBR_TIFF_READ_FAILED: DBR_TIFF_READ_FAILED with scala.Double = js.native
  /* -10000 */ val DBR_UNKNOWN: DBR_UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.dynamsoftNs.BarcodeReaderNs.EnumErrorCode with scala.Double] = js.native
}

