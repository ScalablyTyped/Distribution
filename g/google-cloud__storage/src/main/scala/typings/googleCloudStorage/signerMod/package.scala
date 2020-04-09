package typings.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object signerMod {
  type GetSignedUrlCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* url */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type GetSignedUrlResponse = js.Array[typings.googleCloudStorage.signerMod.SignerGetSignedUrlResponse]
  type Query = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type SignerGetSignedUrlResponse = java.lang.String
}
