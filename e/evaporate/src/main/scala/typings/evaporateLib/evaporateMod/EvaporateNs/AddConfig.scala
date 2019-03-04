package typings
package evaporateLib.evaporateMod.EvaporateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddConfig extends js.Object {
  var beforeSigner: js.UndefOr[
    js.Function2[/* xhr */ stdLib.XMLHttpRequest, /* url */ java.lang.String, scala.Unit]
  ] = js.undefined
  var cancelled: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var complete: js.UndefOr[
    js.Function3[
      /* xhr */ stdLib.XMLHttpRequest, 
      /* awsObjectKey */ java.lang.String, 
      /* stats */ TransferStats, 
      scala.Unit
    ]
  ] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[js.Function1[/* msg */ java.lang.String, scala.Unit]] = js.undefined
  var file: stdLib.File
  var info: js.UndefOr[js.Function1[/* msg */ java.lang.String, scala.Unit]] = js.undefined
  var name: java.lang.String
  var nameChanged: js.UndefOr[js.Function1[/* awsObjectKey */ java.lang.String, scala.Unit]] = js.undefined
  var notSignedHeadersAtInitiate: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var paused: js.UndefOr[js.Function1[/* file_key */ java.lang.String, scala.Unit]] = js.undefined
  var pausing: js.UndefOr[js.Function1[/* file_key */ java.lang.String, scala.Unit]] = js.undefined
  var progress: js.UndefOr[js.Function2[/* p */ scala.Double, /* stats */ TransferStats, scala.Unit]] = js.undefined
  var resumed: js.UndefOr[js.Function1[/* file_key */ java.lang.String, scala.Unit]] = js.undefined
  var started: js.UndefOr[js.Function1[/* file_key */ java.lang.String, scala.Unit]] = js.undefined
  var uploadInitiated: js.UndefOr[js.Function1[/* s3UploadId */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  var warn: js.UndefOr[js.Function1[/* msg */ java.lang.String, scala.Unit]] = js.undefined
  var xAmzHeadersAtComplete: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var xAmzHeadersAtInitiate: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var xAmzHeadersAtUpload: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var xAmzHeadersCommon: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object AddConfig {
  @scala.inline
  def apply(
    file: stdLib.File,
    name: java.lang.String,
    beforeSigner: js.Function2[/* xhr */ stdLib.XMLHttpRequest, /* url */ java.lang.String, scala.Unit] = null,
    cancelled: js.Function0[scala.Unit] = null,
    complete: js.Function3[
      /* xhr */ stdLib.XMLHttpRequest, 
      /* awsObjectKey */ java.lang.String, 
      /* stats */ TransferStats, 
      scala.Unit
    ] = null,
    contentType: java.lang.String = null,
    error: js.Function1[/* msg */ java.lang.String, scala.Unit] = null,
    info: js.Function1[/* msg */ java.lang.String, scala.Unit] = null,
    nameChanged: js.Function1[/* awsObjectKey */ java.lang.String, scala.Unit] = null,
    notSignedHeadersAtInitiate: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    paused: js.Function1[/* file_key */ java.lang.String, scala.Unit] = null,
    pausing: js.Function1[/* file_key */ java.lang.String, scala.Unit] = null,
    progress: js.Function2[/* p */ scala.Double, /* stats */ TransferStats, scala.Unit] = null,
    resumed: js.Function1[/* file_key */ java.lang.String, scala.Unit] = null,
    started: js.Function1[/* file_key */ java.lang.String, scala.Unit] = null,
    uploadInitiated: js.Function1[/* s3UploadId */ js.UndefOr[java.lang.String], scala.Unit] = null,
    warn: js.Function1[/* msg */ java.lang.String, scala.Unit] = null,
    xAmzHeadersAtComplete: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    xAmzHeadersAtInitiate: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    xAmzHeadersAtUpload: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    xAmzHeadersCommon: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): AddConfig = {
    val __obj = js.Dynamic.literal(file = file, name = name)
    if (beforeSigner != null) __obj.updateDynamic("beforeSigner")(beforeSigner)
    if (cancelled != null) __obj.updateDynamic("cancelled")(cancelled)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (error != null) __obj.updateDynamic("error")(error)
    if (info != null) __obj.updateDynamic("info")(info)
    if (nameChanged != null) __obj.updateDynamic("nameChanged")(nameChanged)
    if (notSignedHeadersAtInitiate != null) __obj.updateDynamic("notSignedHeadersAtInitiate")(notSignedHeadersAtInitiate)
    if (paused != null) __obj.updateDynamic("paused")(paused)
    if (pausing != null) __obj.updateDynamic("pausing")(pausing)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (resumed != null) __obj.updateDynamic("resumed")(resumed)
    if (started != null) __obj.updateDynamic("started")(started)
    if (uploadInitiated != null) __obj.updateDynamic("uploadInitiated")(uploadInitiated)
    if (warn != null) __obj.updateDynamic("warn")(warn)
    if (xAmzHeadersAtComplete != null) __obj.updateDynamic("xAmzHeadersAtComplete")(xAmzHeadersAtComplete)
    if (xAmzHeadersAtInitiate != null) __obj.updateDynamic("xAmzHeadersAtInitiate")(xAmzHeadersAtInitiate)
    if (xAmzHeadersAtUpload != null) __obj.updateDynamic("xAmzHeadersAtUpload")(xAmzHeadersAtUpload)
    if (xAmzHeadersCommon != null) __obj.updateDynamic("xAmzHeadersCommon")(xAmzHeadersCommon)
    __obj.asInstanceOf[AddConfig]
  }
}

