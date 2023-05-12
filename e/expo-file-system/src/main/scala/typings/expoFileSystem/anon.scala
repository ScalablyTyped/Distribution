package typings.expoFileSystem

import typings.expoFileSystem.buildFileSystemDottypesMod.FileInfo
import typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemAcceptedUploadHttpMethod
import typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemRequestDirectoryPermissionsResult
import typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemSessionType
import typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemUploadOptions
import typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemUploadType
import typings.expoFileSystem.expoFileSystemBooleans.`false`
import typings.expoFileSystem.expoFileSystemBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /**
    * If the permissions were granted.
    */
  trait DirectoryUri
    extends StObject
       with FileSystemRequestDirectoryPermissionsResult {
    
    /**
      * The [SAF URI](#saf-uri) to the user's selected directory. Available only if permissions were granted.
      */
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
  
  /**
    * Object returned when file exist.
    */
  trait Exists
    extends StObject
       with FileInfo {
    
    /**
      * Signifies that the requested file exist.
      */
    var exists: `true`
    
    /**
      * Boolean set to `true` if this is a directory and `false` if it is a file.
      */
    var isDirectory: Boolean
    
    /**
      * Present if the `md5` option was truthy. Contains the MD5 hash of the file.
      */
    var md5: js.UndefOr[String] = js.undefined
    
    /**
      * The last modification time of the file expressed in seconds since epoch.
      */
    var modificationTime: Double
    
    /**
      * The size of the file in bytes. If operating on a source such as an iCloud file, only present if the `size` option was truthy.
      */
    var size: Double
    
    /**
      * A `file://` URI pointing to the file. This is the same as the `fileUri` input parameter.
      */
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
  
  /**
    * If the permissions were not granted.
    */
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
  
  /**
    * Object returned when file do not exist.
    */
  trait IsDirectory
    extends StObject
       with FileInfo {
    
    var exists: `false`
    
    var isDirectory: `false`
    
    var uri: String
  }
  object IsDirectory {
    
    inline def apply(uri: String): IsDirectory = {
      val __obj = js.Dynamic.literal(exists = false, isDirectory = false, uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsDirectory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsDirectory] (val x: Self) extends AnyVal {
      
      inline def setExists(value: `false`): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setIsDirectory(value: `false`): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined expo-file-system.expo-file-system/build/FileSystem.types.UploadOptionsBinary & {  headers :std.Record<string, string> | undefined,   httpMethod :expo-file-system.expo-file-system/build/FileSystem.types.FileSystemAcceptedUploadHttpMethod | undefined,   sessionType :expo-file-system.expo-file-system/build/FileSystem.types.FileSystemSessionType | undefined} */
  trait UploadOptionsBinaryheader
    extends StObject
       with FileSystemUploadOptions {
    
    /**
      * An object containing all the HTTP header fields and their values for the upload network request.
      * The keys and values of the object are the header names and values respectively.
      */
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * The request method.
      * @default FileSystemAcceptedUploadHttpMethod.POST
      */
    var httpMethod: js.UndefOr[FileSystemAcceptedUploadHttpMethod] = js.undefined
    
    /**
      * A session type. Determines if tasks can be handled in the background. On Android, sessions always work in the background and you can't change it.
      * @default FileSystemSessionType.BACKGROUND
      * @platform ios
      */
    var sessionType: js.UndefOr[FileSystemSessionType] = js.undefined
    
    /**
      * Upload type determines how the file will be sent to the server.
      * Value will be `FileSystemUploadType.BINARY_CONTENT`.
      */
    var uploadType: js.UndefOr[FileSystemUploadType] = js.undefined
  }
  object UploadOptionsBinaryheader {
    
    inline def apply(): UploadOptionsBinaryheader = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadOptionsBinaryheader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadOptionsBinaryheader] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHttpMethod(value: FileSystemAcceptedUploadHttpMethod): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
      
      inline def setSessionType(value: FileSystemSessionType): Self = StObject.set(x, "sessionType", value.asInstanceOf[js.Any])
      
      inline def setSessionTypeUndefined: Self = StObject.set(x, "sessionType", js.undefined)
      
      inline def setUploadType(value: FileSystemUploadType): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    }
  }
  
  /* Inlined expo-file-system.expo-file-system/build/FileSystem.types.UploadOptionsMultipart & {  headers :std.Record<string, string> | undefined,   httpMethod :expo-file-system.expo-file-system/build/FileSystem.types.FileSystemAcceptedUploadHttpMethod | undefined,   sessionType :expo-file-system.expo-file-system/build/FileSystem.types.FileSystemSessionType | undefined} */
  trait UploadOptionsMultiparthea
    extends StObject
       with FileSystemUploadOptions {
    
    /**
      * The name of the field which will hold uploaded file. Defaults to the file name without an extension.
      */
    var fieldName: js.UndefOr[String] = js.undefined
    
    /**
      * An object containing all the HTTP header fields and their values for the upload network request.
      * The keys and values of the object are the header names and values respectively.
      */
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * The request method.
      * @default FileSystemAcceptedUploadHttpMethod.POST
      */
    var httpMethod: js.UndefOr[FileSystemAcceptedUploadHttpMethod] = js.undefined
    
    /**
      * The MIME type of the provided file. If not provided, the module will try to guess it based on the extension.
      */
    var mimeType: js.UndefOr[String] = js.undefined
    
    /**
      * Additional form properties. They will be located in the request body.
      */
    var parameters: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * A session type. Determines if tasks can be handled in the background. On Android, sessions always work in the background and you can't change it.
      * @default FileSystemSessionType.BACKGROUND
      * @platform ios
      */
    var sessionType: js.UndefOr[FileSystemSessionType] = js.undefined
    
    /**
      * Upload type determines how the file will be sent to the server.
      * Value will be `FileSystemUploadType.MULTIPART`.
      */
    var uploadType: FileSystemUploadType
  }
  object UploadOptionsMultiparthea {
    
    inline def apply(uploadType: FileSystemUploadType): UploadOptionsMultiparthea = {
      val __obj = js.Dynamic.literal(uploadType = uploadType.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadOptionsMultiparthea]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadOptionsMultiparthea] (val x: Self) extends AnyVal {
      
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
      
      inline def setUploadType(value: FileSystemUploadType): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    }
  }
}
