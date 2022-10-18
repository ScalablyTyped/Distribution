package typings.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DownloadProgressCallback = FileSystemNetworkTaskProgressCallback[DownloadProgressData]

type DownloadResult = FileSystemDownloadResult

type FileSystemNetworkTaskProgressCallback[T /* <: DownloadProgressData | UploadProgressData */] = js.Function1[/* data */ T, Unit]
