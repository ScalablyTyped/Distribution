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

