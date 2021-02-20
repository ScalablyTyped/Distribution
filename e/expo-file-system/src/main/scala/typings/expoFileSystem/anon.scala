package typings.expoFileSystem

import typings.expoFileSystem.expoFileSystemBooleans.`false`
import typings.expoFileSystem.expoFileSystemBooleans.`true`
import typings.expoFileSystem.fileSystemTypesMod.FileInfo
import typings.expoFileSystem.fileSystemTypesMod.FileSystemAcceptedUploadHttpMethod
import typings.expoFileSystem.fileSystemTypesMod.FileSystemSessionType
import typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadType.BINARY_CONTENT
import typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadType.MULTIPART
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Exists extends FileInfo {
    
    var exists: `true` = js.native
    
    var isDirectory: Boolean = js.native
    
    var md5: js.UndefOr[String] = js.native
    
    var modificationTime: Double = js.native
    
    var size: Double = js.native
    
    var uri: String = js.native
  }
  object Exists {
    
    @scala.inline
    def apply(exists: `true`, isDirectory: Boolean, modificationTime: Double, size: Double, uri: String): Exists = {
      val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exists]
    }
    
    @scala.inline
    implicit class ExistsMutableBuilder[Self <: Exists] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExists(value: `true`): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
      
      @scala.inline
      def setModificationTime(value: Double): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FieldName extends StObject {
    
    var fieldName: js.UndefOr[String] = js.native
    
    var mimeType: js.UndefOr[String] = js.native
    
    var parameters: js.UndefOr[Record[String, String]] = js.native
    
    var uploadType: MULTIPART = js.native
  }
  object FieldName {
    
    @scala.inline
    def apply(uploadType: MULTIPART): FieldName = {
      val __obj = js.Dynamic.literal(uploadType = uploadType.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldName]
    }
    
    @scala.inline
    implicit class FieldNameMutableBuilder[Self <: FieldName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      @scala.inline
      def setParameters(value: Record[String, String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setUploadType(value: MULTIPART): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait From extends StObject {
    
    var from: String = js.native
    
    var to: String = js.native
  }
  object From {
    
    @scala.inline
    def apply(from: String, to: String): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit class FromMutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Headers extends StObject {
    
    var headers: js.UndefOr[Record[String, String]] = js.native
    
    var httpMethod: js.UndefOr[FileSystemAcceptedUploadHttpMethod] = js.native
    
    var sessionType: js.UndefOr[FileSystemSessionType] = js.native
  }
  object Headers {
    
    @scala.inline
    def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHttpMethod(value: FileSystemAcceptedUploadHttpMethod): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
      
      @scala.inline
      def setSessionType(value: FileSystemSessionType): Self = StObject.set(x, "sessionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTypeUndefined: Self = StObject.set(x, "sessionType", js.undefined)
    }
  }
  
  @js.native
  trait Idempotent extends StObject {
    
    var idempotent: js.UndefOr[Boolean] = js.native
  }
  object Idempotent {
    
    @scala.inline
    def apply(): Idempotent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Idempotent]
    }
    
    @scala.inline
    implicit class IdempotentMutableBuilder[Self <: Idempotent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdempotent(value: Boolean): Self = StObject.set(x, "idempotent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdempotentUndefined: Self = StObject.set(x, "idempotent", js.undefined)
    }
  }
  
  @js.native
  trait Intermediates extends StObject {
    
    var intermediates: js.UndefOr[Boolean] = js.native
  }
  object Intermediates {
    
    @scala.inline
    def apply(): Intermediates = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Intermediates]
    }
    
    @scala.inline
    implicit class IntermediatesMutableBuilder[Self <: Intermediates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIntermediates(value: Boolean): Self = StObject.set(x, "intermediates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntermediatesUndefined: Self = StObject.set(x, "intermediates", js.undefined)
    }
  }
  
  @js.native
  trait IsDirectory extends FileInfo {
    
    var exists: `false` = js.native
    
    var isDirectory: `false` = js.native
    
    var md5: js.UndefOr[scala.Nothing] = js.native
    
    var modificationTime: js.UndefOr[scala.Nothing] = js.native
    
    var size: js.UndefOr[scala.Nothing] = js.native
    
    var uri: String = js.native
  }
  object IsDirectory {
    
    @scala.inline
    def apply(exists: `false`, isDirectory: `false`, uri: String): IsDirectory = {
      val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsDirectory]
    }
    
    @scala.inline
    implicit class IsDirectoryMutableBuilder[Self <: IsDirectory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExists(value: `false`): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDirectory(value: `false`): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Md5 extends StObject {
    
    var md5: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[Boolean] = js.native
  }
  object Md5 {
    
    @scala.inline
    def apply(): Md5 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Md5]
    }
    
    @scala.inline
    implicit class Md5MutableBuilder[Self <: Md5] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMd5(value: Boolean): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
      
      @scala.inline
      def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait TotalBytesExpectedToWrite extends StObject {
    
    var totalBytesExpectedToWrite: Double = js.native
    
    var totalBytesWritten: Double = js.native
  }
  object TotalBytesExpectedToWrite {
    
    @scala.inline
    def apply(totalBytesExpectedToWrite: Double, totalBytesWritten: Double): TotalBytesExpectedToWrite = {
      val __obj = js.Dynamic.literal(totalBytesExpectedToWrite = totalBytesExpectedToWrite.asInstanceOf[js.Any], totalBytesWritten = totalBytesWritten.asInstanceOf[js.Any])
      __obj.asInstanceOf[TotalBytesExpectedToWrite]
    }
    
    @scala.inline
    implicit class TotalBytesExpectedToWriteMutableBuilder[Self <: TotalBytesExpectedToWrite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTotalBytesExpectedToWrite(value: Double): Self = StObject.set(x, "totalBytesExpectedToWrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBytesWritten(value: Double): Self = StObject.set(x, "totalBytesWritten", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UploadType extends StObject {
    
    var uploadType: js.UndefOr[BINARY_CONTENT] = js.native
  }
  object UploadType {
    
    @scala.inline
    def apply(): UploadType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadType]
    }
    
    @scala.inline
    implicit class UploadTypeMutableBuilder[Self <: UploadType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUploadType(value: BINARY_CONTENT): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    }
  }
}
