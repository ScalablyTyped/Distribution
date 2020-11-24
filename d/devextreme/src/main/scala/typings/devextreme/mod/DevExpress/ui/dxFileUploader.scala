package typings.devextreme.mod.DevExpress.ui

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFileUploader extends Editor {
  
  /**
    * [descr:dxFileUploader.abortUpload()]
    */
  def abortUpload(): Unit = js.native
  /**
    * [descr:dxFileUploader.abortUpload(fileIndex)]
    */
  def abortUpload(fileIndex: Double): Unit = js.native
  /**
    * [descr:dxFileUploader.abortUpload(file)]
    */
  def abortUpload(file: File): Unit = js.native
  
  /**
    * [descr:dxFileUploader.removeFile(fileIndex)]
    */
  def removeFile(fileIndex: Double): Unit = js.native
  /**
    * [descr:dxFileUploader.removeFile(file)]
    */
  def removeFile(file: File): Unit = js.native
  
  /**
    * [descr:dxFileUploader.upload()]
    */
  def upload(): Unit = js.native
  /**
    * [descr:dxFileUploader.upload(fileIndex)]
    */
  def upload(fileIndex: Double): Unit = js.native
  /**
    * [descr:dxFileUploader.upload(file)]
    */
  def upload(file: File): Unit = js.native
}
