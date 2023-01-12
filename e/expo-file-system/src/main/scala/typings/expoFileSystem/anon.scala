package typings.expoFileSystem

import typings.expoFileSystem.buildFileSystemDottypesMod.FileInfo
import typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemAcceptedUploadHttpMethod
import typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemRequestDirectoryPermissionsResult
import typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemSessionType
import typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemUploadOptions
import typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemUploadType.BINARY_CONTENT
import typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemUploadType.MULTIPART
import typings.expoFileSystem.expoFileSystemBooleans.`false`
import typings.expoFileSystem.expoFileSystemBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DirectoryUri
    extends StObject
       with FileSystemRequestDirectoryPermissionsResult {
    
    var directoryUri: String
    
    var granted: `true`
  }
  object DirectoryUri {
    
    inline def apply(directoryUri: String): DirectoryUri = {
      val __obj = js.Dynamic.literal(directoryUri = directoryUri.asInstanceOf[js.Any], granted = true)
      __obj.asInstanceOf[DirectoryUri]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectoryUri] (val x: Self) extends AnyVal {
      
      inline def setDirectoryUri(value: String): Self = StObject.set(x, "directoryUri", value.asInstanceOf[js.Any])
      
      inline def setGranted(value: `true`): Self = StObject.set(x, "granted", value.asInstanceOf[js.Any])
    }
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Exists] (val x: Self) extends AnyVal {
      
      inline def setExists(value: `true`): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      inline def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      inline def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
      
      inline def setModificationTime(value: Double): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait Granted
    extends StObject
       with FileSystemRequestDirectoryPermissionsResult {
    
    var granted: `false`
  }
  object Granted {
    
    inline def apply(): Granted = {
      val __obj = js.Dynamic.literal(granted = false)
      __obj.asInstanceOf[Granted]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Granted] (val x: Self) extends AnyVal {
      
      inline def setGranted(value: `false`): Self = StObject.set(x, "granted", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Idempotent] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Intermediates] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsDirectory] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Md5] (val x: Self) extends AnyVal {
      
      inline def setMd5(value: Boolean): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      inline def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
      
      inline def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Inlined {  uploadType :expo-file-system.expo-file-system/build/FileSystem.types.FileSystemUploadType.BINARY_CONTENT | undefined} & {  headers :std.Record<string, string> | undefined,   httpMethod :expo-file-system.expo-file-system/build/FileSystem.types.FileSystemAcceptedUploadHttpMethod | undefined,   sessionType :expo-file-system.expo-file-system/build/FileSystem.types.FileSystemSessionType | undefined} */
  trait uploadTypeBINARYCONTENTun
    extends StObject
       with FileSystemUploadOptions {
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var httpMethod: js.UndefOr[FileSystemAcceptedUploadHttpMethod] = js.undefined
    
    var sessionType: js.UndefOr[FileSystemSessionType] = js.undefined
    
    var uploadType: js.UndefOr[BINARY_CONTENT] = js.undefined
  }
  object uploadTypeBINARYCONTENTun {
    
    inline def apply(): uploadTypeBINARYCONTENTun = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[uploadTypeBINARYCONTENTun]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: uploadTypeBINARYCONTENTun] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHttpMethod(value: FileSystemAcceptedUploadHttpMethod): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
      
      inline def setSessionType(value: FileSystemSessionType): Self = StObject.set(x, "sessionType", value.asInstanceOf[js.Any])
      
      inline def setSessionTypeUndefined: Self = StObject.set(x, "sessionType", js.undefined)
      
      inline def setUploadType(value: BINARY_CONTENT): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    }
  }
  
  /* Inlined {  uploadType :expo-file-system.expo-file-system/build/FileSystem.types.FileSystemUploadType.MULTIPART,   fieldName :string | undefined,   mimeType :string | undefined,   parameters :std.Record<string, string> | undefined} & {  headers :std.Record<string, string> | undefined,   httpMethod :expo-file-system.expo-file-system/build/FileSystem.types.FileSystemAcceptedUploadHttpMethod | undefined,   sessionType :expo-file-system.expo-file-system/build/FileSystem.types.FileSystemSessionType | undefined} */
  trait uploadTypeMULTIPARTfieldN
    extends StObject
       with FileSystemUploadOptions {
    
    var fieldName: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var httpMethod: js.UndefOr[FileSystemAcceptedUploadHttpMethod] = js.undefined
    
    var mimeType: js.UndefOr[String] = js.undefined
    
    var parameters: js.UndefOr[Record[String, String]] = js.undefined
    
    var sessionType: js.UndefOr[FileSystemSessionType] = js.undefined
    
    var uploadType: MULTIPART
  }
  object uploadTypeMULTIPARTfieldN {
    
    inline def apply(uploadType: MULTIPART): uploadTypeMULTIPARTfieldN = {
      val __obj = js.Dynamic.literal(uploadType = uploadType.asInstanceOf[js.Any])
      __obj.asInstanceOf[uploadTypeMULTIPARTfieldN]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: uploadTypeMULTIPARTfieldN] (val x: Self) extends AnyVal {
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHttpMethod(value: FileSystemAcceptedUploadHttpMethod): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setParameters(value: Record[String, String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setSessionType(value: FileSystemSessionType): Self = StObject.set(x, "sessionType", value.asInstanceOf[js.Any])
      
      inline def setSessionTypeUndefined: Self = StObject.set(x, "sessionType", js.undefined)
      
      inline def setUploadType(value: MULTIPART): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    }
  }
}
