package typings.expo.expoMod

import org.scalablytyped.runtime.StringDictionary
import typings.expo.Anon_From
import typings.expo.Anon_Idempotent
import typings.expo.Anon_Intermediates
import typings.expo.Anon_Md5
import typings.expo.Anon_Md5Boolean
import typings.expo.Anon_Md5Boolean_932053220
import typings.expo.expoMod.FileSystemNs.DownloadOptions
import typings.expo.expoMod.FileSystemNs.DownloadProgressCallback
import typings.expo.expoMod.FileSystemNs.DownloadProgressData
import typings.expo.expoMod.FileSystemNs.DownloadResult
import typings.expo.expoMod.FileSystemNs.DownloadResumable
import typings.expo.expoMod.FileSystemNs.EncodingType
import typings.expo.expoMod.FileSystemNs.FileInfo
import typings.expo.expoMod.FileSystemNs.PauseResult
import typings.expo.expoMod.FileSystemNs.ReadingOptions
import typings.expo.expoMod.FileSystemNs.WritingOptions
import typings.expo.expoNumbers.`false`
import typings.expo.expoNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "FileSystem")
@js.native
object FileSystemNs extends js.Object {
  trait DownloadOptions extends js.Object {
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    var md5: js.UndefOr[Boolean] = js.undefined
  }
  
  trait DownloadProgressData extends js.Object {
    var totalBytesExpectedToWrite: Double
    var totalBytesWritten: Double
  }
  
  trait DownloadResult extends js.Object {
    var headers: StringDictionary[String]
    var md5: js.UndefOr[Md5] = js.undefined
    var status: Double
    var uri: String
  }
  
  @js.native
  class DownloadResumable protected () extends js.Object {
    def this(url: String, fileUri: String, options: DownloadOptions) = this()
    def this(url: String, fileUri: String, options: DownloadOptions, callback: DownloadProgressCallback) = this()
    def this(
      url: String,
      fileUri: String,
      options: DownloadOptions,
      callback: DownloadProgressCallback,
      resumeData: String
    ) = this()
    def downloadAsync(): js.Promise[DownloadResult] = js.native
    def pauseAsync(): js.Promise[PauseResult] = js.native
    def resumeAsync(): js.Promise[DownloadResult] = js.native
    def savable(): PauseResult = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expo.expoStrings.utf8
    - typings.expo.expoStrings.base64
  */
  trait EncodingType extends js.Object
  
  trait FileInfo extends js.Object {
    var exists: js.UndefOr[`false` | `true`] = js.undefined
    var isDirectory: js.UndefOr[Boolean | `false`] = js.undefined
    var md5: js.UndefOr[Md5] = js.undefined
    var modificationTime: js.UndefOr[Double] = js.undefined
    var size: js.UndefOr[Double] = js.undefined
    var uri: js.UndefOr[String] = js.undefined
  }
  
  trait PauseResult extends js.Object {
    var fileUri: String
    var options: Anon_Md5Boolean_932053220
    var resumeData: String
    var url: String
  }
  
  trait ReadingOptions extends js.Object {
    var encoding: js.UndefOr[EncodingType] = js.undefined
    var length: js.UndefOr[Double] = js.undefined
    var position: js.UndefOr[Double] = js.undefined
  }
  
  trait WritingOptions extends js.Object {
    var encoding: js.UndefOr[EncodingType] = js.undefined
  }
  
  val cacheDirectory: String = js.native
  val documentDirectory: String = js.native
  def copyAsync(options: Anon_From): js.Promise[Unit] = js.native
  def createDownloadResumable(uri: String, fileUri: String): DownloadResumable = js.native
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions): DownloadResumable = js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: js.Function2[/* totalBytesWritten */ Double, /* totalBytesExpectedToWrite */ Double, Unit]
  ): DownloadResumable = js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: js.Function2[/* totalBytesWritten */ Double, /* totalBytesExpectedToWrite */ Double, Unit],
    resumeData: String
  ): DownloadResumable = js.native
  def deleteAsync(fileUri: String): js.Promise[Unit] = js.native
  def deleteAsync(fileUri: String, options: Anon_Idempotent): js.Promise[Unit] = js.native
  def downloadAsync(uri: String, fileUri: String): js.Promise[DownloadResult] = js.native
  def downloadAsync(uri: String, fileUri: String, options: Anon_Md5Boolean): js.Promise[DownloadResult] = js.native
  def getInfoAsync(fileUri: String): js.Promise[FileInfo] = js.native
  def getInfoAsync(fileUri: String, options: Anon_Md5): js.Promise[FileInfo] = js.native
  def makeDirectoryAsync(dirUri: String): js.Promise[Unit] = js.native
  def makeDirectoryAsync(dirUri: String, options: Anon_Intermediates): js.Promise[Unit] = js.native
  def moveAsync(options: Anon_From): js.Promise[Unit] = js.native
  def readAsStringAsync(fileUri: String): js.Promise[String] = js.native
  def readAsStringAsync(fileUri: String, options: ReadingOptions): js.Promise[String] = js.native
  def readDirectoryAsync(dirUri: String): js.Promise[js.Array[String]] = js.native
  def writeAsStringAsync(fileUri: String, contents: String): js.Promise[Unit] = js.native
  def writeAsStringAsync(fileUri: String, contents: String, options: WritingOptions): js.Promise[Unit] = js.native
  type DownloadProgressCallback = js.Function1[/* data */ DownloadProgressData, Unit]
}

