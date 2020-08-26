package typings.gapiClientTaskqueue.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminEmails extends js.Object {
  /** Email addresses of users who are "admins" of the TaskQueue. This means they can control the queue, eg set ACLs for the queue. */
  var adminEmails: js.UndefOr[js.Array[String]] = js.native
  /** Email addresses of users who can "consume" tasks from the TaskQueue. This means they can Dequeue and Delete tasks from the queue. */
  var consumerEmails: js.UndefOr[js.Array[String]] = js.native
  /** Email addresses of users who can "produce" tasks into the TaskQueue. This means they can Insert tasks into the queue. */
  var producerEmails: js.UndefOr[js.Array[String]] = js.native
}

object AdminEmails {
  @scala.inline
  def apply(): AdminEmails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminEmails]
  }
  @scala.inline
  implicit class AdminEmailsOps[Self <: AdminEmails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdminEmailsVarargs(value: String*): Self = this.set("adminEmails", js.Array(value :_*))
    @scala.inline
    def setAdminEmails(value: js.Array[String]): Self = this.set("adminEmails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdminEmails: Self = this.set("adminEmails", js.undefined)
    @scala.inline
    def setConsumerEmailsVarargs(value: String*): Self = this.set("consumerEmails", js.Array(value :_*))
    @scala.inline
    def setConsumerEmails(value: js.Array[String]): Self = this.set("consumerEmails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumerEmails: Self = this.set("consumerEmails", js.undefined)
    @scala.inline
    def setProducerEmailsVarargs(value: String*): Self = this.set("producerEmails", js.Array(value :_*))
    @scala.inline
    def setProducerEmails(value: js.Array[String]): Self = this.set("producerEmails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducerEmails: Self = this.set("producerEmails", js.undefined)
  }
  
}

