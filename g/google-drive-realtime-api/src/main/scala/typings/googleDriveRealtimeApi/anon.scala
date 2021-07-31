package typings.googleDriveRealtimeApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FileIds extends StObject {
    
    // string containing one or more file ids separated by spaces.
    var fileIds: String
  }
  object FileIds {
    
    @scala.inline
    def apply(fileIds: String): FileIds = {
      val __obj = js.Dynamic.literal(fileIds = fileIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileIds]
    }
    
    @scala.inline
    implicit class FileIdsMutableBuilder[Self <: FileIds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileIds(value: String): Self = StObject.set(x, "fileIds", value.asInstanceOf[js.Any])
    }
  }
  
  trait SHIFTAFTERDELETE extends StObject {
    
    var SHIFT_AFTER_DELETE: String
    
    var SHIFT_BEFORE_DELETE: String
    
    var SHIFT_TO_INVALID: String
  }
  object SHIFTAFTERDELETE {
    
    @scala.inline
    def apply(SHIFT_AFTER_DELETE: String, SHIFT_BEFORE_DELETE: String, SHIFT_TO_INVALID: String): SHIFTAFTERDELETE = {
      val __obj = js.Dynamic.literal(SHIFT_AFTER_DELETE = SHIFT_AFTER_DELETE.asInstanceOf[js.Any], SHIFT_BEFORE_DELETE = SHIFT_BEFORE_DELETE.asInstanceOf[js.Any], SHIFT_TO_INVALID = SHIFT_TO_INVALID.asInstanceOf[js.Any])
      __obj.asInstanceOf[SHIFTAFTERDELETE]
    }
    
    @scala.inline
    implicit class SHIFTAFTERDELETEMutableBuilder[Self <: SHIFTAFTERDELETE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSHIFT_AFTER_DELETE(value: String): Self = StObject.set(x, "SHIFT_AFTER_DELETE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSHIFT_BEFORE_DELETE(value: String): Self = StObject.set(x, "SHIFT_BEFORE_DELETE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSHIFT_TO_INVALID(value: String): Self = StObject.set(x, "SHIFT_TO_INVALID", value.asInstanceOf[js.Any])
    }
  }
}
