package typings.fineUploader.s3Mod.s3

import typings.fineUploader.coreMod.CoreEvents
import typings.fineUploader.coreMod.PromiseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Events extends CoreEvents {
  /**
    * Called before a request is sent to S3 if the temporary credentials have expired.
    *
    * You must return a promise. If your attempt to refresh the temporary credentials is successful, you must fulfill the promise via the success method, passing the new credentials object.
    * Otherwise, call failure with a descriptive reason.
    */
  var onCredentialsExpired: js.UndefOr[OnCredentialsExpired] = js.native
}

object S3Events {
  @scala.inline
  def apply(): S3Events = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Events]
  }
  @scala.inline
  implicit class S3EventsOps[Self <: S3Events] (val x: Self) extends AnyVal {
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
    def setOnCredentialsExpired(value: () => PromiseOptions): Self = this.set("onCredentialsExpired", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCredentialsExpired: Self = this.set("onCredentialsExpired", js.undefined)
  }
  
}

