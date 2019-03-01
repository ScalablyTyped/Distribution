package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Saved extends js.Object {
  var saved: scala.Double
  var title: java.lang.String
  var updateSequenceNum: scala.Double
  var updated: scala.Double
}

object Anon_Saved {
  @scala.inline
  def apply(
    saved: scala.Double,
    title: java.lang.String,
    updateSequenceNum: scala.Double,
    updated: scala.Double
  ): Anon_Saved = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("saved")(saved)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("updateSequenceNum")(updateSequenceNum)
    __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[Anon_Saved]
  }
}

