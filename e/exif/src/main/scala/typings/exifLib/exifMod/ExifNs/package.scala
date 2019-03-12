package typings
package exifLib.exifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ExifNs {
  type ExifCallback = js.Function3[
    /* error */ stdLib.Error | scala.Null, 
    /* data */ ExifData, 
    /* dataPath */ java.lang.String, 
    scala.Unit
  ]
  type ExifImageCallback = js.Function2[/* error */ stdLib.Error | scala.Null, /* data */ ExifData, scala.Unit]
}
