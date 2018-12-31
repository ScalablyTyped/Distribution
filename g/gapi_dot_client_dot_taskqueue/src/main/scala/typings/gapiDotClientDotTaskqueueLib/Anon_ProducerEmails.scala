package typings
package gapiDotClientDotTaskqueueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProducerEmails extends js.Object {
  /** Email addresses of users who are "admins" of the TaskQueue. This means they can control the queue, eg set ACLs for the queue. */
  var adminEmails: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Email addresses of users who can "consume" tasks from the TaskQueue. This means they can Dequeue and Delete tasks from the queue. */
  var consumerEmails: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Email addresses of users who can "produce" tasks into the TaskQueue. This means they can Insert tasks into the queue. */
  var producerEmails: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

