package typings.evaporate.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.File
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddConfig extends js.Object {
  var beforeSigner: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* url */ String, Unit]] = js.native
  var cancelled: js.UndefOr[js.Function0[Unit]] = js.native
  var complete: js.UndefOr[
    js.Function3[/* xhr */ XMLHttpRequest, /* awsObjectKey */ String, /* stats */ TransferStats, Unit]
  ] = js.native
  var contentType: js.UndefOr[String] = js.native
  var error: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  var file: File = js.native
  var info: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  var name: String = js.native
  var nameChanged: js.UndefOr[js.Function1[/* awsObjectKey */ String, Unit]] = js.native
  var notSignedHeadersAtInitiate: js.UndefOr[StringDictionary[String]] = js.native
  var paused: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.native
  var pausing: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.native
  var progress: js.UndefOr[js.Function2[/* p */ Double, /* stats */ TransferStats, Unit]] = js.native
  var resumed: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.native
  var started: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.native
  var uploadInitiated: js.UndefOr[js.Function1[/* s3UploadId */ js.UndefOr[String], Unit]] = js.native
  var warn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  var xAmzHeadersAtComplete: js.UndefOr[StringDictionary[String]] = js.native
  var xAmzHeadersAtInitiate: js.UndefOr[StringDictionary[String]] = js.native
  var xAmzHeadersAtUpload: js.UndefOr[StringDictionary[String]] = js.native
  var xAmzHeadersCommon: js.UndefOr[StringDictionary[String]] = js.native
}

object AddConfig {
  @scala.inline
  def apply(file: File, name: String): AddConfig = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConfig]
  }
  @scala.inline
  implicit class AddConfigOps[Self <: AddConfig] (val x: Self) extends AnyVal {
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
    def setFile(value: File): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeSigner(value: (/* xhr */ XMLHttpRequest, /* url */ String) => Unit): Self = this.set("beforeSigner", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeSigner: Self = this.set("beforeSigner", js.undefined)
    @scala.inline
    def setCancelled(value: () => Unit): Self = this.set("cancelled", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCancelled: Self = this.set("cancelled", js.undefined)
    @scala.inline
    def setComplete(value: (/* xhr */ XMLHttpRequest, /* awsObjectKey */ String, /* stats */ TransferStats) => Unit): Self = this.set("complete", js.Any.fromFunction3(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setError(value: /* msg */ String => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setInfo(value: /* msg */ String => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setNameChanged(value: /* awsObjectKey */ String => Unit): Self = this.set("nameChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNameChanged: Self = this.set("nameChanged", js.undefined)
    @scala.inline
    def setNotSignedHeadersAtInitiate(value: StringDictionary[String]): Self = this.set("notSignedHeadersAtInitiate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotSignedHeadersAtInitiate: Self = this.set("notSignedHeadersAtInitiate", js.undefined)
    @scala.inline
    def setPaused(value: /* file_key */ String => Unit): Self = this.set("paused", js.Any.fromFunction1(value))
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    @scala.inline
    def setPausing(value: /* file_key */ String => Unit): Self = this.set("pausing", js.Any.fromFunction1(value))
    @scala.inline
    def deletePausing: Self = this.set("pausing", js.undefined)
    @scala.inline
    def setProgress(value: (/* p */ Double, /* stats */ TransferStats) => Unit): Self = this.set("progress", js.Any.fromFunction2(value))
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setResumed(value: /* file_key */ String => Unit): Self = this.set("resumed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResumed: Self = this.set("resumed", js.undefined)
    @scala.inline
    def setStarted(value: /* file_key */ String => Unit): Self = this.set("started", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStarted: Self = this.set("started", js.undefined)
    @scala.inline
    def setUploadInitiated(value: /* s3UploadId */ js.UndefOr[String] => Unit): Self = this.set("uploadInitiated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUploadInitiated: Self = this.set("uploadInitiated", js.undefined)
    @scala.inline
    def setWarn(value: /* msg */ String => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
    @scala.inline
    def setXAmzHeadersAtComplete(value: StringDictionary[String]): Self = this.set("xAmzHeadersAtComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAmzHeadersAtComplete: Self = this.set("xAmzHeadersAtComplete", js.undefined)
    @scala.inline
    def setXAmzHeadersAtInitiate(value: StringDictionary[String]): Self = this.set("xAmzHeadersAtInitiate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAmzHeadersAtInitiate: Self = this.set("xAmzHeadersAtInitiate", js.undefined)
    @scala.inline
    def setXAmzHeadersAtUpload(value: StringDictionary[String]): Self = this.set("xAmzHeadersAtUpload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAmzHeadersAtUpload: Self = this.set("xAmzHeadersAtUpload", js.undefined)
    @scala.inline
    def setXAmzHeadersCommon(value: StringDictionary[String]): Self = this.set("xAmzHeadersCommon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAmzHeadersCommon: Self = this.set("xAmzHeadersCommon", js.undefined)
  }
  
}

