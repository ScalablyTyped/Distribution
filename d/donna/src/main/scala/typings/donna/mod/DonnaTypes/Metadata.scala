package typings.donna.mod.DonnaTypes

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var files: StringDictionary[File]
}

object Metadata {
  @scala.inline
  def apply(files: StringDictionary[File]): Metadata = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Metadata]
  }
}

