package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Closed extends js.Object {
  var closed: java.lang.String
  var commented: java.lang.String
  var created: java.lang.String
  var destroyed: java.lang.String
  var expired: java.lang.String
  var joined: java.lang.String
  var left: java.lang.String
  var merged: java.lang.String
  var pushed: java.lang.String
  var reopened: java.lang.String
  var updated: java.lang.String
}

object Anon_Closed {
  @scala.inline
  def apply(
    closed: java.lang.String,
    commented: java.lang.String,
    created: java.lang.String,
    destroyed: java.lang.String,
    expired: java.lang.String,
    joined: java.lang.String,
    left: java.lang.String,
    merged: java.lang.String,
    pushed: java.lang.String,
    reopened: java.lang.String,
    updated: java.lang.String
  ): Anon_Closed = {
    val __obj = js.Dynamic.literal(closed = closed, commented = commented, created = created, destroyed = destroyed, expired = expired, joined = joined, left = left, merged = merged, pushed = pushed, reopened = reopened, updated = updated)
  
    __obj.asInstanceOf[Anon_Closed]
  }
}

