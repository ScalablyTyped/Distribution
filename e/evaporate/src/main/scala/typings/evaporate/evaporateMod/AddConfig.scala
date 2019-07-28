package typings.evaporate.evaporateMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.File
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddConfig extends js.Object {
  var beforeSigner: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* url */ String, Unit]] = js.undefined
  var cancelled: js.UndefOr[js.Function0[Unit]] = js.undefined
  var complete: js.UndefOr[
    js.Function3[/* xhr */ XMLHttpRequest, /* awsObjectKey */ String, /* stats */ TransferStats, Unit]
  ] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  var file: File
  var info: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  var name: String
  var nameChanged: js.UndefOr[js.Function1[/* awsObjectKey */ String, Unit]] = js.undefined
  var notSignedHeadersAtInitiate: js.UndefOr[StringDictionary[String]] = js.undefined
  var paused: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.undefined
  var pausing: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.undefined
  var progress: js.UndefOr[js.Function2[/* p */ Double, /* stats */ TransferStats, Unit]] = js.undefined
  var resumed: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.undefined
  var started: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.undefined
  var uploadInitiated: js.UndefOr[js.Function1[/* s3UploadId */ js.UndefOr[String], Unit]] = js.undefined
  var warn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  var xAmzHeadersAtComplete: js.UndefOr[StringDictionary[String]] = js.undefined
  var xAmzHeadersAtInitiate: js.UndefOr[StringDictionary[String]] = js.undefined
  var xAmzHeadersAtUpload: js.UndefOr[StringDictionary[String]] = js.undefined
  var xAmzHeadersCommon: js.UndefOr[StringDictionary[String]] = js.undefined
}

object AddConfig {
  @scala.inline
  def apply(
    file: File,
    name: String,
    beforeSigner: (/* xhr */ XMLHttpRequest, /* url */ String) => Unit = null,
    cancelled: () => Unit = null,
    complete: (/* xhr */ XMLHttpRequest, /* awsObjectKey */ String, /* stats */ TransferStats) => Unit = null,
    contentType: String = null,
    error: /* msg */ String => Unit = null,
    info: /* msg */ String => Unit = null,
    nameChanged: /* awsObjectKey */ String => Unit = null,
    notSignedHeadersAtInitiate: StringDictionary[String] = null,
    paused: /* file_key */ String => Unit = null,
    pausing: /* file_key */ String => Unit = null,
    progress: (/* p */ Double, /* stats */ TransferStats) => Unit = null,
    resumed: /* file_key */ String => Unit = null,
    started: /* file_key */ String => Unit = null,
    uploadInitiated: /* s3UploadId */ js.UndefOr[String] => Unit = null,
    warn: /* msg */ String => Unit = null,
    xAmzHeadersAtComplete: StringDictionary[String] = null,
    xAmzHeadersAtInitiate: StringDictionary[String] = null,
    xAmzHeadersAtUpload: StringDictionary[String] = null,
    xAmzHeadersCommon: StringDictionary[String] = null
  ): AddConfig = {
    val __obj = js.Dynamic.literal(file = file, name = name)
    if (beforeSigner != null) __obj.updateDynamic("beforeSigner")(js.Any.fromFunction2(beforeSigner))
    if (cancelled != null) __obj.updateDynamic("cancelled")(js.Any.fromFunction0(cancelled))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction3(complete))
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction1(info))
    if (nameChanged != null) __obj.updateDynamic("nameChanged")(js.Any.fromFunction1(nameChanged))
    if (notSignedHeadersAtInitiate != null) __obj.updateDynamic("notSignedHeadersAtInitiate")(notSignedHeadersAtInitiate)
    if (paused != null) __obj.updateDynamic("paused")(js.Any.fromFunction1(paused))
    if (pausing != null) __obj.updateDynamic("pausing")(js.Any.fromFunction1(pausing))
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction2(progress))
    if (resumed != null) __obj.updateDynamic("resumed")(js.Any.fromFunction1(resumed))
    if (started != null) __obj.updateDynamic("started")(js.Any.fromFunction1(started))
    if (uploadInitiated != null) __obj.updateDynamic("uploadInitiated")(js.Any.fromFunction1(uploadInitiated))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction1(warn))
    if (xAmzHeadersAtComplete != null) __obj.updateDynamic("xAmzHeadersAtComplete")(xAmzHeadersAtComplete)
    if (xAmzHeadersAtInitiate != null) __obj.updateDynamic("xAmzHeadersAtInitiate")(xAmzHeadersAtInitiate)
    if (xAmzHeadersAtUpload != null) __obj.updateDynamic("xAmzHeadersAtUpload")(xAmzHeadersAtUpload)
    if (xAmzHeadersCommon != null) __obj.updateDynamic("xAmzHeadersCommon")(xAmzHeadersCommon)
    __obj.asInstanceOf[AddConfig]
  }
}

