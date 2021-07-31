package typings.fastifyMultipart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FieldNameSize extends StObject {
    
    /**
      * Max field name size in bytes
      */
    var fieldNameSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Max field value size in bytes
      */
    var fieldSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Max number of non-file fields
      */
    var fields: js.UndefOr[Double] = js.undefined
    
    /**
      * For multipart forms, the max file size
      */
    var fileSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Max number of file fields
      */
    var files: js.UndefOr[Double] = js.undefined
    
    /**
      * Max number of header key=>value pairs
      */
    var headerPairs: js.UndefOr[Double] = js.undefined
  }
  object FieldNameSize {
    
    @scala.inline
    def apply(): FieldNameSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldNameSize]
    }
    
    @scala.inline
    implicit class FieldNameSizeMutableBuilder[Self <: FieldNameSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldNameSize(value: Double): Self = StObject.set(x, "fieldNameSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameSizeUndefined: Self = StObject.set(x, "fieldNameSize", js.undefined)
      
      @scala.inline
      def setFieldSize(value: Double): Self = StObject.set(x, "fieldSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldSizeUndefined: Self = StObject.set(x, "fieldSize", js.undefined)
      
      @scala.inline
      def setFields(value: Double): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      @scala.inline
      def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setHeaderPairs(value: Double): Self = StObject.set(x, "headerPairs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPairsUndefined: Self = StObject.set(x, "headerPairs", js.undefined)
    }
  }
}
