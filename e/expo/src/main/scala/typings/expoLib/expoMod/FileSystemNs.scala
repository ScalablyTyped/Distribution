package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "FileSystem")
@js.native
object FileSystemNs extends js.Object {
  trait DownloadOptions extends js.Object {
    var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
    var md5: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait DownloadProgressData extends js.Object {
    var totalBytesExpectedToWrite: scala.Double
    var totalBytesWritten: scala.Double
  }
  
  trait DownloadResult extends js.Object {
    var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
    var md5: js.UndefOr[expoLib.expoMod.Md5] = js.undefined
    var status: scala.Double
    var uri: java.lang.String
  }
  
  @js.native
  class DownloadResumable protected () extends js.Object {
    def this(url: java.lang.String, fileUri: java.lang.String, options: DownloadOptions) = this()
    def this(url: java.lang.String, fileUri: java.lang.String, options: DownloadOptions, callback: DownloadProgressCallback) = this()
    def this(url: java.lang.String, fileUri: java.lang.String, options: DownloadOptions, callback: DownloadProgressCallback, resumeData: java.lang.String) = this()
    def downloadAsync(): js.Promise[DownloadResult] = js.native
    def pauseAsync(): js.Promise[PauseResult] = js.native
    def resumeAsync(): js.Promise[DownloadResult] = js.native
    def savable(): PauseResult = js.native
  }
  
  trait PauseResult extends js.Object {
    var fileUri: java.lang.String
    var options: expoLib.Anon_Md5Boolean_1357212231
    var resumeData: java.lang.String
    var url: java.lang.String
  }
  
  trait ReadingOptions extends js.Object {
    var encoding: js.UndefOr[EncodingType] = js.undefined
    var length: js.UndefOr[scala.Double] = js.undefined
    var position: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait WritingOptions extends js.Object {
    var encoding: js.UndefOr[EncodingType] = js.undefined
  }
  
  val cacheDirectory: java.lang.String = js.native
  val documentDirectory: java.lang.String = js.native
  def copyAsync(options: expoLib.Anon_From): js.Promise[scala.Unit] = js.native
  def createDownloadResumable(uri: java.lang.String, fileUri: java.lang.String): DownloadResumable = js.native
  def createDownloadResumable(uri: java.lang.String, fileUri: java.lang.String, options: DownloadOptions): DownloadResumable = js.native
  def createDownloadResumable(
    uri: java.lang.String,
    fileUri: java.lang.String,
    options: DownloadOptions,
    callback: js.Function2[
      /* totalBytesWritten */ scala.Double, 
      /* totalBytesExpectedToWrite */ scala.Double, 
      scala.Unit
    ]
  ): DownloadResumable = js.native
  def createDownloadResumable(
    uri: java.lang.String,
    fileUri: java.lang.String,
    options: DownloadOptions,
    callback: js.Function2[
      /* totalBytesWritten */ scala.Double, 
      /* totalBytesExpectedToWrite */ scala.Double, 
      scala.Unit
    ],
    resumeData: java.lang.String
  ): DownloadResumable = js.native
  def deleteAsync(fileUri: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteAsync(fileUri: java.lang.String, options: expoLib.Anon_Idempotent): js.Promise[scala.Unit] = js.native
  def downloadAsync(uri: java.lang.String, fileUri: java.lang.String): js.Promise[DownloadResult] = js.native
  def downloadAsync(uri: java.lang.String, fileUri: java.lang.String, options: expoLib.Anon_Md5Boolean): js.Promise[DownloadResult] = js.native
  def getInfoAsync(fileUri: java.lang.String): js.Promise[FileInfo] = js.native
  def getInfoAsync(fileUri: java.lang.String, options: expoLib.Anon_Md5): js.Promise[FileInfo] = js.native
  def makeDirectoryAsync(dirUri: java.lang.String): js.Promise[scala.Unit] = js.native
  def makeDirectoryAsync(dirUri: java.lang.String, options: expoLib.Anon_Intermediates): js.Promise[scala.Unit] = js.native
  def moveAsync(options: expoLib.Anon_From): js.Promise[scala.Unit] = js.native
  def readAsStringAsync(fileUri: java.lang.String): js.Promise[java.lang.String] = js.native
  def readAsStringAsync(fileUri: java.lang.String, options: ReadingOptions): js.Promise[java.lang.String] = js.native
  def readDirectoryAsync(dirUri: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def writeAsStringAsync(fileUri: java.lang.String, contents: java.lang.String): js.Promise[scala.Unit] = js.native
  def writeAsStringAsync(fileUri: java.lang.String, contents: java.lang.String, options: WritingOptions): js.Promise[scala.Unit] = js.native
  type DownloadProgressCallback = js.Function1[/* data */ DownloadProgressData, scala.Unit]
  type EncodingType = expoLib.expoLibStrings.utf8 | expoLib.expoLibStrings.base64
  type FileInfo = expoLib.Anon_Exists | expoLib.Anon_ExistsFalse
}

