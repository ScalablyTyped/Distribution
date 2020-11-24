package typings.dwt.dynamsoftFileUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job extends js.Object {
  
  /**
    * Specify the block size (in bytes). By default, it's 10240.
    */
  var BlockSize: Double = js.native
  
  /**
    * Specify the file name.
    */
  var FileName: String = js.native
  
  /**
    * Specify the fields in the HTTP Post Form.
    */
  var FormField: typings.dwt.dynamsoftFileUploaderMod.FormField = js.native
  
  /**
    * Specify custom HTTP Post request headers.
    * Example: job.HttpHeader["Content-Type"] = "text/plain";
    */
  var HttpHeader: js.Object = js.native
  
  /**
    * Return the Http version.
    */
  val HttpVersion: String = js.native
  
  /**
    * A callback triggered when the job succeeds.
    * @argument job Specify the job.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def OnRunFailure(job: Job, errorCode: Double, errorString: String): Unit = js.native
  
  /**
    * A callback triggered when the job succeeds.
    * @argument job Specify the job.
    */
  def OnRunSuccess(job: Job): Unit = js.native
  
  /**
    * A callback triggered multiple times during the upload.
    * @argument job Specify the job.
    * @argument percentage Return the percentage.
    */
  def OnUploadTransferPercentage(job: Job, percentage: Double): Unit = js.native
  
  /**
    * Specify the URL of the script to receive the upload.
    */
  var ServerUrl: String = js.native
  
  /**
    * Specify the main content of the job, i.e. the file(s).
    */
  var SourceValue: typings.dwt.dynamsoftFileUploaderMod.SourceValue = js.native
  
  /**
    * Specify the number of threads (<=4) for the upload.
    */
  var ThreadNum: Double = js.native
  
  /**
    * Return the version of the job.
    */
  val Version: Double = js.native
}
object Job {
  
  @scala.inline
  def apply(
    BlockSize: Double,
    FileName: String,
    FormField: FormField,
    HttpHeader: js.Object,
    HttpVersion: String,
    OnRunFailure: (Job, Double, String) => Unit,
    OnRunSuccess: Job => Unit,
    OnUploadTransferPercentage: (Job, Double) => Unit,
    ServerUrl: String,
    SourceValue: SourceValue,
    ThreadNum: Double,
    Version: Double
  ): Job = {
    val __obj = js.Dynamic.literal(BlockSize = BlockSize.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], FormField = FormField.asInstanceOf[js.Any], HttpHeader = HttpHeader.asInstanceOf[js.Any], HttpVersion = HttpVersion.asInstanceOf[js.Any], OnRunFailure = js.Any.fromFunction3(OnRunFailure), OnRunSuccess = js.Any.fromFunction1(OnRunSuccess), OnUploadTransferPercentage = js.Any.fromFunction2(OnUploadTransferPercentage), ServerUrl = ServerUrl.asInstanceOf[js.Any], SourceValue = SourceValue.asInstanceOf[js.Any], ThreadNum = ThreadNum.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlockSize(value: Double): Self = this.set("BlockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("FileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormField(value: FormField): Self = this.set("FormField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpHeader(value: js.Object): Self = this.set("HttpHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpVersion(value: String): Self = this.set("HttpVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRunFailure(value: (Job, Double, String) => Unit): Self = this.set("OnRunFailure", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnRunSuccess(value: Job => Unit): Self = this.set("OnRunSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUploadTransferPercentage(value: (Job, Double) => Unit): Self = this.set("OnUploadTransferPercentage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setServerUrl(value: String): Self = this.set("ServerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceValue(value: SourceValue): Self = this.set("SourceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadNum(value: Double): Self = this.set("ThreadNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("Version", value.asInstanceOf[js.Any])
  }
}
