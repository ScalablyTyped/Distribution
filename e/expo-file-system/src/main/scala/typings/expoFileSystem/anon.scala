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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exists
    extends StObject
       with FileInfo {
    
    var exists: `true`
    
    var isDirectory: Boolean
    
    var md5: js.UndefOr[String] = js.undefined
    
    var modificationTime: Double
    
    var size: Double
    
    var uri: String
  }
  object Exists {
    
    inline def apply(isDirectory: Boolean, modificationTime: Double, size: Double, uri: String): Exists = {
      val __obj = js.Dynamic.literal(exists = true, isDirectory = isDirectory.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exists]
    }
    
    extension [Self <: Exists](x: Self) {
      
      inline def setExists(value: `true`): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      inline def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      inline def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
      
      inline def setModificationTime(value: Double): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldName extends StObject {
    
    var fieldName: js.UndefOr[String] = js.undefined
    
    var mimeType: js.UndefOr[String] = js.undefined
    
    var parameters: js.UndefOr[Record[String, String]] = js.undefined
    
    var uploadType: MULTIPART
  }
  object FieldName {
    
    inline def apply(uploadType: MULTIPART): FieldName = {
      val __obj = js.Dynamic.literal(uploadType = uploadType.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldName]
    }
    
    extension [Self <: FieldName](x: Self) {
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setParameters(value: Record[String, String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setUploadType(value: MULTIPART): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: String
    
    var to: String
  }
  object From {
    
    inline def apply(from: String, to: String): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait Headers extends StObject {
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var httpMethod: js.UndefOr[FileSystemAcceptedUploadHttpMethod] = js.undefined
    
    var sessionType: js.UndefOr[FileSystemSessionType] = js.undefined
  }
  object Headers {
    
    inline def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHttpMethod(value: FileSystemAcceptedUploadHttpMethod): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
      
      inline def setSessionType(value: FileSystemSessionType): Self = StObject.set(x, "sessionType", value.asInstanceOf[js.Any])
      
      inline def setSessionTypeUndefined: Self = StObject.set(x, "sessionType", js.undefined)
    }
  }
  
  trait Idempotent extends StObject {
    
    var idempotent: js.UndefOr[Boolean] = js.undefined
  }
  object Idempotent {
    
    inline def apply(): Idempotent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Idempotent]
    }
    
    extension [Self <: Idempotent](x: Self) {
      
      inline def setIdempotent(value: Boolean): Self = StObject.set(x, "idempotent", value.asInstanceOf[js.Any])
      
      inline def setIdempotentUndefined: Self = StObject.set(x, "idempotent", js.undefined)
    }
  }
  
  trait Intermediates extends StObject {
    
    var intermediates: js.UndefOr[Boolean] = js.undefined
  }
  object Intermediates {
    
    inline def apply(): Intermediates = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Intermediates]
    }
    
    extension [Self <: Intermediates](x: Self) {
      
      inline def setIntermediates(value: Boolean): Self = StObject.set(x, "intermediates", value.asInstanceOf[js.Any])
      
      inline def setIntermediatesUndefined: Self = StObject.set(x, "intermediates", js.undefined)
    }
  }
  
  trait IsDirectory
    extends StObject
       with FileInfo {
    
    var exists: `false`
    
    var isDirectory: `false`
    
    var md5: Unit
    
    var modificationTime: Unit
    
    var size: Unit
    
    var uri: String
  }
  object IsDirectory {
    
    inline def apply(md5: Unit, modificationTime: Unit, size: Unit, uri: String): IsDirectory = {
      val __obj = js.Dynamic.literal(exists = false, isDirectory = false, md5 = md5.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsDirectory]
    }
    
    extension [Self <: IsDirectory](x: Self) {
      
      inline def setExists(value: `false`): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setIsDirectory(value: `false`): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      inline def setMd5(value: Unit): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      inline def setModificationTime(value: Unit): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Unit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait Md5 extends StObject {
    
    var md5: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Boolean] = js.undefined
  }
  object Md5 {
    
    inline def apply(): Md5 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Md5]
    }
    
    extension [Self <: Md5](x: Self) {
      
      inline def setMd5(value: Boolean): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      inline def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
      
      inline def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait TotalBytesExpectedToWrite extends StObject {
    
    var totalBytesExpectedToWrite: Double
    
    var totalBytesWritten: Double
  }
  object TotalBytesExpectedToWrite {
    
    inline def apply(totalBytesExpectedToWrite: Double, totalBytesWritten: Double): TotalBytesExpectedToWrite = {
      val __obj = js.Dynamic.literal(totalBytesExpectedToWrite = totalBytesExpectedToWrite.asInstanceOf[js.Any], totalBytesWritten = totalBytesWritten.asInstanceOf[js.Any])
      __obj.asInstanceOf[TotalBytesExpectedToWrite]
    }
    
    extension [Self <: TotalBytesExpectedToWrite](x: Self) {
      
      inline def setTotalBytesExpectedToWrite(value: Double): Self = StObject.set(x, "totalBytesExpectedToWrite", value.asInstanceOf[js.Any])
      
      inline def setTotalBytesWritten(value: Double): Self = StObject.set(x, "totalBytesWritten", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadType extends StObject {
    
    var uploadType: js.UndefOr[BINARY_CONTENT] = js.undefined
  }
  object UploadType {
    
    inline def apply(): UploadType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadType]
    }
    
    extension [Self <: UploadType](x: Self) {
      
      inline def setUploadType(value: BINARY_CONTENT): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    }
  }
}
