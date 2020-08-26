package typings.dwt.dynamsoftFileUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadManager extends js.Object {
  /**
    * Cancel a job.
    * @param job Specify the job.
    */
  def Cancel(job: Job): Boolean = js.native
  /**
    * Cancel all jobs.
    */
  def CancelAllUpload(): Boolean = js.native
  /**
    * Create an upload job.
    */
  def CreateJob(): Job = js.native
  /**
    * Start uploading (processing the specified job).
    * @param job Specify the job.
    */
  def Run(job: Job): Boolean = js.native
}

object UploadManager {
  @scala.inline
  def apply(Cancel: Job => Boolean, CancelAllUpload: () => Boolean, CreateJob: () => Job, Run: Job => Boolean): UploadManager = {
    val __obj = js.Dynamic.literal(Cancel = js.Any.fromFunction1(Cancel), CancelAllUpload = js.Any.fromFunction0(CancelAllUpload), CreateJob = js.Any.fromFunction0(CreateJob), Run = js.Any.fromFunction1(Run))
    __obj.asInstanceOf[UploadManager]
  }
  @scala.inline
  implicit class UploadManagerOps[Self <: UploadManager] (val x: Self) extends AnyVal {
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
    def setCancel(value: Job => Boolean): Self = this.set("Cancel", js.Any.fromFunction1(value))
    @scala.inline
    def setCancelAllUpload(value: () => Boolean): Self = this.set("CancelAllUpload", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateJob(value: () => Job): Self = this.set("CreateJob", js.Any.fromFunction0(value))
    @scala.inline
    def setRun(value: Job => Boolean): Self = this.set("Run", js.Any.fromFunction1(value))
  }
  
}

