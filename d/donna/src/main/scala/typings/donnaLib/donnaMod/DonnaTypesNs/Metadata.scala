package typings
package donnaLib.donnaMod.DonnaTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var files: org.scalablytyped.runtime.StringDictionary[File]
}

object Metadata {
  @scala.inline
  def apply(files: org.scalablytyped.runtime.StringDictionary[File]): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[Metadata]
  }
}

