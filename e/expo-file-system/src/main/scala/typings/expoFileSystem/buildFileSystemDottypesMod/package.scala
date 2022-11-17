package typings.expoFileSystem.buildFileSystemDottypesMod

import typings.expoFileSystem.anon.DirectoryUri
import typings.expoFileSystem.anon.Exists
import typings.expoFileSystem.anon.Granted
import typings.expoFileSystem.anon.IsDirectory
import typings.expoFileSystem.anon.uploadTypeBINARYCONTENTun
import typings.expoFileSystem.anon.uploadTypeMULTIPARTfieldN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DownloadProgressCallback = FileSystemNetworkTaskProgressCallback[DownloadProgressData]

type DownloadResult = FileSystemDownloadResult

type FileInfo = Exists | IsDirectory

type FileSystemAcceptedUploadHttpMethod = "POST" | "PUT" | "PATCH"

type FileSystemNetworkTaskProgressCallback[T /* <: DownloadProgressData | UploadProgressData */] = js.Function1[/* data */ T, Unit]

type FileSystemRequestDirectoryPermissionsResult = DirectoryUri | Granted

type FileSystemUploadOptions = uploadTypeBINARYCONTENTun | uploadTypeMULTIPARTfieldN
